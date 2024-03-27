package com.uptc.views;

import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JTabbedPane;
import com.uptc.views.headers.*;

public class TabPanel extends JTabbedPane {

    private MethodPanel midSquare;
    private MethodPanel multiplicative;
    private MethodPanel linear;
    private MethodPanel uniform;
    private MethodPanel normal;

    public TabPanel(ActionListener listener) {
        initComponents(listener);
    }

    private void initComponents(ActionListener listener) {
        midSquare = new MethodPanel(new MiddleSquareHeader(listener));
        this.add("Cuadrados Medios", midSquare);

        multiplicative = new MethodPanel(new MultiplicativeHeader(listener));
        this.add("Congruencial Multiplicativa", multiplicative);

        linear = new MethodPanel(new LinearHeader(listener));
        this.add("Congruencial Lineal", linear);

        uniform = new MethodPanel(new UniformHeader(listener));
        uniform.setTableHeader(new String[] { "Ri", "Ni" });
        this.add("D. Uniforme", uniform);

        normal = new MethodPanel(new NormalHeader(listener));
        normal.setTableHeader(new String[] { "Xi", "Ri" });
        this.add("D. Normal", normal);
    }

    public Header getMidSrtHeader() {
        return midSquare.getHeader();
    }

    public Header getMultHeader() {
        return multiplicative.getHeader();
    }

    public Header getLinHeader() {
        return linear.getHeader();
    }

    public Header getUniHeader() {
        return uniform.getHeader();
    }

    public Header getNormHeader() {
        return normal.getHeader();
    }

    // Middle
    public void setMiddSTableRow(Object[] element) {
        midSquare.setTableRow(element);
    }

    public void resetMiddleTable() {
        midSquare.resetTable();
    }

    public void setGraphicData(List<Double> data, String titulo) {
        new GraphicPanel(titulo).setData(data);
    }

    // Linear
    public void setLinearGraphicData(List<Double> interval, String titulo) {
        new GraphicPanel(titulo).setData(interval);
    }

    public void setLinearTableRow(Object[] element) {
        linear.setTableRow(element);
    }

    public void resetLinearTable() {
        linear.resetTable();
    }

    // Multiplicative
    public void resetMultiplicativeTable() {
        multiplicative.resetTable();
    }

    public void setMultiplicativeGraphicData(List<Double> interval, String titulo) {
        new GraphicPanel(titulo).setData(interval);
    }

    public void setMultiplicativeTableRow(Object[] element) {
        multiplicative.setTableRow(element);
    }

    // Uniform
    public void resetUniformTable() {
        uniform.resetTable();
    }

    public void setUniformGraphicData(List<Double> interval, String titulo) {
        new GraphicPanel(titulo).setData(interval);
    }

    public void setUniformTableRow(Object[] element) {
        uniform.setTableRow(element);
    }

    // Normal
    public void setNormalTableRow(Object[] element) {
        normal.setTableRow(element);
    }

    public void resetNormalTable() {
        normal.resetTable();
    }

    public void setNormalGraphicData(List<Double> interval, String titulo) {
        new GraphicPanel(titulo).setData(interval);
    }
}