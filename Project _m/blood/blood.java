package blood;
import java.lang.*;
import javax.swing.*;

import Homepage.Homepage;

import java.awt.*;
import java.awt.event.*;
import blood.*;


public class blood extends JFrame implements ActionListener
{
	JPanel panel;
	ImageIcon img;
	JLabel imgLabel;
	Color mycolor,mycolor1;
	JButton a1Btn,a2Btn,a3Btn,a4Btn,a5Btn,a6Btn,a7Btn,a8Btn;
	Font myfont;
	private JButton backButton;
	private JLabel bloodLabel5;
	ImageIcon imgbl5;

	public blood()
	{
		super("Select Your Division");
		this.setSize(1200, 691);
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 71, 171));
		myfont=new Font("Arial",Font.PLAIN,26);		
		
		a1Btn = new JButton("Barisal");
		a1Btn.setBounds(200, 150, 250, 50);
		a1Btn.setFont(myfont);
		a1Btn.setBackground(Color.YELLOW);
		a1Btn.addActionListener(this);
		panel.add(a1Btn);
		
		a2Btn = new JButton("Dhaka");
		a2Btn.setBounds(200, 250, 250, 50);
		a2Btn.setFont(myfont);
		a2Btn.setBackground(Color.YELLOW);
		a2Btn.addActionListener(this);
		panel.add(a2Btn);
		
		a3Btn = new JButton("Khulna");
		a3Btn.setBounds(200, 350, 250, 50);
		a3Btn.setFont(myfont);
		a3Btn.setBackground(Color.YELLOW);
		a3Btn.addActionListener(this);
		panel.add(a3Btn);
		
		a4Btn = new JButton("chattagram");
		a4Btn.setBounds(200, 450, 250, 50);
		a4Btn.setFont(myfont);
		a4Btn.setBackground(Color.YELLOW);
		a4Btn.addActionListener(this);
		panel.add(a4Btn);
		
		a5Btn = new JButton("Rangpur");
		a5Btn.setBounds(600, 150, 250, 50);
		a5Btn.setFont(myfont);
		a5Btn.setBackground(Color.YELLOW);
		a5Btn.addActionListener(this);
		panel.add(a5Btn);
		
		a6Btn = new JButton("Rajshahi");
		a6Btn.setBounds(600, 250, 250, 50);
		a6Btn.setFont(myfont);
		a6Btn.setBackground(Color.YELLOW);
		a6Btn.addActionListener(this);
		panel.add(a6Btn);
		
		a7Btn = new JButton("Mymensingh");
		a7Btn.setBounds(600, 350, 250, 50);
		a7Btn.setFont(myfont);
		a7Btn.setBackground(Color.YELLOW);
		a7Btn.addActionListener(this);
		panel.add(a7Btn);
		
		a8Btn = new JButton("Sylhet");
		a8Btn.setBounds(600, 450, 250, 50);
		a8Btn.setFont(myfont);
		a8Btn.setBackground(Color.YELLOW);
		a8Btn.addActionListener(this);
		panel.add(a8Btn);
	
		backButton = new JButton();
        backButton.setBounds(50, 50, 40, 40);
        backButton.setIcon(new ImageIcon("Homepage\\Back.png"));
        backButton.addActionListener(this);
        add(backButton);
		imgbl5 = new ImageIcon("blood\\Blood.jpg");
		bloodLabel5 = new JLabel(imgbl5);
		bloodLabel5.setBounds(0,0, 1200, 691);
		panel.add(bloodLabel5);
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==a1Btn)
		{
			BarisalDivision c1=new BarisalDivision();
			c1.setVisible(true);
			this.setVisible(false);
			
		}
		
		else if(ae.getSource()==a2Btn)
		{
			Dhaka m1=new Dhaka();
			m1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==a3Btn)
		{
			KhulnaDivision d1=new KhulnaDivision();
			d1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==a4Btn)
		{
			Chattagram q1=new Chattagram();
			q1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==a5Btn)
		{
			RangpurDivision w1=new RangpurDivision();
			w1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==a6Btn)
		{
			RajshahiDivision t1=new RajshahiDivision();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==a7Btn)
		{
			Mymensingh t1=new Mymensingh();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==a8Btn)
		{
			Sylhet t1=new Sylhet();
			t1.setVisible(true);
			this.setVisible(false);
		}
			else if (ae.getSource() == backButton) 
			{
				Homepage f1 = new Homepage();
			    f1.setVisible(true);
				this.setVisible(false);   
			} else{}
		}
	}
