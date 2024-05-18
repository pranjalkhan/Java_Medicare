package Homepage;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import doctor.*;
import ambulance.*;
import blood.*;
import medicine.*;

public class Homepage extends JFrame implements ActionListener {
    JPanel panel;
    LoginFrame f1;
    JButton backButton, docButton, ambuButton, bloodButton, medButton,button2;
    private JLabel docLabel, ambuLabel, bloodLabel, medLabel,label6;
    private ImageIcon img;

	
    public Homepage() {
        super("HomePage");
        this.setSize(1200, 800);
        setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        panel = new JPanel();
        panel.setLayout(null);

        img = new ImageIcon("Homepage\\Homepage.jpg");
		label6 = new JLabel(img);
		label6.setBounds(0,0, 1200, 800);
		panel.add(label6);

        docButton = new JButton();
        docButton.setBounds(300, 200, 100, 100);
        docButton.setIcon(new ImageIcon("Homepage\\Doctor.jpg"));
        docButton.addActionListener(this);
        add(docButton);

        docLabel = new JLabel("Doctor Information");
        docLabel.setBounds(300, 310, 120, 20);
        add(docLabel);

        ambuButton = new JButton();
        ambuButton.setBounds(500, 350, 100, 100);
        ambuButton.setIcon(new ImageIcon("Homepage\\Ambulance.jpg"));
        ambuButton.addActionListener(this);
        add(ambuButton);

        ambuLabel = new JLabel("Need Ambulance");
        ambuLabel.setBounds(500, 460, 120, 20);
        add(ambuLabel);

        bloodButton = new JButton();
        bloodButton.setBounds(700, 350, 100, 100);
        bloodButton.setIcon(new ImageIcon("Homepage\\Blood.jpg"));
        bloodButton.addActionListener(this);
        add(bloodButton);

        bloodLabel = new JLabel("Blood Donor Information");
        bloodLabel.setBounds(700, 460, 150, 20);
        add(bloodLabel);

        medButton = new JButton();
        medButton.setBounds(500, 200, 100, 100);
        medButton.setIcon(new ImageIcon("Homepage\\Medicine.jpg"));
        medButton.addActionListener(this);
        add(medButton);

        medLabel = new JLabel("Medicine Price");
        medLabel.setBounds(500, 310, 120, 20);
        add(medLabel);

        backButton = new JButton();
        backButton.setBounds(50, 50, 40, 40);
        backButton.setIcon(new ImageIcon("Homepage\\Back.png"));
        backButton.addActionListener(this);
        add(backButton);

        button2 = new JButton("Close");
		button2.setBounds(650,620,95,35);
		panel.add(button2);
		button2.setForeground(Color.black);
        button2.setBackground(Color.YELLOW);
        this.add(panel);
        button2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == backButton) {
            LoginFrame f1 = new LoginFrame();
            f1.setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == docButton) {
            Division d1 = new Division();
            d1.setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == ambuButton) {
            amb d1 = new amb();
            d1.setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == bloodButton) {
            blood d1 = new blood();
            d1.setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == medButton) {
            medicine d1 = new medicine();
            d1.setVisible(true);
            this.setVisible(false);
        }else if (ae.getSource() == button2) {
			System.exit(ABORT);
        }else{}
    }
}