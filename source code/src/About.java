import javax.swing.*;
import java.awt.*;

class About extends JFrame
{
	JFrame jf;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,lb;
	JButton b1,b2,b3;

	About()
	{
		jf=new JFrame();

		jf.setLayout(null);

		l1 = new JLabel("MEDICAL  STORE  MANAGEMENT  SYSTEM");
		l1.setFont(new Font("Algerian",Font.PLAIN,25));
		l1.setBounds(200,30,600,40);
		l1.setForeground(Color.orange);
		jf.add(l1);
		
        l2 = new JLabel("*  Medical Store Management system is a general software for medical store.");
		l2.setFont(new Font("Times New Roman",Font.PLAIN,20));
		l2.setBounds(30,80,700,80);
		jf.add(l2);

		l3 = new JLabel("*  This project is mainly designed for the pharmacist.");
		l3.setFont(new Font("Times New Roman",Font.PLAIN,20));
		l3.setBounds(30,110,700,80);
		jf.add(l3);

		l4 = new JLabel("*  In this system we can add details of Medicines, Suppliers.");
		l4.setFont(new Font("Times New Roman",Font.PLAIN,20));
		l4.setBounds(30,140,700,80);
		jf.add(l4);

		l5 = new JLabel("*  We can also update, delete & search the existing details.");
		l5.setFont(new Font("Times New Roman",Font.PLAIN,20));
		l5.setBounds(30,170,700,80);
		jf.add(l5);

		l6 = new JLabel("*  It is helpfull for stock of Medicine & where we placed the medicine in store.");
		l6.setFont(new Font("Times New Roman",Font.PLAIN,20));
		l6.setBounds(30,200,700,80);
		jf.add(l6);

		l7 = new JLabel("*  Medical Store Management Software is very needy for the Medical Store");
		l7.setFont(new Font("Times New Roman",Font.PLAIN,20));
		l7.setBounds(30,230,700,80);
		jf.add(l7);
		
		l8 = new JLabel("*  This software help them to maintain the day-to-day transactions in computer.");
		l8.setFont(new Font("Times New Roman",Font.PLAIN,20));
		l8.setBounds(30,260,700,80);
		jf.add(l8);

		l9 = new JLabel("*  This is so designed as to ease the work load of pharmacists.");
		l9.setFont(new Font("Times New Roman",Font.PLAIN,20));
		l9.setBounds(30,290,700,80);
		jf.add(l9);
		
		l10 = new JLabel("*  It is suited for the medical shops or stores of any size.");
		l10.setFont(new Font("Times New Roman",Font.PLAIN,20));
		l10.setBounds(30,320,700,80);
		jf.add(l10);
		
		l11 = new JLabel("Note: This project is developed as the mini project for the VTU examination .");
		l11.setFont(new Font("Times New Roman",Font.PLAIN,20));
		l11.setBounds(30,400,700,80);
		jf.add(l11);
		
		l12 = new JLabel(new ImageIcon("pics//pic19.jpg"));
		l12.setBounds(190,400,900,300);
		jf.add(l12);
		
		l13 = new JLabel(new ImageIcon("pics//pic7.png"));
		l13.setBounds(450,120,600,150);
		jf.add(l13);
		
		l14 = new JLabel(new ImageIcon("pics//pic14.png"));
		l14.setBounds(30,400,379,300);
		jf.add(l14);
		
		lb=new JLabel(new ImageIcon("pics//pic10.jpg"));
		lb.setBounds(0,0,900,700);
		jf.add(lb);
		
        jf.setTitle("About System");
		jf.setSize(900,700);
		jf.setLocation(20,20);
		jf.setResizable(false);
		jf.getContentPane().setBackground(Color.cyan);
		jf.setVisible(true);

	}

	public static void main(String args[])
	{
          new About();

	}
}
