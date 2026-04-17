package lab4a;
import javax.swing.*;
import java.awt.*;
public class HelloSwing {

	    public static void main(String[] args) {

	        // Create JFrame
	        JFrame frame = new JFrame("Swing Hello Program");

	        // Create JLabel
	        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming", JLabel.CENTER);

	        // Set font (Plain, size 32)
	        label.setFont(new Font("Arial", Font.PLAIN, 32));

	        // Set text color to Blue
	        label.setForeground(Color.BLUE);

	        // Add label to frame
	        frame.add(label);

	        // Frame settings
	        frame.setSize(700, 200);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLocationRelativeTo(null); // center on screen

	        // Make frame visible
	        frame.setVisible(true);
	    }
	}