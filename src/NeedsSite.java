import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NeedsSite {
    public  JPanel panel1 = new JPanel();
    public  JTextField textField1 = new JTextField();
    public  JTextField textField2 = new JTextField();
    public  JTextField textField3 = new JTextField();
    public  JTextField textField4 = new JTextField();
    public  JFormattedTextField formattedTextField1 = new JFormattedTextField();
    public  JTextField textField5 = new JTextField();
    public  JTextField textField6 = new JTextField();
    public  JButton submitButton = new JButton("Submit");

    public NeedsSite() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            	panel1.add(textField1);
            	panel1.add(textField2);
            	panel1.add(textField3);
            	panel1.add(textField4);
            	panel1.add(textField5);
            	panel1.add(textField6);
            
                JFrame frame = new JFrame("RecSite");
                frame.setContentPane(new RecSite().panel1);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
