//package Dao;
//
//import Database.DatabaseHelpper;
//import Model.BillDetail;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class BillDetailDAO {
//    Connection conn = null;
//    PreparedStatement sttm = null;
//
//    private void closeResources() {
//        try {
//            if (sttm != null) {
//                sttm.close();
//            }
//            if (conn != null) {
//                conn.close();
//            }
//        } catch (SQLException e) {
//            System.out.println("Error closing resources: " + e.toString());
//        }
//    }
//
//    public List<BillDetail> getBillDetailByBillId(String billId) {
//        List<BillDetail> billDetails = new ArrayList<>();
//        ResultSet rs = null;
//        try {
//            String sSQL = "SELECT * FROM BillDetail WHERE billId=?";
//            conn = DatabaseHelpper.getConnection();
//            sttm = conn.prepareStatement(sSQL);
//            sttm.setString(1, billId);
//            rs = sttm.executeQuery();
//            while (rs.next()) {
//                BillDetail billDetail = new BillDetail();
//                billDetail.setBillId(rs.getString("billId"));
//                billDetail.setElectricityUsage(rs.getDouble("electricityUsage"));
//                billDetail.setWaterUseage(rs.getDouble("waterUseage"));
//                billDetail.setElectricityUnitPrice(rs.getDouble("electricityUnitPrice"));
//                billDetail.setWaterUnitPrice(rs.getDouble("waterUnitPrice"));
//                billDetail.setTotalElectricityCost(rs.getDouble("totalElectricityCost"));
//                billDetail.setTotalWaterCost(rs.getDouble("totalWaterCost"));
//                billDetail.setStartDate(rs.getDate("startDate"));
//                billDetail.setEndDate(rs.getDate("endDate"));
//                billDetails.add(billDetail);
//            }
//        } catch (SQLException e) {
//            System.out.println("Error: " + e.toString());
//        } finally {
//            closeResources();
//        }
//        return billDetails;
//    }
//
//    // Add more methods as needed
//}
