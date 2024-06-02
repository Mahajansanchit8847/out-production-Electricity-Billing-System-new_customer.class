
package elecctricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{
String atype ,meter;
Project(String atype , String meter){
    this.atype=atype;
    this.meter=meter;
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/elect1.jpg"));
    Image i2 = i1.getImage().getScaledInstance(1300, 700, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image=new JLabel(i3);
    add(image);
    
    JMenuBar mb = new JMenuBar();
    setJMenuBar(mb);
    
    
    JMenu master = new JMenu("Master");
    master.setForeground(Color.BLUE);
   
    
    JMenuItem newcustomer  = new JMenuItem("New Customer");
    newcustomer.setFont(new Font ("monospaced", Font.PLAIN, 12 ));
    newcustomer.setBackground(Color.WHITE);
    ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
    Image image1 =icon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    newcustomer.setIcon(new ImageIcon(image1));
    newcustomer.setMnemonic('D');
    newcustomer.addActionListener(this);
    newcustomer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));   
    master.add(newcustomer);
    
      JMenuItem customerdetails  = new JMenuItem("Customer Details");
    customerdetails.setFont(new Font ("monospaced", Font.PLAIN, 12 ));
    customerdetails.setBackground(Color.WHITE);
   ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icon/icon2.png"));
    Image image2 =icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    customerdetails.setIcon(new ImageIcon(image2));
    customerdetails.setMnemonic('M');
    customerdetails.addActionListener(this);
    customerdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));   
    master.add(customerdetails);
    
    JMenuItem depositedetails = new JMenuItem("Deposite Details");
    depositedetails.setFont(new Font ("monospaced", Font.PLAIN, 12 ));
    depositedetails.setBackground(Color.WHITE);
   ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("icon/icon3.png"));
    Image image3 =icon3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    depositedetails.setIcon(new ImageIcon(image3));
    depositedetails.setMnemonic('C');
       depositedetails.addActionListener(this);
    depositedetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));   
    master.add(depositedetails);
    
     JMenuItem calculatebills = new JMenuItem("Calculate bills");
    calculatebills.setFont(new Font ("monospaced", Font.PLAIN, 12 ));
    calculatebills.setBackground(Color.WHITE);
   ImageIcon icon4= new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
    Image image4=icon4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    calculatebills.setIcon(new ImageIcon(image4));
    calculatebills.setMnemonic('A');
     calculatebills.addActionListener(this);
    calculatebills.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));   
    master.add(calculatebills);
    
    JMenu info = new JMenu("information");
    info.setForeground(Color.RED);
    
    JMenuItem updateinformation = new JMenuItem("Update information");
    updateinformation.setFont(new Font ("monospaced", Font.PLAIN, 12 ));
    updateinformation.setBackground(Color.WHITE);
   ImageIcon icon5= new ImageIcon(ClassLoader.getSystemResource("icon/icon5.png"));
    Image image5=icon5.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    updateinformation.setIcon(new ImageIcon(image5));
    updateinformation.setMnemonic('E');
     updateinformation.addActionListener(this);
    updateinformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));   
    info.add(updateinformation);
    
    JMenuItem viewinformation = new JMenuItem("View information");
    viewinformation.setFont(new Font ("monospaced", Font.PLAIN, 12 ));
    viewinformation.setBackground(Color.WHITE);
   ImageIcon icon6= new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
    Image image6=icon6.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    viewinformation.setIcon(new ImageIcon(image6));
    viewinformation.setMnemonic('W');
     viewinformation.addActionListener(this);
    viewinformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));   
    info.add(viewinformation);
    
     JMenu user = new JMenu("User");
    user.setForeground(Color.BLUE);
  
    
    JMenuItem paybills = new JMenuItem("Pay Bills");
    paybills.setFont(new Font ("monospaced", Font.PLAIN, 12 ));
    paybills.setBackground(Color.WHITE);
   ImageIcon icon7= new ImageIcon(ClassLoader.getSystemResource("icon/icon7.png"));
    Image image7=icon7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    paybills.setIcon(new ImageIcon(image7));
    paybills.setMnemonic('I');
    paybills.addActionListener(this);
    paybills.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));   
    user.add(paybills);
    
    JMenuItem billdetails = new JMenuItem("Bill details");
    billdetails.setFont(new Font ("monospaced", Font.PLAIN, 12 ));
    billdetails.setBackground(Color.WHITE);
   ImageIcon icon8= new ImageIcon(ClassLoader.getSystemResource("icon/icon8.png"));
    Image image8=icon8.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    billdetails.setIcon(new ImageIcon(image8));
    billdetails.setMnemonic('P');
     billdetails.addActionListener(this);
    billdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));   
    user.add(billdetails);
    
    JMenu report = new JMenu("Reports");
    report.setForeground(Color.RED);
   
    
    JMenuItem generatebills= new JMenuItem("Generate Bills");
    generatebills.setFont(new Font ("monospaced", Font.PLAIN, 12 ));
    generatebills.setBackground(Color.WHITE);
   ImageIcon icon9= new ImageIcon(ClassLoader.getSystemResource("icon/icon9.png"));
    Image image9=icon9.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    generatebills.setIcon(new ImageIcon(image9));
    generatebills.setMnemonic('I');
    generatebills.addActionListener(this);
    generatebills.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));   
    report.add(generatebills);
    
    JMenu utility = new JMenu("Utility");
    utility.setForeground(Color.BLUE);
   
    
    JMenuItem notepad= new JMenuItem("Notepad");
    notepad.setFont(new Font ("monospaced", Font.PLAIN, 12 ));
    notepad.setBackground(Color.WHITE);
   ImageIcon icon10= new ImageIcon(ClassLoader.getSystemResource("icon/icon12.png"));
    Image image10=icon10.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    notepad.setIcon(new ImageIcon(image10));
    notepad.setMnemonic('H');
     notepad.addActionListener(this);
    notepad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));   
    utility.add(notepad);
    
     JMenuItem caluclater= new JMenuItem("Caluclater");
    caluclater.setFont(new Font ("monospaced", Font.PLAIN, 12 ));
    caluclater.setBackground(Color.WHITE);
   ImageIcon icon11= new ImageIcon(ClassLoader.getSystemResource("icon/icon9.png"));
    Image image11=icon11.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    caluclater.setIcon(new ImageIcon(image11));
    caluclater.setMnemonic('T');
       caluclater.addActionListener(this);
    caluclater.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));   
    utility.add(caluclater);
    
    JMenu mexit = new JMenu("exit");
    mexit.setForeground(Color.RED);
   
    
    JMenuItem exit= new JMenuItem("Exit");
    exit.setFont(new Font ("monospaced", Font.PLAIN, 12 ));
    exit.setBackground(Color.WHITE);
   ImageIcon icon12= new ImageIcon(ClassLoader.getSystemResource("icon/icon12.png"));
    Image image12=icon12.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    exit.setIcon(new ImageIcon(image12));
    exit.setMnemonic('B');
     exit.addActionListener(this);
    exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));   
    mexit.add(exit);
    
    if(atype.equals("admin")){
         mb.add(master);
    }else{
       mb.add(info);
       mb.add(user);
     mb.add(report);
    }
     mb.add(utility);
     mb.add(mexit);
       
      
    setLayout(new FlowLayout());
    
    setVisible(true);
}

public void actionPerformed(ActionEvent ae){
    String msg = ae.getActionCommand();
    
    
    
    
    
    
    if (msg.equals("New Customer")) {
        new NewCustomer();
    } else if (msg.equals("Customer Details")){
        new CustomerDetails();
    }else if (msg.equals("Deposite Details")){
        new DepositeDetailes();
    }else if (msg.equals("Calculate bills")){
        new Calculatebill(); 
     }else if (msg.equals("View information")){
     new ViewInformation(meter);
     }else if(msg.equals("Update information")){
         new UpdateInformation(meter);
     }else if (msg.equals("Bill details")){
    new BillDetails(meter);
   }else if ( msg.equals("Notepad")){
       try {
           Runtime.getRuntime().exec("notepad.exe");
       }catch(Exception e){
           e.printStackTrace();
       }
   }else if ( msg.equals("Caluclater")){
       try {
           Runtime.getRuntime().exec("calc.exe");
       }catch(Exception e){
           e.printStackTrace();
       }
   }else if (msg.equals("Exit")){
       setVisible(false);
       new Login();
   }else if (msg.equals("Pay Bills")){
       new PayBill(meter);
   }else if (msg.equals("Generate Bills")){
       new GenerateBill(meter);
   }
       
}
public static void main (String []args){
    new Project("","" );
    
}    
}
