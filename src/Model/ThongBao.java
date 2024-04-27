package Model;

import java.sql.Timestamp;
import java.util.Date;

public class ThongBao {
    private String content; // Changed attribute name to match SQL column name
    private Date date; // Changed attribute name to match SQL column name
    private String adminId; // New attribute for admin ID

    // Constructors, getters, and setters
    public ThongBao() {
        
    }

    public ThongBao(String content, Date date, String adminId) {
        this.content = content;
        this.date = date;
        this.adminId = adminId;
    }

    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }
}
