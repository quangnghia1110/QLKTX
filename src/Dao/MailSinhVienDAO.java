package Dao;

import Database.DatabaseHelpper;
import Model.MailSinhVien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.Random;

public class MailSinhVienDAO {

    public static String generateRandomId() {
        // Define the characters allowed in the random string
        String characters = "0123456789";

        // Create a StringBuilder object to store the random string
        StringBuilder sb = new StringBuilder();

        // Create an instance of Random class
        Random random = new Random();

        // Generate 6 characters randomly from the allowed characters
        for (int i = 0; i < 6; i++) {
            // Get a random index from 0 to characters.length() - 1
            int randomIndex = random.nextInt(characters.length());

            // Append the character at the random index to the StringBuilder
            sb.append(characters.charAt(randomIndex));
        }

        // Convert StringBuilder to String and return
        return "TB" + sb.toString();
    }
    private Connection conn = null;
    private PreparedStatement sttm = null;

    public List<Model.MailSinhVien> getAll(String studentId) {
        List<Model.MailSinhVien> mails = new ArrayList<>();
        ResultSet rs = null;
        try {
            String sSQL = "SELECT * FROM MailSinhVien WHERE studentId = ?";
            conn = DatabaseHelpper.getConnection();
            sttm = conn.prepareStatement(sSQL);
            // Thêm tham số vào câu truy vấn
            sttm.setString(1, studentId);
            rs = sttm.executeQuery();

            while (rs.next()) {
                MailSinhVien mail = new MailSinhVien();
                mail.setIdNotification(rs.getString("idNotification"));
                mail.setAdminId(rs.getString("adminId"));
                mail.setStudentId(rs.getString("studentId"));
                mail.setContent(rs.getString("content"));
                mail.setDate(rs.getDate("date"));
                mails.add(mail);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.toString());
        } finally {
            // Đảm bảo giải phóng tài nguyên
            try {
                if (rs != null) {
                    rs.close();
                }
                if (sttm != null) {
                    sttm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        // In ra số lượng bản ghi trả về để kiểm tra
        System.out.println("Number of records retrieved: " + mails.size());
        return mails;
    }
public List<Model.MailSinhVien> getAllAdmin(String adminId) {
        List<Model.MailSinhVien> mails = new ArrayList<>();
        ResultSet rs = null;
        try {
            String sSQL = "SELECT * FROM MailSinhVien WHERE adminId = ?";
            conn = DatabaseHelpper.getConnection();
            sttm = conn.prepareStatement(sSQL);
            // Thêm tham số vào câu truy vấn
            sttm.setString(1, adminId);
            rs = sttm.executeQuery();

            while (rs.next()) {
                MailSinhVien mail = new MailSinhVien();
                mail.setIdNotification(rs.getString("idNotification"));
                mail.setAdminId(rs.getString("adminId"));
                mail.setStudentId(rs.getString("studentId"));
                mail.setContent(rs.getString("content"));
                mail.setDate(rs.getDate("date"));
                mails.add(mail);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.toString());
        } finally {
            // Đảm bảo giải phóng tài nguyên
            try {
                if (rs != null) {
                    rs.close();
                }
                if (sttm != null) {
                    sttm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        // In ra số lượng bản ghi trả về để kiểm tra
        System.out.println("Number of records retrieved: " + mails.size());
        return mails;
    }

    public String getId(String id) {
        String result = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT id FROM Student WHERE id = ?";
            conn = DatabaseHelpper.getConnection();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, id); // Truyền studentId vào câu truy vấn
            rs = sttm.executeQuery();

            if (rs.next()) {
                result = rs.getString("id");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.toString());
        } finally {
            // Đảm bảo giải phóng tài nguyên
            try {
                if (rs != null) {
                    rs.close();
                }
                if (sttm != null) {
                    sttm.close();
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
                mail.setIdNotification(rs.getString("idNotification"));
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
    private static int count = 1;

    public static int insertMail(String adminId, String studentId, String content, Timestamp date) {
        int result = 0;
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;

        try {
            conn = DatabaseHelpper.getConnection();
            String idNotification = generateRandomId();
            String sql = "INSERT INTO MailSinhVien (idNotification, adminId, studentId, content, date) VALUES (?, ?, ?, ?, ?)";
            pre = conn.prepareStatement(sql);
            pre.setString(1, idNotification);
            pre.setString(2, adminId);
            pre.setString(3, studentId);
            pre.setString(4, content);
            pre.setTimestamp(5, date);
            result = pre.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Đóng các tài nguyên
            try {
                if (pre != null) {
                    pre.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }

    public ArrayList<MailSinhVien> getListMail() {
        String query = "SELECT idNotification, adminId, studentId, content, date FROM MailSinhVien";
        return getMailSinhVienFromDatabase(query);
    }

    public ArrayList<MailSinhVien> getMailSinhVienFromDatabase(String queryStatement) {
        ArrayList<MailSinhVien> listMailSinhViens = new ArrayList<>();
        try {
            Connection conn = DatabaseHelpper.getConnection();
            PreparedStatement ps = conn.prepareStatement(queryStatement);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                MailSinhVien mail = new MailSinhVien();
                mail.setIdNotification(resultSet.getString("idNotification"));
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
