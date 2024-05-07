/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Handle.Button;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
public class TableActionCellEditor1 extends DefaultCellEditor{
    private TableActionEvent1 event;

    public TableActionCellEditor1(TableActionEvent1 event) {
        super(new JCheckBox());
        this.event = event;
    }
 
    public TableActionCellEditor1() {
        super(new JCheckBox());
    }

    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int row, int column) {
        PanelAction1 action = new PanelAction1();
        action.initEvent1(event, row);
        action.setBackground(jtable.getSelectionBackground());
        return action;
    }
}
