package doctor;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import doctor.*;



public class Chattagram  extends JFrame implements ActionListener
{
	ImageIcon img;
	JLabel imgLabel;
	JPanel panel;
	Color mycolor,mycolor1;
	JButton b1Btn, b2Btn, b3Btn, b4Btn, b5Btn, b6Btn, b7Btn,b8Btn,b9Btn,b10Btn,b11Btn,b12Btn,backButton;
	Font myfont;
	private JLabel label6;
	ImageIcon imgch;
	

	public Chattagram()
	{
		super("Select Your District");
		this.setSize(1200, 673);
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myfont=new Font("Arial",Font.PLAIN,26);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 71, 171));
				
		b1Btn = new JButton("CHATTAGRAM");
		b1Btn.setBounds(200,100,250,50);
		b1Btn.setFont(myfont);
		b1Btn.setBackground(Color.YELLOW);
		b1Btn.addActionListener(this);
		panel.add(b1Btn);
		
		b2Btn = new JButton("CUMILLA");
		b2Btn.setBounds(200,200,250,50);
		b2Btn.setFont(myfont);
		b2Btn.setBackground(Color.YELLOW);
		b2Btn.addActionListener(this);
		panel.add(b2Btn);
		
		b3Btn = new JButton("COX'S BAZAR");
		b3Btn.setBounds(200,300,250,50);
		b3Btn.setFont(myfont);
		b3Btn.setBackground(Color.YELLOW);
		b3Btn.addActionListener(this);
		panel.add(b3Btn);
		
		b4Btn = new JButton("FENI");
		b4Btn.setBounds(200,400,250,50);
		b4Btn.setFont(myfont);
		b4Btn.setBackground(Color.YELLOW);
		b4Btn.addActionListener(this);
		panel.add(b4Btn);
		
		b5Btn = new JButton("RANGAMATI");
		b5Btn.setBounds(200,500,250,50);
		b5Btn.setFont(myfont);
		b5Btn.setBackground(Color.YELLOW);
		b5Btn.addActionListener(this);
		panel.add(b5Btn);
		
		b6Btn = new JButton("KHAGRACHARI");
		b6Btn.setBounds(200,600,250,50);
		b6Btn.setFont(myfont);
		b6Btn.setBackground(Color.YELLOW);
		b6Btn.addActionListener(this);
		panel.add(b6Btn);
		
		b7Btn = new JButton("BANDARBAN");
		b7Btn.setBounds(700, 100, 250, 50);
		b7Btn.setFont(myfont);
		b7Btn.setBackground(Color.YELLOW);
		b7Btn.addActionListener(this);
		panel.add(b7Btn);
		
		b8Btn = new JButton("LAKSHMIPUR");
		b8Btn.setBounds(700, 200, 250, 50);
		b8Btn.setFont(myfont);
		b8Btn.setBackground(Color.YELLOW);
		b8Btn.addActionListener(this);
		panel.add(b8Btn);
		
		b9Btn = new JButton("NOAKHALI");
		b9Btn.setBounds(700, 300, 250, 50);
		b9Btn.setFont(myfont);
		b9Btn.setBackground(Color.YELLOW);
		b9Btn.addActionListener(this);
		panel.add(b9Btn);
		
		b10Btn = new JButton("CHANDPUR");
		b10Btn.setBounds(700, 400, 250, 50);
		b10Btn.setFont(myfont);
		b10Btn.setBackground(Color.YELLOW);
		b10Btn.addActionListener(this);
		panel.add(b10Btn);
		
		b11Btn = new JButton("NETROKONA");
		b11Btn.setBounds(700, 500, 250, 50);
		b11Btn.setFont(myfont);
		b11Btn.setBackground(Color.YELLOW);
		b11Btn.addActionListener(this);
		panel.add(b11Btn);
		
		b12Btn = new JButton("BRAHMANBARIAR");
		b12Btn.setBounds(700, 600, 250, 50);
		b12Btn.setFont(myfont);
		b12Btn.setBackground(Color.YELLOW);
		b12Btn.addActionListener(this);
		panel.add(b12Btn);
		
        backButton = new JButton();
        backButton.setBounds(50, 50, 40, 40);
        backButton.setIcon(new ImageIcon("Homepage\\Back.png"));
        backButton.addActionListener(this);
        add(backButton);
		
			
		imgch = new ImageIcon("Homepage\\doc.jpg");
		label6 = new JLabel(imgch);
		label6.setBounds(0,0, 1200, 673);
		panel.add(label6);
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == backButton) 
		{
           Division f1 = new Division();
           f1.setVisible(true);
       	   this.setVisible(false);   
        }
		else if(ae.getSource()==b1Btn)
		{
			Typesofdoctors c1=new Typesofdoctors();
			c1.setVisible(true);
			this.setVisible(false);
			
		}
		
		else if(ae.getSource()==b2Btn)
		{
			Typesofdoctors m1=new Typesofdoctors();
			m1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==b3Btn)
		{
			Typesofdoctors d1=new Typesofdoctors();
			d1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==b4Btn)
		{
			Typesofdoctors q1=new Typesofdoctors();
			q1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==b5Btn)
		{
			Typesofdoctors w1=new Typesofdoctors();
			w1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==b6Btn)
		{
			Typesofdoctors t1=new Typesofdoctors();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==b7Btn)
		{
			Typesofdoctors t1=new Typesofdoctors();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==b8Btn)
		{
			Typesofdoctors t1=new Typesofdoctors();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==b9Btn)
		{
			Typesofdoctors t1=new Typesofdoctors();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==b10Btn)
		{
			Typesofdoctors t1=new Typesofdoctors();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==b11Btn)
		{
			Typesofdoctors t1=new Typesofdoctors();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==b12Btn)
		{
			Typesofdoctors t1=new Typesofdoctors();
			t1.setVisible(true);
			this.setVisible(false);
		}
	}
}