package blood;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import blood.*;


public class Mymensingh  extends JFrame implements ActionListener
{
	ImageIcon img;
	JLabel imgLabel;
	JPanel panel;
	Color mycolor,mycolor1;
	JButton b1Btn, b2Btn, b3Btn, b4Btn,backButton;
	Font myfont;
	private JLabel bloodLabel12;
	ImageIcon imgbl12;

	public Mymensingh()
	{
		super("Select Your District");
		this.setSize(1200, 691);
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myfont=new Font("Arial",Font.PLAIN,26);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 71, 171));
				
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
		b4Btn.setBackground(Color.YELLOW);
		b4Btn.setFont(myfont);
		b4Btn.addActionListener(this);
		panel.add(b4Btn);
		
        backButton = new JButton();
        backButton.setBounds(50, 50, 40, 40);
        backButton.setIcon(new ImageIcon("Homepage\\Back.png"));
        backButton.addActionListener(this);
        add(backButton);
		
		imgbl12 = new ImageIcon("blood\\Blood.jpg");
		bloodLabel12 = new JLabel(imgbl12);
		bloodLabel12.setBounds(0,0, 1200, 691);
		panel.add(bloodLabel12);
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == backButton) 
		{
           blood f1 = new blood();
           f1.setVisible(true);
       	   this.setVisible(false);   
        }
		else if(ae.getSource()==b1Btn)
		{
			Group_of_blood c1=new Group_of_blood();
			c1.setVisible(true);
			this.setVisible(false);
			
		}
		
		else if(ae.getSource()==b2Btn)
		{
			Group_of_blood m1=new Group_of_blood();
			m1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==b3Btn)
		{
			Group_of_blood d1=new Group_of_blood();
			d1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==b4Btn)
		{
			Group_of_blood q1=new Group_of_blood();
			q1.setVisible(true);
			this.setVisible(false);
		}
	}
}