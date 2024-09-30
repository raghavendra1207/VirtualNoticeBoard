import java.io.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class About extends JInternalFrame

{
	JLabel title=new JLabel("Virtual Notice Board",JLabel.CENTER);
	JLabel lmg=new JLabel();
	JLabel l1=new JLabel("Raghavendra",JLabel.CENTER);
	JLabel l2=new JLabel("Anil",JLabel.CENTER);
	JLabel l3=new JLabel("Yashwanth",JLabel.CENTER);
	JLabel l4=new JLabel("MRCET HYD",JLabel.CENTER);
	ImageIcon image=new ImageIcon("notice.gif");

	About()
	{
		super("About The Author",false,true,false,true);

		Container c=getContentPane();
		c.setLayout(null);

		lmg.setBounds(5,5,64,64);
		title.setBounds(80,20,250,30);

		l1.setBounds(30,80,280,40);
		l2.setBounds(50,130,240,30);
		l3.setBounds(30,180,280,40);
		l4.setBounds(5,230,330,30);

		lmg.setIcon(image);

		c.add(title);
		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(l4);
		c.add(lmg);

        title.setFont(new Font("Dialog", 3, 26));
		title.setForeground(Color.blue);

        l1.setFont(new Font("Dialog", 1, 20));
        l1.setBorder(BorderFactory.createRaisedBevelBorder());
		l1.setForeground(Color.black);
		l1.setBackground(Color.red);

        l2.setFont(new Font("Dialog", 1, 16));
        l2.setBorder(BorderFactory.createRaisedBevelBorder());
		l2.setForeground(Color.gray);
		l2.setBackground(Color.white);

        l3.setFont(new Font("Dialog", 1, 20));
        l3.setBorder(BorderFactory.createRaisedBevelBorder());
		l3.setForeground(Color.black);
		l3.setBackground(Color.red);

        l4.setFont(new Font("Dialog", 1, 15));
        l4.setBorder(BorderFactory.createRaisedBevelBorder());
		l4.setForeground(Color.gray);
		l4.setBackground(Color.white);

		setBackground(Color.orange);
		setSize(350,300);
		setLocation((Toolkit.getDefaultToolkit().getScreenSize().width-getWidth())/2,(Toolkit.getDefaultToolkit().getScreenSize().height-getHeight())/2-50);
		setResizable(false);
		show();
	}
}

