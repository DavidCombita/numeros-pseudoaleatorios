package com.uptc.views;

import java.awt.Color;
import java.awt.Dimension;
import java.util.List;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class GraphicPanel extends JFrame {

    private XYSeriesCollection dataset;
    private XYSeries series;
    private JFreeChart chart;
    private int index;
    private static final int WIDTH = 580;
    private static final int HEIGHT = 580;
    private String titulo;

    public GraphicPanel(String titulo) {
        this.titulo = titulo;
        this.setTitle("Pseudoaleatorios " + titulo);
        this.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        this.setLocationRelativeTo(null);
        this.setBackground(Color.WHITE);
        this.setVisible(true);
    }

    public void setData(List<Double> ri) {
        dataset = new XYSeriesCollection();
        series = new XYSeries("Ri");
        index = 0;
        for (Double data : ri) {
            series.add(index++, data);
        }
        dataset.addSeries(series);
        chart = ChartFactory.createScatterPlot("Diagrama de Dispersion "+this.titulo, "", "Ni", dataset, PlotOrientation.VERTICAL,
                false, true, false);
        ChartPanel panel = new ChartPanel(chart);
        this.add(panel);
        panel.updateUI();
    }

    public void resetGraphic() {
        this.removeAll();
    }
}
