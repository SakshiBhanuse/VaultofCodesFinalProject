import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
 class BillBook extends JFrame implements ActionListener
{
	JTextField tf1,tf2;
	JTextField a1;
	JButton bill,back;
	JTextArea t1=new JTextArea();
	BillBook() 
	{
	  JLabel l=new JLabel(new ImageIcon("1234.jpg"));            //set background image
	  l.setBounds(0,0,1340,670);
	  add(l);
	  
	  JLabel l2=new JLabel(new ImageIcon("Image5.jpeg"));    //set background of white color image
	  l2.setBounds(0,0,1340,670);
	  l.add(l2);
	
	  JLabel l3=new JLabel("Genrate Bill");
	  l3.setBounds(60,100,500,50);
	  l2.add(l3);
	  l3.setFont(new Font("Times New Roman",Font.BOLD,35));
	  Color c2=new Color(0,100,0);
	  l3.setForeground(c2);
	  
	  //set label,textfield  and font on background white color 
	  
	  JLabel b_name=new JLabel("Book Name :");                                //b_id
	  b_name.setFont(new Font("Times New Roman",Font.PLAIN,25));
	  b_name.setBounds(40,200,150,30);
	  tf1=new JTextField();
	  tf1.setBounds(180,200,150,30);
	  tf1.setFont(new Font("Times New Roman",Font.PLAIN,25));
	  
	  JLabel b_quentity=new JLabel("Quantity:");                                     //b_name
	  b_quentity.setBounds(40,300,150,30);
	  b_quentity.setFont(new Font("Times New Roman",Font.PLAIN,25));
	  tf2=new JTextField();
	  tf2.setBounds(180,300,150,30);
	  tf2.setFont(new Font("Times New Roman",Font.PLAIN,25));
	  
	  JLabel price=new JLabel("Price:");                               //problem
	  price.setBounds(40,400,100,30);
	  price.setFont(new Font("Times New Roman",Font.PLAIN,25));
	  a1=new JTextField();
	  a1.setBounds(180,400,150,30);
	  a1.setFont(new Font("Times New Roman",Font.PLAIN,25));
	 
	  back=new JButton("Back");                                         //back
	  back.setBounds(130,500,100,40);
	  l2.add(back);
	  back.addActionListener(this);
	  back.setFont(new Font("Cambria",Font.BOLD,18));
	  back.setBackground(c2);
	  back.setForeground(Color.white);
	  
	  bill=new JButton("Print");                                     //submit
	  bill.setFont(new Font("Cambria",Font.BOLD,18));
	  bill.setBounds(330,500,100,40);
	  l2.add(bill);
	  bill.addActionListener(this);
	  bill.setBackground(c2);
	  bill.setForeground(Color.white);
    
	  
	  l2.add(b_name);
	  l2.add(tf1);
	  l2.add(b_quentity);
	  l2.add(tf2);
	  l2.add(a1);
	  l2.add(price);
	  
	  
	 
	   t1.setLayout(new FlowLayout());                      //properties of JTable and JScrollPane
	   JScrollPane js=new JScrollPane(t1);
	   t1.setEditable(false);
	   js.setBounds(480,90,500,500);
	   t1.setFont(new Font("Times New Roman",Font.PLAIN,20));
	   l2.add(js);
	  
	  
	  setLayout(null);
	  setSize(1366,720);
	  setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		//Check condition for particular buttons to open specific activity
		if(e.getSource()==back)
		{
			dispose();
			new BookShop();
		}
		else if(e.getSource()==bill)
		{
			int a,b,total;
			a=Integer.parseInt(tf2.getText());
			b=Integer.parseInt(a1.getText());
			total=a * b;
			t1.setText("\t========================"+"\n"+"\tBook Store Name : G1 Book Shop"+"\n"+"\tContac No : xxxxxxxxx"+"\n"+"\tAddress : Near GRWPT Collage"+"\n"+"\t========================\n\n"+"\tName\tQuantity\tprice\n\t========================\n"+"\n\t"+tf1.getText()+"\t"+tf2.getText()+"\t"+a1.getText()+"\n\t========================\n"+"\n\tTotal Amount : \t"+total);
		}
	}
	public static void main(String args[])
	{
		new BillBook();
	}
}
