import java.awt.*;
import java.awt.event.*;

public class CheckboxExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Checkbox Example");
        Checkbox checkbox1 = new Checkbox("Option 1");
        Checkbox checkbox2 = new Checkbox("Option 2");

        checkbox1.setBounds(50, 50, 100, 30);
        checkbox2.setBounds(50, 80, 100, 30);

        Button button = new Button("Submit");
        button.setBounds(50, 110, 80, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedOptions = "Selected: ";
                if (checkbox1.getState()) selectedOptions += "Option 1 ";
                if (checkbox2.getState()) selectedOptions += "Option 2 ";
                System.out.println(selectedOptions);
            }
        });

        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(button);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
