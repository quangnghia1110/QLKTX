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

public class ThongBaoCaNhanDAO {

    public static List<ThongBaoCaNhan> selectAllThongBaoTheoMaHocSinh(String studentId) {
        List<ThongBaoCaNhan> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        ThongBaoCaNhan tb;
        Timestamp ts;
        try {
            conn = DatabaseHelpper.getConnection();
            String sql = "SELECT * FROM ThongBaoCaNhan WHERE studentId = ?";
            pre = conn.prepareStatement(sql);
            pre.setString(1, studentId);
            rs = pre.executeQuery();
            while (rs.next()) {
                tb = new ThongBaoCaNhan();
                tb.setIdNotification(rs.getString(1));
                tb.setContent(rs.getString(2));
                tb.setDate(rs.getDate(3));
                tb.setStudentId(rs.getString(5));
                list.add(tb);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static int insertThongBao(String idNotification, String content, Timestamp date, String adminId, String studentId) {
        int result = 0;
        Connection conn = null;
        PreparedStatement pre = null;
        try {
            conn = DatabaseHelpper.getConnection();
            String sql = "INSERT INTO ThongBaoCaNhan (idNotification, content, date, adminId, studentId) VALUES (?, ?, ?, ?, ?)";
            pre = conn.prepareStatement(sql);
            pre.setString(1, idNotification);
            pre.setString(2, content);
            pre.setTimestamp(3, date);
            pre.setString(4, adminId);
            pre.setString(5, studentId);
            result = pre.executeUpdate();
        } catch (Exception e) {
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

    private Connection conn = null;
    private PreparedStatement sttm = null;

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

    public List<ThongBaoCaNhan> getByStudentId(String studentId) {
        List<ThongBaoCaNhan> thongBaoCaNhans = new ArrayList<>();

        String query = "SELECT * FROM ThongBaoCaNhan WHERE studentId = ?";

        try (Connection conn = DatabaseHelpper.getConnection(); PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setString(1, studentId);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    ThongBaoCaNhan thongBaoCaNhan = new ThongBaoCaNhan();
                    thongBaoCaNhan.setIdNotification(resultSet.getString("idNotification"));
                    thongBaoCaNhan.setAdminId(resultSet.getString("adminId"));
                    thongBaoCaNhan.setStudentId(resultSet.getString("studentId"));
                    thongBaoCaNhan.setContent(resultSet.getString("content"));
                    thongBaoCaNhan.setDate(resultSet.getDate("date"));

                    thongBaoCaNhans.add(thongBaoCaNhan);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return thongBaoCaNhans;
    }

    public List<ThongBaoCaNhan> getByAdminId(String adminId) {
        List<ThongBaoCaNhan> thongBaoCaNhans = new ArrayList<>();

        String query = "SELECT * FROM ThongBaoCaNhan WHERE adminId = ?";

        try (Connection conn = DatabaseHelpper.getConnection(); PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setString(1, adminId);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    ThongBaoCaNhan thongBaoCaNhan = new ThongBaoCaNhan();
                    thongBaoCaNhan.setIdNotification(resultSet.getString("idNotification"));
                    thongBaoCaNhan.setAdminId(resultSet.getString("adminId"));
                    thongBaoCaNhan.setStudentId(resultSet.getString("studentId"));
                    thongBaoCaNhan.setContent(resultSet.getString("content"));
                    thongBaoCaNhan.setDate(resultSet.getDate("date"));

                    thongBaoCaNhans.add(thongBaoCaNhan);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return thongBaoCaNhans;
    }
}
