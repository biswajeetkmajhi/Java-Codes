import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class EB 
{
	public static void main(String ar[])
	{
		JFrame f=new JFrame();
		JLabel l1=new JLabel("Hi");
		l1.setBounds(20,50,40,30);
		JLabel l2=new JLabel("Write Your Quote");
		l2.setBounds(20,90,150,50);
		JTextArea a=new JTextArea();
		a.setBounds(20,150,250,200);
		JButton b=new JButton("Send");
		b.setBounds(125,380,80,50);
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)	
			{
				a.setText("Nice Thought");
			}
		});
		f.add(l1);
		f.add(l2);
		f.add(a);
		f.add(b);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
}
		