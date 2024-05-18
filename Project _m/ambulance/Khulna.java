package ambulance;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import ambulance.*;
import Homepage.Homepage;


public class Khulna extends JFrame implements ActionListener
{
	ImageIcon img;
	JLabel imgLabel;
	JPanel panel;
	Color mycolor;
	JButton a1Btn, a2Btn, a3Btn, a4Btn, a5Btn, a6Btn, a7Btn, a8Btn, a9Btn, a10Btn,backButton ;
	Font myfont;
	ImageIcon imgamb;
	private JLabel ambLabel;

	public Khulna()
	{
		super("Select Your District");
		this.setSize(1200, 800);
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myfont=new Font("Arial",Font.PLAIN,26);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(170, 245, 255));
				
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
		else if(ae.getSource()==a1Btn)
		{
			ambulance1 c1=new ambulance1();
			c1.setVisible(true);
			this.setVisible(false);
			
		}
		
		else if(ae.getSource()==a2Btn)
		{
			ambulance1 m1=new ambulance1();
			m1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==a3Btn)
		{
			ambulance1 d1=new ambulance1();
			d1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==a4Btn)
		{
			ambulance1 q1=new ambulance1();
			q1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==a5Btn)
		{
			ambulance1 w1=new ambulance1();
			w1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==a6Btn)
		{
			ambulance1 t1=new ambulance1();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==a7Btn)
		{
			ambulance1 t1=new ambulance1();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==a8Btn)
		{
			ambulance1 t1=new ambulance1();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==a9Btn)
		{
			ambulance1 t1=new ambulance1();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==a10Btn)
		{
			ambulance1 t1=new ambulance1();
			t1.setVisible(true);
			this.setVisible(false);
		}
	}
}