/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Admin;

import Handle.PanelRound;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.Timer;
import View.Authentication.Logout;
import javax.swing.BorderFactory;



/**
 *
 * @author LUUTHANH
 */
public class MenuAdmin extends javax.swing.JPanel {

    public MenuAdmin() {
        initComponents();
    }
    
    private MainAdmin headerAdmin;

    public void setHeaderAdmin(MainAdmin headerAdmin) {
        this.headerAdmin = headerAdmin;
    }
    
    public void animationClick (PanelRound panel, String beforeColor) {
        panel.setBackground(new Color(221, 242, 253, 128));
        Timer timer = new Timer(250, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.decode(beforeColor));
                ((Timer) e.getSource()).stop();
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        panelRound1 = new Handle.PanelRound();
        jPanel1 = new javax.swing.JPanel();
        panelRound2 = new Handle.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pn_sinhvien = new Handle.PanelRound();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pn_phong = new Handle.PanelRound();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pn_trangchu = new Handle.PanelRound();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pn_xetduyet = new Handle.PanelRound();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pn_thongke = new Handle.PanelRound();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pn_lichtruc = new Handle.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pn_thongbao = new Handle.PanelRound();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pn_hoadon = new Handle.PanelRound();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        pn_dangxuat = new Handle.PanelRound();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        pn_avatar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(17, 144, 119));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 789));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 789));

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quản lí");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        pn_sinhvien.setBackground(new java.awt.Color(17, 144, 119));
        pn_sinhvien.setPreferredSize(new java.awt.Dimension(171, 48));
        pn_sinhvien.setRoundBottomLeft(15);
        pn_sinhvien.setRoundBottomRight(15);
        pn_sinhvien.setRoundTopLeft(15);
        pn_sinhvien.setRoundTopRight(15);
        pn_sinhvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_sinhvienMouseClicked(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/peopleIcon.png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sinh viên");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pn_sinhvienLayout = new javax.swing.GroupLayout(pn_sinhvien);
        pn_sinhvien.setLayout(pn_sinhvienLayout);
        pn_sinhvienLayout.setHorizontalGroup(
            pn_sinhvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_sinhvienLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        pn_sinhvienLayout.setVerticalGroup(
            pn_sinhvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_sinhvienLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(pn_sinhvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pn_phong.setBackground(new java.awt.Color(17, 144, 119));
        pn_phong.setPreferredSize(new java.awt.Dimension(122, 48));
        pn_phong.setRoundBottomLeft(15);
        pn_phong.setRoundBottomRight(15);
        pn_phong.setRoundTopLeft(15);
        pn_phong.setRoundTopRight(15);
        pn_phong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_phongMouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/roomIcon.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phòng");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pn_phongLayout = new javax.swing.GroupLayout(pn_phong);
        pn_phong.setLayout(pn_phongLayout);
        pn_phongLayout.setHorizontalGroup(
            pn_phongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_phongLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_phongLayout.setVerticalGroup(
            pn_phongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_phongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pn_trangchu.setBackground(new java.awt.Color(17, 144, 119));
        pn_trangchu.setPreferredSize(new java.awt.Dimension(151, 50));
        pn_trangchu.setRoundBottomLeft(15);
        pn_trangchu.setRoundBottomRight(15);
        pn_trangchu.setRoundTopLeft(15);
        pn_trangchu.setRoundTopRight(15);
        pn_trangchu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_trangchuMouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/homeIcon_1.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Trang chủ");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_trangchuLayout = new javax.swing.GroupLayout(pn_trangchu);
        pn_trangchu.setLayout(pn_trangchuLayout);
        pn_trangchuLayout.setHorizontalGroup(
            pn_trangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_trangchuLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_trangchuLayout.setVerticalGroup(
            pn_trangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn_trangchuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        pn_xetduyet.setBackground(new java.awt.Color(17, 144, 119));
        pn_xetduyet.setPreferredSize(new java.awt.Dimension(122, 48));
        pn_xetduyet.setRoundBottomLeft(15);
        pn_xetduyet.setRoundBottomRight(15);
        pn_xetduyet.setRoundTopLeft(15);
        pn_xetduyet.setRoundTopRight(15);
        pn_xetduyet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_xetduyetMouseClicked(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Xét duyệt");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/approvingIcon.png"))); // NOI18N
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pn_xetduyetLayout = new javax.swing.GroupLayout(pn_xetduyet);
        pn_xetduyet.setLayout(pn_xetduyetLayout);
        pn_xetduyetLayout.setHorizontalGroup(
            pn_xetduyetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_xetduyetLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_xetduyetLayout.setVerticalGroup(
            pn_xetduyetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_xetduyetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_xetduyetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addContainerGap())
        );

        pn_thongke.setBackground(new java.awt.Color(17, 144, 119));
        pn_thongke.setPreferredSize(new java.awt.Dimension(122, 48));
        pn_thongke.setRoundBottomLeft(15);
        pn_thongke.setRoundBottomRight(15);
        pn_thongke.setRoundTopLeft(15);
        pn_thongke.setRoundTopRight(15);
        pn_thongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_thongkeMouseClicked(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Thống kê");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/statisticIcon.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pn_thongkeLayout = new javax.swing.GroupLayout(pn_thongke);
        pn_thongke.setLayout(pn_thongkeLayout);
        pn_thongkeLayout.setHorizontalGroup(
            pn_thongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_thongkeLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_thongkeLayout.setVerticalGroup(
            pn_thongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_thongkeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tổng quan");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        pn_lichtruc.setBackground(new java.awt.Color(17, 144, 119));
        pn_lichtruc.setRoundBottomLeft(15);
        pn_lichtruc.setRoundBottomRight(15);
        pn_lichtruc.setRoundTopLeft(15);
        pn_lichtruc.setRoundTopRight(15);
        pn_lichtruc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_lichtrucMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/scheduleIcon.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Lịch trực");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pn_lichtrucLayout = new javax.swing.GroupLayout(pn_lichtruc);
        pn_lichtruc.setLayout(pn_lichtrucLayout);
        pn_lichtrucLayout.setHorizontalGroup(
            pn_lichtrucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_lichtrucLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_lichtrucLayout.setVerticalGroup(
            pn_lichtrucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_lichtrucLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_lichtrucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        pn_thongbao.setBackground(new java.awt.Color(17, 144, 119));
        pn_thongbao.setRoundBottomLeft(15);
        pn_thongbao.setRoundBottomRight(15);
        pn_thongbao.setRoundTopLeft(15);
        pn_thongbao.setRoundTopRight(15);
        pn_thongbao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_thongbaoMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Thông báo");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/notificationIcon.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pn_thongbaoLayout = new javax.swing.GroupLayout(pn_thongbao);
        pn_thongbao.setLayout(pn_thongbaoLayout);
        pn_thongbaoLayout.setHorizontalGroup(
            pn_thongbaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_thongbaoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_thongbaoLayout.setVerticalGroup(
            pn_thongbaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_thongbaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_thongbaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        pn_hoadon.setBackground(new java.awt.Color(17, 144, 119));
        pn_hoadon.setRoundBottomLeft(15);
        pn_hoadon.setRoundBottomRight(15);
        pn_hoadon.setRoundTopLeft(15);
        pn_hoadon.setRoundTopRight(15);
        pn_hoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_hoadonMouseClicked(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/billIcon.png"))); // NOI18N
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Hóa đơn");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pn_hoadonLayout = new javax.swing.GroupLayout(pn_hoadon);
        pn_hoadon.setLayout(pn_hoadonLayout);
        pn_hoadonLayout.setHorizontalGroup(
            pn_hoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_hoadonLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_hoadonLayout.setVerticalGroup(
            pn_hoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_hoadonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_hoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pn_dangxuat.setBackground(new java.awt.Color(17, 144, 119));
        pn_dangxuat.setRoundBottomLeft(15);
        pn_dangxuat.setRoundBottomRight(15);
        pn_dangxuat.setRoundTopLeft(15);
        pn_dangxuat.setRoundTopRight(15);
        pn_dangxuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_dangxuatMouseClicked(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/log_outIcon.png"))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Đăng xuất");
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pn_dangxuatLayout = new javax.swing.GroupLayout(pn_dangxuat);
        pn_dangxuat.setLayout(pn_dangxuatLayout);
        pn_dangxuatLayout.setHorizontalGroup(
            pn_dangxuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dangxuatLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_dangxuatLayout.setVerticalGroup(
            pn_dangxuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dangxuatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_dangxuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_trangchu, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
            .addComponent(pn_sinhvien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
            .addComponent(pn_dangxuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn_thongke, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
            .addComponent(pn_xetduyet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 111, Short.MAX_VALUE))
            .addComponent(pn_hoadon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn_thongbao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pn_phong, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(pn_lichtruc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(pn_trangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_sinhvien, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_phong, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_xetduyet, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_thongke, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_lichtruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_thongbao, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_hoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_dangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);

        pn_avatar.setBackground(new java.awt.Color(17, 144, 119));
        pn_avatar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pn_avatar.setPreferredSize(new java.awt.Dimension(275, 80));
        pn_avatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_avatarMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Xin chào, Lương Chin Du");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quản trị viên");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adminIcon.png"))); // NOI18N

        javax.swing.GroupLayout pn_avatarLayout = new javax.swing.GroupLayout(pn_avatar);
        pn_avatar.setLayout(pn_avatarLayout);
        pn_avatarLayout.setHorizontalGroup(
            pn_avatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_avatarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_avatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addGroup(pn_avatarLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addContainerGap())))
        );
        pn_avatarLayout.setVerticalGroup(
            pn_avatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_avatarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pn_avatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_avatarLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24))
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(44, 44, 44))
        );

        add(pn_avatar, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void pn_sinhvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_sinhvienMouseClicked
        headerAdmin.addStudentListToBody();
        pn_sinhvien.setBackground(Color.decode("#CC9966"));
        pn_avatar.setBackground(Color.decode("#119077"));
        pn_dangxuat.setBackground(Color.decode("#119077"));
        pn_hoadon.setBackground(Color.decode("#119077"));
        pn_lichtruc.setBackground(Color.decode("#119077"));
        pn_phong.setBackground(Color.decode("#119077"));
        pn_thongbao.setBackground(Color.decode("#119077"));
        pn_thongke.setBackground(Color.decode("#119077"));
        pn_trangchu.setBackground(Color.decode("#119077"));
        pn_xetduyet.setBackground(Color.decode("#119077"));
    }//GEN-LAST:event_pn_sinhvienMouseClicked

    private void pn_phongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_phongMouseClicked
        headerAdmin.addRoomListToBody();
        pn_sinhvien.setBackground(Color.decode("#119077"));
        pn_avatar.setBackground(Color.decode("#119077"));
        pn_dangxuat.setBackground(Color.decode("#119077"));
        pn_hoadon.setBackground(Color.decode("#119077"));
        pn_lichtruc.setBackground(Color.decode("#119077"));
        pn_phong.setBackground(Color.decode("#CC9966"));
        pn_thongbao.setBackground(Color.decode("#119077"));
        pn_thongke.setBackground(Color.decode("#119077"));
        pn_trangchu.setBackground(Color.decode("#119077"));
        pn_xetduyet.setBackground(Color.decode("#119077"));
    }//GEN-LAST:event_pn_phongMouseClicked

    private void pn_trangchuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_trangchuMouseClicked
        headerAdmin.addHomeToBody();
        pn_sinhvien.setBackground(Color.decode("#119077"));
        pn_avatar.setBackground(Color.decode("#119077"));
        pn_dangxuat.setBackground(Color.decode("#119077"));
        pn_hoadon.setBackground(Color.decode("#119077"));
        pn_lichtruc.setBackground(Color.decode("#119077"));
        pn_phong.setBackground(Color.decode("#119077"));
        pn_thongbao.setBackground(Color.decode("#119077"));
        pn_thongke.setBackground(Color.decode("#119077"));
        pn_trangchu.setBackground(Color.decode("#CC9966"));
        pn_xetduyet.setBackground(Color.decode("#119077"));
    }//GEN-LAST:event_pn_trangchuMouseClicked

    private void pn_xetduyetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_xetduyetMouseClicked
        headerAdmin.addApprovingToBody();
        pn_sinhvien.setBackground(Color.decode("#119077"));
        pn_avatar.setBackground(Color.decode("#119077"));
        pn_dangxuat.setBackground(Color.decode("#119077"));
        pn_hoadon.setBackground(Color.decode("#119077"));
        pn_lichtruc.setBackground(Color.decode("#119077"));
        pn_phong.setBackground(Color.decode("#119077"));
        pn_thongbao.setBackground(Color.decode("#119077"));
        pn_thongke.setBackground(Color.decode("#119077"));
        pn_trangchu.setBackground(Color.decode("#119077"));
        pn_xetduyet.setBackground(Color.decode("#CC9966"));
    }//GEN-LAST:event_pn_xetduyetMouseClicked

    private void pn_thongkeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_thongkeMouseClicked
        // TODO add your handling code here:
        headerAdmin.addThongKeToBody();
        pn_sinhvien.setBackground(Color.decode("#119077"));
        pn_avatar.setBackground(Color.decode("#119077"));
        pn_dangxuat.setBackground(Color.decode("#119077"));
        pn_hoadon.setBackground(Color.decode("#119077"));
        pn_lichtruc.setBackground(Color.decode("#119077"));
        pn_phong.setBackground(Color.decode("#119077"));
        pn_thongbao.setBackground(Color.decode("#119077"));
        pn_thongke.setBackground(Color.decode("#CC9966"));
        pn_trangchu.setBackground(Color.decode("#119077"));
        pn_xetduyet.setBackground(Color.decode("#119077"));
    }//GEN-LAST:event_pn_thongkeMouseClicked

    private void pn_avatarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_avatarMouseClicked
        pn_sinhvien.setBackground(Color.decode("#119077"));
        pn_avatar.setBackground(Color.decode("#CC9966"));
        pn_dangxuat.setBackground(Color.decode("#119077"));
        pn_hoadon.setBackground(Color.decode("#119077"));
        pn_lichtruc.setBackground(Color.decode("#119077"));
        pn_phong.setBackground(Color.decode("#119077"));
        pn_thongbao.setBackground(Color.decode("#119077"));
        pn_thongke.setBackground(Color.decode("#119077"));
        pn_trangchu.setBackground(Color.decode("#119077"));
        pn_xetduyet.setBackground(Color.decode("#119077"));
    }//GEN-LAST:event_pn_avatarMouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void pn_lichtrucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_lichtrucMouseClicked
        headerAdmin.addDutyScheduleToBody();
        pn_sinhvien.setBackground(Color.decode("#119077"));
        pn_avatar.setBackground(Color.decode("#119077"));
        pn_dangxuat.setBackground(Color.decode("#119077"));
        pn_hoadon.setBackground(Color.decode("#119077"));
        pn_lichtruc.setBackground(Color.decode("#CC9966"));
        pn_phong.setBackground(Color.decode("#119077"));
        pn_thongbao.setBackground(Color.decode("#119077"));
        pn_thongke.setBackground(Color.decode("#119077"));
        pn_trangchu.setBackground(Color.decode("#119077"));
        pn_xetduyet.setBackground(Color.decode("#119077"));
    }//GEN-LAST:event_pn_lichtrucMouseClicked

    private void pn_thongbaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_thongbaoMouseClicked
        headerAdmin.addNotificationToBody();
        pn_sinhvien.setBackground(Color.decode("#119077"));
        pn_avatar.setBackground(Color.decode("#119077"));
        pn_dangxuat.setBackground(Color.decode("#119077"));
        pn_hoadon.setBackground(Color.decode("#119077"));
        pn_lichtruc.setBackground(Color.decode("#119077"));
        pn_phong.setBackground(Color.decode("#119077"));
        pn_thongbao.setBackground(Color.decode("#CC9966"));
        pn_thongke.setBackground(Color.decode("#119077"));
        pn_trangchu.setBackground(Color.decode("#119077"));
        pn_xetduyet.setBackground(Color.decode("#119077"));
        
    }//GEN-LAST:event_pn_thongbaoMouseClicked

    private void pn_hoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_hoadonMouseClicked
        pn_sinhvien.setBackground(Color.decode("#119077"));
        pn_avatar.setBackground(Color.decode("#119077"));
        pn_dangxuat.setBackground(Color.decode("#119077"));
        pn_hoadon.setBackground(Color.decode("#CC9966"));
        pn_lichtruc.setBackground(Color.decode("#119077"));
        pn_phong.setBackground(Color.decode("#119077"));
        pn_thongbao.setBackground(Color.decode("#119077"));
        pn_thongke.setBackground(Color.decode("#119077"));
        pn_trangchu.setBackground(Color.decode("#119077"));
        pn_xetduyet.setBackground(Color.decode("#119077"));
    }//GEN-LAST:event_pn_hoadonMouseClicked

    private void pn_dangxuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_dangxuatMouseClicked
        pn_sinhvien.setBackground(Color.decode("#119077"));
        pn_avatar.setBackground(Color.decode("#119077"));
        pn_dangxuat.setBackground(Color.decode("#CC9966"));
        pn_hoadon.setBackground(Color.decode("#119077"));
        pn_lichtruc.setBackground(Color.decode("#119077"));
        pn_phong.setBackground(Color.decode("#119077"));
        pn_thongbao.setBackground(Color.decode("#119077"));
        pn_thongke.setBackground(Color.decode("#119077"));
        pn_trangchu.setBackground(Color.decode("#119077"));
        pn_xetduyet.setBackground(Color.decode("#119077"));
        Logout logout = new Logout();
        logout.setMainJFrame(headerAdmin);
        logout.setVisible(true);
    }//GEN-LAST:event_pn_dangxuatMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private Handle.PanelRound panelRound1;
    private Handle.PanelRound panelRound2;
    private javax.swing.JPanel pn_avatar;
    private Handle.PanelRound pn_dangxuat;
    private Handle.PanelRound pn_hoadon;
    private Handle.PanelRound pn_lichtruc;
    private Handle.PanelRound pn_phong;
    private Handle.PanelRound pn_sinhvien;
    private Handle.PanelRound pn_thongbao;
    private Handle.PanelRound pn_thongke;
    private Handle.PanelRound pn_trangchu;
    private Handle.PanelRound pn_xetduyet;
    // End of variables declaration//GEN-END:variables
}
