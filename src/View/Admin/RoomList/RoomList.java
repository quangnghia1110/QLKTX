package View.Admin.RoomList;

import Handle.PanelRound;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicScrollBarUI;
import Model.Room;
import Dao.RoomDAO;
import View.Notification.ConfirmRoom;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import View.Admin.RoomList.Message;
import Handle.PanelRound;
import Model.Student;
import View.Notification.SuccessfulExportAndImport;
import java.util.ArrayList;

public class RoomList extends javax.swing.JPanel {

    RoomDAO daoR = new RoomDAO();
    private List<Room> lR = daoR.getAll();
    private ArrayList<Room> list;
    public RoomList() {
        initComponents();
        loadingRoom(lR);
        JScrollPane scrollPane = new JScrollPane(roomContainer);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 20, 10));
        scrollPane.getVerticalScrollBar().setUI(new ThinnerScrollBarUI());
        add(scrollPane);
    }

    private Object getListFilter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void showListStudent(Object listFilter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    class ThinnerScrollBarUI extends BasicScrollBarUI {

        @Override
        protected JButton createDecreaseButton(int orientation) {
            return createButton();
        }

        @Override
        protected JButton createIncreaseButton(int orientation) {
            return createButton();
        }

        private JButton createButton() {
            JButton button = new JButton();
            button.setPreferredSize(new Dimension(0, 0));
            button.setMinimumSize(new Dimension(0, 0));
            button.setMaximumSize(new Dimension(0, 0));
            return button;
        }

        @Override
        protected void configureScrollBarColors() {
            trackColor = Color.LIGHT_GRAY;
            setThumbBounds(0, 0, 0, 0);
            super.configureScrollBarColors();
        }

        @Override
        protected void installDefaults() {
            super.installDefaults();
            scrollBarWidth = 8; // Adjust the scrollbar width as needed
            scrollbar.setBorder(BorderFactory.createEmptyBorder());
        }

        @Override
        protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
            if (!thumbBounds.isEmpty() && this.scrollbar.isEnabled()) {
                g.setColor(Color.DARK_GRAY);
                g.fillRect(thumbBounds.x, thumbBounds.y, thumbBounds.width, thumbBounds.height);
            }
        }
    }

    public void loadingRoom(List<Room> lR) {
        roomContainer.removeAll();
        roomContainer.setLayout(new BoxLayout(roomContainer, BoxLayout.Y_AXIS));

        JPanel rowPanel = createRowPanel();

        for (Room r : lR) {
            JPanel roomPanel = createRoomPanel(r);
            roomPanel.setBackground(Color.white);
            rowPanel.add(roomPanel);
            if (rowPanel.getComponentCount() % 5 == 0) {
                roomContainer.add(rowPanel);
                rowPanel = createRowPanel();
            }
        }
        if (rowPanel.getComponentCount() > 0) {
            roomContainer.add(rowPanel);
        }
        roomContainer.revalidate();
        roomContainer.repaint();
    }

    private JPanel createRowPanel() {
        JPanel rowPanel = new JPanel();
        rowPanel.setBackground(Color.white);
        rowPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        return rowPanel;
    }

    private JPanel createRoomPanel(Room room) {
        JPanel roomPanel = new JPanel();
        JLabel iconRoom = new JLabel();
        PanelRound panelRound1 = new PanelRound();
        PanelRound panelRoundC = new PanelRound();
        JLabel nameRoom = new JLabel();
        JLabel deleteRoom = new JLabel();
        JLabel editRoom = new JLabel();
        editRoom.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                EditRoom dialogRoom = new EditRoom(null, true, room, RoomList.this);
                dialogRoom.setVisible(true);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                editRoom.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                editRoom.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        deleteRoom.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String msgString;
                String type;
                ConfirmRoom confirm = new ConfirmRoom(null, true, "Bạn có chắc chắn muốn xóa phòng này?");
                confirm.setVisible(true);
                Boolean isConfirm = confirm.isConfirmed();
                confirm.dispose();
                if (isConfirm) {
                    if (daoR.delete(room.getName()) > 0) {
                        loadingRoom(daoR.getAll());
                        msgString = "Thành công";
                        type = "succes";
                        Message msg = new Message(null, true, msgString, type);
                        msg.setVisible(true);
                    } else {
                        msgString = "Không thể xóa vì có người ở";
                        type = "err";
                        Message msg = new Message(null, true, msgString, type);
                        msg.setVisible(true);
                    }
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                deleteRoom.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                deleteRoom.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        iconRoom.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                DetailRoom dialogRoom = new DetailRoom(null, true, room);
                dialogRoom.setVisible(true);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                iconRoom.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                iconRoom.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        });

        iconRoom.setIcon(new ImageIcon(getClass().getResource("/img/roomListIcon120x120.png")));
        panelRound1.setBackground(null);
        panelRound1.setRoundBottomLeft(25);
        panelRound1.setRoundBottomRight(25);
        panelRound1.setRoundTopLeft(25);
        panelRound1.setRoundTopRight(25);
        panelRoundC.setBackground(new Color(17,144,119));
        panelRoundC.setRoundBottomLeft(15);
        panelRoundC.setRoundBottomRight(15);
        panelRoundC.setRoundTopLeft(15);
        panelRoundC.setRoundTopRight(15);
        nameRoom.setFont(new Font("Segoe UI", Font.BOLD, 18));
        nameRoom.setForeground(Color.BLACK);
        nameRoom.setText(room.getName().toUpperCase());
        deleteRoom.setIcon(new ImageIcon(getClass().getResource("/img/deleteRoomIcon.png")));
        editRoom.setIcon(new ImageIcon(getClass().getResource("/img/editRoomIcon.png")));

        GroupLayout panelCLayout = new GroupLayout(panelRoundC);
        panelRoundC.setLayout(panelCLayout);
        panelCLayout.setHorizontalGroup(
                panelCLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelCLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(editRoom)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteRoom)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCLayout.setVerticalGroup(
                panelCLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelCLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelCLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(editRoom, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(deleteRoom, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        GroupLayout panelRound1Layout = new GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
                panelRound1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelRound1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(nameRoom)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelRoundC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
                panelRound1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelRound1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(nameRoom, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(panelRound1Layout.createSequentialGroup()
                                .addComponent(panelRoundC, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        GroupLayout roomPanelLayout = new GroupLayout(roomPanel);
        roomPanel.setLayout(roomPanelLayout);
        roomPanelLayout.setHorizontalGroup(
                roomPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(roomPanelLayout.createSequentialGroup()
                                .addContainerGap(18, Short.MAX_VALUE)
                                .addGroup(roomPanelLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                        .addComponent(iconRoom)
                                        .addComponent(panelRound1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        roomPanelLayout.setVerticalGroup(
                roomPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(roomPanelLayout.createSequentialGroup()
                                .addContainerGap(18, Short.MAX_VALUE)
                                .addComponent(iconRoom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panelRound1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        return roomPanel;
    }

    public void animationClick(PanelRound panel, String beforeColor) {
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

        header = new javax.swing.JPanel();
        panelRound4 = new Handle.PanelRound();
        panelRound3 = new Handle.PanelRound();
        txtSearch = new javax.swing.JTextField();
        searchBtn = new javax.swing.JLabel();
        panelRound5 = new Handle.PanelRound();
        addingRoomPanel = new Handle.PanelRound();
        addBtn = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panelRound2 = new Handle.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        panelRound10 = new Handle.PanelRound();
        panelRound1 = new Handle.PanelRound();
        borderPanel = new Handle.PanelRound();
        filterButton = new javax.swing.JLabel();
        panelRound16 = new Handle.PanelRound();
        panelRound15 = new Handle.PanelRound();
        panelRound6 = new Handle.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        comboBoxBlock = new javax.swing.JComboBox<>();
        panelRound14 = new Handle.PanelRound();
        panelRound7 = new Handle.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        comboBoxType = new javax.swing.JComboBox<>();
        roomContainer = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        header.setBackground(new java.awt.Color(255, 255, 255));

        panelRound4.setBackground(new java.awt.Color(17, 144, 119));
        panelRound4.setRoundBottomLeft(50);
        panelRound4.setRoundBottomRight(50);
        panelRound4.setRoundTopLeft(50);
        panelRound4.setRoundTopRight(50);

        panelRound3.setBackground(new java.awt.Color(255, 255, 255));
        panelRound3.setRoundBottomLeft(40);
        panelRound3.setRoundBottomRight(40);
        panelRound3.setRoundTopLeft(40);
        panelRound3.setRoundTopRight(40);

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSearch.setBorder(null);

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        panelRound4.add(panelRound3);

        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/findingIcon.png"))); // NOI18N
        searchBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchBtnMouseEntered(evt);
            }
        });
        panelRound4.add(searchBtn);

        panelRound5.setBackground(new java.awt.Color(17, 144, 119));
        panelRound5.setRoundBottomLeft(50);
        panelRound5.setRoundBottomRight(50);
        panelRound5.setRoundTopLeft(50);
        panelRound5.setRoundTopRight(50);

        addingRoomPanel.setBackground(new java.awt.Color(255, 255, 255));
        addingRoomPanel.setRoundBottomLeft(40);
        addingRoomPanel.setRoundBottomRight(40);
        addingRoomPanel.setRoundTopLeft(40);
        addingRoomPanel.setRoundTopRight(40);
        addingRoomPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addingRoomPanelMouseClicked(evt);
            }
        });
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 2);
        flowLayout1.setAlignOnBaseline(true);
        addingRoomPanel.setLayout(flowLayout1);

        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addingIcon.png"))); // NOI18N
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });
        addingRoomPanel.add(addBtn);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Thêm phòng");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addingRoomPanel.add(jLabel7);

        panelRound5.add(addingRoomPanel);

        panelRound2.setBackground(new java.awt.Color(17, 144, 119));
        panelRound2.setRoundBottomLeft(20);
        panelRound2.setRoundBottomRight(20);
        panelRound2.setRoundTopLeft(20);
        panelRound2.setRoundTopRight(20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DANH SÁCH PHÒNG");

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRound10.setBackground(new java.awt.Color(17, 144, 119));
        panelRound10.setPreferredSize(new java.awt.Dimension(360, 50));
        panelRound10.setRoundBottomLeft(50);
        panelRound10.setRoundBottomRight(20);
        panelRound10.setRoundTopLeft(50);
        panelRound10.setRoundTopRight(20);
        panelRound10.setLayout(new java.awt.CardLayout(5, 5));

        panelRound1.setBackground(new java.awt.Color(17, 144, 119));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setLayout(new java.awt.BorderLayout(5, 0));

        borderPanel.setBackground(new java.awt.Color(17, 144, 119));
        borderPanel.setRoundBottomLeft(50);
        borderPanel.setRoundBottomRight(50);
        borderPanel.setRoundTopLeft(50);
        borderPanel.setRoundTopRight(50);
        borderPanel.setLayout(new java.awt.CardLayout(1, 1));

        filterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/filterIcon.png"))); // NOI18N
        filterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        filterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filterButtonMouseClicked(evt);
            }
        });
        borderPanel.add(filterButton, "card2");

        panelRound1.add(borderPanel, java.awt.BorderLayout.LINE_START);

        panelRound16.setBackground(new java.awt.Color(17, 144, 119));
        panelRound16.setRoundBottomLeft(10);
        panelRound16.setRoundBottomRight(10);
        panelRound16.setRoundTopLeft(10);
        panelRound16.setRoundTopRight(10);
        panelRound16.setLayout(new java.awt.BorderLayout(5, 0));

        panelRound15.setBackground(new java.awt.Color(255, 255, 255));
        panelRound15.setRoundBottomLeft(10);
        panelRound15.setRoundBottomRight(10);
        panelRound15.setRoundTopLeft(10);
        panelRound15.setRoundTopRight(10);
        panelRound15.setLayout(new java.awt.CardLayout(5, 3));

        panelRound6.setBackground(new java.awt.Color(255, 255, 255));
        panelRound6.setMinimumSize(new java.awt.Dimension(92, 36));
        panelRound6.setPreferredSize(new java.awt.Dimension(159, 40));
        panelRound6.setRoundBottomLeft(10);
        panelRound6.setRoundBottomRight(10);
        panelRound6.setRoundTopLeft(10);
        panelRound6.setRoundTopRight(10);
        panelRound6.setLayout(new java.awt.BorderLayout(10, 5));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Dãy");
        panelRound6.add(jLabel8, java.awt.BorderLayout.LINE_START);

        comboBoxBlock.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "A", "B", "C", "D", "E" }));
        comboBoxBlock.setBorder(null);
        comboBoxBlock.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxBlock.setPreferredSize(new java.awt.Dimension(50, 23));
        panelRound6.add(comboBoxBlock, java.awt.BorderLayout.CENTER);

        panelRound15.add(panelRound6, "card2");

        panelRound16.add(panelRound15, java.awt.BorderLayout.LINE_START);

        panelRound14.setBackground(new java.awt.Color(255, 255, 255));
        panelRound14.setRoundBottomLeft(10);
        panelRound14.setRoundBottomRight(10);
        panelRound14.setRoundTopLeft(10);
        panelRound14.setRoundTopRight(10);
        panelRound14.setLayout(new java.awt.CardLayout(5, 2));

        panelRound7.setBackground(new java.awt.Color(255, 255, 255));
        panelRound7.setPreferredSize(new java.awt.Dimension(140, 40));
        panelRound7.setRoundBottomLeft(10);
        panelRound7.setRoundBottomRight(10);
        panelRound7.setRoundTopLeft(10);
        panelRound7.setRoundTopRight(10);
        panelRound7.setLayout(new java.awt.BorderLayout(10, 5));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Loại");
        panelRound7.add(jLabel6, java.awt.BorderLayout.LINE_START);

        comboBoxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Thường", "VIP" }));
        comboBoxType.setBorder(null);
        comboBoxType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxType.setPreferredSize(new java.awt.Dimension(70, 23));
        panelRound7.add(comboBoxType, java.awt.BorderLayout.CENTER);

        panelRound14.add(panelRound7, "card2");

        panelRound16.add(panelRound14, java.awt.BorderLayout.CENTER);

        panelRound1.add(panelRound16, java.awt.BorderLayout.CENTER);

        panelRound10.add(panelRound1, "card2");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelRound10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        add(header, java.awt.BorderLayout.PAGE_START);

        roomContainer.setBackground(new java.awt.Color(255, 255, 255));
        add(roomContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        CreateRoom dialog = new CreateRoom(null, true, this);
        dialog.setVisible(true);
    }//GEN-LAST:event_addBtnMouseClicked

    private void searchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseClicked
        List<Room> lRn;
        lRn = daoR.getRoomsName(txtSearch.getText().toLowerCase());
        roomContainer.removeAll();
        roomContainer.revalidate();
        if (lRn.isEmpty()) {
            Message messageDialog = new Message((java.awt.Frame) null, true, "Không tìm thấy!", "err");
            messageDialog.setVisible(true);
            roomContainer.repaint();
        } else {
            loadingRoom(lRn);
            roomContainer.repaint();
        }

        
    }//GEN-LAST:event_searchBtnMouseClicked

    private void addingRoomPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addingRoomPanelMouseClicked
        // TODO add your handling code here:
        animationClick(addingRoomPanel, "#ffffff");
        CreateRoom dialog = new CreateRoom(null, true, this);
        dialog.setVisible(true);
    }//GEN-LAST:event_addingRoomPanelMouseClicked

    private void searchBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBtnMouseEntered

    }//GEN-LAST:event_searchBtnMouseEntered

    public List<Room> getListFilter() {
        List<Room> resultFilter = new ArrayList<>();
        String selectedBlock = String.valueOf(comboBoxBlock.getSelectedItem());
        String selectedType = String.valueOf(comboBoxType.getSelectedItem());
        boolean type = false;
        if (selectedType.equals("VIP"))
            type = true;
        for (Room room : lR) {
            
            if (selectedBlock.equals("Tất cả")&& !selectedType.equals("Tất cả")){
                if (room.getType()== type){
                    resultFilter.add(room);
                }
            }
            else if (!selectedBlock.equals("Tất cả")&& selectedType.equals("Tất cả")){
                if (room.getBlock().equalsIgnoreCase(selectedBlock)){
                    resultFilter.add(room);
                }
            }
            else {
                if (room.getBlock().equalsIgnoreCase(selectedBlock) && room.getType() == type){
                    resultFilter.add(room);
                }
            }
        }
        return resultFilter;
    }
    private void filterButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterButtonMouseClicked
        animationClick(borderPanel,"#119077");
        if (String.valueOf(comboBoxBlock.getSelectedItem()).equals("Tất cả") && String.valueOf(comboBoxType.getSelectedItem()).equals("Tất cả")){
            loadingRoom(lR);
        }
        else if (getListFilter().isEmpty()) {
            SuccessfulExportAndImport notFound = new SuccessfulExportAndImport(null, true, "Không tìm thấy kết quả phù hợp!");
            notFound.setVisible(true);
            loadingRoom(lR);
        }
        else {
            loadingRoom(getListFilter());
        }
    }//GEN-LAST:event_filterButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addBtn;
    private Handle.PanelRound addingRoomPanel;
    private Handle.PanelRound borderPanel;
    private javax.swing.JComboBox<String> comboBoxBlock;
    private javax.swing.JComboBox<String> comboBoxType;
    private javax.swing.JLabel filterButton;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private Handle.PanelRound panelRound1;
    private Handle.PanelRound panelRound10;
    private Handle.PanelRound panelRound14;
    private Handle.PanelRound panelRound15;
    private Handle.PanelRound panelRound16;
    private Handle.PanelRound panelRound2;
    private Handle.PanelRound panelRound3;
    private Handle.PanelRound panelRound4;
    private Handle.PanelRound panelRound5;
    private Handle.PanelRound panelRound6;
    private Handle.PanelRound panelRound7;
    public javax.swing.JPanel roomContainer;
    private javax.swing.JLabel searchBtn;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
