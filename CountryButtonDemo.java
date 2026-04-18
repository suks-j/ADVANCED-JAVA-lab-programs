package lab4a;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonDemo implements ActionListener {

    JFrame frame;
    JButton btnIndia, btnSrilanka;
    JLabel label;

    public CountryButtonDemo() {
        // Create Frame
        frame = new JFrame("Country Button Demo");

        // Create Buttons
        btnIndia = new JButton("India");
        btnSrilanka = new JButton("Srilanka");

        // Create Label
        label = new JLabel("Press a button", JLabel.CENTER);

        // Set Font
        label.setFont(new Font("Arial", Font.BOLD, 16));

        // Set Layout
        frame.setLayout(new FlowLayout());

        // Add components
        frame.add(btnIndia);
        frame.add(btnSrilanka);
        frame.add(label);

        // Register ActionListener
        btnIndia.addActionListener(this);
        btnSrilanka.addActionListener(this);

        // Frame settings
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Event Handling
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnIndia) {
            label.setText("India is pressed");
        } else if (e.getSource() == btnSrilanka) {
            label.setText("Srilanka is pressed");
        }
    }

    public static void main(String[] args) {
        new CountryButtonDemo();
    }
}
