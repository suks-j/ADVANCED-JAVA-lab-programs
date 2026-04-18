package lab4a;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo implements ActionListener {

    JFrame frame;
    JButton btnClock, btnHourGlass;
    JLabel label;

    public ImageButtonDemo() {

        // Create Frame
        frame = new JFrame("Image Button Demo");

        // Load Images (Make sure images are in project folder)
        ImageIcon clockIcon = new ImageIcon("digital_clock.png");
        ImageIcon hourGlassIcon = new ImageIcon("hourglass.png");

        // Create Buttons with images
        btnClock = new JButton("Digital Clock", clockIcon);
        btnHourGlass = new JButton("Hour Glass", hourGlassIcon);

        // Create Label
        label = new JLabel("Press a button", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 16));

        // Layout
        frame.setLayout(new FlowLayout());

        // Add components
        frame.add(btnClock);
        frame.add(btnHourGlass);
        frame.add(label);

        // Register ActionListener
        btnClock.addActionListener(this);
        btnHourGlass.addActionListener(this);

        // Frame settings
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Event Handling
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnClock) {
            label.setText("Digital Clock is pressed");
        } else if (e.getSource() == btnHourGlass) {
            label.setText("Hour Glass is pressed");
        }
    }

    public static void main(String[] args) {
        new ImageButtonDemo();
    }
}
