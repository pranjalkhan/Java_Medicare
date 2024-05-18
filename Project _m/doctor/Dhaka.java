package doctor;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import doctor.*;


public class Dhaka  extends JFrame implements ActionListener
{
	ImageIcon img;
	JLabel imgLabel;
	JPanel panel;
	Color mycolor,mycolor1;
	JButton b1Btn, b2Btn, b3Btn, b4Btn, b5Btn, b6Btn, b7Btn,b8Btn,backButton;
	Font myfont;
	private JLabel label6;
	ImageIcon imgD;
	

	public Dhaka()
	{
		super("Select Your District");
		this.setSize(1200, 673);
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myfont=new Font("Arial",Font.PLAIN,26);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 71, 171));
				
		b1Btn = new JButton("DHAKA");
		b1Btn.setBounds(200,100,250,50);
		b1Btn.setBackground(Color.YELLOW);
		b1Btn.setFont(myfont);
		b1Btn.addActionListener(this);
		panel.add(b1Btn);
		
		b2Btn = new JButton("NARAYNGANJ");
		b2Btn.setBounds(200,200,250,50);
		b2Btn.setFont(myfont);
		b2Btn.setBackground(Color.YELLOW);
		b2Btn.addActionListener(this);
		panel.add(b2Btn);
		
		b3Btn = new JButton("GAZIPUR");
		b3Btn.setBounds(200,300,250,50);
		b3Btn.setFont(myfont);
		b3Btn.setBackground(Color.YELLOW);
		b3Btn.addActionListener(this);
		panel.add(b3Btn);
		
		b4Btn = new JButton("MANIKGANJ");
		b4Btn.setBounds(200,400,250,50);
		b4Btn.setFont(myfont);
		b4Btn.setBackground(Color.YELLOW);
		b4Btn.addActionListener(this);
		panel.add(b4Btn);
		
		b5Btn = new JButton("SHARIATPUR");
		b5Btn.setBounds(700, 100, 250, 50);
		b5Btn.setFont(myfont);
		b5Btn.setBackground(Color.YELLOW);
		b5Btn.addActionListener(this);
		panel.add(b5Btn);
		
		b6Btn = new JButton("NARSHINDI");
		b6Btn.setBounds(700, 200, 250, 50);
		b6Btn.setFont(myfont);
		b6Btn.setBackground(Color.YELLOW);
		b6Btn.addActionListener(this);
		panel.add(b6Btn);
		
		b7Btn = new JButton("TANGAIL");
		b7Btn.setBounds(700, 300, 250, 50);
		b7Btn.setFont(myfont);
		b7Btn.setBackground(Color.YELLOW);
		b7Btn.addActionListener(this);
		panel.add(b7Btn);
		
		b8Btn = new JButton("MUNSHIGONJ");
		b8Btn.setBounds(700, 400, 250, 50);
		b8Btn.setFont(myfont);
		b8Btn.setBackground(Color.YELLOW);
		b8Btn.addActionListener(this);
		panel.add(b8Btn);
		
        backButton = new JButton();
        backButton.setBounds(50, 50, 40, 40);
        backButton.setIcon(new ImageIcon("Homepage\\Back.png"));
        backButton.addActionListener(this);
        add(backButton);
		
			
		imgD = new ImageIcon("Homepage\\doc.jpg");
		label6 = new JLabel(imgD);
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
 }
}