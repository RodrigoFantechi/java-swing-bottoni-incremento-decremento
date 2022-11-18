import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bottoni {

    public static void main(String[] args) {

        int numero = 50;

        JFrame pippo = new JFrame();
        pippo.setSize(500,500);
        pippo.setTitle("Bottoni");
        pippo.setVisible(true);

        JPanel pannello = new JPanel();
        pannello.setBackground(Color.WHITE);
        pippo.setContentPane(pannello);

        JButton Aumento = new JButton("aumentare");
        JButton Diminuisce = new JButton("diminuire");

        JLabel num = new JLabel ("" + numero);

        pannello.add(Aumento);
        pannello.add(Diminuisce);
        pannello.add(num);


        Aumento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });


    }
}
