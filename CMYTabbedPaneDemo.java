package lab4a;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CMYTabbedPaneDemo implements ChangeListener {

    JFrame frame;
    JTabbedPane tabbedPane;

    public CMYTabbedPaneDemo() {

        // Create Frame
        frame = new JFrame("CMY Tabbed Pane Demo");

        // Create TabbedPane
        tabbedPane = new JTabbedPane();

        // Create Panels
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add Tabs
        tabbedPane.addTab("CYAN", cyanPanel);
        tabbedPane.addTab("MAGENTA", magentaPanel);
        tabbedPane.addTab("YELLOW", yellowPanel);

        // Add ChangeListener
        tabbedPane.addChangeListener(this);

        // Add to Frame
        frame.add(tabbedPane);

        // Frame Settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Event Handling
    public void stateChanged(ChangeEvent e) {
        int index = tabbedPane.getSelectedIndex();
        String tabName = tabbedPane.getTitleAt(index);

        // Display selected tab
        System.out.println(tabName + " tab is selected");
    }

    public static void main(String[] args) {
        new CMYTabbedPaneDemo();
    }
}