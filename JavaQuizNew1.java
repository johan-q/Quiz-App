import javax.swing.*;


import java.awt.*;
import java.awt.event.*;

public class JavaQuizNew1 extends JFrame {

    public JavaQuizNew1() {
        // Set up the JFrame
        setTitle("Java Play");
        setSize(800, 600); // Match the size of the other frames
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setResizable(false);

        // Create a panel with backg round image
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon background = new ImageIcon("JavaQ1.png"); // Provide the path to your image
                g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), null);
            }
        };
        panel.setLayout(null); // Use absolute layout

        // Create buttons with custom bounds
        JButton aButton = new JButton(""); // Create button 'a'
        JButton bButton = new JButton(""); // Create button 'b'
        JButton cButton = new JButton(""); // Create button 'c'
        JButton dButton = new JButton(""); // Create button 'd'

        // Create two visible buttons
        JButton backtochallenges = new JButton();

        // Set bounds for buttons
        aButton.setBounds(250, 210, 80, 30); // x, y, width, height
        bButton.setBounds(250, 270, 80, 30);
        cButton.setBounds(440, 210, 80, 30);
        dButton.setBounds(440, 270, 80, 30);

        backtochallenges.setBounds(30, 463, 110, 50); // Set bounds for visibleButton1
        backtochallenges.setOpaque(false);
        backtochallenges.setContentAreaFilled(false);
        backtochallenges.setBorderPainted(false);

        // Make buttons transparent
        aButton.setOpaque(false);
        aButton.setContentAreaFilled(false);
        aButton.setBorderPainted(false);

        bButton.setOpaque(false);
        bButton.setContentAreaFilled(false);
        bButton.setBorderPainted(false);

        cButton.setOpaque(false);
        cButton.setContentAreaFilled(false);
        cButton.setBorderPainted(false);

        dButton.setOpaque(false);
        dButton.setContentAreaFilled(false);
        dButton.setBorderPainted(false);

        backtochallenges.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Define action for button 'a'
                // For example, call the Congratulation class
                new Challenges(null).setVisible(true);
                dispose();
            }
        });
        // Add action listener to buttons (if needed)
        // For example:
        aButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Define action for button 'a'
                // For example, call the Congratulation class
                new Congratulated().setVisible(true);
                dispose();
            }
        });

        bButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Define action for button 'a'
                // For example, call the Congratulation class
                new Errored().setVisible(true);
                dispose();
            }
        });

        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Define action for button 'a'
                // For example, call the Congratulation class
                new Errored ().setVisible(true);
                dispose();
            }
        });

        dButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Define action for button 'a'
                // For example, call the Congratulation class
                new Errored().setVisible(true);
                dispose();
            }
        });

        // Add buttons to the panel
        panel.add(aButton);
        panel.add(bButton);
        panel.add(cButton);
        panel.add(dButton);

        // Add visible buttons to the panel
        panel.add(backtochallenges);

        // Add the panel to the frame
        add(panel);
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
            backtochallenges.setOpaque(false);
            backtochallenges.setContentAreaFilled(false);
            backtochallenges.setBorderPainted(false);

            JAVAQ4.setOpaque(false);
            JAVAQ4.setContentAreaFilled(false);
            JAVAQ4.setBorderPainted(false);

            // Add action listener to back button
            backtochallenges.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Close the current frame

                    // Open the Textbook frame
                    new Challenges(null).setVisible(true);
                    dispose();
                }
            });

            // Add action listener to next button
            JAVAQ4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Close the current frame
                    new JavaQuizNew1.JavaQuiz2.JavaQ3().setVisible(true);
                    // Open the Homepage frame
                    dispose();
                }
            });

            // Add buttons to the panel
            panel.add(backtochallenges);
            panel.add(JAVAQ4);

            // Add the panel to the frame
            add(panel);
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
                    new JavaQuiz2().setVisible(true);
                    // Open the Homepage frame
                    dispose();
                }
            });

            // Add buttons to the panel
            panel.add(backButton);
            panel.add(nextPageButton);

            // Add the panel to the frame
            add(panel);
        }
    }
   
    static class JavaQuiz2 extends JFrame {

        public JavaQuiz2() {
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
                    ImageIcon background = new ImageIcon("Java2.png"); // Provide the path to your image
                    g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), null);
                }
            };
            panel.setLayout(null); // Use absolute layout

            // Create buttons with custom bounds
            JButton aButton = new JButton(""); // Create button 'a'
            JButton bButton = new JButton(""); // Create button 'b'
            JButton cButton = new JButton(""); // Create button 'c'
            JButton dButton = new JButton(""); // Create button 'd'

            // Create two visible buttons
            JButton backtochallenges = new JButton();

            // Set bounds for buttons
            aButton.setBounds(250, 210, 80, 30); // x, y, width, height
            bButton.setBounds(250, 270, 80, 30);
            cButton.setBounds(440, 210, 80, 30);
            dButton.setBounds(440, 270, 80, 30);

            backtochallenges.setBounds(30, 463, 110, 50); // Set bounds for visibleButton1
            backtochallenges.setOpaque(false);
            backtochallenges.setContentAreaFilled(false);
            backtochallenges.setBorderPainted(false);

            // Make buttons transparent
            aButton.setOpaque(false);
            aButton.setContentAreaFilled(false);
            aButton.setBorderPainted(false);

            bButton.setOpaque(false);
            bButton.setContentAreaFilled(false);
            bButton.setBorderPainted(false);

            cButton.setOpaque(false);
            cButton.setContentAreaFilled(false);
            cButton.setBorderPainted(false);

            dButton.setOpaque(false);
            dButton.setContentAreaFilled(false);
            dButton.setBorderPainted(false);

            backtochallenges.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Define action for button 'a'
                    // For example, call the Congratulation class
                    new Challenges(null).setVisible(true);
                    dispose();
                }
            });
            // Add action listener to buttons (if needed)
            // For example:
            aButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Define action for button 'a'
                    // For example, call the Congratulation class
                    new Congratulated().setVisible(true);
                    dispose();
                }
            });

            bButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Define action for button 'a'
                    // For example, call the Congratulation class
                    new Errored().setVisible(true);
                    dispose();
                }
            });

            cButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Define action for button 'a'
                    // For example, call the Congratulation class
                    new Errored ().setVisible(true);
                    dispose();
                }
            });

            dButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Define action for button 'a'
                    // For example, call the Congratulation class
                    new Errored().setVisible(true);
                    dispose();
                }
            });

            // Add buttons to the panel
            panel.add(aButton);
            panel.add(bButton);
            panel.add(cButton);
            panel.add(dButton);

            // Add visible buttons to the panel
            panel.add(backtochallenges);

            // Add the panel to the frame
            add(panel);
        }
        
        
        static class JavaQ3 extends JFrame {

            public JavaQ3() {
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
                        ImageIcon background = new ImageIcon("JavaQ2.png"); // Provide the path to your image
                        g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), null);
                    }
                };
                panel.setLayout(null); // Use absolute layout

                // Create buttons with custom bounds
                JButton aButton = new JButton(""); // Create button 'a'
                JButton bButton = new JButton(""); // Create button 'b'
                JButton cButton = new JButton(""); // Create button 'c'
                JButton dButton = new JButton(""); // Create button 'd'

                // Create two visible buttons
                JButton backtochallenges = new JButton();

                // Set bounds for buttons
                aButton.setBounds(250, 210, 80, 30); // x, y, width, height
                bButton.setBounds(250, 270, 80, 30);
                cButton.setBounds(440, 210, 80, 30);
                dButton.setBounds(440, 270, 80, 30);

                backtochallenges.setBounds(30, 463, 110, 50); // Set bounds for visibleButton1
                backtochallenges.setOpaque(false);
                backtochallenges.setContentAreaFilled(false);
                backtochallenges.setBorderPainted(false);

                // Make buttons transparent
                aButton.setOpaque(false);
                aButton.setContentAreaFilled(false);
                aButton.setBorderPainted(false);

                bButton.setOpaque(false);
                bButton.setContentAreaFilled(false);
                bButton.setBorderPainted(false);

                cButton.setOpaque(false);
                cButton.setContentAreaFilled(false);
                cButton.setBorderPainted(false);

                dButton.setOpaque(false);
                dButton.setContentAreaFilled(false);
                dButton.setBorderPainted(false);

                backtochallenges.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Define action for button 'a'
                        // For example, call the Congratulation class
                        new Challenges(null).setVisible(true);
                        dispose();
                    }
                });
                // Add action listener to buttons (if needed)
                // For example:
                aButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Define action for button 'a'
                        // For example, call the Congratulation class
                        new Congratulated().setVisible(true);
                        dispose();
                    }
                });

                bButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Define action for button 'a'
                        // For example, call the Congratulation class
                        new Errored().setVisible(true);
                        dispose();
                    }
                });

                cButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Define action for button 'a'
                        // For example, call the Congratulation class
                        new Errored ().setVisible(true);
                        dispose();
                    }
                });

                dButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Define action for button 'a'
                        // For example, call the Congratulation class
                        new Errored().setVisible(true);
                        dispose();
                    }
                });

                // Add buttons to the panel
                panel.add(aButton);
                panel.add(bButton);
                panel.add(cButton);
                panel.add(dButton);

                // Add visible buttons to the panel
                panel.add(backtochallenges);

                // Add the panel to the frame
                add(panel);
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
                backtochallenges.setOpaque(false);
                backtochallenges.setContentAreaFilled(false);
                backtochallenges.setBorderPainted(false);

                JAVAQ4.setOpaque(false);
                JAVAQ4.setContentAreaFilled(false);
                JAVAQ4.setBorderPainted(false);

                // Add action listener to back button
                backtochallenges.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Close the current frame

                        // Open the Textbook frame
                        new Challenges(null).setVisible(true);
                        dispose();
                    }
                });

                // Add action listener to next button
                JAVAQ4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Close the current frame
                        new JavaQ3().setVisible(true);
                        // Open the Homepage frame
                        dispose();
                    }
                });

                // Add buttons to the panel
                panel.add(backtochallenges);
                panel.add(JAVAQ4);

                // Add the panel to the frame
                add(panel);
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
                        new JAVAQ4().setVisible(true);
                        // Open the Homepage frame
                        dispose();
                    }
                });

                // Add buttons to the panel
                panel.add(backButton);
                panel.add(nextPageButton);

                // Add the panel to the frame
                add(panel);
            }
        }

        static class JAVAQ4 extends JFrame {

            public JAVAQ4() {
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
                        ImageIcon background = new ImageIcon("JAVAQ4.png"); // Provide the path to your image
                        g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), null);
                    }
                };
                panel.setLayout(null); // Use absolute layout

                // Create buttons with custom bounds
                JButton aButton = new JButton(""); // Create button 'a'
                JButton bButton = new JButton(""); // Create button 'b'
                JButton cButton = new JButton(""); // Create button 'c'
                JButton dButton = new JButton(""); // Create button 'd'

                // Create two visible buttons
                JButton backtochallenges = new JButton();
               

                // Set bounds for buttons
                aButton.setBounds(250, 210, 80, 30); // x, y, width, height
                bButton.setBounds(250, 270, 80, 30);
                cButton.setBounds(440, 210, 80, 30);
                dButton.setBounds(440, 270, 80, 30);

                backtochallenges.setBounds(30, 463, 110, 50); // Set bounds for visibleButton1
                backtochallenges.setOpaque(false);
                backtochallenges.setContentAreaFilled(false);
                backtochallenges.setBorderPainted(false);

                // Make buttons transparent
                aButton.setOpaque(false);
                aButton.setContentAreaFilled(false);
                aButton.setBorderPainted(false);

                bButton.setOpaque(false);
                bButton.setContentAreaFilled(false);
                bButton.setBorderPainted(false);

                cButton.setOpaque(false);
                cButton.setContentAreaFilled(false);
                cButton.setBorderPainted(false);

                dButton.setOpaque(false);
                dButton.setContentAreaFilled(false);
                dButton.setBorderPainted(false);
                
                backtochallenges.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Define action for button 'a'
                        // For example, call the Congratulation class
                        new Challenges(null).setVisible(true);
                        dispose();
                    }
                });
                // Add action listener to buttons (if needed)
                // For example:
                aButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Define action for button 'a'
                        // For example, call the Congratulation class
                        new Congratulated().setVisible(true);
                        dispose();
                    }
                });
                
                bButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Define action for button 'a'
                        // For example, call the Congratulation class
                        new Errored().setVisible(true);
                        dispose();
                    }
                });
                
                cButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Define action for button 'a'
                        // For example, call the Congratulation class
                        new Errored().setVisible(true);
                        dispose();
                    }
                });
                
                dButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Define action for button 'a'
                        // For example, call the Congratulation class
                        new Errored().setVisible(true);
                        dispose();
                    }
                });

                // Add buttons to the panel
                panel.add(aButton);
                panel.add(bButton);
                panel.add(cButton);
                panel.add(dButton);
                
                // Add visible buttons to the panel
                panel.add(backtochallenges);
              
                // Add the panel to the frame
                add(panel);
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
                    backtochallenges.setOpaque(false);
                    backtochallenges.setContentAreaFilled(false);
                    backtochallenges.setBorderPainted(false);

                    JAVAQ4.setOpaque(false);
                    JAVAQ4.setContentAreaFilled(false);
                    JAVAQ4.setBorderPainted(false);

                    // Add action listener to back button
                    backtochallenges.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // Close the current frame

                            // Open the Textbook frame
                            new Challenges(null).setVisible(true);
                            dispose();
                        }
                    });

                    // Add action listener to next button
                    JAVAQ4.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // Close the current frame
                            new Done().setVisible(true);
                            // Open the Homepage frame
                            dispose();
                        }
                    });

                    // Add buttons to the panel
                    panel.add(backtochallenges);
                    panel.add(JAVAQ4);

                    // Add the panel to the frame
                    add(panel);
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
                            new Done().setVisible(true);
                            // Open the Homepage frame
                            dispose();
                        }
                    });
                    
                    // Add buttons to the panel
                    panel.add(backButton);
                    panel.add(nextPageButton);

                    // Add the panel to the frame
                    add(panel);
                }
            }


    public static void main(String[] args) {
        // Create an instance of the Play class
        SwingUtilities.invokeLater(() -> new JavaQuizNew1().setVisible(true));
    }
}
    }
}
}