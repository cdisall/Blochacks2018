import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DonorSite {
    public JButton makeDonationButton;
    public JButton logoutButton;
    public JPanel Panel1;

    public DonorSite() {
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new Login();
                JFrame frame = new JFrame("Login");
                frame.setContentPane(new Login().Panel1);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
        makeDonationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //redirect to Paypal
            }
        });
    }
}
