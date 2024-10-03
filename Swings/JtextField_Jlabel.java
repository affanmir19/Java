import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("TextField Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        
        // Create a JTextField and JLabel
        JTextField textField = new JTextField(20);
        JLabel label = new JLabel("Enter your name:");
        
        // Create a button
        JButton button = new JButton("Submit");
        
        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
            }
        });
        
        // Set the layout
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        
        // Add the panel to the frame
        frame.add(panel);
        
        // Set the visibility to true
        frame.setVisible(true);
    }
}
