import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Project
{
    static int num1,num2,op;        //
    static String s="";

    public static void main(String args[])
    {
        JFrame frame=new JFrame();
        JPanel pn=new JPanel();
        JTextField view=new JTextField(60);
        JButton bt1=new JButton("1");
        JButton bt2=new JButton("2");
        JButton bt3=new JButton("3");
        JButton bt4=new JButton("4");
        JButton bt5=new JButton("5");
        JButton bt6=new JButton("6");
        JButton bt7=new JButton("7");
        JButton bt8=new JButton("8");
        JButton bt9=new JButton("9");
        JButton bt0=new JButton("0");
        JButton btadd=new JButton("+");
        JButton btsub=new JButton("-");
        JButton btmp=new JButton("X");
        JButton bteq=new JButton("=");
        JButton btdv=new JButton("/");
        JButton btD=new JButton("Delete");
        JButton btC=new JButton("Clear");
        pn.setLayout(null);
        bt1.setBounds(40,60,45,30);
        bt2.setBounds(100,60,45,30);
        bt3.setBounds(160,60,45,30);
        bt4.setBounds(40,100,45,30);
        bt5.setBounds(100,100,45,30);
        bt6.setBounds(160,100,45,30);
        bt7.setBounds(40,140,45,30);
        bt8.setBounds(100,140,45,30);
        bt9.setBounds(160,140,45,30);
        bt0.setBounds(100,180,45,30);
        btadd.setBounds(240,60,45,30);
        btsub.setBounds(240,100,45,30);
        btmp.setBounds(240,140,45,30);
        btdv.setBounds(240,180,45,30);
        bteq.setBounds(240,220,45,30);
        btD.setBounds(40,220,70,30);
        btC.setBounds(130,220,70,30);
        view.setBounds(10,10,275,30);
        frame.setBounds(400,150,300,350);
        frame.setResizable(true);
        pn.add(bt1);
        pn.add(bt2);
        pn.add(bt3);
        pn.add(bt4);
        pn.add(bt5);
        pn.add(bt6);
        pn.add(bt7);
        pn.add(bt8);
        pn.add(bt9);
        pn.add(bt0);
        pn.add(btadd);
        pn.add(btsub);
        pn.add(btmp);
        pn.add(btdv);
        pn.add(btD);
        pn.add(btC);
        pn.add(bteq);
        pn.add(view);
        frame.add(pn);
        bt1.addActionListener(new  ActionListener() {
                                  public void actionPerformed(ActionEvent e)
                                  {
                                      s+=e.getActionCommand();
                                      view.setText(s);
                                  }
                              }
        );
        bt2.addActionListener(new  ActionListener() {
                                  public void actionPerformed(ActionEvent e)
                                  {
                                      s+=e.getActionCommand();
                                      view.setText(s);
                                  }
                              }
        );
        bt3.addActionListener(new  ActionListener() {
                                  public void actionPerformed(ActionEvent e)
                                  {
                                      s+=e.getActionCommand();
                                      view.setText(s);

                                  }
                              }
        );
        bt4.addActionListener(new  ActionListener() {
                                  public void actionPerformed(ActionEvent e)
                                  {
                                      s+=e.getActionCommand();
                                      view.setText(s);
                                  }
                              }
        );
        bt5.addActionListener(new  ActionListener() {
                                  public void actionPerformed(ActionEvent e)
                                  {
                                      s+=e.getActionCommand();
                                      view.setText(s);
                                  }
                              }
        );
        bt6.addActionListener(new  ActionListener() {
                                  public void actionPerformed(ActionEvent e)
                                  {
                                      s+=e.getActionCommand();
                                      view.setText(s);
                                  }
                              }
        );
        bt7.addActionListener(new  ActionListener() {
                                  public void actionPerformed(ActionEvent e)
                                  {
                                      s+=e.getActionCommand();
                                      view.setText(s);
                                  }
                              }
        );
        bt8.addActionListener(new  ActionListener() {
                                  public void actionPerformed(ActionEvent e)
                                  {
                                      s+=e.getActionCommand();
                                      view.setText(s);
                                  }
                              }
        );
        bt9.addActionListener(new  ActionListener() {
                                  public void actionPerformed(ActionEvent e)
                                  {
                                      s+=e.getActionCommand();
                                      view.setText(s);
                                  }
                              }
        );
        bt0.addActionListener(new  ActionListener() {
                                  public void actionPerformed(ActionEvent e)
                                  {
                                      s+=e.getActionCommand();
                                      view.setText(s);
                                  }
                              }
        );
        btD.addActionListener(new  ActionListener() {
                                  public void actionPerformed(ActionEvent e)
                                  {
                                      int dt=Integer.valueOf(s)/10;
                                      String sr=String.valueOf(dt);
                                      if(dt==0)
                                      {
                                          sr="";
                                      }
                                      view.setText(sr);
                                      s=sr;
                                  }
                              }
        );
        btC.addActionListener(new  ActionListener() {
                                  public void actionPerformed(ActionEvent e)
                                  {
                                      view.setText("");
                                      s="";
                                  }
                              }
        );
        btadd.addActionListener(new  ActionListener() {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        num1=Integer.valueOf(s);
                                        s="";
                                        op=1;
                                    }
                                }
        );
        btsub.addActionListener(new  ActionListener() {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        num1=Integer.valueOf(s);
                                        s="";
                                        op=2;
                                    }
                                }
        );
        btmp.addActionListener(new  ActionListener() {
                                   public void actionPerformed(ActionEvent e)
                                   {
                                       num1=Integer.valueOf(s);
                                       s="";
                                       op=3;
                                   }
                               }
        );
        btdv.addActionListener(new  ActionListener() {
                                   public void actionPerformed(ActionEvent e)
                                   {
                                       num1=Integer.valueOf(s);
                                       s="";
                                       op=4;
                                   }
                               }
        );

        bteq.addActionListener(new  ActionListener() {
                                   public void actionPerformed(ActionEvent e)
                                   {
                                       num2=Integer.valueOf(s);
                                       String Result="";
                                       if(op==1)
                                       {
                                           Result=String.valueOf(num1+num2);
                                       }
                                       else if(op==2)
                                       {
                                           Result=String.valueOf(num1-num2);
                                       }
                                       else if(op==3)
                                       {
                                           Result=String.valueOf(num1*num2);
                                       }
                                       else if(op==4)
                                       {
                                           Result=String.valueOf(num1/num2);
                                       }
                                       view.setText(Result);
                                       s=Result;
                                   }
                               }
        );
        pn.setBackground(Color.blue);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}