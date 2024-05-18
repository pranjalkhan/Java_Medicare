package Homepage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Delete extends JFrame implements ActionListener {
    private JTextField userfield;
    private JPasswordField passfield;
    private JButton delbtn, backbtn;

    public Delete() {
        super("Delete Account");
        this.setSize(1200, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label for the background image
        JLabel background = new JLabel(new ImageIcon("Homepage\\Delt.png"));
        background.setLayout(new BorderLayout());

        // Create a panel for the form elements
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setOpaque(false); // Make panel transparent to show the background image

        JLabel username = new JLabel("Name :");
        username.setBounds(100, 150, 75, 50);
        username.setForeground(Color.BLACK);
        panel.add(username);

        userfield = new JTextField();
        userfield.setBounds(200, 160, 200, 30);
        panel.add(userfield);

        JLabel password = new JLabel("Password :");
        password.setBounds(100, 250, 100, 50);
        password.setForeground(Color.black);
        panel.add(password);

        passfield = new JPasswordField();
        passfield.setBounds(200, 260, 200, 30);
        panel.add(passfield);

        delbtn = new JButton("Delete");
        delbtn.setBounds(200, 350, 100, 30);
        delbtn.addActionListener(this);
        panel.add(delbtn);

        backbtn = new JButton("Back");
        backbtn.setBounds(310, 350, 100, 30);
        backbtn.addActionListener(this);
        panel.add(backbtn);

        // Add the panel to the background label
        background.add(panel, BorderLayout.CENTER);

        // Set the background label as the content pane
        setContentPane(background);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == delbtn) {
            File f1 = new File("./Accounts.txt");

            if (f1.exists()) {
                boolean delete = f1.delete();

                if (delete) {
                    JOptionPane.showMessageDialog(null, "User data deleted successfully");
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to delete user data");
                }
            } else {
                JOptionPane.showMessageDialog(null, "User data not found");
            }
        } else if (e.getSource() == backbtn) {
            this.setVisible(false);
            LoginFrame f2 = new LoginFrame();
            f2.setVisible(true);
        }
    }

    public static void main(String[] args) {
        Delete deleteFrame = new Delete();
        deleteFrame.setVisible(true);
    }
}
