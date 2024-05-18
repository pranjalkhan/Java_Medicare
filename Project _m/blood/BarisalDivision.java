package blood;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import blood.*;



public class BarisalDivision extends JFrame implements ActionListener
{
	ImageIcon img;
	JLabel imgLabel;
	JPanel panel;
	Color mycolor,mycolor1;
	JButton a1Btn, a2Btn, a3Btn, a4Btn, a5Btn, a6Btn,backButton;
	Font myfont;
	private JLabel bloodLabel;
	ImageIcon imgbl;
	

	public BarisalDivision()
	{
		super("Select Your District");
		this.setSize(1200, 691);
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myfont=new Font("Arial",Font.PLAIN,26);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 71, 171));
				
		a1Btn = new JButton("BARISAL");
		a1Btn.setBounds(200, 150, 250, 50);
		a1Btn.setFont(myfont);
		a1Btn.setBackground(Color.YELLOW);
		a1Btn.addActionListener(this);
		panel.add(a1Btn);
		
		a2Btn = new JButton("PATUAKHALI");
		a2Btn.setBounds(200, 250, 250, 50);
		a2Btn.setFont(myfont);
		a2Btn.setBackground(Color.YELLOW);
		a2Btn.addActionListener(this);
		panel.add(a2Btn);
		
		a3Btn = new JButton("BHOLA");
		a3Btn.setBounds(200, 350, 250, 50);
		a3Btn.setFont(myfont);
		a3Btn.setBackground(Color.YELLOW);
		a3Btn.addActionListener(this);
		panel.add(a3Btn);
		
		a4Btn = new JButton("PIROJPUR");
		a4Btn.setBounds(600, 150, 250, 50);
		a4Btn.setFont(myfont);
		a4Btn.setBackground(Color.YELLOW);
		a4Btn.addActionListener(this);
		panel.add(a4Btn);
		
		a5Btn = new JButton("BARGUNA");
		a5Btn.setBounds(600, 250, 250, 50);
		a5Btn.setFont(myfont);
		a5Btn.setBackground(Color.YELLOW);
		a5Btn.addActionListener(this);
		panel.add(a5Btn);
		
		a6Btn = new JButton("JHALOKHATHI");
		a6Btn.setBounds(600, 350, 250, 50);
		a6Btn.setFont(myfont);
		a6Btn.setBackground(Color.YELLOW);
		a6Btn.addActionListener(this);
		panel.add(a6Btn);
		
        backButton = new JButton();
        backButton.setBounds(50, 50, 40, 40);
        backButton.setIcon(new ImageIcon("Homepage\\Back.png"));
        backButton.addActionListener(this);
        add(backButton);
		
		imgbl = new ImageIcon("blood\\Blood.jpg");
		bloodLabel = new JLabel(imgbl);
		bloodLabel.setBounds(0,0, 1200, 691);
		panel.add(bloodLabel);
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
			Group_of_blood c1=new Group_of_blood();
			c1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==a3Btn)
		{
			Group_of_blood c1=new Group_of_blood();
			c1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==a4Btn)
		{
			Group_of_blood c1=new Group_of_blood();
			c1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==a5Btn)
		{
			Group_of_blood c1=new Group_of_blood();
			c1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==a6Btn)
		{
			Group_of_blood c1=new Group_of_blood();
			c1.setVisible(true);
			this.setVisible(false);
		}
	}

}