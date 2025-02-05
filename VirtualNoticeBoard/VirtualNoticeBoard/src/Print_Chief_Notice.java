import java.io.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;


public class Print_Chief_Notice extends JInternalFrame implements ActionListener

{
	JLabel title=new JLabel("Print Chief Notice",JLabel.CENTER);

	JComboBox com1=new JComboBox();

	JLabel l1=new JLabel("Chief Name :",JLabel.RIGHT);
	JLabel l2=new JLabel();
	JLabel l3=new JLabel("Designation :",JLabel.RIGHT);
	JLabel l4=new JLabel();
	JLabel l5=new JLabel("Select Year & Batch :",JLabel.RIGHT);

	JTextArea ta=new JTextArea();
	JButton b1=new JButton("Print This Notice");

	Connection con,con1;
	Statement st,st1;
	ResultSet rs,rs1;
	ResultSetMetaData rsmt,rsmt1;


	Print_Chief_Notice()
	{
		super("Print Chief Notice",false,true,false,true);

		Container c=getContentPane();
		c.setLayout(null);

		com1.addItem("");
		dataConnection();
		Com1Show();

		JScrollPane js=new JScrollPane(ta);
		ta.setForeground(Color.black);
		ta.setBackground(Color.white);
		js.setBounds(10,140,370,160);
		c.add(js);

		title.setBounds(10,5,370,35);

		l1.setBounds(10,50,170,20);
		l2.setBounds(200,50,180,20);

		l3.setBounds(10,80,170,20);
		l4.setBounds(200,80,180,20);

		l5.setBounds(10,110,170,20);
		com1.setBounds(200,110,180,20);

		b1.setBounds(100,320,200,30);

		com1.addActionListener(this);
		b1.addActionListener(this);
		b1.setMnemonic('P');

		c.add(title);
		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(l4);
		c.add(l5);
		c.add(com1);
		c.add(b1);


        title.setFont(new Font("Dialog", 1, 20));
        title.setBorder(BorderFactory.createRaisedBevelBorder());
		title.setForeground(Color.blue);
		title.setBackground(Color.red);

		ta.setFont(new Font("Dialog", 0, 14));

		l2.setBorder(BorderFactory.createRaisedBevelBorder());
		l2.setForeground(Color.black);
		l2.setBackground(Color.gray);

		l4.setBorder(BorderFactory.createRaisedBevelBorder());
		l4.setForeground(Color.black);
		l4.setBackground(Color.gray);

		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setBorder(BorderFactory.createRaisedBevelBorder());

		com1.setBorder(BorderFactory.createRaisedBevelBorder());

		setBackground(Color.white);
		setSize(400,390);
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


	public void dataConnection1()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/VNB","root","Graghu678");
			st1=con1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		}
		catch(Exception ce1)
		{
			JOptionPane.showMessageDialog(null,ce1);
		}
	}



	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==com1)
		{
			com1.removeItem("");
			try
			{
				String lbname=l2.getText();
				String comyear=(String)com1.getSelectedItem();
				rs1=st1.executeQuery("select * from Notice where Name='"+lbname+"' and YearBatch='"+comyear+"'");

				while(rs1.next())
				{
					ta.setText(rs1.getString(3));
				}
			}
			catch(Exception e6)
			{
				System.out.print(e6);
			}
		}



		if(e.getSource()==b1)

		  {
			  try
			  {
				FileWriter fw=new FileWriter("Notice of "+l2.getText()+".txt",true);

				fw.write("CHIEF  NOTICE"+"\r\n");
				fw.write("~~~~~~~~~~~~~"+"\r\n");
				fw.write(""+"\r\n");
				fw.write(""+"\r\n");
				fw.write("Notice For "+com1.getSelectedItem()+"\r\n");
				fw.write(""+"\r\n");
				fw.write(""+"\r\n");
				fw.write(""+"\r\n");
				fw.write(""+"\r\n");
				fw.write(ta.getText()+"\r\n");
				fw.write(""+"\r\n");
				fw.write(""+"\r\n");
				fw.write(""+"\r\n");
				fw.write(l2.getText()+"\r\n");
				fw.write(l4.getText()+"\r\n");
   				fw.close();
			   }catch(Exception e222){}
          		JOptionPane.showMessageDialog(this,"Printed in file successfully.");
           }

	}


	public void Com1Show()
	{
		try
		{
			while(rs.next())
			{
				l2.setText(rs.getString(1));
				l4.setText(rs.getString(3));
			}
		}
		catch(Exception e4)
		{
			System.out.print(e4);
		}


		dataConnection1();
		try
		{
			String comname=l2.getText();
			rs1=st1.executeQuery("select * from Notice where Name='"+comname+"'");
			while(rs1.next())
			{
				com1.addItem((Object)rs1.getString(2));
			}
		}
		catch(Exception e5)
		{
			System.out.print(e5);
		}
	}
}

