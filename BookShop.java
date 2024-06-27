import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BookShop extends JFrame implements ActionListener
{  
  JButton b1,b2,b3,b4; 
  BookShop()
  {
	  
	  Color c1=new Color(25,25,112);                          //Backgroud color
	  getContentPane().setBackground(c1);

	  //Add Buttons,Set font and Add Action Listener
	  b1=new JButton("ADD BOOK");                              
	  b1.setBounds(300,300,200,50);
	  b1.setFont(new Font("Cambria",Font.BOLD,20));
	  b1.addActionListener(this);
	  add(b1);
	  
	  b2=new JButton("Rquest Book");
	  b2.setBounds(300,400,200,50);
	  b2.setFont(new Font("Cambria",Font.BOLD,20));
	  b2.addActionListener(this);
	  add(b2);
	  
	  b3=new JButton("Generate Bills");
	  b3.setBounds(800,300,200,50);
	  b3.setFont(new Font("Cambria",Font.BOLD,20));
	  b3.addActionListener(this);
	  add(b3);
	  
	  b4=new JButton("Customer Record");
	  b4.setBounds(800,400,210,50);
	  b4.setFont(new Font("Cambria",Font.BOLD,20));
	  b4.addActionListener(this);
	  add(b4);
  
	  JLabel l1=new JLabel("BOOKSHOP MANEGEMENT SYSTEM");
	  l1.setBounds(200,20,1000,50);
	  l1.setForeground(Color.white);
	  l1.setFont(new Font("Times New Roman",Font.BOLD,50));
	  add(l1);
	 
	  /*JLabel l2=new JLabel("Select Hostel");
	  l2.setBounds(200,200,700,60);
	  l2.setFont(new Font("Cambria",Font.BOLD,40));
	  add(l2);*/

	  JLabel l=new JLabel(new ImageIcon("cutebook.jpg"));         //Set Image 
	  l.setBounds(0,0,1366,720);
	  add(l);
	  
      setLayout(null);
      setSize(1366,720);
      setVisible(true);
 }
public void actionPerformed(ActionEvent e)                     
{
	//Check condition for particular buttons to open specific form
	                           
		if(e.getSource()==b1)
		{
		  dispose();
		  new AddBook();
		}
		else if(e.getSource()==b2)
		{
		   dispose();
		   new RequestBook();
		}
		
		else if(e.getSource()==b3)
		{
			dispose();
			new BillBook();
		}
		else if(e.getSource()==b4)
		{
			dispose();
			new AddCustomer();
		}
}
public static void main(String args[])
{
  new BookShop();                                      
}
}