
package view.nhanVien;

public class NhanVien extends javax.swing.JPanel {
    public NhanVien() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_TTNV = new javax.swing.JLabel();
        jTextField_Born = new javax.swing.JTextField();
        checkbox_Male = new java.awt.Checkbox();
        jButton_New = new javax.swing.JButton();
        jLabel_Addr = new javax.swing.JLabel();
        jLabel_Name = new javax.swing.JLabel();
        jTextField_Addr = new javax.swing.JTextField();
        jLabel_ID = new javax.swing.JLabel();
        jButton_Save = new javax.swing.JButton();
        checkbox_Female = new java.awt.Checkbox();
        jButton_Exit = new javax.swing.JButton();
        jLabel_Sex = new javax.swing.JLabel();
        btnSchedule = new javax.swing.JButton();
        jTextField_PhoneNumber = new javax.swing.JTextField();
        jComboBox_State = new javax.swing.JComboBox<>();
        jButton_Delete = new javax.swing.JButton();
        jTextField_Name = new javax.swing.JTextField();
        jButton_Update = new javax.swing.JButton();
        jLabel_PhoneNumber = new javax.swing.JLabel();
        jLabel_Born = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        scrollbar1 = new java.awt.Scrollbar();
        jButton_Pass = new javax.swing.JButton();
        jComboBox_Location = new javax.swing.JComboBox<>();
        jTextField_ID = new javax.swing.JTextField();

        jLabel_TTNV.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_TTNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TTNV.setText("QUẢN LÝ NHÂN VIÊN");

        jTextField_Born.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        checkbox_Male.setLabel("Nam ");

        jButton_New.setText("+ Thêm mới");
        jButton_New.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NewActionPerformed(evt);
            }
        });

        jLabel_Addr.setText("Địa chỉ");

        jLabel_Name.setText("Tên nhân viên");

        jTextField_Addr.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel_ID.setText("Mã nhân viên");

        jButton_Save.setText("Lưu");
        jButton_Save.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        checkbox_Female.setLabel("Nữ");

        jButton_Exit.setText("Đóng");
        jButton_Exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExitActionPerformed(evt);
            }
        });

        jLabel_Sex.setText("Giới tính");

        btnSchedule.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSchedule.setText("Lương & Lịch làm việc");
        btnSchedule.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleActionPerformed(evt);
            }
        });

        jTextField_PhoneNumber.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jComboBox_State.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trạng thái", "Tất cả", "Đang hoạt động", "Ngừng hoạt động", " " }));
        jComboBox_State.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_StateActionPerformed(evt);
            }
        });

        jButton_Delete.setText("Xóa");
        jButton_Delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField_Name.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButton_Update.setText("Sửa");
        jButton_Update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel_PhoneNumber.setText("Số điện thoại");

        jLabel_Born.setText("Ngày sinh");

        panel1.setBackground(new java.awt.Color(204, 204, 204));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ tên", "Chức vụ", "Giới tính", "Ngày sinh", "Số điện thoại", "Địa chỉ", "Trạng thái"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1143, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
        );

        jButton_Pass.setText("Bỏ qua");
        jButton_Pass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jComboBox_Location.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chức vụ", "Nhân viên Fulltime", "Nhân viên Parttime", "Quản lý" }));
        jComboBox_Location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_LocationActionPerformed(evt);
            }
        });

        jTextField_ID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel_TTNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(214, 214, 214))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton_New, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButton_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel_Sex, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(checkbox_Male, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(checkbox_Female, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox_State, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox_Location, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_Born, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Born, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(330, 330, 330))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_Addr, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_Addr, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_TTNV, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Sex, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkbox_Male, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkbox_Female, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_Addr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Addr, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Born, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Born, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_State, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_Location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Update)
                    .addComponent(jButton_New)
                    .addComponent(jButton_Delete)
                    .addComponent(jButton_Save)
                    .addComponent(jButton_Pass)
                    .addComponent(jButton_Exit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NewActionPerformed
        // TODO add your handling code here:
//        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
//        model.addRow(new Object[]{jTextField_ID.getText(),
//            jTextField_Name.getText(),
//            jComboBox_Location.getSelectedItem().toString(),
//
//        });
//        String ID = jTextField_ID.getText();
//        String name = jTextField_Name.getText();
//        String phonenumber = jTextField_PhoneNumber.getText();
//        String address = jTextField_Addr.getText();
//        String birthday = jTextField_Born.getText();
    }//GEN-LAST:event_jButton_NewActionPerformed

    private void jButton_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExitActionPerformed
        // TODO add your handling code here:
//        System.exit(0);
    }//GEN-LAST:event_jButton_ExitActionPerformed

    private void btnScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleActionPerformed
        new Schedule().setVisible(true);
    }//GEN-LAST:event_btnScheduleActionPerformed

    private void jComboBox_StateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_StateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_StateActionPerformed

    private void jComboBox_LocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_LocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_LocationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSchedule;
    private java.awt.Checkbox checkbox_Female;
    private java.awt.Checkbox checkbox_Male;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Exit;
    private javax.swing.JButton jButton_New;
    private javax.swing.JButton jButton_Pass;
    private javax.swing.JButton jButton_Save;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JComboBox<String> jComboBox_Location;
    private javax.swing.JComboBox<String> jComboBox_State;
    private javax.swing.JLabel jLabel_Addr;
    private javax.swing.JLabel jLabel_Born;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_PhoneNumber;
    private javax.swing.JLabel jLabel_Sex;
    private javax.swing.JLabel jLabel_TTNV;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField_Addr;
    private javax.swing.JTextField jTextField_Born;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_PhoneNumber;
    private java.awt.Panel panel1;
    private java.awt.Scrollbar scrollbar1;
    // End of variables declaration//GEN-END:variables
}
