package lab4a;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;

public class CountryCapitalDemo implements ListSelectionListener {

    JFrame frame;
    JList<String> countryList;
    HashMap<String, String> capitalMap;

    public CountryCapitalDemo() {

        // Create Frame
        frame = new JFrame("Country Capital Demo");

        // Countries array
        String countries[] = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Create JList
        countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Create HashMap for country-capital mapping
        capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "No single capital"); // continent
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        // Add ListSelectionListener
        countryList.addListSelectionListener(this);

        // Add JList inside JScrollPane
        JScrollPane scrollPane = new JScrollPane(countryList);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Frame settings
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Event Handling
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()) {
            String selectedCountry = countryList.getSelectedValue();
            String capital = capitalMap.get(selectedCountry);

            System.out.println("Capital of " + selectedCountry + " is: " + capital);
        }
    }

    public static void main(String[] args) {
        new CountryCapitalDemo();
    }
}
