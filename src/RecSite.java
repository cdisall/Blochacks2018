import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Object;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JComponent;
import javax.swing.filechooser.*;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class RecSite {
    public JButton uploadStatementButton;
    public  JButton updateNeedsButton;
    public  JPanel Panel1;
    public  JButton logoutButton;

    public RecSite() {
        uploadStatementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFileChooser chooseFile = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
                chooseFile.setDialogTitle("Choose a file.");
                chooseFile.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

                int returnValue = chooseFile.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    if (chooseFile.getSelectedFile().isFile()) {
                        System.out.println("You selected the file: " + chooseFile.getSelectedFile());
                    }
                }
            }
        });

        updateNeedsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new NeedsSite();
                JFrame frame = new JFrame("NeedsSite");
                frame.setContentPane(new NeedsSite().Panel1);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);

            }
        });
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                new RecLogin();
                JFrame frame = new JFrame("RecLogin");
                frame.setContentPane(new RecLogin().Panel1);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
