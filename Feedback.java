import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Feedback extends JFrame {

    public Feedback() {
        // Set up the JFrame
        setTitle("Feedback");
        setSize(800, 600); // Match the size of the other frames
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setResizable(false);

        // Create a panel with background image
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Load the background image
                ImageIcon background = new ImageIcon("feedback.png"); // Provide the path to your image
                Image image = background.getImage();
                // Scale the image to fit the panel
                g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
            }
        };
        panel.setLayout(null); // Use absolute layout

        // Create buttons
        JButton backButton = new JButton("");
        JButton submit = new JButton("");

        // Set bounds for buttons
        backButton.setBounds(72, 472, 100, 40);
        submit.setBounds(645, 480, 100, 40);
        
        // Make buttons transparent
        backButton.setOpaque(false);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);

        submit.setOpaque(false);
        submit.setContentAreaFilled(false);
        submit.setBorderPainted(false);

        // Add action listener to back button
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Close the current frame
                dispose();
                // Open the Textbook frame
                new Homepage().setVisible(true);
            }
        });

        // Add action listener to next button
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Close the current frame
                dispose();
                // Open the Homepage frame
                new SUB().setVisible(true);
            }
        });

        // Create a JTextArea for feedback
        JTextArea feedbackArea = new JTextArea();
        feedbackArea.setBounds(265, 120, 280, 230); // Set bounds for the text area
        feedbackArea.setLineWrap(true); // Enable line wrapping
        feedbackArea.setWrapStyleWord(true); // Wrap at word boundaries
        feedbackArea.setFont(new Font("Arial", Font.PLAIN, 16)); // Set font and size

        // Add the textarea to the panel
        panel.add(feedbackArea);

        // Add buttons to the panel
        panel.add(backButton);
        panel.add(submit);

        // Add the panel to the frame
        add(panel);
    }

    public static void main(String[] args) {
        // Create an instance of the Instruction class
        SwingUtilities.invokeLater(() -> new Feedback().setVisible(true));
    }
}
