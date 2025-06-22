
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JavaQuiz extends JFrame {

    public JavaQuiz() {
        // Set up the JFrame
        setTitle("C++ Textbook");
        setSize(800, 600); // Match the size of the other frames
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setResizable(false);

        // Create a panel with background image
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon background = new ImageIcon("jv.png"); // Provide the path to your image
                g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };
        panel.setLayout(null); // Use absolute layout

        // Create buttons
        JButton backButton = new JButton("");
        JButton nextPageButton = new JButton("");

        // Set bounds for buttons
        backButton.setBounds(72, 472, 100, 40);
        nextPageButton.setBounds(645, 480, 100, 40);

     // Make buttons transparent
        backButton.setOpaque(false);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);

        nextPageButton.setOpaque(false);
        nextPageButton.setContentAreaFilled(false);
        nextPageButton.setBorderPainted(false);
        
        // Add action listener to back button
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Close the current frame
               
                // Open the Textbook frame
                new Challenges(null).setVisible(true);
                dispose();
            }
        });

        // Add action listener to next button
        nextPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Close the current frame
               
                // Open the Homepage frame
                new Homepage().setVisible(true);
                dispose();
            }
        });

        // Add buttons to the panel
        panel.add(backButton);
        panel.add(nextPageButton);

        // Add the panel to the frame
        add(panel);
    }

    public static void main(String[] args) {
        // Create an instance of the JavaText class
        SwingUtilities.invokeLater(() -> new JavaText().setVisible(true));
    }
}
