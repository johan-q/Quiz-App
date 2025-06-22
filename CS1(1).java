

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CS1 extends JFrame {

    public CS1() {
        // Set up the JFrame
        setTitle("Java Play");
        setSize(800, 600); // Match the size of the other frames
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setResizable(false);

        // Create a panel with background image
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon background = new ImageIcon("CS1.png"); // Provide the path to your image
                g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };
        panel.setLayout(null); // Use absolute layout

        // Create buttons with custom bounds
        JButton aButton = new JButton(""); // Create button 'a'
        JButton bButton = new JButton(""); // Create button 'b'
        JButton cButton = new JButton(""); // Create button 'c'
        JButton dButton = new JButton(""); // Create button 'd'

        // Create a visible button
        JButton backtochallenges = new JButton();

        // Set bounds for buttons
        aButton.setBounds(250, 210, 80, 30); // x, y, width, height
        bButton.setBounds(250, 270, 80, 30);
        cButton.setBounds(440, 210, 80, 30);
        dButton.setBounds(440, 270, 80, 30);

        backtochallenges.setBounds(30, 463, 110, 50); // Set bounds for back button

        // Make buttons transparent
        makeButtonTransparent(aButton);
        makeButtonTransparent(bButton);
        makeButtonTransparent(cButton);
        makeButtonTransparent(dButton);
        makeButtonTransparent(backtochallenges);

        // Add action listeners to buttons
        addListener(aButton, new Congratulated());
        addListener(bButton, new Errored());
        addListener(cButton, new Errored());
        addListener(dButton, new Errored());
        addBackButtonListener(backtochallenges);

        // Add buttons to the panel
        panel.add(aButton);
        panel.add(bButton);
        panel.add(cButton);
        panel.add(dButton);
        panel.add(backtochallenges);

        // Add the panel to the frame
        add(panel);
    }

    private void makeButtonTransparent(JButton button) {
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
    }

    private void addListener(JButton button, JFrame frame) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(true);
                dispose();
            }
        });
    }

    private void addBackButtonListener(JButton button) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Challenges(null).setVisible(true);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CS1().setVisible(true));
    }

    static class Congratulated extends JFrame {
        public Congratulated() {
            // Set up the JFrame
            setTitle("Congratulation");
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
                    ImageIcon background = new ImageIcon("cong.png"); // Provide the path to your image
                    Image image = background.getImage();
                    // Scale the image to fit the panel
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
                }
            };
            panel.setLayout(null); // Use absolute layout

            // Create buttons
            JButton backtochallenges = new JButton("");
            JButton JAVAQ4 = new JButton("");

            // Set bounds for buttons
            backtochallenges.setBounds(72, 472, 100, 40);
            JAVAQ4.setBounds(645, 480, 100, 40);

            // Make buttons transparent
            makeButtonTransparent(backtochallenges);
            makeButtonTransparent(JAVAQ4);

            // Add action listener to back button
            backtochallenges.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Close the current frame
                    new Challenges(null).setVisible(true);
                    dispose();
                }
            });

            // Add action listener to next button
            JAVAQ4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Close the current frame
                    new CS2().setVisible(true);
                    dispose();
                }
            });

            // Add buttons to the panel
            panel.add(backtochallenges);
            panel.add(JAVAQ4);

            // Add the panel to the frame
            add(panel);
        }

        private void makeButtonTransparent(JButton button) {
            button.setOpaque(false);
            button.setContentAreaFilled(false);
            button.setBorderPainted(false);
        }
    }

    static class Errored extends JFrame {

        public Errored() {
            // Set up the JFrame
            setTitle("Wrong");
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
                    ImageIcon background = new ImageIcon("error.png"); // Provide the path to your image
                    Image image = background.getImage();
                    // Scale the image to fit the panel
                    g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
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
            makeButtonTransparent(backButton);
            makeButtonTransparent(nextPageButton);

            // Add action listener to back button
            backButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new Challenges(null).setVisible(true);
                    dispose();
                }
            });

            // Add action listener to next button
            nextPageButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new CS2().setVisible(true);
                    dispose();
                }
            });

            // Add buttons to the panel
            panel.add(backButton);
            panel.add(nextPageButton);

            // Add the panel to the frame
            add(panel);
        }

        private void makeButtonTransparent(JButton button) {
            button.setOpaque(false);
            button.setContentAreaFilled(false);
            button.setBorderPainted(false);
        }
    }

    static class INS extends JFrame {
        public INS() {
            // Set up the JFrame
            setTitle("Instructions");
            setSize(800, 600);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setLocationRelativeTo(null);
            setResizable(false);

            // Create a panel with background image
            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    ImageIcon background = new ImageIcon("instructions.png"); // Provide the path to your image
                    g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), null);
                }
            };
            panel.setLayout(null);

            // Create a back button
            JButton backButton = new JButton("");
            backButton.setBounds(30, 500, 100, 40);

            // Make button transparent
            makeButtonTransparent(backButton);

            // Add action listener to back button
            backButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new CS1().setVisible(true);
                    dispose();
                }
            });

            // Add button to the panel
            panel.add(backButton);

            // Add the panel to the frame
            add(panel);
        }

        private void makeButtonTransparent(JButton button) {
            button.setOpaque(false);
            button.setContentAreaFilled(false);
            button.setBorderPainted(false);
        }
    }
}
