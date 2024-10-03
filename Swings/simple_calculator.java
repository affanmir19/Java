import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        
        // Create text field for input
        JTextField textField = new JTextField();
        textField.setEditable(false);
        
        // Create buttons
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btnAdd = new JButton("+");
        JButton btnEqual = new JButton("=");
        
        // Create a panel for buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        
        // Add buttons to the panel
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btnAdd);
        panel.add(btnEqual);
        
        // Action Listener for buttons
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "1");
            }
        });
        
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "2");
            }
        });
        
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "+");
            }
        });
        
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                String[] parts = input.split("\\+");
                if (parts.length == 2) {
                    int result = Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
                    textField.setText(String.valueOf(result));
                }
            }
        });
        
        // Add components to the frame
        frame.setLayout(new BorderLayout());
        frame.add(textField, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        
        // Set the visibility to true
        frame.setVisible(true);
    }
}
