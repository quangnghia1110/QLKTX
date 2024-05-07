package Model;

import java.sql.Timestamp;
import java.util.Date;

public class MailSinhVien {
    private String idNotification, content, adminId, studentId;
    private Date date;

    public MailSinhVien() {
        
    }

    public MailSinhVien(String idNotification, String studentId, String adminId, String content, Date date) {
        this.idNotification = idNotification;
        this.content = content;
        this.adminId = adminId;
        this.studentId = studentId;
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public String getIdNotification() {
        return idNotification;
    }

    public void setIdNotification(String idNotification) {
        this.idNotification = idNotification;
    }
}
