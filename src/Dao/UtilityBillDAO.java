package Dao;

import Database.DatabaseHelpper;
import Model.UtilityBill;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UtilityBillDAO {
    private Connection conn = null;
    private PreparedStatement sttm = null;

    // Lấy tất cả các hóa đơn tiện ích cho một phòng cụ thể
    public List<UtilityBill> getAll(String studentId) {
        List<UtilityBill> utilityBills = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DatabaseHelpper.getConnection(); // Thay thế YourDatabaseConnection bằng lớp kết nối cơ sở dữ liệu thực tế của bạn
            String query = "SELECT * FROM UtilityBill WHERE studentId = ?";
            statement = connection.prepareStatement(query);
            statement.setString(1, studentId); // Thiết lập tham số tên phòng
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                // Tạo một đối tượng UtilityBill mới và điền các trường từ result set
                UtilityBill utilityBill = new UtilityBill();
                utilityBill.setBillId(resultSet.getInt("billId"));
                utilityBill.setStudentId(resultSet.getString("studentId")); // Lấy studentId
                utilityBill.setRoomName(resultSet.getString("roomName"));
                utilityBill.setElectricityCost(resultSet.getDouble("electricityCost"));
                utilityBill.setWaterCost(resultSet.getDouble("waterCost"));
                utilityBill.setDateOfPayment(resultSet.getDate("dateOfPayment"));

                // Thêm hóa đơn tiện ích vào danh sách
                utilityBills.add(utilityBill);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Đóng kết nối, câu lệnh và result set
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return utilityBills;
    }
 public List<UtilityBill> getAllByRoom(String roomName) {
        List<UtilityBill> utilityBills = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DatabaseHelpper.getConnection(); // Thay thế YourDatabaseConnection bằng lớp kết nối cơ sở dữ liệu thực tế của bạn
            String query = "SELECT * FROM UtilityBill WHERE roomName = ?";
            statement = connection.prepareStatement(query);
            statement.setString(1, roomName); // Thiết lập tham số tên phòng
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                // Tạo một đối tượng UtilityBill mới và điền các trường từ result set
                UtilityBill utilityBill = new UtilityBill();
                utilityBill.setBillId(resultSet.getInt("billId"));
                utilityBill.setStudentId(resultSet.getString("studentId")); // Lấy studentId
                utilityBill.setRoomName(resultSet.getString("roomName"));
                utilityBill.setElectricityCost(resultSet.getDouble("electricityCost"));
                utilityBill.setWaterCost(resultSet.getDouble("waterCost"));
                utilityBill.setDateOfPayment(resultSet.getDate("dateOfPayment"));

                // Thêm hóa đơn tiện ích vào danh sách
                utilityBills.add(utilityBill);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Đóng kết nối, câu lệnh và result set
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return utilityBills;
    }
    // Lấy tất cả các hóa đơn tiện ích từ cơ sở dữ liệu
    public ArrayList<UtilityBill> getAllUtilityBills() {
        String query = "SELECT billId, studentId, roomName, electricityCost, waterCost, dateOfPayment FROM UtilityBill";
        return getUtilityBillsFromDatabase(query);
    }

    // Lấy tất cả các hóa đơn tiện ích từ cơ sở dữ liệu với câu lệnh truy vấn cụ thể
    public ArrayList<UtilityBill> getUtilityBillsFromDatabase(String queryStatement) {
        ArrayList<UtilityBill> listUtilityBills = new ArrayList<>();
        try {
            Connection conn = DatabaseHelpper.getConnection();  
            PreparedStatement ps = conn.prepareStatement(queryStatement);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                UtilityBill utilityBill = new UtilityBill();
                utilityBill.setBillId(resultSet.getInt("billId"));
                utilityBill.setStudentId(resultSet.getString("studentId")); // Lấy studentId
                utilityBill.setRoomName(resultSet.getString("roomName"));
                utilityBill.setElectricityCost(resultSet.getDouble("electricityCost"));
                utilityBill.setWaterCost(resultSet.getDouble("waterCost"));
                utilityBill.setDateOfPayment(resultSet.getDate("dateOfPayment"));
                listUtilityBills.add(utilityBill);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listUtilityBills;
    }

    // Đóng tài nguyên
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
