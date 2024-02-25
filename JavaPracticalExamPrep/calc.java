import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyCalc implements ActionListener {
    JFrame frame;

    public MyCalc() {
        frame = new JFrame("Calculator");
        Container c = new Container();

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        JTextField inputField = new JTextField(50);
        inputPanel.add(inputField, BorderLayout.CENTER);

        JPanel outputPanel = new JPanel();
        outputPanel.setLayout(new BorderLayout());
        JTextField outputField = new JTextField(50);
        outputPanel.add(outputField, BorderLayout.SOUTH);

        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(4, 4));
        JButton b_0 = new JButton("0");
        JButton b_1 = new JButton("1");
        JButton b_2 = new JButton("2");
        JButton b_3 = new JButton("3");
        JButton b_4 = new JButton("4");
        JButton b_5 = new JButton("5");
        JButton b_6 = new JButton("6");
        JButton b_7 = new JButton("7");
        JButton b_8 = new JButton("8");
        JButton b_9 = new JButton("9");
        JButton b_CLR = new JButton("CLEAR");
        JButton b_add = new JButton("+");
        JButton b_sub = new JButton("-");
        JButton b_mul = new JButton("*");
        JButton b_div = new JButton("/");
        JButton b_EQL = new JButton("=");

        buttons.add(b_7);
        buttons.add(b_8);
        buttons.add(b_9);
        buttons.add(b_add);
        buttons.add(b_4);
        buttons.add(b_5);
        buttons.add(b_6);
        buttons.add(b_sub);
        buttons.add(b_1);
        buttons.add(b_2);
        buttons.add(b_3);
        buttons.add(b_mul);
        buttons.add(b_CLR);
        buttons.add(b_0);
        buttons.add(b_EQL);
        buttons.add(b_div);

        c.setLayout(new BorderLayout());
        c.add(inputPanel, BorderLayout.NORTH);
        c.add(buttons, BorderLayout.CENTER);
        c.add(outputPanel, BorderLayout.SOUTH);

        frame.add(c);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}

public class calc {
    public static void main(String[] args) {
        MyCalc calc1 = new MyCalc();
    }
}