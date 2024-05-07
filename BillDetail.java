
package Model;

import java.util.Date;

public class BillDetail {
    private String billId;
    private double electricityUsage;
    private double waterUseage;
    private double electricityUnitPrice;    
    private double waterUnitPrice;
    private double totalElectricityCost;
    private double totalWaterCost;
    private Date startDate;
    private Date endDate;

    public BillDetail() {
    }

    public BillDetail(String billId, double electricityUsage, double waterUseage, double electricityUnitPrice, double waterUnitPrice, double totalElectricityCost, double totalWaterCost, Date startDate, Date endDate) {
        this.billId = billId;
        this.electricityUsage = electricityUsage;
        this.waterUseage = waterUseage;
        this.electricityUnitPrice = electricityUnitPrice;
        this.waterUnitPrice = waterUnitPrice;
        this.totalElectricityCost = totalElectricityCost;
        this.totalWaterCost = totalWaterCost;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    
    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
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

    public double getTotalElectricityCost() {
        return totalElectricityCost;
    }

    public void setTotalElectricityCost(double totalElectricityCost) {
        this.totalElectricityCost = totalElectricityCost;
    }

    public double getTotalWaterCost() {
        return totalWaterCost;
    }

    public void setTotalWaterCost(double totalWaterCost) {
        this.totalWaterCost = totalWaterCost;
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

}
