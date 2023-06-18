import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

class deposite{

}
     
public class task3{
   public static void main(String[] args) {
    

    JButton b7 = new JButton("Confirm");
    b7.setFont(new Font("Verdana", Font.PLAIN, 15));
    
    JButton b8 = new JButton();
    b8.setFont(new Font("Verdana", Font.PLAIN, 20));

    //default id and password

    int id=123456;
    int password=7890;

    //buttons for features of atm

    JButton b2,b3,b4,b5,b6;
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton(); 
        /*b2.setBounds(90, 60, 200, 20);
        b3.setBounds(90, 90, 200, 20);
        b4.setBounds(90, 120, 200, 20);
        b5.setBounds(90, 150, 200, 20);
        b6.setBounds(80, 180, 200, 20);*/

//first Frame 
    JFrame f = new JFrame("ATM INTERFACE");
    
    JLabel l1 = new JLabel("WELCOME TO ATM INTERFACE");
    l1.setBounds(150,10,390,20);
    l1.setFont(new Font("Verdana", Font.PLAIN, 20));
    f.add(l1);
    
    JLabel l2 = new JLabel("Enter ID:");
    l2.setBounds(80, 80, 200, 20);
    l2.setFont(new Font("Verdana", Font.PLAIN, 15));
    f.add(l2);
    
    JLabel l3 = new JLabel("Enter Password:");
    l3.setBounds(80, 100, 200, 20);
    l3.setFont(new Font("Verdana", Font.PLAIN, 15));
    f.add(l3);
    
    JTextField tf1 = new JTextField("000000");
    tf1.setBounds(220, 70, 90, 25);
    tf1.setFont(new Font("Verdana", Font.PLAIN, 15));
    f.add(tf1);
    
    JTextField tf2 = new JTextField("0000");
    tf2.setBounds(220, 100, 90, 25);
    tf2.setFont(new Font("Verdana", Font.PLAIN, 15));
    f.add(tf2);
    
    
    JButton b1 = new JButton("Login");
    b1.setFont(new Font("Verdana", Font.PLAIN, 20));
    b1.setBounds(130, 40, 50, 10);
    b1.setBackground(Color.RED);
    f.add(b1);
    
    
    //add action listerner to login button

    b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae){

            //set password and id for login

            if(Integer.parseInt(tf1.getText())==id && Integer.parseInt(tf2.getText())==password){

            //second frame

            JFrame f2 = new JFrame("ATM features");
            JLabel l2 = new JLabel();
            l2.setText("Welcome to Interface features");
            l2.setBounds(50,5,500,20);
            l2.setFont(new Font("Verdana", Font.PLAIN, 25));

            f2.add(l2);

            b2.setText("Transaction History");
            b2.setFont(new Font("Verdana", Font.PLAIN, 15));
            b3.setText("Withdraw");
            b3.setFont(new Font("Verdana", Font.PLAIN, 15));
            b4.setText("Deposit");
            b4.setFont(new Font("Verdana", Font.PLAIN, 15));
            b5.setText("Transfer");
            b5.setFont(new Font("Verdana", Font.PLAIN, 15));
            b6.setText("Quit");
            b6.setFont(new Font("Verdana", Font.PLAIN, 15));
            f2.add(b2); 
            f2.add(b3);
            f2.add(b4);
            f2.add(b5);
            f2.add(b6);

            f2.setLayout(new GridLayout(6, 1, 5, 10));

            f2.setSize(500, 400);
            f2.setVisible(true);
            f2.setBackground(Color.yellow);
            f2.getContentPane().setBackground(Color.pink);
            f2.setLayout(null);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //add action listner to buttons
        
        }else{

            //else block if password is wrong

           b1.setText("Wrong ID or Password\nTry again");
           b1.setFont(new Font("Verdana", Font.PLAIN, 15));
           b1.setBounds(130, 200, 300, 30);
           //b1.setFont(new Font("Verdana", Font.PLAIN, 25)); 

        }
    }
    });
        b2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae){
            JFrame f3 = new JFrame("Transaction History");
            JLabel l2 = new JLabel();
            l2.setText("No Transaction History Yet!");
            l2.setBounds(10,180,200,20);
            l2.setFont(new Font("Verdana", Font.PLAIN, 15));
            f3.add(l2);
            f3.setSize(500, 400);
            f3.setBackground(Color.MAGENTA);
            f3.getContentPane().setBackground(Color.pink);
            f3.setVisible(true);
            f3.setLayout(null);
            //f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            
        }
    });
    b3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            JFrame f3 = new JFrame("Withdraw");
            JLabel l2 = new JLabel();
            l2.setText("Enter amount : ");
            l2.setFont(new Font("Verdana", Font.PLAIN, 15));
            l2.setBounds(80, 80, 200, 20);
            //l2.setFont(new Font("Verdana", Font.PLAIN, 15));
            f3.add(l2);
            
            JTextField tf3 = new JTextField("$$$$");
            tf3.setBounds(200, 80, 90, 20);
            f3.add(tf3);
            
            
            b7.setBounds(10, 40, 100, 20);
            b7.setBackground(Color.RED);                
            f3.add(b7);
            f3.setSize(500, 400);
            f3.setBackground(Color.MAGENTA);
            f3.getContentPane().setBackground(Color.pink);
            f3.setVisible(true);
            f3.setLayout(null);

        }
    });
        b4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae){
            JFrame f3 = new JFrame("Deposit amount");
            JLabel l2 = new JLabel();
            l2.setText("Enter amount : ");
            l2.setFont(new Font("Verdana", Font.PLAIN, 15));
            l2.setBounds(80, 80, 200, 20);
            //l2.setFont(new Font("Verdana", Font.PLAIN, 15));
            f3.add(l2);
            
            JTextField tf3 = new JTextField("-amount-");
            tf3.setBounds(200, 80, 100, 20);
            tf3.setFont(new Font("Verdana", Font.PLAIN, 15));
            f3.add(tf3);
            
            
            b7.setBounds(10, 40, 100, 20);
            b7.setBackground(Color.RED);                
            f3.add(b7);
            f3.setSize(500, 400);
            f3.setBackground(Color.MAGENTA);
            f3.getContentPane().setBackground(Color.pink);
            f3.setVisible(true);
            f3.setLayout(null);

        }
    });
    b5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae){
            JFrame f3 = new JFrame("Transfer");
            JLabel l2 = new JLabel();
            l2.setText("Enter amount:");
            l2.setFont(new Font("Verdana", Font.PLAIN, 15));
            l2.setBounds(40, 50, 300, 20);
            //l2.setFont(new Font("Verdana", Font.PLAIN, 15));
            f3.add(l2);
            
            JTextField tf3 = new JTextField("$$$$");
            tf3.setBounds(190, 50, 60, 25);
            f3.add(tf3);

            l3.setText("Account number:");
            l3.setFont(new Font("Verdana", Font.PLAIN, 15));
            l3.setBounds(40, 70, 300, 20);
            //l2.setFont(new Font("Verdana", Font.PLAIN, 15));
            f3.add(l3);
            
            JTextField tf4 = new JTextField("0000");
            tf4.setBounds(190, 70, 50, 25);
            f3.add(tf4);
            
            
            b7.setBounds(100, 120, 100, 20);
            b7.setBackground(Color.RED); 
            b7.setFont(new Font("Verdana", Font.PLAIN, 18));               
            f3.add(b7);
            f3.setSize(500, 400);
            f3.setBackground(Color.MAGENTA);
            f3.getContentPane().setBackground(Color.pink);
            f3.setVisible(true);
            f3.setLayout(null);

        }
    });
    b7.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae){
            JFrame f4 = new JFrame("confirmation");
            JLabel l3 = new JLabel("If Operation done then click OK");
            l3.setFont(new Font("Verdana", Font.PLAIN, 15));
            
            l3.setBounds(80, 50, 300, 20);
            b8.setText("OK");
            b8.setFont(new Font("Verdana", Font.PLAIN, 15));
            f4.add(l3);
            f4.add(b8);
            f4.setSize(500, 400);
            f4.setBackground(Color.MAGENTA);
            f4.getContentPane().setBackground(Color.pink);
            f4.setVisible(true);
            f4.setLayout(null);

            
        }
    });

    b8.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae){
        JFrame frame = new JFrame("Exit");
        b8.setText("Thank You");
        b8.setFont(new Font("Verdana", Font.PLAIN, 15));
        b8.setBounds(10, 10, 50, 20);
        frame.add(b8);
        b8.setBorder(BorderFactory.createLineBorder(Color.blue));
        frame.setSize(500, 400);
        frame.setBackground(Color.MAGENTA);
        frame.getContentPane().setBackground(Color.pink);
        frame.setVisible(true);
        frame.setLayout(null);
    }
}); 

    b6.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae){
            JFrame frame = new JFrame("Exit");
            b8.setText("Thank You");
            b8.setBounds(10, 10, 50, 20);
            frame.add(b8);
            b8.setBorder(BorderFactory.createLineBorder(Color.blue));
            frame.setSize(500, 400);
            frame.setBackground(Color.MAGENTA);
            frame.getContentPane().setBackground(Color.pink);
            frame.setVisible(true);
            frame.setLayout(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
    });

    f.setSize(500, 400);
    f.setBackground(Color.MAGENTA);
    f.getContentPane().setBackground(Color.pink);
    f.setVisible(true);
    f.setLayout(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
   } 
}
//use id = 123456
//password = 7890
