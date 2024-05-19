package doctor;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import doctor.*;

public class Cardiologists extends JFrame implements ActionListener {
	JPanel panel;

	JLabel a1, a2, a3, a4, a5, a6;
	Font myfont;
	private JLabel label6;
	ImageIcon imgcrd;

	private JButton backButton;

	public Cardiologists() {
		super("Cardiologists");
		this.setSize(1200, 673);

		myfont = new Font("Arial", Font.PLAIN, 26);

		panel = new JPanel();
		panel.setLayout(null);
		setLocationRelativeTo(null);
		panel.setBackground(new Color(0, 71, 171));

		a1 = new JLabel("Dr.Abrar Adnan Pranjal");
		a1.setBounds(100, 100, 500, 20);
		a1.setFont(myfont);
		panel.add(a1);

		a2 = new JLabel("Cardiologists");
		a2.setBounds(100, 120, 500, 20);
		a2.setFont(myfont);
		panel.add(a2);

		a3 = new JLabel("Phone no: 01706063448");
		a3.setBounds(100, 140, 500, 20);
		a3.setFont(myfont);
		panel.add(a3);

		a4 = new JLabel("Dr. Zidane Khan");
		a4.setBounds(100, 180, 500, 20);
		a4.setFont(myfont);
		panel.add(a4);

		a5 = new JLabel("Cardiologists");
		a5.setBounds(100, 200, 500, 20);
		a5.setFont(myfont);
		panel.add(a5);

		a6 = new JLabel("Phone no: 019828504588");
		a6.setBounds(100, 220, 500, 20);
		a6.setFont(myfont);
		panel.add(a6);

		backButton = new JButton();
		backButton.setBounds(50, 50, 40, 40);
		backButton.setIcon(new ImageIcon("Homepage\\Back.png"));
		backButton.addActionListener(this);
		add(backButton);

		imgcrd = new ImageIcon("Homepage\\doc.jpg");
		label6 = new JLabel(imgcrd);
		label6.setBounds(0, 0, 1200, 673);
		panel.add(label6);

		this.add(panel);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == backButton) {
			Typesofdoctors f1 = new Typesofdoctors();
			f1.setVisible(true);
			this.setVisible(false);
		} else {
		}
	}

}