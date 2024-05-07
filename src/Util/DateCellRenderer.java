import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateCellRenderer extends DefaultTableCellRenderer {

    private SimpleDateFormat originalDateFormat;
    private SimpleDateFormat newDateFormat;

    public DateCellRenderer() {
        originalDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        newDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
//        if (!(value instanceof String)) {
//            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
//        }

        if (value instanceof java.util.Date) {
            java.util.Date date = (java.util.Date) value;
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            setText(sdf.format(date));
        }
        return this;

    }

    
}
