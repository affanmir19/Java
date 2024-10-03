import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonSwingApp {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Create a button
        JButton button = new JButton("Click Me!");
        
        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });
        
        // Add the button to the frame
        frame.getContentPane().add(button);
        
        // Set the frame's layout to null
        frame.setLayout(null);
        button.setBounds(150, 100, 100, 30);
        
        // Set the visibility to true
        frame.setVisible(true);
    }
}
