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
        panelRoundC.setBackground(new Color(17, 144, 119));
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
        roomContainer = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        header.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 767, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        add(header, java.awt.BorderLayout.PAGE_START);

        roomContainer.setBackground(new java.awt.Color(255, 255, 255));
        add(roomContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void addingRoomPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addingRoomPanelMouseClicked
        // TODO add your handling code here:
        animationClick(addingRoomPanel, "#ffffff");
        CreateRoom dialog = new CreateRoom(null, true, this);
        dialog.setVisible(true);
    }//GEN-LAST:event_addingRoomPanelMouseClicked

    public List<Room> getListFilter() {
        List<Room> resultFilter = new ArrayList<>();
        String selectedBlock = String.valueOf(comboBoxBlock.getSelectedItem());
        String selectedType = String.valueOf(comboBoxType.getSelectedItem());
        boolean type = "VIP".equals(selectedType);

        for (Room room : lR) {
            if ("Tất cả".equals(selectedBlock) && !"Tất cả".equals(selectedType) && room.getType() == type) {
                resultFilter.add(room);
            } else if (!"Tất cả".equals(selectedBlock) && "Tất cả".equals(selectedType) && room.getBlock().equalsIgnoreCase(selectedBlock)) {
                resultFilter.add(room);
            } else if (room.getBlock().equalsIgnoreCase(selectedBlock) && room.getType() == type) {
                resultFilter.add(room);
            }
        }
        return resultFilter;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel header;
    public javax.swing.JPanel roomContainer;
    // End of variables declaration//GEN-END:variables
}
