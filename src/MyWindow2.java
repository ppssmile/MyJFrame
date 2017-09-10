import javax.swing.*;
import java.awt.*;

public class MyWindow2 extends JFrame {
    public MyWindow2(){
        setTitle("MyWindow1. PAGE_?");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        setLayout(new GridBagLayout());
        JButton[] button=new JButton[7];
        button[0]=new JButton("PAGE_START");
        button[0].setPreferredSize(new Dimension(100,50));
        add(button[0]/*, new BorderLayout().PAGE_START*/);
        button[1]=new JButton("PAGE_END");
        button[1].setPreferredSize(new Dimension(100,100));
        add(button[1]/*, new BorderLayout().PAGE_END*/);// Аналог AFTER_LAST_LINE
        button[2]=new JButton("PAGE_START");
        button[2].setPreferredSize(new Dimension(100,200));
        add(button[2]/*, new BorderLayout().LINE_START*/);
        button[3]=new JButton("LINE_END");
        button[3].setPreferredSize(new Dimension(100,200));
        add(button[3]/*, new BorderLayout().LINE_END*/);//Аналог AFTER_LINE_ENDS
        button[6]=new JButton("Center");
        button[6].setPreferredSize(new Dimension(100, 100));
        add(button[6]/*, new BorderLayout.CENTER*/);
        button[4]=new JButton("AFTER_LAST_LINE");
        button[4].setPreferredSize(new Dimension(100,50));
        add(button[4]/*, new BorderLayout().AFTER_LAST_LINE*/);
        button[5]=new JButton("AFTER_LINE_ENDS");
        add(button[5]/*, new BorderLayout().AFTER_LINE_ENDS*/);
        setVisible(true);

    }
    public void add(){

    }
}
