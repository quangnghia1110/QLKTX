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
}