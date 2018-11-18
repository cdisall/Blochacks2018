import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DonorSite {
    public JButton makeDonationButton  = new JButton("Make Donation");
    public JButton logoutButton = new JButton("Logout");
    public JPanel panel1 = new JPanel();

    public DonorSite() {
    	
        panel1.add(makeDonationButton);
        panel1.add(logoutButton);
        
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFrame frame = new JFrame("Login");
                frame.setContentPane(new Login().panel1);
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
