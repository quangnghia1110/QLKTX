/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Database;

import View.Admin.MainAdmin;
import View.Authentication.Login;

/**
 *
 * @author ADMIN
 */
public class QLKTX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainAdmin headerAdmin = new MainAdmin();
        Login login = new Login(headerAdmin, true); // Corrected syntax
        login.setVisible(true);
    }
    
}
