

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Set1_Calc {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Container container = new Container();
        JTextField textfield = new JTextField(4);

        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btnC = new JButton("C");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btnadd = new JButton("+");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btnsub = new JButton("-");
        JButton btn0 = new JButton("0");
        JButton btndot = new JButton(".");
        JButton btndiv = new JButton("/");
        JButton btnmultiply = new JButton("*");

        JPanel mainPanel = new JPanel(new GridLayout(4, 4));
        mainPanel.add(btn1);
        mainPanel.add(btn2);
        mainPanel.add(btn3);
        mainPanel.add(btnC);
        mainPanel.add(btn4);
        mainPanel.add(btn5);
        mainPanel.add(btn6);
        mainPanel.add(btnadd);
        mainPanel.add(btn7);
        mainPanel.add(btn8);
        mainPanel.add(btn9);
        mainPanel.add(btnsub);
        mainPanel.add(btn0);
        mainPanel.add(btndot);
        mainPanel.add(btndiv);
        mainPanel.add(btnmultiply);

        JPanel topRowPanel = new JPanel(new GridLayout(1, 4));
        topRowPanel.add(textfield);

        container.setLayout(new BorderLayout());
        container.add(mainPanel, BorderLayout.CENTER);
        container.add(topRowPanel, BorderLayout.NORTH);

        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(container);

        btnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textfield.setText(null);
            }
        });
    }

}
