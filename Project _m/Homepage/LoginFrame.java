package Homepage;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame implements MouseListener, ActionListener {
	JPanel panel;
	JButton loginButton, createButton, deleteButton;
	JLabel usernameLabel, passwordLabel, mediCareLabel;
	JTextField usernameField;
	JPasswordField passwordField;

	public LoginFrame() {
		setTitle("Login Page");
		setSize(1200, 800);

		panel = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setContentPane(new JLabel(new ImageIcon("Homepage\\Login Page.jpg")));
		setLayout(null);

		mediCareLabel = new JLabel("Medi_Care");
		mediCareLabel.setBounds(100, 100, 400, 50);
		mediCareLabel.setFont(new Font("Arial", Font.BOLD, 30));
		mediCareLabel.setForeground(Color.RED);
		add(mediCareLabel);

		usernameLabel = new JLabel("Username:");
		usernameLabel.setBounds(100, 250, 100, 25);
		usernameLabel.setForeground(Color.black);
		add(usernameLabel);

		usernameField = new JTextField();
		usernameField.setBounds(200, 245, 150, 35);
		add(usernameField);

		passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(100, 300, 100, 25);
		passwordLabel.setForeground(Color.black);
		add(passwordLabel);

		passwordField = new JPasswordField();
		passwordField.setBounds(200, 295, 150, 35);
		passwordField.setEchoChar('*');
		add(passwordField);

		loginButton = new JButton("Login");
		loginButton.setBounds(150, 400, 180, 25);
		loginButton.addMouseListener(this);
		loginButton.addActionListener(this);
		add(loginButton);

		createButton = new JButton("Create New Account");
		createButton.setBounds(150, 450, 180, 25);
		createButton.addMouseListener(this);
		createButton.addActionListener(this);
		add(createButton);

		deleteButton = new JButton("Delete Account");
		deleteButton.setBounds(150, 500, 180, 25);
		deleteButton.addMouseListener(this);
		deleteButton.addActionListener(this);
		add(deleteButton);

		this.add(panel);
	}

	public void mouseClicked(MouseEvent me) {
	}

	public void mousePressed(MouseEvent me) {
	}

	public void mouseReleased(MouseEvent me) {
	}

	public void mouseEntered(MouseEvent me) {
		if (me.getSource() == loginButton) {
			loginButton.setBackground(Color.gray);
			loginButton.setForeground(Color.black);
		} else if (me.getSource() == createButton) {
			createButton.setBackground(Color.green);
			createButton.setForeground(Color.black);
		}
	}

	public void mouseExited(MouseEvent me) {
		if (me.getSource() == loginButton) {
			loginButton.setBackground(Color.pink);
			loginButton.setForeground(Color.black);
		}

		else if (me.getSource() == createButton) {
			createButton.setBackground(Color.white);
			createButton.setForeground(Color.black);
		}
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == createButton) {
			Create c1 = new Create();
			c1.setVisible(true);
			this.setVisible(false);
		} else if (ae.getSource() == loginButton) {
			String usernameLabel = usernameField.getText();
			String passwordLabel = passwordField.getText();

			Accounts acc = new Accounts();

			if (acc.getAccount(usernameLabel, passwordLabel) == true) {

				JOptionPane.showMessageDialog(null, "Valid Information !!!");

				Homepage h1 = new Homepage();
				h1.setVisible(true);
				this.setVisible(false);
			}

			else {
				JOptionPane.showMessageDialog(null, "Invalid Information !!!");
			}

		}

		else if (ae.getSource() == deleteButton) {
			Delete f1 = new Delete();
			f1.setVisible(true);
			this.setVisible(false);
		}

	}
}
