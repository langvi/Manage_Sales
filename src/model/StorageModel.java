
package model;

import data.productProperties;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StorageModel {
    Connection conn = new ConnectDatabase().connectDB();
    // Fetching database Prodution display on the Table
    public void fetch_production_db(String query, JTable table)
    {
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        tableModel.setRowCount(0);
        ArrayList<productProperties> list = new ArrayList<productProperties>();
        
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {
                productProperties product = new productProperties();
                product.setName(rs.getString("name_product"));
                product.setProduct_code(rs.getString("product_code"));
                product.setProduct_number(rs.getInt("sum"));
                product.setRetail_price(rs.getInt("retail_price"));
                product.setCategory(rs.getString("category"));
                list.add(product);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StorageModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < list.size(); i++)
        {
            String[] data = new String[5];
            data[0] = list.get(i).getName();
            data[1] = list.get(i).getProduct_code();
            data[2] = Integer.toString(list.get(i).getProduct_number());
            data[3] = Integer.toString(list.get(i).getRetail_price());
            data[4] = list.get(i).getCategory();
            tableModel.addRow(data);
        }
        table.setModel(tableModel);
        tableModel.fireTableDataChanged();
    }
}
