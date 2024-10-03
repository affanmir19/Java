import java.awt.*;
import java.awt.event.*;

public class TextFieldExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Text Field Example");
        Label label = new Label("Enter your name:");
        TextField textField = new TextField();

        label.setBounds(20, 50, 150, 20);
        textField.setBounds(20, 80, 150, 20);

        Button button = new Button("Submit");
        button.setBounds(20, 110, 80, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Submitted Name: " + textField.getText());
            }
        });

        frame.add(label);
        frame.add(textField);
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
