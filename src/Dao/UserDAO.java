/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import Database.DatabaseHelpper;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Model.Student;
import Model.User;

/**
 *
 * @author ADMIN
 */
public class UserDAO {
    Connection conn = null;
    PreparedStatement sttm = null;

    private void closeResources() {
        try {
            if (sttm != null) {
                sttm.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Error closing resources: " + e.toString());
        }
    }

    public User getUser(String username){
        ResultSet re = null;
        User user = new User();
        try {
            String ssQL = "SELECT * FROM [User] WHERE username = ?";
            conn = DatabaseHelpper.getConnection();
            sttm= conn.prepareStatement(ssQL);
            sttm.setString(1, username);
            re = sttm.executeQuery();
            while(re.next()){
                user.setUsername(re.getString(1));
                user.setPassword(re.getString(2));
                user.setIsAdmin(re.getBoolean(3));
                return user;
            }
        } catch (Exception e) {
            System.err.println("Error: "+e.toString());
        }finally{
            closeResources();
        }
        return null;
    }

    public int checkLogin(String username, String password){
        User user = getUser(username);
        if(user != null){
            if(user.getPassword().equalsIgnoreCase(password)){
                return 1;
            }else{
                return 2;
            }
        }
        return 0;
    }

    public boolean exitUser(User us){
        ResultSet re = null;
         try {
            String ssQL = "SELECT * FROM [User] WHERE [User].username = ?";
            conn = DatabaseHelpper.getConnection();
            sttm= conn.prepareStatement(ssQL);
            sttm.setString(1, us.getUsername());
            re = sttm.executeQuery();
            while(re.next()){
                return true;
            }
        } catch (Exception e) {
            System.err.println("Error: "+e.toString());
        }finally{
            closeResources();
        }
         return false;
    }

    public int createUser(User us){
        int re = 0;
        try {
            String ssQL = "INSERT INTO [User] (username, password, isAdmin) VALUES(?,?,?)" ;
            conn = DatabaseHelpper.getConnection();
            sttm= conn.prepareStatement(ssQL);
            sttm.setString(1, us.getUsername());
            sttm.setString(2, us.getPassword());
            sttm.setBoolean(3, us.isIsAdmin());

            re = sttm.executeUpdate();
            if(re > 0){
                System.out.println("Create new User successful");
                return 1;
            }
        }catch (Exception e) {
            System.err.println("Error: "+e.toString());
        }finally{
            closeResources();
        }
        System.out.println("Create new User fail");
        return 0;
    }

    public boolean updateUser(User us){
        try {
            String SQL = "UPDATE [USER] SET password = ?, isAdmin = ? WHERE username = ?";
            conn = DatabaseHelpper.getConnection();
            sttm = conn.prepareStatement(SQL);
            sttm.setString(1, us.getPassword());
            sttm.setBoolean(2, us.isIsAdmin());
            sttm.setString(3, us.getUsername());
            System.out.println("Cập nhật User thành công !");
            return sttm.executeUpdate() >  0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Student getUserProfile(String id){
        Student st = new Student();
        ResultSet rs = null;
        try {
            String SQL = "SELECT [Student].name, [Student].id, [Student].class, [Student].birthday, [Student].address, [Student].email, [Student].gender, [Student].phoneNumber " +
                        "FROM [Student] JOIN [User] ON Student.id = [USER].username " +
                        "WHERE [USER].username =  " + "'" + id + "'" ;

            conn = DatabaseHelpper.getConnection();
            sttm = conn.prepareStatement(SQL);
            rs = sttm.executeQuery();
            while(rs.next()){
                st.setName(rs.getString("name"));
                st.setId(rs.getString("id"));
                st.setClassName(rs.getString("class"));
                st.setBirthday(rs.getString("birthday"));
                st.setAddress(rs.getString("address"));
                st.setEmail(rs.getString("email"));
                st.setGender(rs.getBoolean("gender"));
                st.setPhoneNumber(rs.getString("phoneNumber"));
            }

        } catch (Exception e) {
        }
        return st;
    }
    public String getId(String id){
    String userProfile = "";
    ResultSet rs = null;
    try {
        String SQL = "SELECT [Student].id" +
                    "FROM [Student] JOIN [User] ON Student.id = [USER].username " +
                    "WHERE [USER].username =  " + "'" + id + "'" ;

        conn = DatabaseHelpper.getConnection();
        sttm = conn.prepareStatement(SQL);
        rs = sttm.executeQuery();
        while(rs.next()){
            userProfile += "Name: " + rs.getString("name") + "\n";
            userProfile += "ID: " + rs.getString("id") + "\n";
            userProfile += "Class: " + rs.getString("class") + "\n";
            userProfile += "Birthday: " + rs.getString("birthday") + "\n";
            userProfile += "Address: " + rs.getString("address") + "\n";
            userProfile += "Email: " + rs.getString("email") + "\n";
            userProfile += "Gender: " + (rs.getBoolean("gender") ? "Male" : "Female") + "\n";
            userProfile += "Phone Number: " + rs.getString("phoneNumber") + "\n";
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
    return userProfile;
}

    public String getCurrentUserFromDatabase(String username) {
    String currentUser = null;
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
        conn = DatabaseHelpper.getConnection();

        String query = "SELECT username FROM User WHERE username = ?";
        pstmt = conn.prepareStatement(query);
        pstmt.setString(1, username);

        rs = pstmt.executeQuery();

        if (rs.next()) {
            // Retrieve the username from the result set
            currentUser = rs.getString("username");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Close resources
        // ...
    }

    return currentUser;
}



public String getAdminIdFromDatabase(String username) {
    String adminId = null;
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
        conn = DatabaseHelpper.getConnection();

        String query = "SELECT username FROM User WHERE username = ?";
        pstmt = conn.prepareStatement(query);
        pstmt.setString(1, username);

        rs = pstmt.executeQuery();

        if (rs.next()) {
            adminId = rs.getString("username");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Đóng các tài nguyên
        // ...
    }

    return adminId;
}
public boolean isAdmin(String username) {
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    boolean isAdmin = false;

    try {
        conn = DatabaseHelpper.getConnection();

        String query = "SELECT isAdmin FROM User WHERE username = ?";
        pstmt = conn.prepareStatement(query);
        pstmt.setString(1, username);

        rs = pstmt.executeQuery();

        if (rs.next()) {
            isAdmin = rs.getBoolean("isAdmin");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Close resources
        // ...
    }

    return isAdmin;
}
public User getAdminUser() {
    User adminUser = null;
    String query = "SELECT * FROM [User] WHERE isAdmin = 1";

    try (Connection conn = DatabaseHelpper.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(query);
         ResultSet rs = pstmt.executeQuery()) {

        if (rs.next()) {
            String username = rs.getString("username");
            String password = rs.getString("password");
            boolean isAdmin = rs.getBoolean("isAdmin");

            adminUser = new User(username, password, isAdmin);
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Handle the exception properly
    }

    return adminUser;
}


}
