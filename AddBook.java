import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
 class AddBook extends JFrame implements ActionListener
{
	JTextField tf1,tf2;
	JComboBox cb2;
	JTextField a1; 
	JButton submit,back,reset,delete;
	JTable t=new JTable();
	Object[] columns={"Book ID","Category","Book Name","Price"}; 	
	DefaultTableModel model=new DefaultTableModel();
	
	AddBook() 
	{
	  JLabel l=new JLabel(new ImageIcon(""));            //set background image
	  l.setBounds(0,0,1340,670);
	  add(l);
	  
	  JLabel l2=new JLabel(new ImageIcon(""));    //set background of white color image
	  l2.setBounds(0,0,1340,670);
	  l.add(l2);
	
	
	  JLabel l3=new JLabel("ADD BOOK");
	  l3.setBounds(60,100,500,50);
	  l2.add(l3);
	  l3.setFont(new Font("Times New Roman",Font.BOLD,35));
	  Color c2=new Color(165,42,42);
	  l3.setForeground(c2);
	  
	  //set label,textfield ,Combobox and font on background white color 
	  
	  JLabel b_id=new JLabel("Book ID :");                                //b_id
	  b_id.setFont(new Font("Times New Roman",Font.PLAIN,25));
	  b_id.setBounds(40,200,150,30);
	  tf1=new JTextField();
	  tf1.setBounds(180,200,150,30);
	  tf1.setFont(new Font("Times New Roman",Font.PLAIN,25));
	  
	  
	  JLabel Category=new JLabel("Category:");                                  //Category
	  Category.setFont(new Font("Times New Roman",Font.PLAIN,25));
	  Category.setBounds(430,200,100,30); 
	  String book[]={"Motivational","Short Story","Poetry","Essay","Dramma","Novel"};
	  cb2=new JComboBox(book);
	  cb2.setBounds(530,200,150,30);
	  cb2.setFont(new Font("Times New Roman",Font.PLAIN,20));
	  
	  JLabel b_name=new JLabel("Book Name:");                                     //b_name
	  b_name.setBounds(40,300,150,30);
	  b_name.setFont(new Font("Times New Roman",Font.PLAIN,25));
	  tf2=new JTextField();
	  tf2.setBounds(180,300,150,30);
	  tf2.setFont(new Font("Times New Roman",Font.PLAIN,25));
	  
	  JLabel price=new JLabel("Price:");                               //problem
	  price.setBounds(40,400,100,30);
	  price.setFont(new Font("Times New Roman",Font.PLAIN,25));
	  a1=new JTextField();
	  a1.setBounds(180,400,150,30);
	  a1.setFont(new Font("Times New Roman",Font.PLAIN,25));
	  
	  //add buttons,actionListener,background color and foreground color
	  back=new JButton("Back");                                         //back
	  back.setBounds(40,500,100,40);
	  l2.add(back);
	  back.addActionListener(this);
	  back.setFont(new Font("Cambria",Font.BOLD,18));
	  back.setBackground(c2);
	  back.setForeground(Color.white);
	  
	  
	  reset=new JButton("Reset");                                         //reset
	  reset.setBounds(230,500,100,40);
	  l2.add(reset);
	  reset.addActionListener(this);
	  reset.setFont(new Font("Cambria",Font.BOLD,18));
	  reset.setBackground(c2);
	  reset.setForeground(Color.white);
	  
	  delete=new JButton("Delete");                                       //delete
	  delete.setBounds(430,500,100,40);
	  l2.add(delete);
	  delete.addActionListener(this);
	  delete.setFont(new Font("Cambria",Font.BOLD,18));
	  delete.setBackground(c2);
	  delete.setForeground(Color.white);
	  
	  submit=new JButton("Submit");                                     //submit
	  submit.setFont(new Font("Cambria",Font.BOLD,18));
	  submit.setBounds(630,500,110,40);
	  l2.add(submit);
	  submit.addActionListener(this);
	  submit.setBackground(c2);
	  submit.setForeground(Color.white);
    
	  
	  l2.add(b_id);
	  l2.add(Category);
	  l2.add(tf1);
	  l2.add(cb2);
	  l2.add(b_name);
	  l2.add(tf2);
	  l2.add(a1);
	  l2.add(price);
	  
	  
	 
	   t.setLayout(new FlowLayout());                      //properties of JTable and JScrollPane
	   JScrollPane js=new JScrollPane(t);
	   js.setBounds(780,90,500,500);
	   t.setBackground(c2);
	   t.setForeground(Color.white);
	   t.setFont(new Font("Times New Roman",Font.PLAIN,20));
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
		
		else if(e.getSource()==submit)
		{
			int a=Integer.parseInt(tf1.getText());
			if(a>8)
			{
				JOptionPane.showMessageDialog(null,"Please enter book id between 1 to 8!");
			}
			else
			{
		        model.setColumnIdentifiers(columns);
		        t.setModel(model);
		        Object[] row=new Object[6];
				row[0]=tf1.getText();
				row[1]=cb2.getSelectedItem();
				row[2]=tf2.getText();
				row[3]=a1.getText();     
				model.addRow(row);
				t.setRowHeight(50);
		     }
		}
		else if(e.getSource()==reset)
		{
			tf1.setText("");
			tf2.setText("");
			a1.setText("");
			cb2.setSelectedItem("First Category");
		}
		else if(e.getSource()==delete)
		{
			int i=t.getSelectedRow();
			if( i>=0)
			{
				model.removeRow(i);
			}
		}
		
	}
	public static void main(String args[])
	{
		new AddBook();
	}
}