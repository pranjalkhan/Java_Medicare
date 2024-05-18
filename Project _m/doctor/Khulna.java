package doctor;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import doctor.*;


public class Khulna extends JFrame implements ActionListener
{
	ImageIcon img;
	JLabel imgLabel;
	JPanel panel;
	Color mycolor,mycolor1;
	JButton a1Btn, a2Btn, a3Btn, a4Btn, a5Btn, a6Btn, a7Btn, a8Btn, a9Btn, a10Btn,backButton ;
	Font myfont;
	private JLabel label6;
	ImageIcon imgK;

	public Khulna()
	{
		super("Select Your District");
		this.setSize(1200, 673);
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myfont=new Font("Arial",Font.PLAIN,26);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 71, 171));	
				
		a1Btn = new JButton("KHULNA");
		a1Btn.setBounds(200, 150, 250, 50);
		a1Btn.setFont(myfont);
		a1Btn.setBackground(Color.YELLOW);
		a1Btn.addActionListener(this);
		panel.add(a1Btn);
		
		a2Btn = new JButton("BAGERHAT");
		a2Btn.setBounds(200, 250, 250, 50);
		a2Btn.setFont(myfont);
		a2Btn.setBackground(Color.YELLOW);
		a2Btn.addActionListener(this);
		panel.add(a2Btn);
		
		a3Btn = new JButton("SATKHIRA");
		a3Btn.setBounds(200, 350, 250, 50);
		a3Btn.setFont(myfont);
		a3Btn.setBackground(Color.YELLOW);
		a3Btn.addActionListener(this);
		panel.add(a3Btn);
		
		a4Btn = new JButton("JESSORE");
		a4Btn.setBounds(200, 450, 250, 50);
		a4Btn.setFont(myfont);
		a4Btn.setBackground(Color.YELLOW);
		a4Btn.addActionListener(this);
		panel.add(a4Btn);
		
		a5Btn = new JButton("MAGURA");
		a5Btn.setBounds(200, 550, 250, 50);
		a5Btn.setFont(myfont);
		a5Btn.setBackground(Color.YELLOW);
		a5Btn.addActionListener(this);
		panel.add(a5Btn);
		
		a6Btn = new JButton("JHENAIDAH");
		a6Btn.setBounds(600, 150, 250, 50);
		a6Btn.setFont(myfont);
		a6Btn.setBackground(Color.YELLOW);
		a6Btn.addActionListener(this);
		panel.add(a6Btn);
		
		a7Btn = new JButton("NARAIL");
		a7Btn.setBounds(600, 250, 250, 50);
		a7Btn.setFont(myfont);
		a7Btn.setBackground(Color.YELLOW);
		a7Btn.addActionListener(this);
		panel.add(a7Btn);
		
		a8Btn = new JButton("KUSHTIA");
		a8Btn.setBounds(600, 350, 250, 50);
		a8Btn.setFont(myfont);
		a8Btn.setBackground(Color.YELLOW);
		a8Btn.addActionListener(this);
		panel.add(a8Btn);
		
		
		a9Btn = new JButton("CHUADANGA");
		a9Btn.setBounds(600, 450, 250, 50);
		a9Btn.setFont(myfont);
		a9Btn.setBackground(Color.YELLOW);
		a9Btn.addActionListener(this);
		panel.add(a9Btn);
		 
	    a10Btn = new JButton("MEHERPUR");
		a10Btn.setBounds(600, 550, 250, 50);
		a10Btn.setFont(myfont);
		a10Btn.setBackground(Color.YELLOW);
		a10Btn.addActionListener(this);
		panel.add(a10Btn);
		
		backButton = new JButton("BACK");
		backButton.setBounds(50,50,40,40);
		backButton.addActionListener(this);
		panel.add(backButton);        backButton = new JButton();
       
		backButton.setBounds(50, 50, 40, 40);
        backButton.setIcon(new ImageIcon("Homepage\\Back.png"));
        backButton.addActionListener(this);
        add(backButton);	this.add(panel);
		
			
		imgK = new ImageIcon("Homepage\\doc.jpg");
		label6 = new JLabel(imgK);
		label6.setBounds(0,0, 1200, 673);
		panel.add(label6);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == backButton) 
		{
           Division f1 = new Division();
           f1.setVisible(true);
       	   this.setVisible(false);   
        }
		else if(ae.getSource()==a1Btn)
		{
			Typesofdoctors c1=new Typesofdoctors();
			c1.setVisible(true);
			this.setVisible(false);
			
		}
		
		else if(ae.getSource()==a2Btn)
		{
			Typesofdoctors m1=new Typesofdoctors();
			m1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==a3Btn)
		{
			Typesofdoctors d1=new Typesofdoctors();
			d1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==a4Btn)
		{
			Typesofdoctors q1=new Typesofdoctors();
			q1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==a5Btn)
		{
			Typesofdoctors w1=new Typesofdoctors();
			w1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==a6Btn)
		{
			Typesofdoctors t1=new Typesofdoctors();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==a7Btn)
		{
			Typesofdoctors t1=new Typesofdoctors();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==a8Btn)
		{
			Typesofdoctors t1=new Typesofdoctors();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==a9Btn)
		{
			Typesofdoctors t1=new Typesofdoctors();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==a10Btn)
		{
			Typesofdoctors t1=new Typesofdoctors();
			t1.setVisible(true);
			this.setVisible(false);
		}
	}
}