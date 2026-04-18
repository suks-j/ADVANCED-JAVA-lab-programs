package lab4a;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CountryListDemo implements ListSelectionListener {

    JFrame frame;
    JList<String> countryList;

    public CountryListDemo() {

        // Create Frame
        frame = new JFrame("Country List Demo");

        // Countries array
        String countries[] = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Create JList
        countryList = new JList<>(countries);

        // Set selection mode (single selection)
        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add ListSelectionListener
        countryList.addListSelectionListener(this);

        // Add JList inside JScrollPane
        JScrollPane scrollPane = new JScrollPane(countryList);

        // Add to frame
        frame.add(scrollPane, BorderLayout.CENTER);

        // Frame settings
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Event handling method
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            String selectedCountry = countryList.getSelectedValue();
            System.out.println(selectedCountry + " is selected");
        }
    }

    public static void main(String[] args) {
        new CountryListDemo();
    }
}
