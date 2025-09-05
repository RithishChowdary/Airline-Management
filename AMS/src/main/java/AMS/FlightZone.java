/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AMS;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class FlightZone extends JFrame
{
    private JTable table;
    private JTextField t;
    Choice ch1;
    JLabel l1;
    
    public static void main(String[] args)
    {
        new FlightZone().setVisible(true);
    }
    FlightZone()
    {
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/34.png"));
        Image i1 = img.getImage().getScaledInstance(900, 600, Image.SCALE_SMOOTH);
        ImageIcon img2 = new ImageIcon(i1);
        l1 = new JLabel(img2);
        l1.setBounds(0, 0, 900, 650);
        setContentPane(l1);
                
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(860,523);
        setLayout(null);
        setVisible(true);
        
        JLabel flightCode=new JLabel("Flight Code");
        flightCode.setFont(new Font("Arial", Font.BOLD,18));
        flightCode.setBounds(100,100,150,30);
        flightCode.setForeground(new Color(15,11,1));
        add(flightCode);
        
        JLabel flightDetails=new JLabel("Air India Flight Information");
        flightDetails.setFont(new Font("Arial", Font.BOLD,33));
        flightDetails.setBounds(250,20,570,35);
        flightDetails.setForeground(new Color(15,11,1));
        add(flightDetails);
       
        JButton bt=new JButton("Show Details");
        bt.setFont(new Font("Arial", Font.BOLD,20));
bt.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            String code = ch1.getSelectedItem();
            ConnectionClass c = new ConnectionClass();
            String str = "select * from flight where f_code= '" + code + "'";
            ResultSet rs = c.stm.executeQuery(str);
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
});

        bt.setBounds(560,100,220,30);
        add(bt);
        
        table=new JTable();
        table.setBackground(Color.WHITE);
        table.setBounds(23,250,800,300);
        table.setFont(new Font("Arial", Font.BOLD,14));
        add(table);
        
        ch1=new Choice();
        ch1.setBounds(250,103,200,35);
        ch1.setFont(new Font("Arial",Font.BOLD,18));
        try
        {
            ConnectionClass con=new ConnectionClass();
            String str="select distinct f_code from flight";
            ResultSet rs=con.stm.executeQuery(str);
            while(rs.next())
            {
                ch1.add(rs.getString("f_code"));
            }
        }
        catch(Exception exx)
        {
            exx.printStackTrace();
        }
       add(ch1);
        
       JLabel flightc=new JLabel("Flight Code");
       flightc.setFont(new Font("Arial",Font.BOLD,14));
       flightc.setBounds(33,220,126,16);
       flightc.setForeground(new Color(15,11,1));
       add(flightc);
       
       JLabel flightName=new JLabel("Flight Name");
       flightName.setFont(new Font("Arial",Font.BOLD,14));
       flightName.setBounds(155,220,120,16);
       flightName.setForeground(new Color(15,11,1));
       add(flightName);
       
       JLabel source=new JLabel("Source");
       source.setFont(new Font("Arial",Font.BOLD,14));
       source.setBounds(275,220,104,16);
       source.setForeground(new Color(15,11,11));
       add(flightc);
       
       JLabel destination=new JLabel("Destination");
       destination.setFont(new Font("Arial",Font.BOLD,14));
       destination.setBounds(300,220,120,16);
       destination.setForeground(new Color(15,11,1));
       add(destination);
       
       JLabel capacity=new JLabel("Capacity");
       capacity.setFont(new Font("Arial",Font.BOLD,14));
       capacity.setBounds(407,220,111,16);
       capacity.setForeground(new Color(15,11,11));
       add(capacity);
       
       JLabel className=new JLabel("Class Name");
       className.setFont(new Font("Arial",Font.BOLD,14));
       className.setBounds(610,220,120,16);
       className.setForeground(new Color(15,11,11));
       add(className);
       
       JLabel price=new JLabel("Price");
       price.setFont(new Font("Arial",Font.BOLD,14));
       price.setBounds(740,220,111,16);
       price.setForeground(new Color(15,11,11));
       add(price);
       
       setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
       setSize(900,650);
       setVisible(true);
       setLocation(100,50);
       
       
    }
}
