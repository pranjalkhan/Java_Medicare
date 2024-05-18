package ambulance;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import ambulance.*;
import Homepage.Homepage;

public class amb extends JFrame implements ActionListener {
    JPanel panel;
    Color mycolor;
    JButton a1Btn, a2Btn, a3Btn, a4Btn, a5Btn, a6Btn, a7Btn, a8Btn;
    JButton backButton;
    Font myfont;
	ImageIcon imgamb;
	private JLabel ambLabel;

    public amb() {
        super("Select your Division");
        this.setSize(1216, 800);
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myfont = new Font("Arial", Font.PLAIN, 26);

        panel = new JPanel();
        panel.setLayout(null);
       /* panel.setBackground(new Color(0, 0, 0));*/
		
		

        a1Btn = createButton("Barisal", 200, 150);
        a2Btn = createButton("Dhaka", 200, 250);
        a3Btn = createButton("Khulna", 200, 350);
        a4Btn = createButton("Chattagram", 200, 450);
        a5Btn = createButton("Rangpur", 600, 150);
        a6Btn = createButton("Rajshahi", 600, 250);
        a7Btn = createButton("Mymensingh", 600, 350);
        a8Btn = createButton("Sylhet", 600, 450);

        backButton = new JButton();
        backButton.setBounds(50, 50, 40, 40);
        backButton.setIcon(new ImageIcon("Homepage\\Back.png"));
        backButton.addActionListener(this);
        add(backButton);
		
		imgamb = new ImageIcon("ambulance\\Ambu.jpg");
		ambLabel = new JLabel(imgamb);
		ambLabel.setBounds(0,0, 1216, 800);
		panel.add(ambLabel);

        this.add(panel);
    }

    private JButton createButton(String label, int x, int y) {
        JButton button = new JButton(label);
        button.setBounds(x, y, 250, 50);
        button.setFont(myfont);
        button.setBackground(Color.YELLOW);
        button.addActionListener(this);
        panel.add(button);
        return button;
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == backButton) { 
            Homepage f1 = new Homepage();
                    f1.setVisible(true);
                    this.setVisible(false);
        } else if (ae.getSource() == a1Btn) {
            Barisal c1 = new Barisal();
            c1.setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == a2Btn) {
            Dhaka m1 = new Dhaka();
            m1.setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == a3Btn) {
            Khulna d1 = new Khulna();
            d1.setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == a4Btn) {
            Chattagram q1 = new Chattagram();
            q1.setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == a5Btn) {
            Rangpur w1 = new Rangpur();
            w1.setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == a6Btn) {
            Rajshahi t1 = new Rajshahi();
            t1.setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == a7Btn) {
            Mymensingh t1 = new Mymensingh();
            t1.setVisible(true);
            this.setVisible(false);
        } else if (ae.getSource() == a8Btn) {
            Sylhet t1 = new Sylhet();
            t1.setVisible(true);
            this.setVisible(false);
        }
    }

    
}

