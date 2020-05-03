/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manage_sales;

import view.Login;

/**
 *
 * @author lang vi
 */
public class Manage_Sales {
    public static void main(String[] args) {
       Login login = new Login();
       login.setVisible(true);
       login.setResizable(false);
//        MyData data = new MyData();
//        if(data.isConnect("jdbc:mysql://localhost:3306/hello","vi", "123456")){
//            System.out.println("Thanh cong");
//        }
//        else{
//            System.out.println("That bai");
//        }
//        data.listCustomers();
    }
    
}
