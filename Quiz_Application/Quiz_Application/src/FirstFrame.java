import javax.swing.*;
import javax.swing.*;
import java.awt.event.*;


public class FirstFrame {
	
	JFrame f;
	JLabel l1,l2;
	JButton b1;
	
	public FirstFrame(){
		f = new JFrame();
		f.setSize(500,400);
		f.setLayout(null);
		
		l1 = new JLabel("Quiz Application");
		l1.setBounds(200, 40, 150, 40);
		f.add(l1);
		
		b1 = new JButton("Start Quiz");
		b1.setBounds(170, 150, 150, 40);
		f.add(b1);
		
		b1.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				f.dispose();
				new SecondFrame();
			}
		});
		
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new FirstFrame();
	}

}
