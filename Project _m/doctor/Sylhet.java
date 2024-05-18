package doctor;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import doctor.*;


public class Sylhet  extends JFrame implements ActionListener
{
	ImageIcon img;
	JLabel imgLabel;
	JPanel panel;
	Color mycolor,mycolor1;
	JButton b1Btn, b2Btn, b3Btn, b4Btn,backButton;
	Font myfont;
	private JLabel label6;
	ImageIcon imgS;
	

	public Sylhet()
	{
		super("Select Your District");
		this.setSize(1200, 673);
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myfont=new Font("Arial",Font.PLAIN,26);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 71, 171));
				
		b1Btn = new JButton("Sylhet");
		b1Btn.setBounds(200, 300, 250, 50);
		b1Btn.setFont(myfont);
		b1Btn.setBackground(Color.YELLOW);
		b1Btn.addActionListener(this);
		panel.add(b1Btn);
		
		b2Btn = new JButton("Sunamganj");
		b2Btn.setBounds(200, 400, 250, 50);
		b2Btn.setFont(myfont);
		b2Btn.setBackground(Color.YELLOW);
		b2Btn.addActionListener(this);
		panel.add(b2Btn);
		
		b3Btn = new JButton("Habiganj");
		b3Btn.setBounds(700, 300, 250, 50);
		b3Btn.setFont(myfont);
		b3Btn.setBackground(Color.YELLOW);
		b3Btn.addActionListener(this);
		panel.add(b3Btn);
		
		b4Btn = new JButton("Moulvibajar");
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
		
			
		imgS = new ImageIcon("Homepage\\doc.jpg");
		label6 = new JLabel(imgS);
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
	}
}