package controller;

import base.BaseApp;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.OrderProduct;
import model.Product;

public class ThongKeController {

    public OrderProduct fetchOrderProduct(String query) {
        OrderProduct orderProduct = new OrderProduct();
        try {
            Statement st = BaseApp.connectDB().createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.first();
            orderProduct.setOrder_ID(rs.getInt("order_ID"));
            orderProduct.setProduct_ID(rs.getInt("productID"));
            orderProduct.setTotal_product(rs.getInt("total_product"));

        } catch (SQLException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orderProduct;
    }

    public void fetchDataThongKe(JTable table, String time, String message) {
        String queryOrderID = "SELECT order_ID FROM orders WHERE create_at = '" + time + "'";
        String queryOrderProduct = "SELECT * FROM `order_product` WHERE order_ID = ";
        String queryProduct = "SELECT product_name, retail_price FROM product WHERE productID = ";
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.setRowCount(0);
        //
        ArrayList<Integer> listOrderID = new ArrayList<Integer>(); // cac ma hoa don trong thoi gian
        ArrayList<OrderProduct> listOrderProduct = new ArrayList<>(); // 
        ArrayList<Product> listProduct = new ArrayList<>(); // danh sach cac san pham
        //
        listOrderID = fetchOrderId(queryOrderID, message);

        if (!listOrderID.isEmpty()) {
            for (Integer integer : listOrderID) {
                listOrderProduct.add(fetchOrderProduct(queryOrderProduct + integer));

            }
            // lay thong tin san pham tu hoa don chi tiet san pham
            for (OrderProduct orderProduct : listOrderProduct) {
                listProduct.add(fetchProduct(queryProduct + orderProduct.getProduct_ID()));
            }

            // table can ten san pham, ma san pham,so luong tu hoa don, gia san pham, 
            for (int i = 0; i < listProduct.size(); i++) {
                String[] data = new String[5];
                data[0] = listProduct.get(i).getName();
                data[1] = Integer.toString(listOrderProduct.get(i).getProduct_ID());
                data[2] = Integer.toString(listOrderProduct.get(i).getTotal_product());
                data[3] = BaseApp.formatMoney(listProduct.get(i).getRetail_price());
                float total = listOrderProduct.get(i).getTotal_product() * listProduct.get(i).getRetail_price();
                data[4] = BaseApp.formatMoney(total);
                tableModel.addRow(data);
            }
        } else {
            message = "Không có dữ liệu";
        }
        table.setModel(tableModel);
        tableModel.fireTableDataChanged();

    }

    public ArrayList<Integer> fetchOrderId(String query, String message) {
        ArrayList<Integer> listOrderID = new ArrayList<>();
        try {
            Statement st = BaseApp.connectDB().createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.first()) {
                listOrderID.add(rs.getInt("order_ID"));
                while (rs.next()) {
                    listOrderID.add(rs.getInt("order_ID"));
                }
                return listOrderID;
            } else {
                message = "Không có kết quả nào";
            }

        } catch (SQLException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listOrderID;
    }

    public Product fetchProduct(String query) {
        Product product = new Product();
        try {
            Statement st = BaseApp.connectDB().createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.first();
            product.setName(rs.getString("product_name"));
            product.setRetail_price(rs.getFloat("retail_price"));

        } catch (SQLException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product;

    }

    public String fetchData(String query) {
        String data = "";
        Statement st;
        try {
            st = BaseApp.connectDB().createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.first();
            data = rs.getString(1);

        } catch (SQLException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
}
