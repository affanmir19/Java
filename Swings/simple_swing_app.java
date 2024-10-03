import javax.swing.*;

public class SimpleSwingApp {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Simple Swing Application");
        
        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set the size of the frame
        frame.setSize(400, 300);
        
        // Set the visibility to true
        frame.setVisible(true);
    }
}
