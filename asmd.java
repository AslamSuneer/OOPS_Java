import javax.swing.*;
import java.awt.event.*;

	class asmd extends JFrame implements ActionListener{

private JButton b1; //add
private JButton b2; //sub
private JButton b3; //mul
private JButton b4; //div

private JLabel l1; //for number1
private JLabel l2; //for number2
private JLabel l3; //for result
private JLabel l4; //Display Result
private JTextField t1; //to read no1
private JTextField t2; //to read no2


public asmd(){

setSize(640,480);
setLayout(null);

l1=new JLabel ("NO 1");
l2=new JLabel ("NO 2");
l3=new JLabel ("Result");
l4=new JLabel ("");
t1=new JTextField();
t2=new JTextField();
b1=new JButton("Add");
b2=new JButton("sub");
b3=new JButton("mul");
b4=new JButton("div");


l1.setBounds(100,100,200,30);
t1.setBounds(200,100,200,30);
l2.setBounds(100,140,200,30);
t2.setBounds(200,140,200,30);
add(l1);
add(t1);
add(l2);
add(t2);

b1.setBounds(100,180,70,30);
add(b1);
b2.setBounds(180,180,70,30);
add(b2);
b3.setBounds(260,180,70,30);
add(b3);
b4.setBounds(340,180,70,30);
add(b4);




l3.setBounds(100,240,100,30);
l4.setBounds(200,240,200,30);
add(l3);
add(l4);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}

public void  actionPerformed(ActionEvent e){
Integer num1=Integer.parseInt(t1.getText());
Integer num2=Integer.parseInt(t2.getText());
Integer res=0;

if(e.getSource()==b1){
 res=num1+num2;
}
else if(e.getSource()==b2){
res=num1-num2;
}
else if(e.getSource()==b3){
res=num1*num2;
}
else if(e.getSource()==b4){
res=num1/num2;
}
l4.setText(res.toString());
}
	public static void main(String args[]){
	light l=new light();
	l.setVisible(true);

}
}