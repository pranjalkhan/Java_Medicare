package blood;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import blood.*;

public class RangpurDivision extends JFrame implements ActionListener
{
	ImageIcon img;
	JLabel imgLabel;
	JPanel panel;
	Color mycolor,mycolor1;
	JButton a1Btn, a2Btn, a3Btn, a4Btn, a5Btn, a6Btn, a7Btn, a8Btn,backButton ;
	Font myfont;
	private JLabel bloodLabel16;
	ImageIcon imgbl16;

	public RangpurDivision()
	{
		super("Select Your District");
		this.setSize(1200, 691);
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 71, 171));
		myfont=new Font("Arial",Font.PLAIN,26);		
		
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
		
		imgbl16 = new ImageIcon("blood\\Blood.jpg");
		bloodLabel16 = new JLabel(imgbl16);
		bloodLabel16.setBounds(0,0, 1200, 691);
		panel.add(bloodLabel16);
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
		else if(ae.getSource()==a1Btn)
		{
			Group_of_blood c1=new Group_of_blood();
			c1.setVisible(true);
			this.setVisible(false);
			
		}
		
		else if(ae.getSource()==a2Btn)
		{
			Group_of_blood m1=new Group_of_blood();
			m1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==a3Btn)
		{
			Group_of_blood d1=new Group_of_blood();
			d1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==a4Btn)
		{
			Group_of_blood q1=new Group_of_blood();
			q1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==a5Btn)
		{
			Group_of_blood w1=new Group_of_blood();
			w1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==a6Btn)
		{
			Group_of_blood t1=new Group_of_blood();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==a7Btn)
		{
			Group_of_blood t1=new Group_of_blood();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==a8Btn)
		{
			Group_of_blood t1=new Group_of_blood();
			t1.setVisible(true);
			this.setVisible(false);
		}
	}
}