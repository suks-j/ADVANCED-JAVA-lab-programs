package lab4a;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class TabbedPaneColorDemo implements ChangeListener {

    JFrame frame;
    JTabbedPane tabbedPane;

    public TabbedPaneColorDemo() {

        // Create Frame
        frame = new JFrame("Tabbed Pane Color Demo");

        // Create TabbedPane
        tabbedPane = new JTabbedPane();

        // Create Panels for each tab
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);

        // Add tabs
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add ChangeListener
        tabbedPane.addChangeListener(this);

        // Add to frame
        frame.add(tabbedPane);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Event handling for tab selection
    public void stateChanged(ChangeEvent e) {
        int index = tabbedPane.getSelectedIndex();
        String title = tabbedPane.getTitleAt(index);

        // Display selected tab color in console
        System.out.println(title + " tab is selected");
    }

    public static void main(String[] args) {
        new TabbedPaneColorDemo();
    }
}
