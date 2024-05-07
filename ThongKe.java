/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Service.ThongKeService;
import java.awt.CardLayout;
//import java.awt.Dimension;
import java.util.List;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.time.SimpleTimePeriod;

import java.awt.Dimension;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class ThongKe {

    private ThongKeService thongKeService = null;

    public ThongKe() {
        this.thongKeService = new ThongKeService();
    }

    public void setDataToChart1(JPanel jpnItem) {
        List<Student> listItem = thongKeService.getListByStudent();

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if (listItem != null) {
            for (Student item : listItem) {
                //dataset.addValue(item.getId(), "Số sinh viên", item.getRoom());
                dataset.addValue(Double.valueOf(item.getId()), "Số sinh viên", item.getRoom());

            }
        }

        JFreeChart barChart = ChartFactory.createBarChart(
                "Số sinh viên ở từng dãy".toUpperCase(),
                "Dãy", "Số sinh viên",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 321));

        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }

    public void setDataToChart2(JPanel jpnItem) {
        List<Student> listItem = thongKeService.getListByStudent();

        DefaultPieDataset dataset = new DefaultPieDataset();
        if (listItem != null) {
            for (Student item : listItem) {
                //dataset.addValue(item.getId(), "Số sinh viên", item.getRoom());
                dataset.setValue(item.getRoom(), Double.valueOf(item.getId()));

            }
        }

        JFreeChart pieChart = ChartFactory.createPieChart(
                "Phân phối số sinh viên theo phòng".toUpperCase(),
                dataset, true, true, false);

        ChartPanel chartPanel = new ChartPanel(pieChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 321));

        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }

    public void setDataToChart3(JPanel jpnItem) {
        List<Student> listItem = thongKeService.getListByStudent();

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if (listItem != null) {
            for (Student item : listItem) {
                // Thêm dữ liệu vào dataset
                dataset.addValue(Double.valueOf(item.getId()), "Số sinh viên", item.getRoom());
            }
        }

        // Tạo biểu đồ đường
        JFreeChart lineChart = ChartFactory.createLineChart(
                "Biểu đồ số sinh viên ở từng dãy", // Tiêu đề biểu đồ
                "Dãy", // Nhãn trục x
                "Số sinh viên", // Nhãn trục y
                dataset, // Dataset
                PlotOrientation.VERTICAL, // Hướng biểu đồ
                true, // Có hiển thị legend không
                true, // Có tooltips không
                false // Có URLs không
        );

        // Tạo panel chứa biểu đồ
        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 321));

        // Xóa và thêm panel vào jpnItem
        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }

    

}
