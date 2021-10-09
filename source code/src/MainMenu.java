import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainMenu extends JFrame implements ActionListener
{   JFrame jf;
	JMenuBar mbar;
	JMenu m1,m2,m3,m4,m5;
	JMenuItem m1_1,m1_2,m1_3,m1_4,m1_5,m2_1,m2_2,m2_3,m2_4,m2_5,m3_1,m3_2,m4_1,m5_1;
	JLabel l1,l2,l3,l4,l5;
	

	public MainMenu()
	{
        jf=new JFrame();
        
		jf.setLayout(null);
		
		l4 = new JLabel("WELCOME TO MEDICAL STORE");
        l4.setFont(new Font("Gabriola",Font.BOLD,25));
        l4.setForeground(Color.blue);
        l4.setBounds(230,50,300,40);
		jf.add(l4);
		
		l5 = new JLabel("MANAGEMENT SYSTEM");
        l5.setFont(new Font("Gabriola",Font.BOLD,25));
        l5.setForeground(Color.blue);
        l5.setBounds(260,70,300,40);
		jf.add(l5);
		
		//l1=new JLabel("PHARMIZ");
		l1=new JLabel(new ImageIcon("pics//pic11.jpg"));
		//l1.setFont(new Font("Algerian",Font.PLAIN,40));
		l1.setBounds(250,200,250,60);
		//l1.setForeground(Color.magenta);
		jf.add(l1);
		
		l2 = new JLabel("An easy management for medical store");
		l2.setFont(new Font("Gabriola",Font.PLAIN,30));
		l2.setBounds(200,240,700,80);
		l2.setForeground(Color.black);
		jf.add(l2);

		mbar = new JMenuBar();
		jf.setJMenuBar(mbar);

		m1=new JMenu("Supplier");
		mbar.add(m1);
		m1_1 = new JMenuItem("Add New Supplier",new ImageIcon("images//addnew.png"));
		m1.add(m1_1);
		m1_2 = new JMenuItem("search Supplier",new ImageIcon("images//search.png"));
		m1.add(m1_2);
		m1_3 = new JMenuItem("Update Supplier",new ImageIcon("images//update.png"));
		m1.add(m1_3);
		m1_4 = new JMenuItem("Delete Supplier",new ImageIcon("images//delete.png"));
		m1.add(m1_4);
	    m1_5 = new JMenuItem("List of Supplier",new ImageIcon("images//all.png"));
		m1.add(m1_5);

		m2=new JMenu("Medicine");
		mbar.add(m2);
		m2_1 = new JMenuItem("Add New Medicine",new ImageIcon("images//addnew.png"));
		m2.add(m2_1);
		m2_2 = new JMenuItem("search Medicine",new ImageIcon("images//search.png"));
		m2.add(m2_2);
		m2_3 = new JMenuItem("Update Medicine",new ImageIcon("images//update.png"));
		m2.add(m2_3);
		m2_4 = new JMenuItem("Delete Medicine",new ImageIcon("images//delete.png"));
		m2.add(m2_4);
	    m2_5 = new JMenuItem("Stock of Medicine",new ImageIcon("images//all.png"));
		m2.add(m2_5);


		m3=new JMenu("Report");
	    mbar.add(m3);
		m3_1 = new JMenuItem("Daily Purchase Report",new ImageIcon("images//report.png"));
		m3.add(m3_1);

		m3_2 = new JMenuItem("Suplier wise medicine Report",new ImageIcon("images//report.png"));
		m3.add(m3_2);

		m4=new JMenu("About");
		mbar.add(m4);
		m4_1 = new JMenuItem("About System",new ImageIcon("images//help.png"));
		m4.add(m4_1);

		m5=new JMenu("Exit");
		mbar.add(m5);
		m5_1 = new JMenuItem("Exit",new ImageIcon("images//exit.png"));
		m5.add(m5_1);

        m1_1.addActionListener(this);
		m1_2.addActionListener(this);
		m1_3.addActionListener(this);
		m1_4.addActionListener(this);
    	m1_5.addActionListener(this);

		m2_1.addActionListener(this);
		m2_2.addActionListener(this);
		m2_3.addActionListener(this);
		m2_4.addActionListener(this);
	    m2_5.addActionListener(this);

		m3_1.addActionListener(this);
		m3_2.addActionListener(this);
		m4_1.addActionListener(this);
		m5_1.addActionListener(this);
        
		l3 = new JLabel(new ImageIcon("pics//pic2.jpg"));
		l3.setBounds(0,0,695,500);
		jf.add(l3);
		
		jf.setTitle("Main Menu");
		jf.setLocation(20,20);
        jf.setSize(700,550);
	    jf.setResizable(false);
	   
		jf.getContentPane().setBackground(Color.cyan);
		jf.setVisible(true);

	}

	public void actionPerformed(ActionEvent ae)
	{

	  if(ae.getSource()==m1_1)
		{
		  new AddNewSupplier();
		}
		else if(ae.getSource()==m1_2)
		{
		 new SearchSupplier();
		}
		else if(ae.getSource()==m1_3)
		{
		new UpdateSupplier();
		}
		else if(ae.getSource()==m1_4)
		{
		new DeleteSupplier();
		}
	    else if(ae.getSource()==m1_5)
		{
		  new SupplierList();
		}


		else if(ae.getSource()==m2_1)
		{
			new AddNewMedicine();
		}
		else if(ae.getSource()==m2_2)
		{
			new SearchMedicine();
		}
		else if(ae.getSource()==m2_3)
		{
			new UpdateMedicine();
		}
		else if(ae.getSource()==m2_4)
		{
			new DeleteMedicine();
		}
		else if(ae.getSource()==m2_5)
		{
			new MedicineList();
		}

		 else if(ae.getSource()==m3_1)
		 {
		   new DailyPurchaseReport();
		 }

		  else if(ae.getSource()==m3_2)
		 {
		   new SupplierWiseMedList();
		 }

		else if(ae.getSource()==m4_1)
		{
	        new About();
		}

		else if(ae.getSource()==m5_1)
		{
		  System.exit(0);
		}

  }

	public static void main(String args[])
	{
		new MainMenu();
	}
}
