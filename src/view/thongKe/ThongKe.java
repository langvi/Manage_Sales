package view.thongKe;

import base.BaseApp;
import controller.ThongKeController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ThongKe extends javax.swing.JPanel {
    
    ThongKeController controller;
    String day = "";
    String month = "";
    String year = "";
    SimpleDateFormat formatter;
    String message = "";
    
    public ThongKe() {
        initComponents();
        controller = new ThongKeController();
        formatter = new SimpleDateFormat("yyyy-MM-dd");        
        setLabel();
        setEvent();
    }
    
    public void setLabel() {
        String queryCountProduct = "SELECT SUM(`product_number`) FROM product";
        String queryPriceProduct = "SELECT SUM(`retail_price`) FROM product";
        labelCountProduct.setText(controller.fetchData(queryCountProduct));
        float price = Float.parseFloat(controller.fetchData(queryPriceProduct));
        String countPriceCount = BaseApp.formatMoney(price);
        labelCountPriceProduct.setText(countPriceCount + " VND");
        
    }
    
    public void setEvent() {
        cbChoose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox comboBox = (JComboBox) e.getSource();
                Object index = comboBox.getSelectedIndex();
                if (index.equals(0)) {
                    formatter = new SimpleDateFormat("yyyy-MM-dd");
                } else if (index.equals(1)) {
                    formatter = new SimpleDateFormat("MM/yyyy");
                } else if (index.equals(2)) {
                    formatter = new SimpleDateFormat("yyyy");
                }
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelCountProduct = new javax.swing.JLabel();
        labelCountPriceProduct = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableThongKe = new javax.swing.JTable();
        chooseCalendar = new com.toedter.calendar.JDateChooser();
        cbChoose = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Thống Kê Bán Hàng ");
        jLabel2.setToolTipText("");

        jLabel3.setText("Tổng số lượng hàng hóa trong kho:");

        jLabel4.setText("Tổng giá trị sản phẩm:");

        labelCountProduct.setForeground(new java.awt.Color(0, 0, 255));
        labelCountProduct.setText(":");

        labelCountPriceProduct.setForeground(new java.awt.Color(0, 0, 255));
        labelCountPriceProduct.setText(":");

        tableThongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên sản phẩm", "Mã sản phẩm", "Số lượng(Đã bán)", "Giá(VND)", "Tổng(VND)"
            }
        ));
        jScrollPane1.setViewportView(tableThongKe);

        chooseCalendar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                chooseCalendarPropertyChange(evt);
            }
        });

        cbChoose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngày", "Tháng", "Năm" }));

        jLabel1.setText("Chọn thời gian:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelCountPriceProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelCountProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(438, 438, 438)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chooseCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(labelCountProduct))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(labelCountPriceProduct))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cbChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chooseCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chooseCalendarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_chooseCalendarPropertyChange
        Date date = chooseCalendar.getDate();
        String strDate = formatter.format(date);
        controller.fetchDataThongKe(tableThongKe, strDate, message);
        if (!message.isEmpty()) {
            JOptionPane.showMessageDialog(this, message);
        }
    }//GEN-LAST:event_chooseCalendarPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbChoose;
    private com.toedter.calendar.JDateChooser chooseCalendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCountPriceProduct;
    private javax.swing.JLabel labelCountProduct;
    private javax.swing.JTable tableThongKe;
    // End of variables declaration//GEN-END:variables
}
