/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author hoang
 */
import Dao.ThongKeDAO;
import Model.Student;
import java.util.List;

public class ThongKeService {

    private ThongKeDAO thongKeDAO = null;

    public ThongKeService() {
        this.thongKeDAO = new ThongKeDAO();
    }
    public List<Student> getListByStudent() {
        return thongKeDAO.getListByStudent();
    }
}
