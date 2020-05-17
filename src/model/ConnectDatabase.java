/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConnectDatabase {
    public Connection connectDB() {
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/mydata?autoReconnect=true&useSSL=false",
                    "root", "");
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
