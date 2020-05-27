
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LoginModel {
    Connection  connection = new ConnectDatabase().connectDB();
    public boolean isCheck(String query, String checkString, String columnName) {
        try {
            Statement stm = connection.createStatement();
            ResultSet result = stm.executeQuery(query);
            while (result.next()) {
                if (result.getString(columnName).equals(checkString)) {
                    return true;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(LoginModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    // Kiểm tra quyền của tài khoản đăng nhập
    public boolean checkPermission(String query, String userName){
        String permissionString = "admin";
        try {
            Statement stm = connection.createStatement();
            ResultSet result = stm.executeQuery(query);
            while (result.next()) {
                if(result.getString("user_name").equals(userName)){
                    if(result.getString("permission").equals(permissionString)){
                        return true;
                    }
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(LoginModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
