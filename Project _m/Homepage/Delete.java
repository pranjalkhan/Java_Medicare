package Homepage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;

public class Delete extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel username, password;
    private JTextField userfield;
    private JPasswordField passfield;
    private JButton delbtn, backbtn;

    public Delete() {
        super("Delete Account");
        this.setSize(1000, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the layout to null to position components absolutely
        setLayout(null);

        // Create and add the background image
        JLabel background = new JLabel(new ImageIcon("Homepage/Delt.png"));
        background.setBounds(0, 0, 1000, 600);
        add(background);

        // Create a transparent panel to hold the form elements
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 1000, 600);
        panel.setOpaque(false);

        username = new JLabel("Name :");
        username.setBounds(250, 150, 75, 50);
        username.setForeground(Color.BLACK);
        panel.add(username);

        userfield = new JTextField();
        userfield.setBounds(400, 165, 150, 25);
        panel.add(userfield);

        password = new JLabel("Password :");
        password.setBounds(250, 290, 75, 50);
        password.setForeground(Color.BLACK);
        panel.add(password);

        passfield = new JPasswordField();
        passfield.setBounds(400, 300, 150, 25);
        panel.add(passfield);

        delbtn = new JButton("Delete");
        delbtn.setBounds(280, 410, 100, 25);
        delbtn.addActionListener(this);
        panel.add(delbtn);

        backbtn = new JButton("Back");
        backbtn.setBounds(400, 410, 100, 25);
        backbtn.addActionListener(this);
        panel.add(backbtn);

        // Add the panel on top of the background label
        background.add(panel);

        // Set the content pane to the background label
        setContentPane(background);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == delbtn) {
            String username = userfield.getText();
            String password = new String(passfield.getPassword());
            deleteUser(username, password);
        } else if (e.getSource() == backbtn) {
            // Assuming LoginFrame is another class in your application
            LoginFrame lo = new LoginFrame();
            lo.setVisible(true);
            this.dispose();
        }
    }

    private void deleteUser(String username, String password) {
        File file = new File("Accounts.txt");
        if (!file.exists()) {
            JOptionPane.showMessageDialog(this, "User data file not found");
            return;
        }

        try {
            // Read all lines from the file
            java.util.List<String> lines = Files.readAllLines(file.toPath());

            // Filter out the line containing the user to be deleted
            java.util.List<String> updatedLines = new java.util.ArrayList<>();
            String userEntry = username + "\t" + password;
            for (String line : lines) {
                if (!line.trim().equals(userEntry)) {
                    updatedLines.add(line);
                }
            }

            // Write the updated lines back to the file
            Files.write(file.toPath(), updatedLines, StandardOpenOption.TRUNCATE_EXISTING);

            JOptionPane.showMessageDialog(this, "User data deleted successfully");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "An error occurred while deleting user data");
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Delete frame = new Delete();
        frame.setVisible(true);
    }
}
