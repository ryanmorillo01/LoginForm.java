import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener{

    private JLabel JLabelUsername;
    private JLabel jLabelPassword;
    private JTextField jTextFieldUsername;
    private JPasswordField jPasswordField;
    private JButton jButtonLogin;

    public LoginForm(){
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabelUsername = new JLabel("Username:");
        jLabelPassword = new JLabel("Password:");
        jTextFieldUsername = new JTextField(15);
        jPasswordField= new JPasswordField(15);
        jButtonLogin = new JButton("Login");

        
        Container container = getContentPane();
        container.setLayout(new GridLayout(3, 2));
        container.add(JLabelUsername);
        container.add(jTextFieldUsername);
        container.add(jLabelPassword);
        container.add(jPasswordField);
        container.add(jButtonLogin);

        jButtonLogin.addActionListener(this);
        setVisible(true);
    }

        public void actionPerformed(ActionEvent e, JPasswordField JpasswordField){
            String username = jTextFieldUsername.getText();
            String password = new String(JpasswordField.getPassword());
            if (username.equals("admin")&& password.equals("password")) {
                JOptionPane.showMessageDialog(this, "Login successful");
            }else{
                JOptionPane.showMessageDialog(this, "Invalid username or password");
            }
        }
        public static void main(String[] args) {
            new LoginForm();
        }
    }