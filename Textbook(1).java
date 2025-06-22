import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Textbook extends JFrame {

    public Textbook(StudyOrPlay studyOrPlayFrame) {
        // Set up the JFrame
        setTitle("Textbook");
        setSize(800, 600); // Match the size of the other frames
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setResizable(false);

        // Create a panel with a background image
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Load the background image
                ImageIcon imageIcon = new ImageIcon("moduletext.png"); // Change to your image file path
                Image image = imageIcon.getImage();
                // Scale the image to fit the panel
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel.setLayout(null); // Use absolute layout

        // Create 8 buttons with updated names
        JButton exitButton = new JButton("");
        JButton nextButton = new JButton("");
        JButton javaButton = new JButton("");
        JButton pythonButton = new JButton("");
        JButton cPlusPlusButton = new JButton("");
        JButton javascriptButton = new JButton("");
        JButton cssButton = new JButton("");
        JButton htmlButton = new JButton("");

        // Set bounds for each button
        exitButton.setBounds(72, 475, 100, 40);
        nextButton.setBounds(645, 485, 100, 40);
        javaButton.setBounds(260, 160, 120, 30);
        pythonButton.setBounds(260, 203, 120, 30);
        cPlusPlusButton.setBounds(260, 246, 120, 30);
        javascriptButton.setBounds(445, 160, 120, 30);
        cssButton.setBounds(441, 203, 120, 30);
        htmlButton.setBounds(441, 245, 120, 30);

        // Make buttons transparent
        exitButton.setOpaque(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setBorderPainted(false);

        nextButton.setOpaque(false);
        nextButton.setContentAreaFilled(false);
        nextButton.setBorderPainted(false);

        javaButton.setOpaque(false);
        javaButton.setContentAreaFilled(false);
        javaButton.setBorderPainted(false);

        pythonButton.setOpaque(false);
        pythonButton.setContentAreaFilled(false);
        pythonButton.setBorderPainted(false);

        cPlusPlusButton.setOpaque(false);
        cPlusPlusButton.setContentAreaFilled(false);
        cPlusPlusButton.setBorderPainted(false);

        javascriptButton.setOpaque(false);
        javascriptButton.setContentAreaFilled(false);
        javascriptButton.setBorderPainted(false);

        cssButton.setOpaque(false);
        cssButton.setContentAreaFilled(false);
        cssButton.setBorderPainted(false);

        htmlButton.setOpaque(false);
        htmlButton.setContentAreaFilled(false);
        htmlButton.setBorderPainted(false);

        // Add ActionListener to exit button
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Close the textbook frame
                dispose();
                // Make the StudyOrPlay frame visible
                studyOrPlayFrame.setVisible(true);
            }
        });

        // Add ActionListener to Java button
        javaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open the JavaText class
                new JavaText().setVisible(true);
            }
        });

        // Add ActionListener to Python button
        pythonButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open the PythonText class
                new PythonText().setVisible(true);
            }
        });

        // Add ActionListener to C++ button
        cPlusPlusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open the CPlusPlusText class
                new CPlusPlusText().setVisible(true);
            }
        });

        // Add ActionListener to JavaScript button
        javascriptButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open the JavaScriptText class
                new JavaScriptText().setVisible(true);
            }
        });

        // Add ActionListener to CSS button
        cssButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open the CSSText class
                new CSSText().setVisible(true);
            }
        });

        // Add ActionListener to HTML button
        htmlButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open the HTMLText class
                new HTMLText().setVisible(true);
            }
        });

        // Add buttons to the panel
        panel.add(exitButton);
        panel.add(nextButton);
        panel.add(javaButton);
        panel.add(pythonButton);
        panel.add(cPlusPlusButton);
        panel.add(javascriptButton);
        panel.add(cssButton);
        panel.add(htmlButton);

        // Add the panel to the frame
        add(panel);
    }

    public static void main(String[] args) {
        // Create an instance of the StudyOrPlay class
        StudyOrPlay studyOrPlayFrame = new StudyOrPlay(new Homepage());
        // Create an instance of the Textbook class
        SwingUtilities.invokeLater(() -> new Textbook(studyOrPlayFrame).setVisible(true));
    }
}
