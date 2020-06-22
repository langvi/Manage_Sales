package controller;

import base.BaseApp;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import model.Customer;
import model.Employee;
import model.Product;

/**
 *
 * @author nguyenthithuylinh
 */
public class NhanVienController {

    // Lay user ID cua nhan vien
    public int fetchUserID(String querySQL) {
        Statement stm;
        try {
            stm = BaseApp.connectDB().createStatement();
            ResultSet result = stm.executeQuery(querySQL);
            result.first();
            int userID = result.getInt("userID");
            return userID;
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    // Lấy dữ liệu từ database nhân viên
    public void callData(String query, JTable table) {
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.setRowCount(0);
        ArrayList<Employee> list = new ArrayList<Employee>();
        try {
            Statement stm = BaseApp.connectDB().createStatement();
            ResultSet result = stm.executeQuery(query);
            while (result.next()) {
                Employee employee = new Employee();
                employee.setId(result.getInt("employeeID"));
                employee.setName(result.getString("name"));
                employee.setBirthday(result.getString("date_of_birth"));
                employee.setPhoneNumber(result.getString("phone_number"));
                employee.setAddress(result.getString("address"));
                employee.setWorkTime(result.getString("time_work"));
                employee.setNumberWorkDay(result.getInt("day_work"));
                employee.setSalary(result.getFloat("salary"));
                list.add(employee);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < list.size(); i++) {
            String[] data = new String[8];

            data[0] = Integer.toString(list.get(i).getId());
            data[1] = list.get(i).getName();
            data[2] = list.get(i).getBirthday();
            data[3] = list.get(i).getPhoneNumber();
            data[4] = list.get(i).getAddress();
            data[5] = list.get(i).getWorkTime();
            int numberDay = list.get(i).getNumberWorkDay();
            data[6] = Integer.toString(numberDay);
            data[7] = BaseApp.formatMoney(list.get(i).getSalary());
            tableModel.addRow(data);
        }
        table.setModel(tableModel);
        tableModel.fireTableDataChanged();
    }

    public void showInforEmployee(String queryData, Employee employee) {
        try {

            Statement st = BaseApp.connectDB().createStatement();
            ResultSet result = st.executeQuery(queryData);
            if (result.first()) {
                employee.setId(result.getInt("employeeID"));
                employee.setName(result.getString("name"));
                employee.setBirthday(result.getString("date_of_birth"));
                employee.setPhoneNumber(result.getString("phone_number"));
                employee.setAddress(result.getString("address"));
                employee.setWorkTime(result.getString("time_work"));
                employee.setNumberWorkDay(result.getInt("day_work"));
                employee.setSalary(result.getFloat("salary"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(NhanVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String convertDateToString(Date date, String format) {
        SimpleDateFormat mySimpleDateFormat = new SimpleDateFormat(format);
        return mySimpleDateFormat.format(date);
    }

    public static Date convertStringToDate(String dateStr, String format) {
        SimpleDateFormat mySimpleDateFormat = new SimpleDateFormat(format);
        try {
            return (Date) mySimpleDateFormat.parse(dateStr);
        } catch (ParseException e) {
            return null;
        }
    }

    // Thêm dữ liệu nhân viên vào database
    public void AddEmployee(String query, String message) {
        try {
            Statement st = BaseApp.connectDB().createStatement();
            st.executeUpdate(query);
            message = "Thêm thành công";
        } catch (SQLException ex) {
            message = "Có lỗi xảy ra";
            Logger.getLogger(NhanVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    public void searchEmployee(String name, JTable table) {
//         DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
//        tableModel.setRowCount(0);
//        ArrayList<Employee> list = new ArrayList<>();
//        try {
//            Statement st = BaseApp.connectDB().createStatement();
//            String query = "SELECT * FROM employees WHERE name = '" + name + "'";
//            ResultSet rs = st.executeQuery(query);
//
//            while (rs.next()) {
//                Employee employee = new Employee();
//                
//                list.add(employee);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(NhanVienController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            String[] data = new String[5];
//            data[0] = list.get(i).getName();
//            data[1] = list.get(i).getId();
//            data[2] = Integer.toString(list.get(i).getProduct_number());
//            data[3] = BaseApp.formatMoney(list.get(i).getRetail_price());
//            data[4] = list.get(i).getCategory();
//            tableModel.addRow(data);
//        }
//        table.setModel(tableModel);
//        tableModel.fireTableDataChanged();
//    }
}
