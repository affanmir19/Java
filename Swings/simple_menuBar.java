import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBarExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Menu Bar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();
        
        // Create a menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        
        // Add action listener to exit item
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        // Add items to the menu
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        
        // Set the menu bar for the frame
        frame.setJMenuBar(menuBar);
        
        // Set the visibility to true
        frame.setVisible(true);
    }
}
