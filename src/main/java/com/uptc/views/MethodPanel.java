package com.uptc.views;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.List;

public class MethodPanel extends JPanel {

    private Header header;
    private JPTable table;

    public MethodPanel(Header header) {
        this.header = header;
        this.setLayout(new BorderLayout());
        initComponents();
    }

    private void initComponents() {
        this.add(header, BorderLayout.NORTH);

        table = new JPTable();
        this.add(table, BorderLayout.WEST);
    }

    public Header getHeader() {
        return header;
    }

    public void setTableRow(Object[] row) {
        table.addRow(row);
    }

    public void resetTable() {
        table.deleteTable();
    }

    public void setGraphicData(List<Double> data, String titulo) {
       new GraphicPanel(titulo).setData(data);
    }

    public void setTableHeader(String[] header) {
        table.setHeader(header);
    }
}
