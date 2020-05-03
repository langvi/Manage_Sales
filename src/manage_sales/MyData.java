/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manage_sales;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lang vi
 */
class MyData {

    public Connection conn;

    public boolean isConnect(String url, String userName, String pass) {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, pass);
            if (conn != null) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MyData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

//    public void listCustomers() {
//        try {
//            Statement st = conn.createStatement();
//            ResultSet rs = st.executeQuery("Select * from customer");
//            while (rs.next()) {
//                System.out.println(rs.getString("Họ tên"));
//            }
//            rs.close();
//            st.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(MyData.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}
