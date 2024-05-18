package ambulance;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import ambulance.*;
import Homepage.Homepage;


public class Mymensingh  extends JFrame implements ActionListener
{
	ImageIcon img;
	JLabel imgLabel;
	JPanel panel;
	Color mycolor;
	JButton b1Btn, b2Btn, b3Btn, b4Btn,backButton;
	Font myfont;
	ImageIcon imgamb;
	private JLabel ambLabel;

	public Mymensingh()
	{
		super("Select Your District");
		this.setSize(1200, 800);
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myfont=new Font("Arial",Font.PLAIN,26);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(170, 245, 255));
				
		b1Btn = new JButton("MYMENSINGH");
		b1Btn.setBounds(200, 300, 250, 50);
		b1Btn.setFont(myfont);
		b1Btn.setBackground(Color.YELLOW);
		b1Btn.addActionListener(this);
		panel.add(b1Btn);
		
		b2Btn = new JButton("JAMALPUR");
		b2Btn.setBounds(200, 400, 250, 50);
		b2Btn.setFont(myfont);
		b2Btn.setBackground(Color.YELLOW);
		b2Btn.addActionListener(this);
		panel.add(b2Btn);
		
		b3Btn = new JButton("SHERPUR");
		b3Btn.setBounds(700, 300, 250, 50);
		b3Btn.setFont(myfont);
		b3Btn.setBackground(Color.YELLOW);
		b3Btn.addActionListener(this);
		panel.add(b3Btn);
		
		b4Btn = new JButton("NETROKONA");
		b4Btn.setBounds(700, 400, 250, 50);
		b4Btn.setFont(myfont);
		b4Btn.setBackground(Color.YELLOW);
		b4Btn.addActionListener(this);
		panel.add(b4Btn);

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
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == backButton) {
        
        amb f1 = new amb();
        f1.setVisible(true);
       	this.setVisible(false);
		   
    }
		else if(ae.getSource()==b1Btn)
		{
			ambulance1 c1=new ambulance1();
			c1.setVisible(true);
			this.setVisible(false);
			
		}
		
		else if(ae.getSource()==b2Btn)
		{
			ambulance1 m1=new ambulance1();
			m1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==b3Btn)
		{
			ambulance1 d1=new ambulance1();
			d1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==b4Btn)
		{
			ambulance1 q1=new ambulance1();
			q1.setVisible(true);
			this.setVisible(false);
		}
	}
}