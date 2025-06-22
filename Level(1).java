import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Level extends JFrame {

    public Level() {
        // Set up the JFrame
        setTitle("Instruction");
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
                ImageIcon background = new ImageIcon("Level.jpg"); // Provide the path to your image
                Image image = background.getImage();
                // Scale the image to fit the panel
                g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
            }
        };
        panel.setLayout(null); // Use absolute layout

        // Create buttons
        JButton backButton = new JButton("");
        JButton nextPageButton = new JButton("");
        JButton easy = new JButton("");
        JButton average = new JButton("");
        JButton hard = new JButton("");

        
        // Set bounds for buttons
        backButton.setBounds(72, 472, 100, 40);
        nextPageButton.setBounds(645, 478, 100, 40);
        easy.setBounds(330, 132, 150, 54);
        average.setBounds(315, 205, 180, 54);
        hard.setBounds(330, 280, 150, 54);
        
        // Make buttons transparent
        backButton.setOpaque(false);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);

        nextPageButton.setOpaque(false);
        nextPageButton.setContentAreaFilled(false);
        nextPageButton.setBorderPainted(false);

  // Make buttons transparent
        easy.setOpaque(false);
        easy.setContentAreaFilled(false);
        easy.setBorderPainted(false);

        average.setOpaque(false);
        average.setContentAreaFilled(false);
        average.setBorderPainted(false);

        hard.setOpaque(false);
        hard.setContentAreaFilled(false);
        hard.setBorderPainted(false);



        // Add action listener to back button
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Close the current frame
                dispose();
                // Open the Textbook frame
                new Challenges(null).setVisible(true);
            }
        });

        // Add action listener to next button
        nextPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Close the current frame
                dispose();
                // Open the Homepage frame
                new JavaQuizNew1().setVisible(true);
            }
        });
        
        // Add action listener to next button
        easy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Close the current frame
                dispose();
                // Open the Homepage frame
                new JavaQuizNew1().setVisible(true);
            }
        });
        
        // Add action listener to next button
        average.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Close the current frame
                dispose();
                // Open the Homepage frame
                new JavaQuizNew1().setVisible(true);
            }
        });
        
        // Add action listener to next button
        hard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Close the current frame
                dispose();
                // Open the Homepage frames
                new JavaQuizNew1().setVisible(true);
            }
        });
        // Add buttons to the panel
        panel.add(backButton);
        panel.add(nextPageButton);
        panel.add(easy);
        panel.add(average);
        panel.add(hard);
        
        // Add the panel to the frame
        add(panel);
    }

    public static void main(String[] args) {
        // Create an instance of the Instruction class
        SwingUtilities.invokeLater(() -> new Level().setVisible(true));
    }
}
