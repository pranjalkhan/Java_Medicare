package doctor;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Typesofdoctors extends JFrame implements ActionListener {
	JPanel panel;
	JButton a1Btn, a2Btn, a3Btn, a4Btn, a5Btn, a6Btn, backButton;
	Color mycolor, mycolor1;
	Font myfont;
	private ImageIcon img;
	private JLabel label6;
	ImageIcon imgT;

	public Typesofdoctors() {
		super("Doctors: ");
		this.setSize(1200, 673);
		setLocationRelativeTo(null);

		myfont = new Font("Arial", Font.PLAIN, 26);

		panel = new JPanel();
		panel.setLayout(null);
		// panel.setBackground(new Color(0, 71, 171));

		// Left column buttons
		a1Btn = new JButton("Cardiologist");
		a1Btn.setBounds(130, 300, 250, 50);
		a1Btn.setFont(myfont);
		a1Btn.setBackground(Color.YELLOW);
		a1Btn.addActionListener(this);
		panel.add(a1Btn);

		a2Btn = new JButton("Medicine Specialist");
		a2Btn.setBounds(130, 400, 260, 50);
		a2Btn.setFont(myfont);
		a2Btn.setBackground(Color.YELLOW);
		a2Btn.addActionListener(this);
		panel.add(a2Btn);

		a3Btn = new JButton("Dermatologist");
		a3Btn.setBounds(130, 500, 250, 50);
		a3Btn.setFont(myfont);
		a3Btn.setBackground(Color.YELLOW);
		a3Btn.addActionListener(this);
		panel.add(a3Btn);

		// Right column buttons
		a4Btn = new JButton("Dentist");
		a4Btn.setBounds(800, 300, 250, 50);
		a4Btn.setFont(myfont);
		a4Btn.setBackground(Color.YELLOW);
		a4Btn.addActionListener(this);
		panel.add(a4Btn);

		a5Btn = new JButton("M.B.B.S");
		a5Btn.setBounds(800, 400, 250, 50);
		a5Btn.setFont(myfont);
		a5Btn.setBackground(Color.YELLOW);
		a5Btn.addActionListener(this);
		panel.add(a5Btn);

		a6Btn = new JButton("General Surgeons");
		a6Btn.setBounds(800, 500, 250, 50);
		a6Btn.setFont(myfont);
		a6Btn.setBackground(Color.YELLOW);
		a6Btn.addActionListener(this);
		panel.add(a6Btn);

		backButton = new JButton();
		backButton.setBounds(50, 50, 40, 40);
		backButton.setIcon(new ImageIcon("Homepage\\Back.png"));
		backButton.addActionListener(this);
		panel.add(backButton);

		imgT = new ImageIcon("Homepage\\doc.jpg");
		label6 = new JLabel(imgT);
		label6.setBounds(0, 0, 1200, 673);
		panel.add(label6);

		this.add(panel);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == backButton) {
			Division f1 = new Division();
			f1.setVisible(true);
			this.setVisible(false);
		} else if (ae.getSource() == a1Btn) {
			Cardiologists c1 = new Cardiologists();
			c1.setVisible(true);
			this.setVisible(false);
		} else if (ae.getSource() == a2Btn) {
			MedicineSpecialist m1 = new MedicineSpecialist();
			m1.setVisible(true);
			this.setVisible(false);
		} else if (ae.getSource() == a3Btn) {
			Dermatologist d1 = new Dermatologist();
			d1.setVisible(true);
			this.setVisible(false);
		} else if (ae.getSource() == a4Btn) {
			Dentist q1 = new Dentist();
			q1.setVisible(true);
			this.setVisible(false);
		} else if (ae.getSource() == a5Btn) {
			MBBS w1 = new MBBS();
			w1.setVisible(true);
			this.setVisible(false);
		} else if (ae.getSource() == a6Btn) {
			GeneralSurgeons t1 = new GeneralSurgeons();
			t1.setVisible(true);
			this.setVisible(false);
		}
	}

}
