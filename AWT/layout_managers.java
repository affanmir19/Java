import java.awt.*;
import java.awt.event.*;

public class LayoutExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Layout Manager Example");
        frame.setLayout(new FlowLayout());

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setSize(300, 200);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
