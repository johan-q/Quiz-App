import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start extends JFrame {

    public Start() {
        // Set up the JFrame
        setTitle("Start Page");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Dispose on close to avoid closing the entire application
        setLocationRelativeTo(null); // Center the frame
        setResizable(false);

        // Create a panel with a background image
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Load the background image
                ImageIcon imageIcon = new ImageIcon("welcome.png"); // Change to your image file path
                Image image = imageIcon.getImage();
                // Scale the image to fit the panel
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel.setLayout(null); // Use absolute layout

        // Create buttons for the start page
        JButton Homepage = new JButton("");
        JButton button2 = new JButton("");
       

        // Set bounds for each button
        Homepage.setBounds(77, 475, 102, 40); // x, y, width, height
        button2.setBounds(640, 475, 102, 40);
        
         
        // Make buttons transparent
        Homepage.setOpaque(false);
        Homepage.setContentAreaFilled(false);
        Homepage.setBorderPainted(false);
        
       
        button2.setOpaque(false);
        button2.setContentAreaFilled(false);
        button2.setBorderPainted(false);

        // Add action listener to Homepage
        Homepage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                // Open new frame when Homepage is clicked
                new Homepage().setVisible(true);
                dispose();
            }
        });

        // Add action listener to button2
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Close the Start frame
               
                // Open new frame when button2 is clicked
                new StudyOrPlay(new Homepage()).setVisible(true);
                dispose();
                
                
            }
        });

        // Add the buttons to the panel
        panel.add(Homepage);
        panel.add(button2);
      

        // Add the panel to the frame
        add(panel);
    }

    public static void main(String[] args) {
        // Create an instance of the Start class
        SwingUtilities.invokeLater(() -> new Start().setVisible(true));
        Start start = new Start();
		start.dispose();
    }
}

// NewFrame class representing the new frame with three buttons
//NewFrame class representing the new frame with three buttons
class StudyOrPlay extends JFrame {
 private Homepage homepage;

 public StudyOrPlay(Homepage homepage) {
     this.homepage = homepage;
     setTitle("Study or Play");
     setSize(800, 600); // Match the size of the Start frame
     setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     setLocationRelativeTo(null);
     setResizable(false);

     // Create a panel with a background image
     JPanel panel = new JPanel() {
         @Override
         protected void paintComponent(Graphics g) {
             super.paintComponent(g);
             ImageIcon imageIcon = new ImageIcon("HP.png"); // Change to your image file path
             Image image = imageIcon.getImage();
             // Scale the image to fit the panel
             g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
         }
     };
     panel.setLayout(null); // Use absolute layout

     // Create three buttons for the new frame
     JButton Homepage = new JButton("");
     JButton button2 = new JButton(""); // Define button2
     JButton exitButton = new JButton("");
     JButton FEEDBACK = new JButton("");
   
     // Set bounds for each button
     Homepage.setBounds(320, 200, 50, 60); // x, y, width, height
     button2.setBounds(420, 200, 80, 40); // Set bounds for button2
     exitButton.setBounds(72, 475, 100, 40);
     FEEDBACK.setBounds(370, 290, 102, 35);
     

     // Make buttons transparent
     exitButton.setOpaque(false);
     exitButton.setContentAreaFilled(false);
     exitButton.setBorderPainted(false);
     
     Homepage.setOpaque(false);
     Homepage.setContentAreaFilled(false);
     Homepage.setBorderPainted(false);
     
     // Make buttons transparent
      FEEDBACK.setOpaque(false);
      FEEDBACK.setContentAreaFilled(false);
       FEEDBACK.setBorderPainted(false);

   
     button2.setOpaque(false);
     button2.setContentAreaFilled(false);
     button2.setBorderPainted(false);
     // Add action listener to the "Exit" button
     exitButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             // Close the StudyOrPlay frame
             
             // Open new instance of Homepage
             homepage.setVisible(true);
             dispose();
         }
     });

     // Add action listener to the "Challenges" button
  // Add action listener to the "Challenges" button
     button2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             // Instantiate the Challenges class and make its frame visible
        	 dispose(); // Close the current StudyOrPlay frame
             new Challenges(null).setVisible(true);
            
         }
     });

       

     // Add action listener to the "Play" button
     Homepage.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             // Instantiate the Textbook class
        	  // Close the current frame
             dispose();
             new Textbook(null).setVisible(true);

           
         }
     });
     
     FEEDBACK.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
             // Instantiate the Textbook class
        	  // Close the current frame
             dispose();
             new Feedback().setVisible(true);

           
         }
     });

     // Add buttons to the panel
     panel.add(Homepage);
     panel.add(button2); // Add button2 to the panel
     panel.add(exitButton);
     panel.add(FEEDBACK);

     // Add the panel to the frame
     add(panel);
 }
}
