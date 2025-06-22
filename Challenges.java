import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Challenges extends JFrame {

    public Challenges(StudyOrPlay studyOrPlayFrame) {
        // Set up the JFrame
        setTitle("Quiz");
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
                ImageIcon imageIcon = new ImageIcon("Lenge.png"); // Change to your image file path
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
        javaButton.setBounds(260, 130, 120, 30);
        pythonButton.setBounds(260, 190, 120, 30);
        cPlusPlusButton.setBounds(260, 246, 120, 30);
        javascriptButton.setBounds(445, 120, 120, 30);
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
                
                // Make the StudyOrPlay frame visible
                studyOrPlayFrame.setVisible(true);
                dispose();
            }
        });

        // Add ActionListener to Java button
        javaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open the JavaQuiz class
                new JavaLevels().setVisible(true);
                // Close the Challenges frame
                dispose();
            }
        });
        // Add ActionListener to Python button
        pythonButton.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {
                 // Open the JavaQuiz class
        		  new Challenges.JavaLevels.PythonLevels().setVisible(true);
                  // Close the Challenges frame
                  dispose();
            }
        });

       
        // Add ActionListener to JavaScript button
        javascriptButton.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {
                 // Open the JavaQuiz class
                 new Challenges.JavaLevels.PythonLevels.JavascriptLevels().setVisible(true);
                 // Close the Challenges frame
                 dispose();
            }
        });

        // Add ActionListener to CSS button
        cssButton.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {
                 // Open the JavaQuiz class
                 new Challenges.JavaLevels.PythonLevels.JavascriptLevels.CSSLevels ().setVisible(true);
                 // Close the Challenges frame
                 dispose();
            }
        });

      
        // Add ActionListener to HTML button
        exitButton.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {
                 // Open the JavaQuiz class
                 new Homepage().setVisible(true);
                 // Close the Challenges frame
                 dispose();
            }
        });
        // Add ActionListener to HTML button
        nextButton.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {
                 // Open the JavaQuiz class
                 new StudyOrPlay(null).setVisible(true);
                 // Close the Challenges frame
                 dispose();
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
    
    
    //Java Levels
    
    static class JavaLevels extends JFrame {

        public JavaLevels() {
            // Set up the JFrame
            setTitle("LEVELS");
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
           
            JButton easy = new JButton("");
            JButton average = new JButton("");
            JButton hard = new JButton("");

            
            // Set bounds for buttons
            backButton.setBounds(72, 472, 100, 40);
           
            easy.setBounds(330, 132, 150, 54);
            average.setBounds(315, 205, 180, 54);
            hard.setBounds(330, 280, 150, 54);
            
            // Make buttons transparent
            backButton.setOpaque(false);
            backButton.setContentAreaFilled(false);
            backButton.setBorderPainted(false);

            
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
                    new JavaAverage().setVisible(true);
                }
            });
            
            // Add action listener to next button
            hard.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Close the current frame
                    dispose();
                    // Open the Homepage frames
                    new JavaHard1().setVisible(true);
                }
            });
            // Add buttons to the panel
            panel.add(backButton);
           
            panel.add(easy);
            panel.add(average);
            panel.add(hard);
            
            // Add the panel to the frame
            add(panel);
        }  
        
        
      //Java Levels
        
        static class PythonLevels extends JFrame {

            public PythonLevels() {
                // Set up the JFrame
                setTitle("LEVELS");
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
               
                JButton easy = new JButton("");
                JButton average = new JButton("");
                JButton hard = new JButton("");

                
                // Set bounds for buttons
                backButton.setBounds(72, 472, 100, 40);
               
                easy.setBounds(330, 132, 150, 54);
                average.setBounds(315, 205, 180, 54);
                hard.setBounds(330, 280, 150, 54);
                
                // Make buttons transparent
                backButton.setOpaque(false);
                backButton.setContentAreaFilled(false);
                backButton.setBorderPainted(false);

                
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
                easy.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Close the current frame
                        dispose();
                        // Open the Homepage frame
                        new PQ1().setVisible(true);
                    }
                });
                
                // Add action listener to next button
                average.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Close the current frame
                        dispose();
                        // Open the Homepage frame
                        new PhytonAverage().setVisible(true);
                    }
                });
                
                // Add action listener to next button
                hard.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Close the current frame
                        dispose();
                        // Open the Homepage frames
                        new PythonHard1().setVisible(true);
                    }
                });
                // Add buttons to the panel
                panel.add(backButton);
               
                panel.add(easy);
                panel.add(average);
                panel.add(hard);
                
                // Add the panel to the frame
                add(panel);
            }  
            
          //JavaSCRIPT Levels
            
            static class JavascriptLevels extends JFrame {

                public JavascriptLevels() {
                    // Set up the JFrame
                    setTitle("LEVELS");
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
                   
                    JButton easy = new JButton("");
                    JButton average = new JButton("");
                    JButton hard = new JButton("");

                    
                    // Set bounds for buttons
                    backButton.setBounds(72, 472, 100, 40);
                   
                    easy.setBounds(330, 132, 150, 54);
                    average.setBounds(315, 205, 180, 54);
                    hard.setBounds(330, 280, 150, 54);
                    
                    // Make buttons transparent
                    backButton.setOpaque(false);
                    backButton.setContentAreaFilled(false);
                    backButton.setBorderPainted(false);

                    
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
                    easy.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // Close the current frame
                            dispose();
                            // Open the Homepage frame
                            new CR1().setVisible(true);
                        }
                    });
                    
                    // Add action listener to next button
                    average.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // Close the current frame
                            dispose();
                            // Open the Homepage frame
                            new JvAverage1().setVisible(true);
                        }
                    });
                    
                    // Add action listener to next button
                    hard.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            // Close the current frame
                            dispose();
                            // Open the Homepage frames
                            new JvHard1().setVisible(true);
                        }
                    });
                    // Add buttons to the panel
                    panel.add(backButton);
                   
                    panel.add(easy);
                    panel.add(average);
                    panel.add(hard);
                    
                    // Add the panel to the frame
                    add(panel);
                }  
                
              //CSS Levels
                
                static class CSSLevels extends JFrame {

                    public CSSLevels() {
                        // Set up the JFrame
                        setTitle("LEVELS");
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
                       
                        JButton easy = new JButton("");
                        JButton average = new JButton("");
                        JButton hard = new JButton("");

                        
                        // Set bounds for buttons
                        backButton.setBounds(72, 472, 100, 40);
                       
                        easy.setBounds(330, 132, 150, 54);
                        average.setBounds(315, 205, 180, 54);
                        hard.setBounds(330, 280, 150, 54);
                        
                        // Make buttons transparent
                        backButton.setOpaque(false);
                        backButton.setContentAreaFilled(false);
                        backButton.setBorderPainted(false);

                        
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
                        easy.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                // Close the current frame
                                dispose();
                                // Open the Homepage frame
                                new CS1().setVisible(true);
                            }
                        });
                        
                        // Add action listener to next button
                        average.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                // Close the current frame
                              
                                // Open the Homepage frame
                                new CssAverage1().setVisible(true);
                                dispose();
                            }
                        });
                        hard.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                // Close the current frame
                              
                                // Open the Homepage frame
                                new CSSHard1().setVisible(true);
                                dispose();
                            }
                        });
                        
                       
                        // Add buttons to the panel
                        panel.add(backButton);
                       
                        panel.add(easy);
                        panel.add(average);
                        panel.add(hard);
                        
                        // Add the panel to the frame
                        add(panel);
                    }  
        
    public static void main(String[] args) {
        // Create an instance of the StudyOrPlay class
        StudyOrPlay studyOrPlayFrame = new StudyOrPlay(new Homepage());
        // Create an instance of the Textbook class
        SwingUtilities.invokeLater(() -> new Challenges(studyOrPlayFrame).setVisible(true));
    }
}
}
    }
}
}