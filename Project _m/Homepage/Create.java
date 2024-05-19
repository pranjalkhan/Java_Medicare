package Homepage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Create extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel background;
    private JLabel username, password, confirmPassword, gmailLabel, phoneLabel, genderLabel;
    private JTextField userfield, gmailField, phoneField;
    private JPasswordField passfield, confirmPassField;
    private JComboBox<String> genderComboBox;
    private JButton regbtn, backbtn;
    private Accounts accounts;

    public Create() {
        super("Create Account");
        setSize(1000, 600);
        setLocationRelativeTo(null);

        final ImageIcon backgroundImage = new ImageIcon("Homepage\\CrA.jpg");
        background = new JLabel(backgroundImage);
        background.setLayout(new BorderLayout());

        panel = new JPanel();
        panel.setLayout(null);
        panel.setOpaque(false);
        background.add(panel);

        username = new JLabel("Name:");
        username.setBounds(100, 100, 75, 50);
        username.setForeground(Color.BLACK);
        panel.add(username);

        userfield = new JTextField();
        userfield.setBounds(400, 115, 150, 25);
        panel.add(userfield);

        password = new JLabel("Password:");
        password.setBounds(100, 150, 75, 50);
        password.setForeground(Color.BLACK);
        panel.add(password);

        passfield = new JPasswordField();
        passfield.setBounds(400, 165, 150, 25);
        panel.add(passfield);

        confirmPassword = new JLabel("Confirm Password:");
        confirmPassword.setBounds(100, 200, 150, 50);
        confirmPassword.setForeground(Color.BLACK);
        panel.add(confirmPassword);

        confirmPassField = new JPasswordField();
        confirmPassField.setBounds(400, 215, 150, 25);
        panel.add(confirmPassField);

        gmailLabel = new JLabel("Gmail:");
        gmailLabel.setBounds(100, 250, 75, 50);
        gmailLabel.setForeground(Color.BLACK);
        panel.add(gmailLabel);

        gmailField = new JTextField();
        gmailField.setBounds(400, 265, 150, 25);
        panel.add(gmailField);

        phoneLabel = new JLabel("Phone Number:");
        phoneLabel.setBounds(100, 300, 100, 50);
        phoneLabel.setForeground(Color.BLACK);
        panel.add(phoneLabel);

        phoneField = new JTextField();
        phoneField.setBounds(400, 315, 150, 25);
        panel.add(phoneField);

        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(100, 350, 75, 50);
        genderLabel.setForeground(Color.BLACK);
        panel.add(genderLabel);

        String[] genders = { "Male", "Female", "Others" };
        genderComboBox = new JComboBox<>(genders);
        genderComboBox.setBounds(400, 365, 150, 25);
        panel.add(genderComboBox);

        regbtn = new JButton("Sign up");
        regbtn.setBounds(280, 450, 100, 25);
        regbtn.addActionListener(this);
        panel.add(regbtn);

        backbtn = new JButton("Back");
        backbtn.setBounds(400, 450, 100, 25);
        backbtn.addActionListener(this);
        panel.add(backbtn);

        setContentPane(background);

        accounts = new Accounts();
    }

    // Action_Listenner Methode................
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == regbtn) {
            String name = userfield.getText();
            String pass = new String(passfield.getPassword());
            String confirmPass = new String(confirmPassField.getPassword());
            String gmail = gmailField.getText();
            String phone = phoneField.getText();
            String gender = (String) genderComboBox.getSelectedItem();

            if (name.isEmpty() || pass.isEmpty() || confirmPass.isEmpty() || gmail.isEmpty() || phone.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Fill All Options !!!");
            } else {
                if (!pass.equals(confirmPass)) {
                    JOptionPane.showMessageDialog(this, "Passwords do not match !!!");
                } else {

                    accounts.setusername(name);
                    accounts.setpass(pass);
                    accounts.addaccount();

                    JOptionPane.showMessageDialog(this, "Successfully Registered !!!");

                    userfield.setText("");
                    passfield.setText("");
                    confirmPassField.setText("");
                    gmailField.setText("");
                    phoneField.setText("");

                    LoginFrame f1 = new LoginFrame();
                    f1.setVisible(true);
                    this.setVisible(false);
                }
            }
        } else if (ae.getSource() == backbtn) {

            LoginFrame f1 = new LoginFrame();
            f1.setVisible(true);
            this.setVisible(false);
        }
    }

}
