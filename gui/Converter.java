import javax.swing.*;
import java.awt.event.*;

public class Converter
{
	public static void main(String ar[])
	{
		JFrame f=new JFrame("Converter");
		JButton b1=new JButton("C to F");
		JButton b2=new JButton("F to C");
		JTextField a=new JTextField();
		JLabel l=new JLabel("RESULT");
		a.setBounds(50,30,100,30);
		l.setBounds(160,30,100,30);
		b1.setBounds(50,70,100,30);
		b2.setBounds(160,70,100,30);
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			 try
			 {	
				String s=a.getText();
				int n=Integer.parseInt(s);
				int res =(int)(n*(9.0/5))+32;
				l.setText("Farenhiet:"+res);
			 }
			 catch(Exception ex)
			 {
				l.setText("Invalid");
			 }
			}
		});

		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			 try
			 {
				String s=a.getText();
				int n=Integer.parseInt(s);
				int res =(int)((n-32)*(5.0/9));
				l.setText("Celcius:"+res);
			 }
			 catch(Exception ex)
			 {
				l.setText("Invalid");
			 }
			}
		});
		
		f.add(b1);f.add(b2);f.add(l);f.add(a);
		f.setSize(400,200);
		f.setLayout(null);
		f.setVisible(true);
	}
}