package doctor;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import doctor.*;




public class Rangpur extends JFrame implements ActionListener
{
	ImageIcon img;
	JLabel imgLabel;
	JPanel panel;
	Color mycolor,mycolor1;
	JButton a1Btn, a2Btn, a3Btn, a4Btn, a5Btn, a6Btn, a7Btn, a8Btn,backButton ;
	Font myfont;
	private JLabel label6;
	ImageIcon imgR;

	public Rangpur()
	{
		super("Select Your District");
		this.setSize(1200, 673);
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myfont=new Font("Arial",Font.PLAIN,26);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 71, 171));
				
		a1Btn = new JButton("RANGPUR");
		a1Btn.setBounds(200, 150, 250, 50);
		a1Btn.setFont(myfont);
		a1Btn.setBackground(Color.YELLOW);
		a1Btn.addActionListener(this);
		panel.add(a1Btn);
		
		a2Btn = new JButton("GAIBANDHA");
		a2Btn.setBounds(200, 250, 250, 50);
		a2Btn.setFont(myfont);
		a2Btn.setBackground(Color.YELLOW);
		a2Btn.addActionListener(this);
		panel.add(a2Btn);
		
		a3Btn = new JButton("NILPHAMARI");
		a3Btn.setBounds(200, 350, 250, 50);
		a3Btn.setFont(myfont);
		a3Btn.setBackground(Color.YELLOW);
		a3Btn.addActionListener(this);
		panel.add(a3Btn);
		
		a4Btn = new JButton("KURIGRAM");
		a4Btn.setBounds(200, 450, 250, 50);
		a4Btn.setFont(myfont);
		a4Btn.setBackground(Color.YELLOW);
		a4Btn.addActionListener(this);
		panel.add(a4Btn);
		
		a5Btn = new JButton("LALMONIRHAT");
		a5Btn.setBounds(600, 150, 250, 50);
		a5Btn.setFont(myfont);
		a5Btn.setBackground(Color.YELLOW);
		a5Btn.addActionListener(this);
		panel.add(a5Btn);
		
		a6Btn = new JButton("DINAJPUR");
		a6Btn.setBounds(600, 250, 250, 50);
		a6Btn.setFont(myfont);
		a6Btn.setBackground(Color.YELLOW);
		a6Btn.addActionListener(this);
		panel.add(a6Btn);
		
		a7Btn = new JButton("THAKURGAON");
		a7Btn.setBounds(600, 350, 250, 50);
		a7Btn.setFont(myfont);
		a7Btn.setBackground(Color.YELLOW);
		a7Btn.addActionListener(this);
		panel.add(a7Btn);
		
		a8Btn = new JButton("PANCHAGARH");
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
		
			
		imgR = new ImageIcon("Homepage\\doc.jpg");
		label6 = new JLabel(imgR);
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
	}
}