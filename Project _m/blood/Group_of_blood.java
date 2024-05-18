package blood;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import blood.*;


public class Group_of_blood extends JFrame implements ActionListener
{
	JPanel panel;
	JButton a1Btn,a2Btn,a3Btn,a4Btn,a5Btn,a6Btn,a7Btn,a8Btn,backButton;
	Color mycolor,mycolor1;
	Font myfont;
	private JLabel bloodLabel10;
	ImageIcon imgbl10;
	
	public Group_of_blood()
	{
		super("Doctors: ");
		this.setSize(1200,691);
		setLocationRelativeTo(null);
		
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 71, 171));
		
		a1Btn=new JButton("O+");
		a1Btn.setBounds(200,100,250,80);
		a1Btn.setBackground(Color.YELLOW);
		a1Btn.addActionListener(this);
		panel.add(a1Btn);
		
		a2Btn=new JButton("O-");
		a2Btn.setBounds(200,200,250,80);
		a2Btn.setBackground(Color.YELLOW);
		a2Btn.addActionListener(this);
		panel.add(a2Btn);
		
		a3Btn=new JButton("AB+");
		a3Btn.setBounds(200,300,250,80);
		a3Btn.setBackground(Color.YELLOW);
		a3Btn.addActionListener(this);
		panel.add(a3Btn);
		
		a4Btn=new JButton("AB-");
		a4Btn.setBounds(200,400,250,80);
		a4Btn.setBackground(Color.YELLOW);
		a4Btn.addActionListener(this);
		panel.add(a4Btn);
		
		a5Btn=new JButton("A+");
		a5Btn.setBounds(600,100,250,80);
		a5Btn.setBackground(Color.YELLOW);
		a5Btn.addActionListener(this);
		panel.add(a5Btn);
		
		a6Btn=new JButton("A-");
		a6Btn.setBounds(600,200,250,80);
		a6Btn.setBackground(Color.YELLOW);
		a6Btn.addActionListener(this);
		panel.add(a6Btn);
		
		a7Btn=new JButton("B+");
		a7Btn.setBounds(600,300,250,80);
		a7Btn.setBackground(Color.YELLOW);
		a7Btn.addActionListener(this);
		panel.add(a7Btn);
		this.add(panel);	
        
		a8Btn=new JButton("B-");
		a8Btn.setBounds(600,400,250,80);
		a8Btn.setBackground(Color.YELLOW);
		a8Btn.addActionListener(this);
		panel.add(a8Btn);		
		
        backButton = new JButton();
        backButton.setBounds(50, 50, 40, 40);
        backButton.setIcon(new ImageIcon("Homepage\\Back.png"));
        backButton.addActionListener(this);
        add(backButton);
		
		imgbl10 = new ImageIcon("blood\\Blood.jpg");
		bloodLabel10 = new JLabel(imgbl10);
		bloodLabel10.setBounds(0,0, 1200, 691);
		panel.add(bloodLabel10);
		
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
			opositive c1=new opositive();
			c1.setVisible(true);
			this.setVisible(false);
			
		}
		else if(ae.getSource()==a2Btn)
		{
			onegative m1=new onegative();
			m1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==a3Btn)
		{
			abpositive d1=new abpositive();
			d1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==a4Btn)
		{
			abnegative q1=new abnegative();
			q1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==a5Btn)
		{
			apositive w1=new apositive();
			w1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==a6Btn)
		{
			anegative t1=new anegative();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==a7Btn)
		{
			bpositive t1=new bpositive();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==a8Btn)
		{
			bnegative t1=new bnegative();
			t1.setVisible(true);
			this.setVisible(false);
		}
	}
	
}