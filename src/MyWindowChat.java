import javax.sound.sampled.LineEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindowChat extends JFrame {
    MyWindowChat(){
        //Задаем координаты начала Frame и размер
        setBounds(200,200,420,440);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);//Присваеваем значение 0 для возможности указания локальных координат и размера окон
        JPanel[] panels=new JPanel[3];// Создаем массив панелей

        panels[0]=new JPanel();// Получаем экземпляр панели
        panels[0].setLayout(new GridLayout());// Задаем режим компановщика
        panels[0].setBounds(0,0, 380, 360);// задаем размер и начальные координаты панели

        panels[1]=new JPanel();
        panels[1].setLayout(new GridLayout());
        panels[1].setBounds(0,370, 300, 25);

        panels[2]= new JPanel();
        panels[2].setLayout(new GridLayout());
        panels[2].setBounds(320,370, 70, 25);

        add(panels[0]);//добавляем панели на Frame
        add(panels[1]);
        add(panels[2]);
// Создаем и добавляем компаненты на панели
        JButton button=new JButton("Enter"); // Создать кнопку и добавить на панель
        panels[2].add(button);

        JTextArea textArea= new JTextArea();// создать текстовое поле
        JScrollPane  scrollPane= new JScrollPane(textArea);// создаем скрол-панель и сообщаем ей параметром TextArea
        panels[0].add(scrollPane);

        JTextField textField = new JTextField();
        panels[1].add(textField);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append(textField.getText()+"\n");
                textField.setText("");

            }
        });// Обработка событий нажатия Button

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append(textField.getText()+"\n");
                textField.setText("");

            }
        });

        setVisible(true);// Параметр отображения окна для пользователя
    }


}
