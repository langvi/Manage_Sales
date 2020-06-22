package view;

import base.BaseApp;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import view.thongKe.ThongKe;
import view.hoaDon.HoaDon;
import view.nhanVien.NhanVien;
import view.khachHang.KhachHang;
import view.hangHoa.HangHoa;
import view.nhanVien.Schedule;

public class Home extends javax.swing.JFrame {

    HangHoa khoHang;
    KhachHang khachHang;
    NhanVien nhanVien;
    Schedule schedule;
    HoaDon hoaDon;
    ThongKe thongKe;

    public Home() {
        super.setTitle("QUẢN LÍ BÁN HÀNG");
        initComponents();
        khoHang = new HangHoa();
        khachHang = new KhachHang();
        nhanVien = new NhanVien();
        schedule = new Schedule();
        hoaDon = new HoaDon();
        thongKe = new ThongKe();
        TabbedPaneHome.addTab("Kho hàng", khoHang);
        TabbedPaneHome.addTab("Khách hàng", khachHang);
        if (BaseApp.permission == 1) {
            TabbedPaneHome.addTab("Nhân viên", nhanVien);
        } else {
            TabbedPaneHome.addTab("Nhân viên", schedule);

        }
        TabbedPaneHome.addTab("Hóa đơn", hoaDon);
        TabbedPaneHome.addTab("Thống kê", thongKe);
//        setEvent();
    }

    public final void setEvent() {
        TabbedPaneHome.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                System.out.println("Tab: " + TabbedPaneHome.getSelectedIndex());
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelHome = new javax.swing.JPanel();
        TabbedPaneHome = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelHome.setPreferredSize(new java.awt.Dimension(1000, 600));

        TabbedPaneHome.setToolTipText("");

        javax.swing.GroupLayout PanelHomeLayout = new javax.swing.GroupLayout(PanelHome);
        PanelHome.setLayout(PanelHomeLayout);
        PanelHomeLayout.setHorizontalGroup(
            PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPaneHome)
        );
        PanelHomeLayout.setVerticalGroup(
            PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHomeLayout.createSequentialGroup()
                .addComponent(TabbedPaneHome)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelHome, javax.swing.GroupLayout.DEFAULT_SIZE, 1295, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelHome, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelHome;
    private javax.swing.JTabbedPane TabbedPaneHome;
    // End of variables declaration//GEN-END:variables
}
