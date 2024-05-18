package ambulance;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import ambulance.*;
import Homepage.Homepage;


public class Dhaka extends JFrame implements ActionListener
{
	ImageIcon img;
	JLabel imgLabel;
	JPanel panel;
	Color mycolor;
	JButton b1Btn, b2Btn, b3Btn, b4Btn, b5Btn, b6Btn, b7Btn,b8Btn,backButton;
	Font myfont;
	ImageIcon imgamb;
	private JLabel ambLabel;
	

	public Dhaka()
	{
		super("Select Your District");
		this.setSize(1200, 800);
		setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myfont=new Font("Arial",Font.PLAIN,26);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(170, 245, 255));
				
		b1Btn = new JButton("DHAKA");
		b1Btn.setBounds(200,100,250,50);
		b1Btn.setFont(myfont);
		b1Btn.setBackground(Color.YELLOW);
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
	  else if(ae.getSource()==b1Btn)
		{
			ambulance1 c1=new ambulance1();
			c1.setVisible(true);
			this.setVisible(false);
			
		}
		
		else if(ae.getSource()==b2Btn)
		{
			ambulance1 m1=new ambulance1();
			m1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==b3Btn)
		{
			ambulance1 d1=new ambulance1();
			d1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==b4Btn)
		{
			ambulance1 q1=new ambulance1();
			q1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==b5Btn)
		{
			ambulance1 w1=new ambulance1();
			w1.setVisible(true);
			this.setVisible(false);
		}
		else if(ae.getSource()==b6Btn)
		{
			ambulance1 t1=new ambulance1();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==b7Btn)
		{
			ambulance1 t1=new ambulance1();
			t1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(ae.getSource()==b8Btn)
		{
			ambulance1 t1=new ambulance1();
			t1.setVisible(true);
			this.setVisible(false);
		}
 }
}