package Model;

import java.sql.Timestamp;
import java.util.Date;

public class ThongBaoChung extends ThongBao{
    private String idNotification;
    private String studentId;

    public ThongBaoChung() {
        super();
    }

    public ThongBaoChung(String idNotification, String content, Date date, String adminId, String studentId) {
        super(content, date,adminId);
        this.idNotification = idNotification;
        this.studentId=studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getIdNotification() {
        return idNotification;
    }

    public void setIdNotification(String idNotification) {
        this.idNotification = idNotification;
    }
}
