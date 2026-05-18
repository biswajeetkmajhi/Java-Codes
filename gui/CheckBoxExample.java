import javax.swing.*;
import java.awt.event.*;

public class CheckBoxExample {
    CheckBoxExample() {
        // Create a frame
        JFrame f = new JFrame("Checkbox Example");

        // Create checkboxes
        JCheckBox cb1 = new JCheckBox("C");
        cb1.setBounds(100, 100, 50, 30);

        JCheckBox cb2 = new JCheckBox("C++");
        cb2.setBounds(100, 150, 50, 30);

        JCheckBox cb3 = new JCheckBox("Java");
        cb3.setBounds(100, 200, 60, 30);

        // Create a button
        JButton b = new JButton("Show");
        b.setBounds(100, 250, 80, 30);

        // Create a label to show output
        JLabel label = new JLabel();
        label.setBounds(100, 300, 250, 30);

        // Add action listener
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "Selected: ";
                if (cb1.isSelected())
                    data += "C ";
                if (cb2.isSelected())
                    data += "C++ ";
                if (cb3.isSelected())
                    data += "Java ";

                label.setText(data);
            }
        });

        // Add components to frame
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(b);
        f.add(label);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new CheckBoxExample();
    }
}
