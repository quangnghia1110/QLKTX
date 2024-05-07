package Dao;

import Database.DatabaseHelpper;
import Model.DutySchedule;
import Model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DutyScheduleDAO {

    private Connection conn = null;
    private PreparedStatement sttm = null;

    public List<DutySchedule> getAll(String studentId) {
        List<DutySchedule> dutySchedules = new ArrayList<>();
        ResultSet rs = null;
        try {
            String sSQL = "SELECT * FROM DutySchedule WHERE studentId = ?";
            conn = DatabaseHelpper.getConnection();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, studentId);
            rs = sttm.executeQuery();

            while (rs.next()) {
                DutySchedule dutySchedule = new DutySchedule();
                dutySchedule.setScheduleId(rs.getInt("scheduleId"));
                dutySchedule.setScheduleDate(rs.getDate("scheduleDate"));
                dutySchedule.setStudentId(rs.getString("studentId"));

                dutySchedule.setDescription(rs.getString("description"));
                dutySchedules.add(dutySchedule);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.toString());
        } finally {
            closeResources();
        }
        return dutySchedules;
    }

    public ArrayList<DutySchedule> getListSchedule() {
        String query = "SELECT scheduleId, scheduleDate, description, studentId FROM DutySchedule";
        return getDutyScheduleFromDatabase(query);
    }

    public ArrayList<DutySchedule> getDutyScheduleFromDatabase(String queryStatement) {
        ArrayList<DutySchedule> listDutySchedules = new ArrayList<>();
        try {
            Connection conn = DatabaseHelpper.getConnection();  // Assuming you have a method like DatabaseHelpper.getConnection()
            PreparedStatement ps = conn.prepareStatement(queryStatement);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                DutySchedule dutySchedule = new DutySchedule();
                dutySchedule.setScheduleId(resultSet.getInt("scheduleId"));
                dutySchedule.setStudentId(resultSet.getString("studentId"));
                dutySchedule.setScheduleDate(resultSet.getDate("scheduleDate"));
                dutySchedule.setDescription(resultSet.getString("description"));
                listDutySchedules.add(dutySchedule);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listDutySchedules;
    }

    private void closeResources() {
        try {
            if (sttm != null) {
                sttm.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Error closing resources: " + e.toString());
        }
    }

    public boolean createDutySchedule(DutySchedule dutySchedule) {
        String query = "INSERT INTO DutySchedule (scheduleId, scheduleDate, description, studentId) VALUES (?,?, ?, ?)";
        try {
            conn = DatabaseHelpper.getConnection();
            sttm = conn.prepareStatement(query);

            sttm.setInt(1, dutySchedule.getScheduleId());
            sttm.setDate(2, dutySchedule.getScheduleDate());
            sttm.setString(3, dutySchedule.getDescription());
            sttm.setString(4, dutySchedule.getStudentId());
            int rowsAffected = sttm.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println("Error creating duty schedule: " + e.toString());
            return false;
        } finally {
            closeResources();
        }
    }

    public boolean updateDutySchedule(DutySchedule dutySchedule) {
        String query = "UPDATE DutySchedule SET studentId=?, scheduleDate=?, description=? WHERE scheduleId=?";
        try {
            conn = DatabaseHelpper.getConnection();
            sttm = conn.prepareStatement(query);
            sttm.setString(1, dutySchedule.getStudentId());
            sttm.setDate(2, dutySchedule.getScheduleDate());
            sttm.setString(3, dutySchedule.getDescription());
            sttm.setInt(4, dutySchedule.getScheduleId());
            int rowsAffected = sttm.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println("Error updating duty schedule: " + e.toString());
            return false;
        } finally {
            closeResources();
        }
    }

    public boolean deleteDutySchedule(int scheduleId) {
        String query = "DELETE FROM DutySchedule WHERE scheduleId=?";
        try {
            conn = DatabaseHelpper.getConnection();
            sttm = conn.prepareStatement(query);
            sttm.setInt(1, scheduleId);
            int rowsAffected = sttm.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println("Error deleting duty schedule: " + e.toString());
            return false;
        } finally {
            closeResources();
        }
    }
public boolean isDutyScheduleExist(int scheduleId) {
    String query = "SELECT COUNT(*) FROM DutySchedule WHERE scheduleId = ?";
    try (Connection conn = DatabaseHelpper.getConnection();
         PreparedStatement ps = conn.prepareStatement(query)) {
        ps.setInt(1, scheduleId);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;
            }
        }
    } catch (SQLException e) {
        System.out.println("Error checking duty schedule existence: " + e.toString());
    }
    return false;
}
public List<DutySchedule> filterByScheduleId(int scheduleId) {
    List<DutySchedule> filteredSchedules = new ArrayList<>();
    String query = "SELECT scheduleId, scheduleDate, description, studentId FROM DutySchedule WHERE scheduleId = ?";
    try {
        Connection conn = DatabaseHelpper.getConnection();
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, scheduleId);
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()) {
            DutySchedule dutySchedule = new DutySchedule();
            dutySchedule.setScheduleId(resultSet.getInt("scheduleId"));
            dutySchedule.setStudentId(resultSet.getString("studentId"));
            dutySchedule.setScheduleDate(resultSet.getDate("scheduleDate"));
            dutySchedule.setDescription(resultSet.getString("description"));
            filteredSchedules.add(dutySchedule);
        }
    } catch (SQLException e) {
        System.out.println("Error filtering duty schedules by scheduleId: " + e.toString());
    }
    return filteredSchedules;
}

}
