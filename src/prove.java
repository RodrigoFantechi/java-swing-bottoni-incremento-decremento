import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



    public class prove  {

        private int num = 50;
        private JButton increment;
        private JButton decrement;
        private JLabel label;
        private JPanel buttonPanel;
        private JPanel displayPanel;

        public prove() {

            JFrame numeri = new JFrame();
            numeri.setSize(500,500);
            numeri.setTitle("Numeri");

            numeri.setVisible(true);

            increment = new JButton ("Increment");
            decrement = new JButton ("Decrement");
            increment.addActionListener (new incListener());
            decrement.addActionListener (new decListener());


            num = 50;
            label = new JLabel ("" + num);

            buttonPanel = new JPanel();
            displayPanel = new JPanel();

            buttonPanel.add(increment);
            buttonPanel.add(decrement);
            displayPanel.add(label);

            numeri.setLayout(new BorderLayout());
            numeri.add(buttonPanel, BorderLayout.CENTER);
            numeri.add(displayPanel, BorderLayout.NORTH);
        }

        private class incListener implements ActionListener {
            public void actionPerformed(ActionEvent event ) {
                num++;
                label.setText("" + num);
            }
        }

        private class decListener implements ActionListener {
            public void actionPerformed (ActionEvent event) {
                num--;
                label.setText("" + num);
            }
        }

        public static void main(String[] args) {
            prove win = new prove();

        }
    }


