import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RecLogin {
    public  JTextField textField1;
    public  JButton loginButton;
    public  JPasswordField passwordField1;
    public  JPanel Panel1;

    public RecLogin() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new RecSite();
                JFrame frame = new JFrame("RecSite");
                frame.setContentPane(new RecSite().Panel1);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
