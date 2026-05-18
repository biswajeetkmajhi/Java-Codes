/*
Create a Java Swing application with a text field and a button. When the user types their name into the text field and clicks the button, display "Hello, [name]!" in a label below.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Text
{
	public static void main(String ar[])
	{
		JFrame f=new JFrame("Text");

		JTextField f1=new JTextField();
		f1.setBounds(20,20,100,50);
		
		JLabel l=new JLabel("Display");
		l.setBounds(20,140,100,50);

		JButton b=new JButton("Click");
		b.setBounds(20,80,100,50);

		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String s=f1.getText();
					int n=Integer.parseInt(s);
					l.setText("Hello "+s+"!");
				}
				catch(Exception ex)
				{
					l.setText("Invalid");
				}
			}
		});
	
		f.add(f1);
		f.add(l);
		f.add(b);

		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
}
