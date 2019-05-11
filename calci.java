import javax.swing.*;
import java.awt.event.*;

public class calci extends JFrame{
JLabel l1,l2,l3,l4;
JTextField t1,t2;
JButton b1;
void setcomponents(){
	l1=new JLabel("Addition of Two Numbers");
	l2=new JLabel("First Number");
	l3=new JLabel("Second Number");
	l4=new JLabel();
	t1=new JTextField();
	t2=new JTextField();
	b1=new JButton("Add");
	setLayout(null);
	l1.setBounds(80,20,300,10);
	l2.setBounds(50,80,100,20);
	t1.setBounds(150,80,100,20);
	l3.setBounds(50,130,100,20);
	t2.setBounds(150,130,100,20);
	b1.setBounds(80,180,100,20);
	l4.setBounds(50,240,200,20);
	b1.addActionListener(new Handler());
	
	add(l1);
	add(l2);
	add(t1);
	add(l3);
	add(t2);
	add(b1);
	add(l4);
}

class Handler implements ActionListener{
public void actionPerformed(ActionEvent e){
	int a=Integer.parseInt(t1.getText());
	int b=Integer.parseInt(t2.getText());
	int s=a+b;
	l4.setText("Result is :"+s);
}
}
	
public static void main(String []args){
calci jf=new calci();
jf.setTitle("SIMPLE CALCI");
jf.setcomponents();

jf.setSize(400,400);
jf.setVisible(true);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}