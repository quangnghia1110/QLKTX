/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

/**
 *
 * @author hoang
 */
import Database.DatabaseHelpper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Model.Student;

public class ThongKeDAO {
    
    public List<Student> getListByStudent() {
        Connection cons = DatabaseHelpper.getConnection();
        String sql = "SELECT Room.block AS BlockName, COUNT(Student.id) AS NumberOfStudents FROM Room LEFT JOIN Student ON Room.name = Student.room GROUP BY Room.block ORDER BY Room.block;";
        List<Student> list = new ArrayList<>();
        try {
            PreparedStatement st = (PreparedStatement) cons.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Student student = new Student();
                student.setRoom(rs.getString("BlockName"));
                student.setId(rs.getString("NumberOfStudents"));
                list.add(student);
            }
            st.close();
            cons.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
