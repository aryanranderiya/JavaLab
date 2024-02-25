

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Set6_GUIUnits {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());

        JLabel label_no_of_units = new JLabel("Number of Units:");
        JTextField textfield_units = new JTextField();
        JLabel label_billamount = new JLabel("Bill Amount");
        JButton btn_calculate_bill = new JButton("Calculate Bill");

        JPanel top_panel = new JPanel();
        JPanel center_panel = new JPanel();
        JPanel bottom_panel = new JPanel();

        top_panel.setLayout(new GridLayout(2, 1));
        center_panel.setLayout(new FlowLayout(0, 0, 200));

        top_panel.add(label_no_of_units);
        top_panel.add(textfield_units);
        center_panel.add(label_billamount);
        bottom_panel.add(btn_calculate_bill);

        frame.add(top_panel, BorderLayout.NORTH);
        frame.add(center_panel, BorderLayout.CENTER);
        frame.add(bottom_panel, BorderLayout.SOUTH);

        frame.setSize(500, 500);
        frame.setTitle("Bill-Calculator!!");
        frame.setVisible(true);

        btn_calculate_bill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user_input = textfield_units.getText();

                int bill = calculateBill(Integer.parseInt(user_input));
                label_billamount.setText("Unit Consumption : " + user_input + " Bill : " + bill);

                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }

        });

    }

    public static int calculateBill(int units) {

        int charge = 1;
        if (units <= 200) {
            charge = 3;
        } else if (units > 200 && units < 300) {
            charge = 4;
        } else {
            charge = 5;
        }

        return units * charge;
    }
}
