package Model;

import java.util.Date;

public class UtilityBill {
    private int billId;
    private String studentId; 
    private String roomName;
    private double electricityCost;
    private double waterCost;
    private double electricityUsage;
    private double waterUseage;
    private double electricityUnitPrice;    
    private double waterUnitPrice;
    private Date dateOfPayment;
    private Date dateOfBill;
    private Date startDate;
    private Date endDate;
    private int status;

    public UtilityBill() {
    }

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

    public void setElectricityCost(double electricityUsage, double electricityUnitPrice) {
        this.electricityCost = electricityUsage*electricityUnitPrice;
    }

    public double getWaterCost() {
        return waterCost;
    }

    public void setWaterCost(double waterUseage, double waterUnitPrice) {
        this.waterCost = waterUseage*waterUnitPrice;
    }

    public double getElectricityUsage() {
        return electricityUsage;
    }

    public void setElectricityUsage(double electricityUsage) {
        this.electricityUsage = electricityUsage;
    }

    public double getWaterUseage() {
        return waterUseage;
    }

    public void setWaterUseage(double waterUseage) {
        this.waterUseage = waterUseage;
    }

    public double getElectricityUnitPrice() {
        return electricityUnitPrice;
    }

    public void setElectricityUnitPrice(double electricityUnitPrice) {
        this.electricityUnitPrice = electricityUnitPrice;
    }

    public double getWaterUnitPrice() {
        return waterUnitPrice;
    }

    public void setWaterUnitPrice(double waterUnitPrice) {
        this.waterUnitPrice = waterUnitPrice;
    }

    public Date getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(Date dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public Date getDateOfBill() {
        return dateOfBill;
    }

    public void setDateOfBill(Date dateOfBill) {
        this.dateOfBill = dateOfBill;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public UtilityBill(int billId, String studentId, String roomName, double electricityCost, double waterCost, double electricityUsage, double waterUseage, double electricityUnitPrice, double waterUnitPrice, Date dateOfPayment, Date dateOfBill, Date startDate, Date endDate, int status) {
        this.billId = billId;
        this.studentId = studentId;
        this.roomName = roomName;
        this.electricityCost = electricityCost;
        this.waterCost = waterCost;
        this.electricityUsage = electricityUsage;
        this.waterUseage = waterUseage;
        this.electricityUnitPrice = electricityUnitPrice;
        this.waterUnitPrice = waterUnitPrice;
        this.dateOfPayment = dateOfPayment;
        this.dateOfBill = dateOfBill;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    

}
