/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.Dataset;
import org.jfree.ui.ApplicationFrame;

/**
 *
 * @author Luis Pérez
 */
public class HistogramDisplay extends ApplicationFrame{

    private final Histogram<String> histogram;
    
    public HistogramDisplay(Histogram<String> histo) {
       super("Histograma");
       this.histogram= histo;
       setContentPane(createPanel());
       pack();
       
      
    }
    
    public void execute(){
        setVisible(true);
        
    }
    
    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createdChart(createDataSet()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        
        return chartPanel;
    }
    
    private JFreeChart createdChart(DefaultCategoryDataset dataSet){
        JFreeChart chart= ChartFactory.createBarChart(
                "Histogram",
                "dominios emails",
                "nº de mails recibidos",
                dataSet,
                PlotOrientation.VERTICAL,
                false,
                rootPaneCheckingEnabled,
                rootPaneCheckingEnabled);
        return chart;
        
        }
    
    private DefaultCategoryDataset createDataSet(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        for (String key : histogram.keySet()) {
            dataSet.addValue(histogram.get(key), "", key);
            
        }
        return dataSet;
    }
    
    

    
}
