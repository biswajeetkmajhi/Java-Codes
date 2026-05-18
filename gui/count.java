import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class count implements ActionListener
{
	JLabel l2,l1,w,ch;
	JTextArea a;
	JButton b;
	JRadioButton r1,r2;
	ButtonGroup bg;

	count()
	{
		JFrame f=new JFrame("Count");
		
		l2=new JLabel("Choose");
		l2.setBounds(15,10,50,30);
		
		r1=new JRadioButton();
		r1.setBounds(15,40,15,15);
		
		w=new JLabel("Words:");
		w.setBounds(30,40,70,30);

		r2=new JRadioButton();
		r2.setBounds(95,40,15,15);

		ch=new JLabel("Characters:");
		ch.setBounds(110,40,150,30);

		l1=new JLabel("Enter Text Here");
		l1.setBounds(20,75,100,30);

		a=new JTextArea();	
		a.setBounds(20,110,200,150);

		b=new JButton("Submit");
		b.setBounds(20,265,100,30);

		bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);

		b.addActionListener(this);
		r1.addActionListener(this);
		r2.addActionListener(this);

		f.add(w);
		f.add(ch);
		f.add(l1);
		f.add(a);
		f.add(b);
		f.add(l2);
		f.add(r1);
		f.add(r2);
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		try{
			String s=a.getText();
			String words[]=s.split("\\s");
	
			if(r1.isSelected()){
				if(e.getSource() == b)
					w.setText("Words:"+words.length);
				ch.setText("Characters:");
			}
			else if(r2.isSelected()){
				if(e.getSource() == b)
					ch.setText("Characters:"+s.length());
				w.setText("Words:");
			}
		}
		catch(Exception ex)
		{
			l2.setText("Choose Any One");
		}
	}

	public static void main(String ar[])
	{
		new count();
	}
}

