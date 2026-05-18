import javax.swing.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    JTextField v1, v2, result;
    JButton add, sub, mul, div, equal;
    String op = "";

    Calculator() {
        JFrame f = new JFrame("Simple Calculator");

        v1 = new JTextField();
        v1.setBounds(50, 30, 100, 30);

        v2 = new JTextField();
        v2.setBounds(160, 30, 100, 30);

        result = new JTextField();
        result.setBounds(270, 30, 100, 30);
        result.setEditable(false);

        add = new JButton("+");
        add.setBounds(50, 80, 50, 30);

        sub = new JButton("-");
        sub.setBounds(110, 80, 50, 30);

        mul = new JButton("*");
        mul.setBounds(170, 80, 50, 30);

        div = new JButton("/");
        div.setBounds(230, 80, 50, 30);

        equal = new JButton("=");
        equal.setBounds(290, 80, 50, 30);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        equal.addActionListener(this);

        f.add(v1);
        f.add(v2);
        f.add(result);
        f.add(add);
        f.add(sub);
        f.add(mul);
        f.add(div);
        f.add(equal);

        f.setSize(400, 200);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(v1.getText());
            int num2 = Integer.parseInt(v2.getText());

            if (e.getSource() == add) op = "+";
            else if (e.getSource() == sub) op = "-";
            else if (e.getSource() == mul) op = "*";
            else if (e.getSource() == div) op = "/";
            else if (e.getSource() == equal) {
                int res = 0;
                switch (op) {
                    case "+": res = num1 + num2; break;
                    case "-": res = num1 - num2; break;
                    case "*": res = num1 * num2; break;
                    case "/": res = num2 != 0 ? num1 / num2 : 0; break;
                }
                result.setText("" + res);
            }
        } catch (Exception ex) {
            result.setText("Error");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
