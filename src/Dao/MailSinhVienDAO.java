package Dao;

import Database.DatabaseHelpper;
import Model.DutySchedule;
import Model.MailSinhVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MailSinhVienDAO {
     private Connection conn = null;
    private PreparedStatement sttm = null;
    public List<MailSinhVien> getAll(String studentId) {
        List<MailSinhVien> mails = new ArrayList<>();
        ResultSet rs = null;
        try {
            String sSQL = "SELECT * FROM MailSinhVien WHERE studentId = ?";
            conn = DatabaseHelpper.getConnection();
            sttm = conn.prepareStatement(sSQL);
            rs = sttm.executeQuery();

            while (rs.next()) {
                MailSinhVien mail = new MailSinhVien();
                mail.setAdminId(rs.getString("adminId"));
                mail.setStudentId(rs.getString("studentId"));
               
                mail.setContent(rs.getString("content"));
                mail.setDate(rs.getDate("date"));
                mails.add(mail);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.toString());
        } 
        return mails;
    }
    public String getId(String studentId) {
    String result = null;
    ResultSet rs = null;
    try {
        String sSQL = "SELECT studentId FROM MailSinhVien WHERE studentId = ?";
        conn = DatabaseHelpper.getConnection();
        sttm = conn.prepareStatement(sSQL);
        sttm.setString(1, studentId); // Truyền studentId vào câu truy vấn
        rs = sttm.executeQuery();

        if (rs.next()) {
            result = rs.getString("studentId");
        }
    } catch (SQLException e) {
        System.out.println("Error: " + e.toString());
    } finally {
        // Đảm bảo giải phóng tài nguyên
        try {
            if (rs != null) rs.close();
            if (sttm != null) sttm.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return result;
}


    public static List<MailSinhVien> selectAllMail(String adminId) {
        List<MailSinhVien> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        try {
            conn = DatabaseHelpper.getConnection();
            String sql = "SELECT * FROM MailSinhVien WHERE adminId = ?";
            pre = conn.prepareStatement(sql);
            pre.setString(1, adminId);
            rs = pre.executeQuery();
            while (rs.next()) {
                MailSinhVien mail = new MailSinhVien();
          
                mail.setAdminId(adminId);
                mail.setStudentId(rs.getString("studentId"));
                mail.setContent(rs.getNString("content"));
                mail.setDate(rs.getDate("date"));
                list.add(mail);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return list;
    }

    public static int insertMail( String adminId,String studentId, String content, Timestamp date) {
    int result = 0;
    Connection conn = null;
    PreparedStatement pre = null;
    try {
        conn = DatabaseHelpper.getConnection();
        String sql = "INSERT INTO MailSinhVien (adminId, studentId, content, date) VALUES (?, ?, ?, ?)";
        pre = conn.prepareStatement(sql);
        pre.setString(1, adminId);
        pre.setString(2, studentId);
        pre.setString(3, content);
        pre.setTimestamp(4, date);
        result = pre.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return result;
}

    public ArrayList<MailSinhVien> getListMail() {
        String query = "SELECT adminId, studentId, content, date FROM MailSinhVien";
        return getMailSinhVienFromDatabase(query);
    }
    public ArrayList<MailSinhVien> getMailSinhVienFromDatabase(String queryStatement) {
        ArrayList<MailSinhVien> listMailSinhViens = new ArrayList<>();
        try {
            Connection conn = DatabaseHelpper.getConnection();  // Assuming you have a method like DatabaseHelpper.getConnection()
            PreparedStatement ps = conn.prepareStatement(queryStatement);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                MailSinhVien mail = new MailSinhVien();
                mail.setAdminId(resultSet.getString("adminId"));
                mail.setStudentId(resultSet.getString("studentId"));
                mail.setContent(resultSet.getString("content"));
                mail.setDate(resultSet.getDate("date"));
                listMailSinhViens.add(mail);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listMailSinhViens;
    }
}
