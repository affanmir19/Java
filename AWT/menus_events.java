import java.awt.*;
import java.awt.event.*;

public class MenuEventDelegationExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Menu Event Delegation Example");

        // Create a menu bar
        MenuBar menuBar = new MenuBar();

        // Create a "File" menu
        Menu fileMenu = new Menu("File");
        
        // Create menu items
        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        MenuItem exitItem = new MenuItem("Exit");

        // Add menu items to the "File" menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(exitItem);

        // Add "File" menu to the menu bar
        menuBar.add(fileMenu);

        // Set the menu bar to the frame
        frame.setMenuBar(menuBar);

        // Add ActionListener for menu items
        newItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("New File created.");
            }
        });

        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("File opened.");
            }
        });

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Exiting application.");
                System.exit(0);
            }
        });

        // Frame settings
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        // Close the frame on close button click
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
