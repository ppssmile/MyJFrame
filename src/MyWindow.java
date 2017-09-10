import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyWindow extends JFrame {
    public MyWindow(){
        setTitle("My first window. East, North, Center, West, South");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,600,400);
        JButton[] jbt=new JButton[8];
        for(int i=0; i<jbt.length;i++){
            jbt[i]=new JButton("#"+i);
        }
        setLayout(new BorderLayout());
        add(jbt[0], BorderLayout.CENTER);
        add(jbt[1], BorderLayout.EAST);
        add(jbt[2], BorderLayout.NORTH);
        add(jbt[3], BorderLayout.WEST);
        add(jbt[4], BorderLayout.SOUTH);
//        new BoxLayout(getContentPane(), BoxLayout.X_AXIS);
//        jbt[4].setAlignmentX();
//        add(jbt[5], BorderLayout.AFTER_LAST_LINE);
//        add(jbt[0], BorderLayout.AFTER_LAST_LINE);
        setVisible(true);
    }
}
