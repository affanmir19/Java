import java.awt.*;
import java.awt.event.*;

public class BasicAWTExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Basic AWT Example");
        Button button = new Button("Click Me");

        button.setBounds(50, 100, 80, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        });

        frame.add(button);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);

        // Close the frame on close button click
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
