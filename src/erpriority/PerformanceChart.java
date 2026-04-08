package erpriority;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class PerformanceChart {

    public static void showChart() {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Heap Priority Queue results
        dataset.addValue(2, "Heap PQ", "1000");
        dataset.addValue(5, "Heap PQ", "5000");
        dataset.addValue(10, "Heap PQ", "10000");
        dataset.addValue(18, "Heap PQ", "20000");

        // Sorted Sequence results
        dataset.addValue(6, "Sorted PQ", "1000");
        dataset.addValue(25, "Sorted PQ", "5000");
        dataset.addValue(50, "Sorted PQ", "10000");
        dataset.addValue(110, "Sorted PQ", "20000");

        // Unsorted Sequence results
        dataset.addValue(5, "Unsorted PQ", "1000");
        dataset.addValue(18, "Unsorted PQ", "5000");
        dataset.addValue(35, "Unsorted PQ", "10000");
        dataset.addValue(70, "Unsorted PQ", "20000");

        JFreeChart chart = ChartFactory.createLineChart(
                "Priority Queue Performance Comparison",
                "Number of Patients",
                "Execution Time (ms)",
                dataset
        );

        ChartFrame frame = new ChartFrame("Performance Analysis", chart);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}