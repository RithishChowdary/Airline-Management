/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AMS;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {  

    JLabel l1, l2, l3, l4;
    JButton bt1, bt2;
    JPasswordField pf;
    JTextField tf;
    JFrame f;

    Login() {
        f = new JFrame("Login Account");
        f.setBackground(Color.WHITE);
        f.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(0, 0, 498, 278);
        l1.setLayout(null);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/11.gif"));
        l1 = new JLabel(img);
        l1.setBounds(0, 0, 498, 278);
        l1.setLayout(null);

        l2 = new JLabel("UserName");
        l2.setBounds(212, 120, 150, 30);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Arial", Font.BOLD, 20));
        l1.add(l2);

        f.add(l1);

        l3 = new JLabel("LoginAccount");
        l3.setBounds(190, 30, 500, 50);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Arial", Font.BOLD, 20));
        l1.add(l3);

        l4 = new JLabel("Password");
        l4.setBounds(212, 170, 150, 30);
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Arial", Font.BOLD, 20));
        l1.add(l4);

        tf = new JTextField();
        tf.setBounds(320, 120, 150, 30);
        l1.add(tf);

        pf = new JPasswordField();
        pf.setBounds(320, 170, 150, 30);
        l1.add(pf);

        bt1 = new JButton("Login");
        bt1.setBackground(Color.BLACK);
        bt1.setForeground(Color.WHITE);
        bt1.setBounds(120, 220, 150, 40);
        l1.add(bt1);

        bt2 = new JButton("SignUp");
        bt2.setBackground(Color.BLACK);
        bt2.setForeground(Color.WHITE);
        bt2.setBounds(320, 220, 150, 40);
        l1.add(bt2);

        bt1.addActionListener(this);
        bt2.addActionListener(this);

        f.setVisible(true);
        f.setSize(498, 315);
        f.setLocation(300, 100);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == bt1) {
            String username = tf.getText();
            String pass = new String(pf.getPassword());

            try {
                ConnectionClass obj = new ConnectionClass();
                String q = "Select * from users where username='" + username + "' and password='" + pass + "'";
                ResultSet rs = obj.stm.executeQuery(q);
                if (rs.next()) 
                {
                    new HomePage().setVisible(true);
                    f.dispose();
                } else 
                {
                    JOptionPane.showMessageDialog(f, "You have entered wrong username and password !",
                            "Login Failed", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) 
            {
                ex.printStackTrace();
            }
        }

        if (e.getSource() == bt2) 
        {
            String username = JOptionPane.showInputDialog(f, "Enter username:");
            String password = JOptionPane.showInputDialog(f, "Enter password:");

            try {
                ConnectionClass obj = new ConnectionClass();
                String q = "INSERT INTO users (username, password) VALUES (?, ?)";
                PreparedStatement pst = obj.con.prepareStatement(q);
                pst.setString(1, username);
                pst.setString(2, password);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(f, "Signup successful!");
            } 
            catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(f, "Error: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) 
    {
        new Login();
    }
}
