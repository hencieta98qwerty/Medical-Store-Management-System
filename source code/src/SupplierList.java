
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.sql.ResultSet;

public class SupplierList extends JFrame
 {
    JFrame jf=new JFrame();
    JLabel ln,lb;
    Connection con;
    PreparedStatement ps;
    Statement stmt;
    ResultSet rs;
 	DefaultTableModel model = new DefaultTableModel();
    JTable tabGrid = new JTable(model);
    JScrollPane scrlPane = new JScrollPane(tabGrid);

  public SupplierList()
  {

    jf.setLayout(null);
  	ln = new JLabel("LIST OF SUPPLIER DETAILS");
    ln.setFont(new Font("Algerian",Font.PLAIN,25));
    ln.setForeground(new java.awt.Color(0,102,102));
    ln.setBounds(270,70,350,25);
    jf.add(ln);

    scrlPane.setBounds(0,150,900,600);
    jf.add(scrlPane);
    tabGrid.setFont(new Font ("Times New Roman",0,15));

   	model.addColumn("S_ID");
   	model.addColumn("S_NAME");
  	model.addColumn("S_Address");
  	model.addColumn("S_PhNo");
  	model.addColumn("S_EmailId");

  		int r = 0;
     try
     {

     	Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
		System.out.println("Connected to database.");
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        rs = stmt.executeQuery("select * from supplier order by sid asc");
          while(rs.next())
            {
            	model.insertRow(r++,new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});

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

     lb = new JLabel(new ImageIcon("pics//pic5.jpg"));
	 lb.setBounds(0,0,900,700);
	 jf.add(lb);
		
    jf.setTitle("Supplier List");
    jf.setSize(900,700);
	 jf.setLocation(20,20);
	jf.setResizable(false);
    jf.getContentPane().setBackground(new java.awt.Color(204,204,0));
    jf.setVisible(true);
  }


  public static void main(String args[])
    {
    	new SupplierList();
    }
}
