
package form;
import java.awt.Color;
import static javafx.scene.text.Font.font;
import javax.swing.*;

public class ResultPage {
  JFrame f=new JFrame();
  JPanel p=new JPanel();
 
  JLabel l1=new JLabel("First Name");
  JLabel l2=new JLabel("Last Name");
  JLabel l3=new JLabel("Phone");
  JLabel l4=new JLabel("Gender");
  JLabel l5=new JLabel("Patient");
  JTable t=new JTable();
  
  JLabel l01=new JLabel("First Name");
  JLabel l02=new JLabel("Last Name");
  JLabel l03=new JLabel("Phone");
  JLabel l04=new JLabel("Gender");
  JLabel l05=new JLabel("Patient");

   String s01,s02,s03,s04,s05;

    ResultPage(String s1, String s2, String s3, String s4,String s5) {
       
    s01=s1;
    s02=s2;
    s03=s3;
    s04=s4;
    s05=s5;
     
    l1.setBounds(200,50,200,200);
    l2.setBounds(200,100,200,200);
    l3.setBounds(200,150,200,200);
    l4.setBounds(200,200,200,200);
    l5.setBounds(200,250,200,200);
    
    l01.setBounds(100,50,200,200);
    l02.setBounds(100,100,200,200);
    l03.setBounds(100,150,200,200);
    l04.setBounds(100,200,200,200);
    l05.setBounds(100,250,200,200);
   
    
    l1.setText(s1);
    l2.setText(s2);
    l3.setText(s3);
    l4.setText(s4);
    l5.setText(s5);
    l01.setForeground(Color.black);    
    l02.setForeground(Color.black);
    l03.setForeground(Color.black); 
    l04.setForeground(Color.black); 
    l05.setForeground(Color.black); 
    
  
    l1.setForeground(Color.black);    
    l2.setForeground(Color.black);
    l3.setForeground(Color.black); 
    l4.setForeground(Color.black); 
    l5.setForeground(Color.black); 
  
  
    p.add(l01);
    p.add(l02);
    p.add(l03);
    p.add(l04);
    p.add(l05);
    
            
    p.add(l1);
    p.add(l2);
    p.add(l3);
    p.add(l4);
    p.add(l5);
            
   p.setBackground(Color.getHSBColor(101,600,101));

    p.setSize(700,500);
    p.setLayout(null);
    p.setVisible(true);
    
    f.add(p);
      f.setBounds(400, 100, 400,500);
    f.setSize(700,500);
    f.setLayout(null);
    
    f.setVisible(true);
    }
 
    }
