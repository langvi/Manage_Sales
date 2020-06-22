package controller;

import base.BaseApp;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.OrderProduct;

public class ThongKeController {

    public ArrayList<OrderProduct> fetchData(String query) {
        ArrayList<OrderProduct> listOrder = new ArrayList<>();
        try {
            Statement st = BaseApp.connectDB().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                OrderProduct orderProduct = new OrderProduct();
                orderProduct.setOrder_ID(rs.getInt("order_ID"));
                orderProduct.setProduct_ID(rs.getInt("productID"));
                orderProduct.setTotal_product(rs.getInt("total_product"));
                listOrder.add(orderProduct);
            }
            return listOrder;

        } catch (SQLException ex) {
            Logger.getLogger(ThongKeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listOrder;
    }
}
