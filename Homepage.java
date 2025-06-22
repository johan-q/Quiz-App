import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homepage extends JFrame {
    
    public Homepage() {
        // Set up the JFrame
        setTitle("Homepage");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
        setLocationRelativeTo(null); // Center the frame
        setResizable(false);
        
        // Create a panel with a background image
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Load the background image
                ImageIcon imageIcon = new ImageIcon("1.png"); // Change to your image file path
                Image image = imageIcon.getImage();
                // Scale the image to fit the panel
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel.setLayout(null); // Use absolute layout
        
        // Create buttons
        JButton button1 = new JButton("");
        JButton button2 = new JButton("");
        JButton button3 = new JButton("");
        JButton button4 = new JButton("");
        
        // Set bounds for each button
        button1.setBounds(120, 480, 100, 35); // x, y, width, height
        button2.setBounds(270, 480, 110, 35);
        button3.setBounds(420, 480, 100, 35);
        button4.setBounds(570, 480, 100, 35);
        
        // Make buttons transparent
        button1.setOpaque(false);
        button1.setContentAreaFilled(false);
        button1.setBorderPainted(false);
        
        button2.setOpaque(false);
        button2.setContentAreaFilled(false);
        button2.setBorderPainted(false);
        
        button3.setOpaque(false);
        button3.setContentAreaFilled(false);
        button3.setBorderPainted(false);
        
        button4.setOpaque(false);
        button4.setContentAreaFilled(false);
        button4.setBorderPainted(false);
        
        // Add action listeners to buttons
        button1.addActionListener(new ActionListener() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
            	 dispose();
                // Create an instance of the Start class when button 1 is clicked
                new Start().setVisible(true);
               
            }
        });
        
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	  dispose();
                // Define action for button 2
            	  new MainInstruction().setVisible(true);
            }
        });
        
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {  
                dispose();
                // Define action for button 3
                new About().setVisible(true);
            }
        });

        
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Define action for button 4
            	dispose();
              
            }
        });
        
        // Add the buttons to the panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        
        // Add the panel to the frame
        add(panel);
        
        // Show the frame
        setVisible(true);
        
        
       
        
           
    }
    
    public static void main(String[] args) {
       
          
             
        SwingUtilities.invokeLater(() -> new Homepage());
    
}


}