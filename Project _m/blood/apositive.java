package blood;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import blood.*;

public class apositive extends JFrame implements ActionListener
{
	JPanel panel;
	Color mycolor;
	Font myfont;
	private JButton backButton;
	private JLabel bloodLabel4;
	ImageIcon imgbl4;
	public apositive()
	{
		super("Blood donor");
		setSize(1200,691);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
       
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 71, 171));
		myfont=new Font("Arial",Font.PLAIN,26);
		
		JLabel usernameLabel1 = new JLabel("Name :Sayeed");
		usernameLabel1.setBounds(200, 100, 500, 20);
		usernameLabel1.setForeground(Color.black);
		usernameLabel1.setFont(myfont);
		add(usernameLabel1);
		
	
		JLabel usernameLabel2 = new JLabel("Contact: 013245585255");
		usernameLabel2.setBounds(200, 120, 500, 20);
		usernameLabel2.setForeground(Color.black);
		usernameLabel2.setFont(myfont);
		add(usernameLabel2);
		
        JLabel usernameLabel3 = new JLabel("Email: bdiushfsf@gmail.com");
		usernameLabel3.setBounds(200, 140, 500, 20);
		usernameLabel3.setForeground(Color.black);
		usernameLabel3.setFont(myfont);
		add(usernameLabel3);
		
				
		JLabel usernameLabel4 = new JLabel("Name :Monaiyem");
		usernameLabel4.setBounds(200, 200, 500, 20);
		usernameLabel4.setForeground(Color.black);
		usernameLabel4.setFont(myfont);
		add(usernameLabel4);
		
	
		JLabel usernameLabel5 = new JLabel("Contact: 013245585255");
		usernameLabel5.setBounds(200, 220, 500, 20);
		usernameLabel5.setForeground(Color.black);
		usernameLabel5.setFont(myfont);
		add(usernameLabel5);
		
        JLabel usernameLabel6 = new JLabel("Email: bdiushfsf@gmail.com");
		usernameLabel6.setBounds(200, 240, 500, 20);
		usernameLabel6.setForeground(Color.black);
		usernameLabel6.setFont(myfont);
		add(usernameLabel6);

		backButton = new JButton();
        backButton.setBounds(50, 50, 40, 40);
        backButton.setIcon(new ImageIcon("Homepage\\Back.png"));
        backButton.addActionListener(this);
        add(backButton);
		
		imgbl4 = new ImageIcon("blood\\Blood.jpg");
		bloodLabel4 = new JLabel(imgbl4);
		bloodLabel4.setBounds(0,0, 1200, 691);
		panel.add(bloodLabel4);
        
		
		this.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource() == backButton) 
		{
			Group_of_blood f1 = new Group_of_blood();
           f1.setVisible(true);
       	   this.setVisible(false);   
        } else{}
	}
}