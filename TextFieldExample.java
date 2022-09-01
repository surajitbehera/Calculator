import java.awt.*;
import java.awt.event.*;
public class TextFieldExample extends Frame implements ActionListener
{
    TextField tf1,tf2,tf3;
    Button b1,b2,b3,b4;
    TextFieldExample()
    {
        this.setLayout(null);
        tf1=new TextField();
        tf1.setBounds(100,50,150,40); 
        tf2=new TextField();
        tf2.setBounds(100,100,150,40);
        tf3=new TextField();
        tf3.setBounds(100,150,150,40);
        tf3.setEditable(false);
        b1=new Button("Add");
        b1.setBounds(100,200,60,45);
        b1.addActionListener(this);
        b2=new Button("Sub");
        b2.setBounds(200,200,60,45);
        b2.addActionListener(this);
        b3=new Button("Mul");
        b3.setBounds(100,250,60,45);
        b3.addActionListener(this);
        b4=new Button("Div");
        b4.setBounds(200,250,60,45);
        b4.addActionListener(this);
        add(tf1);
        add(tf2);
        add(tf3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e)
    {
        String s1=tf1.getText();
        String s2=tf2.getText();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=0;
        if(e.getSource()==b1) {
            c=a+b;
            String result=String.valueOf(c);
            tf3.setText(result);
        }
        if(e.getSource()==b2) {
            c=a-b;
            String result=String.valueOf(c);
            tf3.setText(result);
        }
        if(e.getSource()==b3) {
            c=a*b;
            String result=String.valueOf(c);
            tf3.setText(result);
        }
        if(e.getSource()==b4) {
            c=a/b;
            String result=String.valueOf(c);
            tf3.setText(result);
        }
        
    }
    public static void main(String args[])
    {
        TextFieldExample tf = new TextFieldExample();
        tf.setTitle("My text field");
        tf.setSize(400,400);
        tf.setVisible(true);
        tf.setBackground(Color.blue);
    }
}