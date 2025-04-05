import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends JFrame{
    private JButton blu;
    private JPanel panel1;
    private JButton rap;
    private JButton chang;
    private JButton EXITButton;

    public main() {
        setTitle("SIGN IN");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);
        blu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
new blu().setVisible(true);
            }
        });
        rap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
new rap().setVisible(true);
            }
        });
        chang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
 new james().setVisible(true);
            }
        });
        EXITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new main().setVisible(true);
    }
}
