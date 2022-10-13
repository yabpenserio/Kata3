package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {

    public HistogramDisplay(String title) {
        super(title);
        setContentPane(createPanel());
        pack();
    }
    public void execute(){
        setVisible(true);
    }
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
         JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart",
                "Dominios email","Nº de emails", dataSet, 
                PlotOrientation.VERTICAL, false,false, rootPaneCheckingEnabled);
         return chart;
       
        
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(3,"","ulpgc.es");
        dataset.addValue(1,"","dis.ulpgc.es");
        dataset.addValue(7,"","eii.ulpgc.es");
        dataset.addValue(13,"","gmail.es");
        dataset.addValue(5,"","hotmail.es");
        return dataset;
    }
    
}
