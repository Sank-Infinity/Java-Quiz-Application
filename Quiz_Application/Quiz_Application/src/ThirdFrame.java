import javax.swing.*; 
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class ThirdFrame {
	JFrame f;
	JLabel l1;
	JRadioButton r1,r2,r3,r4;
	JButton b1,b2;
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	
	
	
	public ThirdFrame() {
		
	
		f = new JFrame();
		f.setSize(500,400);
		f.setLayout(null);
		
		l1 = new JLabel("QUE 2. Which of these objects is the farthest from the Sun ?");
		l1.setBounds(50, 10, 500, 40);
		f.add(l1);
		
		r1 = new JRadioButton("A ) Neptune");
		r1.setBounds(200, 50, 150, 40);
		f.add(r1);
		
		r2 = new JRadioButton("B ) Saturn");
		r2.setBounds(200, 100, 150, 40);
		f.add(r2);

		r3 = new JRadioButton("C ) Kuiper belt");
		r3.setBounds(200, 150, 150, 40);
		f.add(r3);
		
		r4 = new JRadioButton("D ) 90377 sedna");
		r4.setBounds(200, 200, 150, 40);
		f.add(r4);
		
		b1= new JButton("Next");
		b1.setBounds(50, 250, 150, 40);
		f.add(b1);
		
		b1.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){ 
				try {
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quia","root","");
				    stmt = con.createStatement();
					
					
					String username = "question-2";
					
					
					String qual = " ";
					
					if (r1.isSelected()) {
						qual = "Red dwarf";
					}
					else if (r2.isSelected()) {
						qual = "super nova";
					}
					else if (r3.isSelected()) {
						qual = "Black Whole";
					}
					else if (r4.isSelected()){
						qual = "D ) 90377 sedna";
					}
					
					
					rs = stmt.executeQuery("select * from answer");
					
					while(rs.next()) {
						if (username.equals(rs.getString(1)) && qual.equals(rs.getString(2))  ) {
							SecondFrame.count = SecondFrame.count+1;
							JOptionPane.showMessageDialog(f, "Correct answer");

						}
					}
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				
				
			}
				
				
				f.dispose();
				new FourFrame();
			}
		});
		
		b2 = new JButton("Answer");
		b2.setBounds(250, 250, 150, 40);
		f.add(b2);
		
		b2.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				
				JOptionPane.showMessageDialog(f, "Answer : D ) 90377 sedna");
			}
		});
		
		
		f.setVisible(true);

}
}