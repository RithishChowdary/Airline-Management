package AMS;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class CheckPaymentDetails extends JFrame 
{
    JTextField textField;
    JTable table;
    JLabel FlightCode, Capacity, Classcode, Classname, label, sector;

    class GradientLabel extends JLabel
    {
        public GradientLabel(String text)
        {
            super(text);
            setFont(new Font("Arial", Font.BOLD, 33));
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g)
        {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                                 RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

            GradientPaint gradient = new GradientPaint(
                0, 0, Color.WHITE,
                getWidth(), 0, Color.BLACK
            );

            g2d.setPaint(gradient);
            FontMetrics fm = g2d.getFontMetrics(getFont());
            int x = 0;
            int y = fm.getAscent();

            g2d.setFont(getFont());
            g2d.drawString(getText(), x, y);
            g2d.dispose();
        }
    }

    public static void main(String[] args) 
    {
        new CheckPaymentDetails();
    }

    CheckPaymentDetails() 
    {
        initialize();
    }

    private void initialize()
    {
        setTitle("Payment Details");
        getContentPane().setBackground(Color.WHITE);
        setSize(960, 590);
        setLayout(null);

        sector = new GradientLabel("Check Payment Details");
        sector.setBounds(291, 17, 800, 50);
        add(sector);

        JLabel Fcode = new JLabel("Username");
        Fcode.setFont(new Font("Arial", Font.BOLD, 16));
        Fcode.setBounds(190, 160, 150, 26);
        add(Fcode);

        textField = new JTextField();
        textField.setBounds(300, 160, 150, 26);
        textField.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField);

        JButton Show = new JButton("Show");
        Show.setFont(new Font("Arial", Font.BOLD, 14));
        Show.setBackground(Color.BLACK);
        Show.setForeground(Color.WHITE);
        Show.setBounds(500, 160, 150, 26);
        add(Show);

        table = new JTable();
        table.setBounds(93, 297, 766, 87);
        add(table);

        FlightCode = new JLabel("TicketId");
        FlightCode.setFont(new Font("Arial", Font.BOLD, 14));
        FlightCode.setBounds(117, 262, 100, 26);
        add(FlightCode);

        Capacity = new JLabel("Price");
        Capacity.setFont(new Font("Arial", Font.BOLD, 14));
        Capacity.setBounds(237, 268, 38, 14);
        add(Capacity);

        Classcode = new JLabel("Journey Date");
        Classcode.setFont(new Font("Arial", Font.BOLD, 14));
        Classcode.setBounds(362, 264, 101, 24);
        add(Classcode);

        Classname = new JLabel("Journey Time");
        Classname.setFont(new Font("Arial", Font.BOLD, 14));
        Classname.setBounds(485, 268, 114, 14);
        add(Classname);

        JLabel Cardno = new JLabel("Username");
        Cardno.setFont(new Font("Arial", Font.BOLD, 14));
        Cardno.setBounds(620, 269, 101, 19);
        add(Cardno);

        JLabel Phoneno = new JLabel("Status");
        Phoneno.setFont(new Font("Arial", Font.BOLD, 14));
        Phoneno.setBounds(752, 264, 86, 24);
        add(Phoneno);
        
        label = new JLabel();
        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("Icons/33.png"));
        Image img = ic.getImage().getScaledInstance(1550, 800, Image.SCALE_SMOOTH);
        ImageIcon ic1 = new ImageIcon(img);
        label.setIcon(ic1);
        label.setBounds(0, 0, 960, 590);
        add(label);

        setLocation(40, 20);
        setVisible(true);

        Show.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent ae) 
            {
                try {
                    String usn = textField.getText();
                    ConnectionClass obj = new ConnectionClass();
                    String str = "select tid,price,journey_date,journey_time,username,status " +"from bookedFlight where username='" + usn + "' and status='success'";
                    ResultSet rs = obj.stm.executeQuery(str);
                    table.setModel(DbUtils.resultSetToTableModel(rs));
                    table.setFont(new Font("Arial", Font.BOLD, 14));
                } catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }
        });
    }
}
