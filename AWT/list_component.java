import java.awt.*;
import java.awt.event.*;

public class ListExample {
    public static void main(String[] args) {
        Frame frame = new Frame("List Example");
        List list = new List(4, false);
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");

        Button button = new Button("Show Selected");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Selected Item: " + list.getSelectedItem());
            }
        });

        frame.add(list);
        frame.add(button);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
