import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class AddNewMedicine extends JFrame implements ActionListener
{
	JFrame jf;
	JTextField t1,t2,t3,t4,t5,t6,t8,t9,t10;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,ln,lb;
    JButton b0,b1,b2;
    JComboBox msname,tabtype;
    String s,sid1,tabt;
	Font f;
    Date date1;
    GregorianCalendar calendar;
    String strDate;
    Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	DefaultTableModel model = new DefaultTableModel();
    JTable tabGrid = new JTable(model);
    JScrollPane scrlPane = new JScrollPane(tabGrid);

	AddNewMedicine()
	{
		jf=new JFrame();
		f = new Font("Times New Roman",Font.PLAIN,20);
		jf.setLayout(null);

	    ln=new JLabel("New  Medicine  Details");
	    ln.setFont(new Font("Algerian",Font.PLAIN,25));
	    ln.setForeground(new java.awt.Color(204,204,0));
	    ln.setBounds(300,30,400,40);
	    jf.add(ln);

		l1 = new JLabel("Medicine Batch no* :");
		l1.setFont(f);
        l1.setBounds(50,100,200,25);
        l1.setForeground(new java.awt.Color(51, 255, 204));
		jf.add(l1);

		t1 = new JTextField(20);
		t1.setBounds(250,100,100,25);
		t1.setToolTipText("Enter medicine batch no");
		jf.add(t1);

		l2 = new JLabel("Medicine name* :");
		l2.setFont(f);
        l2.setBounds(50,140,200,25);
        l2.setForeground(new java.awt.Color(51,255,204));
		jf.add(l2);

    	t2 = new JTextField(20);
		t2.setBounds(250,140,200,25);
		t2.setToolTipText("Enter medicine name");
		jf.add(t2);

		l3 = new JLabel("Medicine company* :");
		l3.setFont(f);
        l3.setBounds(50,180,200,25);
        l3.setForeground(new java.awt.Color(51,255,204));
		jf.add(l3);

     	t3 = new JTextField(20);
		t3.setBounds(250,180,200,25);
		t3.setToolTipText("Enter medicine company");
		jf.add(t3);

		l4 = new JLabel("Medicine quantity* :");
		l4.setFont(f);
        l4.setBounds(50,220,200,25);
        l4.setForeground(new java.awt.Color(51,255,204));
    	jf.add(l4);

        t4= new JTextField(20);
		t4.setBounds(250,220,100,25);
		t4.setToolTipText("Enter medicine quantity");
		jf.add(t4);

		l5= new JLabel("Med expiry date* :");
		l5.setFont(f);
        l5.setBounds(50,260,250,25);
        l5.setForeground(new java.awt.Color(51,255,204));
		jf.add(l5);

	    t5= new JTextField(20);
		t5.setBounds(250,260,100,25);
		t5.setToolTipText("Enter medicine expiry date");
		jf.add(t5);

		l6= new JLabel("Med purchase date* :");
		l6.setFont(f);
        l6.setBounds(50,300,260,25);
        l6.setForeground(new java.awt.Color(51,255,204));
    	jf.add(l6);

        t6= new JTextField(20);
		t6.setBounds(250,300,100,25);
		t6.setToolTipText("Enter medicine expiry date");
		jf.add(t6);

		date1= new Date();
     	calendar=new GregorianCalendar();
	    calendar.setTime(date1);
        strDate =calendar.get(Calendar.DATE)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"+calendar.get(Calendar.YEAR);
	    t6.setText(strDate);

		l7 = new JLabel("Medicine type* :");
		l7.setFont(f);
        l7.setBounds(470,100,200,25);
        l7.setForeground(new java.awt.Color(51,255,204));
    	jf.add(l7);

        tabtype=new JComboBox();
        tabtype.addItem("--type--");
		tabtype.addItem("Tablet");
		tabtype.addItem("Capsule");
		tabtype.addItem("Syrup");
		tabtype.addItem("Insulin");
		tabtype.addItem("Cream");
		tabtype.addItem("Balm");
		tabtype.addItem("Drop");
		tabtype.addItem("Granul");
		tabtype.addItem("Oil");
		tabtype.addItem("Powder");
		tabtype.setBounds(720,100,100,25);tabtype.setToolTipText("Select medicine type");
		jf.add(tabtype);
		tabtype.addActionListener(new ActionListener()
	     {
		   public void actionPerformed(ActionEvent ae)
		   {
		    tabt =(String)tabtype.getSelectedItem();
		   }
          });

		l8= new JLabel("Medicine purchase price* :");
		l8.setFont(f);
        l8.setBounds(470,140,220,25);
        l8.setForeground(new java.awt.Color(51,255,204));
    	jf.add(l8);

        t8 = new JTextField(20);
		t8.setBounds(720,140,100,25);
		t8.setToolTipText("Enter medicine purchase price");
		jf.add(t8);

		l9 = new JLabel("Medicine sale price* :");
		l9.setFont(f);
        l9.setBounds(470,180,200,25);
        l9.setForeground(new java.awt.Color(51,255,204));
    	jf.add(l9);

        t9 = new JTextField(20);
		t9.setBounds(720,180,100,25);
		t9.setToolTipText("Enter medicine sale price");
		jf.add(t9);

		l10 = new JLabel("Medicine rack no* :");
		l10.setFont(f);
        l10.setBounds(470,220,200,25);
        l10.setForeground(new java.awt.Color(51,255,204));
    	jf.add(l10);

        t10 = new JTextField(20);
		t10.setBounds(720,220,100,25);
		t10.setToolTipText("Enter medicine rack no");
		jf.add(t10);

		l11 = new JLabel("Supplier name* :");
		l11.setFont(f);
        l11.setBounds(470,260,250,25);
        l11.setForeground(new java.awt.Color(51,255,204));
    	jf.add(l11);


        msname=new JComboBox();
        msname.setBounds(720,260,130,25);
        msname.setToolTipText("select medicine supplier name");
        jf.add(msname);
        msname.addActionListener(new ActionListener()
	     {
		   public void actionPerformed(ActionEvent ae)
		   {
		    s =(String)msname.getSelectedItem();
		   }
          });

        try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
			System.out.println("Connected to database.");
			 ps=con.prepareStatement("select sname from supplier");
		    rs=ps.executeQuery();
    		while(rs.next())
    		{
    		 String sname1=rs.getString(1);
    		 msname.addItem(sname1);
    		}

    	con.close();
       }
       catch(SQLException se)
       {
       System.out.println(se);
      }
      catch(Exception e)
       {
       System.out.println(e);
       }

        b0 = new JButton("Save",new ImageIcon("images//save.png"));
        b0.setBounds(150,330,110,35);
        b0.setToolTipText("click to save medicine details");
		jf.add(b0);b0.addActionListener(this);

		b1 = new JButton("Clear",new ImageIcon("images//clear.png"));
		b1.setBounds(300,330,110,35);
		b1.setToolTipText("click to clear all textfields");
	    jf.add(b1); b1.addActionListener(this);

        b2= new JButton("All",new ImageIcon("images//all.png"));
		b2.setBounds(450,330,110,35);
		b2.setToolTipText("click to view all medicine details");
		jf.add(b2); b2.addActionListener(this);

	    scrlPane.setBounds(0,380,900,600);
        jf.add(scrlPane);
        tabGrid.setFont(new Font ("Times New Roman",0,15));

        model.addColumn("M_BNO");
        model.addColumn("M_NAME");
        model.addColumn("M_COMPANY");
        model.addColumn("M_QUANTITY");
        model.addColumn("M_EXPDATE");
        model.addColumn("M_PURDATE");
        model.addColumn("M_TYPE");
        model.addColumn("M_SALEPRICE");
        model.addColumn("M_PURPRICE");
        model.addColumn("M_RACKNO");
        model.addColumn("M_SID");
        model.addColumn("M_SNAME");
         
        lb = new JLabel(new ImageIcon("pics//pic23.jpg"));
		lb.setBounds(0,0,900,700);
		jf.add(lb);
		
	     jf.setTitle("Add New Medicine ");
	     jf.setSize(900,700);
		 jf.setLocation(20,20);
		 jf.setResizable(false);
		 jf.getContentPane().setBackground(Color.cyan);
	     jf.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{
	 if(ae.getSource()==b0)
	   {
	   try
	    {
	    	if(((t1.getText()).equals(""))||((t2.getText()).equals(""))||((t3.getText()).equals(""))||((t4.getText()).equals(""))||((t5.getText()).equals(""))||((t6.getText()).equals(""))||
	    	((t8.getText()).equals(""))||((t9.getText()).equals(""))||((t10.getText()).equals("")))
	        {
		    JOptionPane.showMessageDialog(this,"* Details are Missing !","Warning!!!",JOptionPane.WARNING_MESSAGE);
	        }
	        else
	        {
                	float a=Float.parseFloat(t8.getText());
					float b=Float.parseFloat(t9.getText());
	        	if(b<a)
	        	{
	        	JOptionPane.showMessageDialog(this,"sale price should be greater than puchase price!","Warning!!!",JOptionPane.WARNING_MESSAGE);
	        	}
	        	else
	        	{

			Class.forName("oracle.jdbc.driver.OracleDriver");
		    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
			System.out.println("Connected to database.");

			ps=con.prepareStatement("Select sid from supplier where sname='"+s+"'");
    		  rs=ps.executeQuery();
    		  while(rs.next())
    		  {
    		  	 sid1=rs.getString(1);
    	      }
 ps=con.prepareStatement("insert into medicine (mbno,mname,mcompany,mqty,mexpdate,mpurdate,mtype,mpurprice,msaleprice,mrackno,sid,sname)values(?,?,?,?,?,?,?,?,?,?,?,?)");

            ps.setString(1,t1.getText());
		    ps.setString(2,t2.getText());
		    ps.setString(3,t3.getText());
			ps.setInt(4,Integer.parseInt(t4.getText()));
            ps.setString(5,t5.getText());
		    ps.setString(6,t6.getText());
		    ps.setString(7,tabt);
			ps.setFloat(8,Float.parseFloat(t8.getText()));
            ps.setFloat(9,Float.parseFloat(t9.getText()));
		    ps.setString(10,t10.getText());
		    ps.setInt(11,Integer.parseInt(sid1));
		    ps.setString(12,s);
		  	ps.executeUpdate();

  int reply=JOptionPane.showConfirmDialog(null,"Medicine added successfully.Do you want add more Medicines?","Added Medicine",JOptionPane.YES_NO_OPTION);

	             if (reply == JOptionPane.YES_OPTION)
	   			{
	   		       jf.setVisible(false);
	   		       new AddNewMedicine();
	   		    }
	   		  else if (reply == JOptionPane.NO_OPTION)
	   			{
	   			  jf.setVisible(false);
		        }
	      }
		   }

		con.close();
   }
   catch(SQLException se)
   {
     System.out.println(se);
     JOptionPane.showMessageDialog(null,"SQL Error:"+se);
   }
  catch(Exception e)
  {
    System.out.println(e);
    JOptionPane.showMessageDialog(null,"Error:"+e);
  }

 }
  else if(ae.getSource()==b1)
      {    t1.setText("");
           t2.setText("");
           t3.setText("");
           t4.setText("");
           t5.setText("");
           t6.setText("");
		   t8.setText("");
           t9.setText("");
           t10.setText("");

      }

    else if(ae.getSource()==b2)
    {//list
  	int r = 0;
     try
     {
         Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
		System.out.println("Connected to database.");
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        rs = stmt.executeQuery("SELECT * from medicine order by mbno asc" );
          while(rs.next())
            {
  model.insertRow(r++, new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12) });
            }
             con.close();
       }
      catch(SQLException se)
       {
        System.out.println(se);
         JOptionPane.showMessageDialog(null,"SQL Error:"+se);
       }
      catch(Exception e)
       {
       	   System.out.println(e);
          JOptionPane.showMessageDialog(null,"Error:"+e);
       }
	}
   }
	public static void main(String args[])
	{
	      new AddNewMedicine();
	}
}

