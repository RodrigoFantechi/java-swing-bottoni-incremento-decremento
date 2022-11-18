import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class primaClasse {

    public static void main(String[] args) {

        JFrame pippo = new JFrame();
        pippo.setSize(500,500);
        pippo.setTitle("primaProva");
        pippo.setVisible(true);

        JPanel pannello = new JPanel();
        pannello.setBackground(Color.BLUE);
        pippo.setContentPane(pannello);

        JButton jButton = new JButton();
        jButton.setName("ilBottone");
        pannello.setLayout(new BorderLayout());
        jButton.setPreferredSize(new Dimension(100, 50));
        pannello.add(jButton,BorderLayout.PAGE_START);

        JTextArea commento = new JTextArea();
        commento.setText("cazzoooo");
        commento.setPreferredSize(new Dimension(100,50));
        pannello.add(commento,BorderLayout.CENTER);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                commento.setText("pippo");

            }
        });





    }
}
