import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaHard1 extends JFrame {


	    public JavaHard1() {
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
	                ImageIcon background = new ImageIcon("JavaHard1.png"); // Provide the path to your image
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


	        // Set bounds for buttons
	        aButton.setBounds(275, 133, 260, 49);
	        bButton.setBounds(275, 200, 260, 49);
	        cButton.setBounds(275, 260, 260, 49);

	        backtochallenges.setBounds(30, 463, 110, 50); // Set bounds for visibleButton1
	        backtochallenges.setOpaque(false);
	        backtochallenges.setContentAreaFilled(false);
	        backtochallenges.setBorderPainted(false);

	        

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
	                new Check().setVisible(true);
	                dispose();
	            }
	        });

	        bButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Define action for button 'a'
	                // For example, call the Congratulation class
	                new Wrong().setVisible(true);
	                dispose();
	            }
	        });

	        cButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Define action for button 'a'
	                // For example, call the Congratulation class
	                new Wrong ().setVisible(true);
	                dispose();
	            }
	        });

	        dButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Define action for button 'a'
	                // For example, call the Congratulation class
	                new Wrong().setVisible(true);
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

	    static class Check extends JFrame {
	        public Check() {
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
	                    new JavaHard2().setVisible(true);
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

	    static class Wrong extends JFrame {

	        public Wrong() {
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
	                    ImageIcon background = new ImageIcon("Wrong.png"); // Provide the path to your image
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
	                    new JavaHard2().setVisible(true);
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
	   
	    static class JavaHard2 extends JFrame {

	        public JavaHard2() {
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
	                    ImageIcon background = new ImageIcon("JavaHard2.png"); // Provide the path to your image
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
	            aButton.setBounds(275, 133, 260, 49);
	            bButton.setBounds(275, 200, 260, 49);
	            cButton.setBounds(275, 260, 260, 49);


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
	                    new Wrong2().setVisible(true);
	                    dispose();
	                }
	            });

	            bButton.addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    // Define action for button 'a'
	                    // For example, call the Congratulation class
	                    new Check2().setVisible(true);
	                    dispose();
	                }
	            });

	            cButton.addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    // Define action for button 'a'
	                    // For example, call the Congratulation class
	                    new Wrong2 ().setVisible(true);
	                    dispose();
	                }
	            });

	            dButton.addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                    // Define action for button 'a'
	                    // For example, call the Congratulation class
	                    new Wrong().setVisible(true);
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
	        static class Check2 extends JFrame {
	            public Check2() {
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
	                        new JavaHard3().setVisible(true);
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

	        static class Wrong2 extends JFrame {

	            public Wrong2() {
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
	                        ImageIcon background = new ImageIcon("Wrong.png"); // Provide the path to your image
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
	                        new JavaHard3().setVisible(true);
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
	       
	        
	        
	        static class JavaHard3 extends JFrame {

	            public JavaHard3() {
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
	                        ImageIcon background = new ImageIcon("JavaHard3.png"); // Provide the path to your image
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
	                aButton.setBounds(275, 133, 260, 49);
	                bButton.setBounds(275, 200, 260, 49);
	                cButton.setBounds(275, 260, 260, 49);



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
	                        new Wrong3().setVisible(true);
	                        dispose();
	                    }
	                });

	                bButton.addActionListener(new ActionListener() {
	                    @Override
	                    public void actionPerformed(ActionEvent e) {
	                        // Define action for button 'a'
	                        // For example, call the Congratulation class
	                        new Check3().setVisible(true);
	                        dispose();
	                    }
	                });

	                cButton.addActionListener(new ActionListener() {
	                    @Override
	                    public void actionPerformed(ActionEvent e) {
	                        // Define action for button 'a'
	                        // For example, call the Congratulation class
	                        new Wrong3 ().setVisible(true);
	                        dispose();
	                    }
	                });

	                dButton.addActionListener(new ActionListener() {
	                    @Override
	                    public void actionPerformed(ActionEvent e) {
	                        // Define action for button 'a'
	                        // For example, call the Congratulation class
	                        new Wrong().setVisible(true);
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

	        static class Check3 extends JFrame {
	            public Check3() {
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

	        static class Wrong3 extends JFrame {

	            public Wrong3() {
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
	                        ImageIcon background = new ImageIcon("Wrong.png"); // Provide the path to your image
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
	        SwingUtilities.invokeLater(() -> new JavaAverage().setVisible(true));
	    }
	}
	    }

	}