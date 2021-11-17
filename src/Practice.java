import javax.swing.*;


public class Practice {
    public static void main(String[] args) {
        JFrame myframe = new JFrame();
        JPanel mypanel = new JPanel();
        JButton click = new JButton("Click");
        JLabel name =  new JLabel("SCHOOL OF EXCELLENCE");

        click.setSize(100,50);
        click.setLocation(200,200);
        name.setSize(150,200);
        name.setLocation(150,0);

        myframe.setSize(500,500);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        mypanel.setSize(500,500);
        mypanel.add(click);
        mypanel.add(name);
        mypanel.setLayout(null);

        myframe.add(mypanel);
        myframe.setLocationRelativeTo(null);

        myframe.setVisible(true);
    }
}