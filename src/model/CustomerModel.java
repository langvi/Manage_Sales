package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import data.Customer;

public class CustomerModel {

    Connection connection = new ConnectDatabase().connectDB();

    // Lấy dữ liệu từ database khách hàng
    public void fetchData(String query, JTable table) {
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.setRowCount(0);
        ArrayList<Customer> list = new ArrayList<Customer>();
        try {
            Statement stm = connection.createStatement();
            ResultSet result = stm.executeQuery(query);
            while (result.next()) {
                Customer customer = new Customer();
                customer.setId(result.getString("customerID"));
                customer.setName(result.getString("name"));
                customer.setYearOfBirth(result.getString("year_of_birth"));
                customer.setPhoneNumber(result.getString("number_phone"));
                customer.setAddress(result.getString("address"));
                list.add(customer);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CustomerModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < list.size(); i++) {
            String[] data = new String[5];

            data[0] = list.get(i).getId();
            data[1] = list.get(i).getName();
            data[2] = list.get(i).getYearOfBirth();
            data[3] = list.get(i).getPhoneNumber();
            data[4] = list.get(i).getAddress();
            tableModel.addRow(data);
        }
        table.setModel(tableModel);
        tableModel.fireTableDataChanged();
    }

    // Thêm dữ liệu khách hàng vào database
    public void AddDatabase(String query, Customer customer) {
        try {
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, customer.getName());
            pst.setString(2, customer.getYearOfBirth());
            pst.setString(3, customer.getPhoneNumber());
            pst.setString(4, customer.getAddress());
            pst.execute();

        } catch (SQLException ex) {
            Logger.getLogger(CustomerModel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
