import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class calculator1 extends JFrame implements ActionListener {

    static JFrame f;
    static JTextField l;

    String s0, s1, s2;

    calculator1() {
        s0 = s1 = s2 = "";
    }

    public static void main(String args[]) {
        f = new JFrame("Calculator");

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        calculator1 c = new calculator1();

        l = new JTextField(16);
        l.setEditable(false);
        l.setHorizontalAlignment(JTextField.RIGHT);

        // Create buttons
        String[] buttonLabels = {
            "7", "8", "9", "/", 
            "4", "5", "6", "*", 
            "1", "2", "3", "-", 
            ".", "0", "=", "+", 
            "C"
        };

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(5, 4, 5, 5));

        for (String label : buttonLabels) {
            JButton b = new JButton(label);
            b.addActionListener(c);
            p.add(b);
        }

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        topPanel.add(l, BorderLayout.CENTER);

        f.setLayout(new BorderLayout());
        f.add(topPanel, BorderLayout.NORTH);
        f.add(p, BorderLayout.CENTER);

        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.equals(".")) {
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;
            l.setText(s0 + s1 + s2);
        } else if (s.equals("C")) {
            s0 = s1 = s2 = "";
            l.setText("");
        } else if (s.equals("=")) {
            double result = 0;

            if (s1.equals("+"))
                result = Double.parseDouble(s0) + Double.parseDouble(s2);
            else if (s1.equals("-"))
                result = Double.parseDouble(s0) - Double.parseDouble(s2);
            else if (s1.equals("/"))
                result = Double.parseDouble(s0) / Double.parseDouble(s2);
            else if (s1.equals("*"))
                result = Double.parseDouble(s0) * Double.parseDouble(s2);

            l.setText(s0 + s1 + s2 + "=" + result);
            s0 = Double.toString(result);
            s1 = s2 = "";
        } else {
            if (s1.equals("") || s2.equals(""))
                s1 = s;
            else {
                double result = 0;
                if (s1.equals("+"))
                    result = Double.parseDouble(s0) + Double.parseDouble(s2);
                else if (s1.equals("-"))
                    result = Double.parseDouble(s0) - Double.parseDouble(s2);
                else if (s1.equals("/"))
                    result = Double.parseDouble(s0) / Double.parseDouble(s2);
                else if (s1.equals("*"))
                    result = Double.parseDouble(s0) * Double.parseDouble(s2);

                s0 = Double.toString(result);
                s1 = s;
                s2 = "";
            }
            l.setText(s0 + s1 + s2);
        }
    }
}
