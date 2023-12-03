import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator2 implements ActionListener {
    int flag=0;
static double x = 0, y = 0, result = 0;
    static int op = 0;
    JFrame f = new JFrame();
    JLabel l1 = new JLabel("CALCULATOR");
    JTextField t1 = new JTextField();
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton a = new JButton("+");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton s = new JButton("-");
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton m = new JButton("*");
    JButton c = new JButton("C");
    JButton b0 = new JButton("0");
    JButton p = new JButton(".");
    JButton sub = new JButton("SUBMIT");
    JButton d = new JButton("/");

    Calculator2() {
        l1.setBounds(200, 20, 135, 25);
        t1.setBounds(100, 40, 300, 30);
        b7.setBounds(100, 75, 50, 30);
        b8.setBounds(180, 75, 50, 30);
        b9.setBounds(260, 75, 50, 30);
        a.setBounds(340, 75, 60, 30);
        b4.setBounds(100, 120, 50, 30);
        b5.setBounds(180, 120, 50, 30);
        b6.setBounds(260, 120, 50, 30);
        s.setBounds(340, 120, 60, 30);
        b1.setBounds(100, 165, 50, 30);
        b2.setBounds(180, 165, 50, 30);
        b3.setBounds(260, 165, 50, 30);
        m.setBounds(340, 165, 60, 30);
        c.setBounds(100, 210, 50, 30);
        b0.setBounds(180, 210, 50, 30);
        p.setBounds(260, 210, 50, 30);
        sub.setBounds(100, 255, 300, 30);
        d.setBounds(340, 210, 60, 30);

        f.add(l1);
        f.add(t1);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(a);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(s);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(m);
        f.add(c);
        f.add(b0);
        f.add(p);
        f.add(sub);
        f.add(d);

        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        a.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        s.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        m.addActionListener(this);
        c.addActionListener(this);
        b0.addActionListener(this);
        p.addActionListener(this);
        sub.addActionListener(this);
        d.addActionListener(this);

        f.setSize(500, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b0) {
            t1.setText(t1.getText().concat("0"));
        } else if (e.getSource() == b1) {
            t1.setText(t1.getText().concat("1"));
        } else if (e.getSource() == b2) {
            t1.setText(t1.getText().concat("2"));
        } else if (e.getSource() == b3) {
            t1.setText(t1.getText().concat("3"));
        } else if (e.getSource() == b4) {
            t1.setText(t1.getText().concat("4"));
        } else if (e.getSource() == b5) {
            t1.setText(t1.getText().concat("5"));
        } else if (e.getSource() == b6) {
            t1.setText(t1.getText().concat("6"));
        } else if (e.getSource() == b7) {
            t1.setText(t1.getText().concat("7"));
        } else if (e.getSource() == b8) {
            t1.setText(t1.getText().concat("8"));
        } else if (e.getSource() == b9) {
            t1.setText(t1.getText().concat("9"));
        } else if (e.getSource() == p) {
            t1.setText(t1.getText().concat("."));
        }

        if (e.getSource() == a) {
            x = Double.parseDouble(t1.getText());
            op = 1;
            t1.setText("");
        }
        if (e.getSource() == s) {
            x = Double.parseDouble(t1.getText());
            op = 2;
            t1.setText("");
        }
        if (e.getSource() == m) {
            x = Double.parseDouble(t1.getText());
            op = 3;
            t1.setText("");
        }
        if (e.getSource() == d) {
            x = Double.parseDouble(t1.getText());
            op = 4;
            t1.setText("");
        }
        if (e.getSource() == c) {
            t1.setText("");
        }
        if (e.getSource() == sub) {
            int flag = 0;
            y = Double.parseDouble(t1.getText());
            switch (op) {
                case 1:
                    result = x + y;
                    break;
                case 2:
                    result = x - y;
                    break;
                case 3:
                    result = x * y;
                    break;
                case 4:
                    if (y == 0) {
                        flag = 1;
                        t1.setText("MathError");
                        throw new ArithmeticException("Divide by Zero not possible ");
                    } else {
                        result = x / y;
                    }
                    break;
            }
            if (flag == 0) {
                t1.setText(""+result);
            }
        }
    }

    public static void main(String args[]) {
        new Calculator2();
    }
}
