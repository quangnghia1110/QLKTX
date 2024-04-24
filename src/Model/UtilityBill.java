package Model;

import java.util.Date;

public class UtilityBill {
    // Thuộc tính của hóa đơn tiện ích
    private int billId;
    private String studentId; // Thêm trường studentId
    private String roomName;
    private double electricityCost;
    private double waterCost;
    private Date dateOfPayment;

   

    // Getters và Setters
    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public double getElectricityCost() {
        return electricityCost;
    }

    public void setElectricityCost(double electricityCost) {
        this.electricityCost = electricityCost;
    }

    public double getWaterCost() {
        return waterCost;
    }

    public void setWaterCost(double waterCost) {
        this.waterCost = waterCost;
    }

    public Date getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(Date dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

}
