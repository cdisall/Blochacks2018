import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

public class RecLogin {
    public  JTextField username = new JTextField();
    public  JButton loginButton  = new JButton("Login");
    public  JPasswordField passwordField1 = new JPasswordField();
    public  JPanel panel1 = new JPanel();

    public RecLogin() {
        panel1.add(username);
        panel1.add(passwordField1);
        panel1.add(loginButton);
        
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            	
            	//Check if user exists. If not, create an account.
            	String email = username.getText();
            	String pwd = passwordField1.getText();
            	boolean test = false;
            	for (Reciever R : Login.recievers) {
            		if(R.getEmail().equals(email)) {
            			if(R.getPassword().equals(pwd)) {
            				test=true;
            				Login.index=Login.recievers.indexOf(R);
            				break;
            			}
            		}
            	}
            	if(!test) {
            		Reciever newOne = new Reciever(email, pwd);
            		newOne.setDefaultNeeds();
            		Login.index=Login.recievers.indexOf(newOne);
            		Login.recievers.add(newOne);
            	}
            	
            	System.out.println("Welcome!");
            	System.out.println(Login.recievers.toString());
            	
            	JFrame frame = new JFrame("RecSite");
                frame.setContentPane(new RecSite().panel1);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
        username.addInputMethodListener(new InputMethodListener() {
            @Override
            public void inputMethodTextChanged(InputMethodEvent inputMethodEvent) {
                JTextField txtInput = new JTextField("");
                String userame=username.getText();
            }

            @Override
            public void caretPositionChanged(InputMethodEvent inputMethodEvent) {

            }
        });
        passwordField1.addInputMethodListener(new InputMethodListener() {
            @Override
            public void inputMethodTextChanged(InputMethodEvent inputMethodEvent) {
                JTextField txtInput = new JTextField("");
                String password=passwordField1.getText();
            }

            @Override
            public void caretPositionChanged(InputMethodEvent inputMethodEvent) {

            }
        });

    }
}
