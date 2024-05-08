package Dao;

import Database.DatabaseHelpper;
import Model.ThongBaoCaNhan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.UUID;
import Model.ThongBaoChung;

public class ThongBaoChungDAO {
    public static int insertThongBaoToanBoSinhVien(String idNotification,String content, Timestamp date, String adminId) {
    int result = 0;
    Connection conn = null;
    PreparedStatement pre = null;
    try {
        conn = DatabaseHelpper.getConnection();
        List<String> studentIds = getAllStudentIds(); // Lấy danh sách tất cả các studentId
        String sql = "INSERT INTO ThongBaoChung (idNotification, content, date, adminId, studentId) VALUES (?, ?, ?, ?, ?)";
        pre = conn.prepareStatement(sql);
        for (String studentId : studentIds) {
            pre.setString(1, idNotification);
            pre.setString(2, content);
            pre.setTimestamp(3, date);
            pre.setString(4, adminId);
            pre.setString(5, studentId);
            pre.addBatch(); // Thêm câu lệnh vào batch để thực hiện chung
        }
        // Execute batch update and get the number of successful executions
        int[] batchResult = pre.executeBatch();
        for (int i : batchResult) {
            if (i >= 0) {
                result += i;
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Close resources
        try {
            if (pre != null) {
                pre.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return result;
}
public boolean isMaThongBaoChungExist(String idNotification) {
    String query = "SELECT COUNT(*) FROM ThongBaoChung WHERE idNotification = ?";
    try (Connection conn = DatabaseHelpper.getConnection();
         PreparedStatement ps = conn.prepareStatement(query)) {
        ps.setString(1, idNotification);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;
            }
        }
    } catch (SQLException e) {
        System.out.println("Lỗi kiểm tra sự tồn tại của Mã Thông Báo: " + e.toString());
    }
    return false;
}

    private static List<String> getAllStudentIds() {
        List<String> studentIds = new ArrayList<>();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT id FROM Student";
            conn = DatabaseHelpper.getConnection();
            sttm = conn.prepareStatement(sSQL);
            rs = sttm.executeQuery();
            while (rs.next()) {
                studentIds.add(rs.getString("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (sttm != null) sttm.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return studentIds;
    }
    
    
    
    public List<ThongBaoChung> getByStudentId(String studentId) {
        List<ThongBaoChung> thongBaoChungs = new ArrayList<>();
        
        String query = "SELECT * FROM ThongBaoChung WHERE studentId = ?";
        
        try (Connection conn = DatabaseHelpper.getConnection();
             PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setString(1, studentId);
            
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    ThongBaoChung thongBaoChung = new ThongBaoChung();
                    thongBaoChung.setIdNotification(resultSet.getString("idNotification"));
                    thongBaoChung.setAdminId(resultSet.getString("adminId"));
                    thongBaoChung.setStudentId(resultSet.getString("studentId"));
                    thongBaoChung.setContent(resultSet.getString("content"));
                    thongBaoChung.setDate(resultSet.getDate("date"));
                    
                    thongBaoChungs.add(thongBaoChung);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return thongBaoChungs;
    }
    
    
    public List<ThongBaoChung> getByAdminId(String adminId) {
        List<ThongBaoChung> thongBaoChungs = new ArrayList<>();
        
        String query = "SELECT * FROM ThongBaoChung WHERE adminId = ?";
        
        try (Connection conn = DatabaseHelpper.getConnection();
             PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setString(1, adminId);
            
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    ThongBaoChung thongBaoChung = new ThongBaoChung();
                    thongBaoChung.setIdNotification(resultSet.getString("idNotification"));
                    thongBaoChung.setAdminId(resultSet.getString("adminId"));
                    thongBaoChung.setStudentId(resultSet.getString("studentId"));
                    thongBaoChung.setContent(resultSet.getString("content"));
                    thongBaoChung.setDate(resultSet.getDate("date"));
                    
                    thongBaoChungs.add(thongBaoChung);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return thongBaoChungs;
    }
}

