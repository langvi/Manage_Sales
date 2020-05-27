package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.LoginModel;

public class LoginController {

    String queryUserName = "SELECT user_name FROM user";
    String queryPassword = "SELECT password FROM user";
    String queryPermission = "SELECT * FROM user";
    LoginModel loginModel = new LoginModel();
    
    // Kiểm tra tính hợp lệ của thông tin đăng nhập
    public int CheckValidate(String txtUserName, String txtPassword) {
        if (loginModel.isCheck(queryUserName, txtUserName, "user_name")
                && loginModel.isCheck(queryPassword, txtPassword, "password")) {
            if (loginModel.checkPermission(queryPermission, txtUserName)) {
                return 1; // admin
            } else {
                return 2; // user
            }
        }
        return 0;// failure

    }
   // Lưu mật khẩu của người dùng
    public void savePassword(String path, String userName, String password) {
        File file = new File(path);
        String[] data = {
            userName,
            password
        };
        OutputStream outputStream;
        try {
            outputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

            for (String item : data) {
                outputStreamWriter.write(item);
                outputStreamWriter.write("\n");
            }
            outputStreamWriter.flush();
            outputStream.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Lấy thông tin tài khoản và mật khẩu
    public void readUser(String path, JTextField txtUserName, JPasswordField txtPassword){
        File file = new File(path);
        InputStream inputStream;
        try {
            inputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line = "";
            String[] user = new String[2]; 
            int count = 0;
            while ((line = reader.readLine()) != null) {
                user[count] = line;
                count++;
            }
            inputStream.close();
            txtUserName.setText(user[0]);
            txtPassword.setText(user[1]);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
