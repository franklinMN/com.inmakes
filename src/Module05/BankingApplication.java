package Module05;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class BankingApplication {

    BankingApplication() {
        loginPage();
    }

    public static void loginPage(){

        JTextField username;
        JPasswordField passwordField;


        JFrame frame = new JFrame("loginPage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username: ");
        panel.add(usernameLabel);
        username = new JTextField();
        panel.add(username);

        JLabel passwordLabel = new JLabel("Password: ");
        panel.add(passwordLabel);
        passwordField = new JPasswordField();
        panel.add(passwordField);

        JButton submitButtom = new JButton("Submit");
        submitButtom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ){
                String name = username.getText();
                String pass = new String(passwordField.getPassword());

                if(validate(name, pass)){
                    homePage(frame);
                }else{
                    JOptionPane.showMessageDialog(frame, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);;
                }
            }
        });
        panel.add(submitButtom);


        frame.add(panel);
        frame.setVisible(true);

    }

    public static void homePage( JFrame loginFrame ){

        loginFrame.dispose();

        JFrame homeFrame = new JFrame("Home Page");
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setSize(400, 300);

        JLabel welcomeLabel = new JLabel("Welcome to the Home Page!");
        
        homeFrame.add(welcomeLabel);
        homeFrame.setVisible(true);

    }

    private static boolean validate( String name, String pass ){
        return "admin".equals(name) && "admin".equals(pass);
    }
    
    public static void main( String[] args ){

        SwingUtilities.invokeLater(
            new Runnable() {
                @Override
                public void run(){
                    new BankingApplication();
                }
                
            }
        );
    }

}
