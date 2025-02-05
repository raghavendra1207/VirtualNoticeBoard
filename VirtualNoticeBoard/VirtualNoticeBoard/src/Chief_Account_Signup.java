import java.io.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Chief_Account_Signup extends JInternalFrame implements ActionListener

{
	JLabel title=new JLabel("Signup Form of Chief",JLabel.CENTER);

	JLabel l1=new JLabel("Name :",JLabel.RIGHT);
	JLabel l2=new JLabel("Password :",JLabel.RIGHT);
	JLabel l3=new JLabel("Verify Password :",JLabel.RIGHT);
	JLabel l4=new JLabel("Your Designation :",JLabel.RIGHT);

	JTextField t1=new JTextField();
	JTextField t2=new JTextField();
	JTextField t3=new JTextField();
	JTextField t4=new JTextField();

	JButton b1=new JButton("Cancel");
	JButton b2=new JButton("Submit");

	Connection con;
	Statement st;
	ResultSet rs;
	ResultSetMetaData rsmt;

	Chief_Account_Signup()
	{
		super("Account Signup Form",false,true,false,true);

		Container c=getContentPane();
		c.setLayout(null);

		title.setBounds(10,5,370,35);

		l1.setBounds(10,50,170,20);
		t1.setBounds(200,50,180,20);

		l2.setBounds(10,80,170,20);
		t2.setBounds(200,80,180,20);

		l3.setBounds(10,110,170,20);
		t3.setBounds(200,110,180,20);

		l4.setBounds(10,140,170,20);
		t4.setBounds(200,140,180,20);

		b1.setBounds(10,180,180,25);
		b2.setBounds(200,180,180,25);

		b1.addActionListener(this);
		b1.setMnemonic('C');
		b2.addActionListener(this);
		b2.setMnemonic('S');

		c.add(title);

		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(l4);

		c.add(t1);
		c.add(t2);
		c.add(t3);
		c.add(t4);

		c.add(b1);
		c.add(b2);

        title.setFont(new Font("Dialog", 1, 20));
        title.setBorder(BorderFactory.createRaisedBevelBorder());
		title.setForeground(Color.blue);
		title.setBackground(Color.red);

		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setBorder(BorderFactory.createRaisedBevelBorder());
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.setBorder(BorderFactory.createRaisedBevelBorder());

		setBackground(Color.white);
		setSize(400,250);
		setLocation((Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2,(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2-50);
		setResizable(false);
		show();
	}



	public void dataConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/VNB","root","Graghu678");
			st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs=st.executeQuery("Select * From Chief");
		}
		catch(Exception ce)
		{
			JOptionPane.showMessageDialog(null,ce);
		}
	}



	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			dispose();
		}


		if(e.getSource()==b2)
		{
			try
			{
			if((t1.getText().equals("")) || (t2.getText().equals("")) || (t3.getText().equals("")) || (t4.getText().equals("")))
			JOptionPane.showMessageDialog(this,"Must fill all the fields.");
			else
			{
			try
			{
			String pass1=t2.getText();
			String pass2=t3.getText();
			if(pass1.equals(pass2))
			{
			try
			{
				dataConnection();
				String name=t1.getText();
				String pass=t2.getText();
				String desg=t4.getText();

				String query="UPDATE Chief SET Name='"+name+"',Password='"+pass+"',Designation='"+desg+"'"; //where Name='"+comname+"'and YearBatch='"+comyear+"'";
				System.out.println(query);
				int result=st.executeUpdate(query);
				if(result==1)
				JOptionPane.showMessageDialog(this,"New Records Added Successfully.");
			}catch(Exception e1)
				{
					JOptionPane.showMessageDialog(this,"Sorry, Enter Another User Name.");
				}
			}
			else
			JOptionPane.showMessageDialog(this,"Both passwords are not same. Enter again.");
			}catch(Exception e88){}
			}
			}catch(Exception e888){}
		}
	}
}

