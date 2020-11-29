import javax.swing.*;  
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class ResultFrame {

	JFrame f;
	JLabel l1,l2;
	JButton b1;
	
	
	
	public ResultFrame() {
		f = new JFrame();
		f.setSize(500,400);
		f.setLayout(null);
		
		
		l1 = new JLabel("Result");
		l1.setBounds(210, 40, 150, 40);
		f.add(l1);
		
		String str = Integer.toString(SecondFrame.count);
		
		l2 = new JLabel(str);
		l2.setBounds(220, 100, 150, 40);
		f.add(l2);
		
		b1 = new JButton("Exit");
		b1.setBounds(150, 250, 150, 40);
		f.add(b1);
		
		b1.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				
				System.exit(0);
			}
		});
		
		f.setVisible(true);
	
	}	
}
