import javax.swing.*;
import java.awt.event.*;
class Calculator implements ActionListener
{
JFrame frame;
JTextField t1;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18;

static double a,b,c=0;
int op;

Calculator(){
frame=new JFrame();

// Making Calculator screen
t1=new JTextField();
t1.setBounds(0,0,400,50);
frame.add(t1);

//Making Button 
b1=new JButton("7");
b1.setBounds(20,60,60,50);
frame.add(b1);

//Making Button 
b2=new JButton("8");
b2.setBounds(90,60,60,50);
frame.add(b2);

//Making Button 
b3=new JButton("9");
b3.setBounds(160,60,60,50);
frame.add(b3);

//Making Button 
b4=new JButton("+");
b4.setBounds(230,60,80,50);
frame.add(b4);
 
//Making Button
b5=new JButton("4");
b5.setBounds(20,120,60,50);
frame.add(b5);

//Making Button 
b6=new JButton("5");
b6.setBounds(90,120,60,50);
frame.add(b6);

//Making Button 
b7=new JButton("6");
b7.setBounds(160,120,60,50);
frame.add(b7);

//Making Button 
b8=new JButton("-");
b8.setBounds(230,120,80,50);
frame.add(b8);

//Making Button 
b9=new JButton("1");
b9.setBounds(20,180,60,50);
frame.add(b9);

//Making Button 
b10=new JButton("2");
b10.setBounds(90,180,60,50);
frame.add(b10);

//Making Button 
b11=new JButton("3");
b11.setBounds(160,180,60,50);
frame.add(b11);

//Making Button 
b12=new JButton("*");
b12.setBounds(230,180,80,50);
frame.add(b12);

//Making Button 
b13=new JButton("0");
b13.setBounds(20,240,60,50);
frame.add(b13);

//Making Button 
b14=new JButton(".");
b14.setBounds(90,240,60,50);
frame.add(b14);

//Making Button 
b15=new JButton("CLR");
b15.setBounds(160,240,60,50);
frame.add(b15);

//Making Button 
b16=new JButton("/");
b16.setBounds(230,240,80,50);
frame.add(b16);

//Making Button 
b17=new JButton("=");
b17.setBounds(20,300,150,50);
frame.add(b17);

//Making Button 
b18=new JButton("%");
b18.setBounds(170,300,150,50);
frame.add(b18);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);
b17.addActionListener(this);
b18.addActionListener(this);

frame.setSize(350,430);
frame.setLayout(null);
frame.setVisible(true);
frame.setTitle("Calculator");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
t1.setText(t1.getText().concat("7"));

if(e.getSource()==b2)
t1.setText(t1.getText().concat("8"));

if(e.getSource()==b3)
t1.setText(t1.getText().concat("9"));

if(e.getSource()==b5)
t1.setText(t1.getText().concat("4"));

if(e.getSource()==b6)
t1.setText(t1.getText().concat("5"));

if(e.getSource()==b7)
t1.setText(t1.getText().concat("6"));

if(e.getSource()==b9)
t1.setText(t1.getText().concat("1"));

if(e.getSource()==b10)
t1.setText(t1.getText().concat("2"));

if(e.getSource()==b11)
t1.setText(t1.getText().concat("3"));

if(e.getSource()==b13)
t1.setText(t1.getText().concat("0"));

if(e.getSource()==b14)
t1.setText(t1.getText().concat("."));

if(e.getSource()==b15)
{
String s=t1.getText();
t1.setText("");
for(int i=0;i<s.length()-1;i++)
t1.setText(t1.getText()+s.charAt(i));
}

if(e.getSource()==b4)
{
a=Double.parseDouble(t1.getText());
op=1;
t1.setText("");
}

if(e.getSource()==b8)
{
a=Double.parseDouble(t1.getText());
op=2;
t1.setText("");
}

if(e.getSource()==b12)
{
a=Double.parseDouble(t1.getText());
op=3;
t1.setText("");
}

if(e.getSource()==b16)
{
a=Double.parseDouble(t1.getText());
op=4;
t1.setText("");
}

if(e.getSource()==b18)
{
a=Double.parseDouble(t1.getText());
op=5;
t1.setText("");
}

if(e.getSource()==b17)
{
b=Double.parseDouble(t1.getText());
switch(op)
{
case 1:
c=a+b;
break;
case 2:
c=a-b;
break;
case 3:
c=a*b;
break;
case 4:
c=a/b;
break;
case 5:
c=a%b;
break;
default:
JOptionPane.showMessageDialog(frame,"Wrong");
}
String res=String.valueOf(c);
t1.setText(res);
if(e.getSource()==b15)
{
t1.setText("");
}
}
}
public static void main(String[] args){
new Calculator();
}
}




