import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NeedsSite {
    public  JPanel Panel1;
    public  JTextField textField1;
    public  JTextField textField2;
    public  JTextField textField3;
    public  JTextField textField4;
    public  JFormattedTextField formattedTextField1;
    public  JTextField textField5;
    public  JTextField textField6;
    public  JButton submitButton;

    public NeedsSite() {
        submitButton.addActionListener(new ActionListener() {
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
