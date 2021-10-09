package ru.ssau.tk.groupId.Points.testgui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleGUI extends JFrame{
   private JButton button = new JButton("тестовая кнопка");
   private JTextField input = new JTextField("", 5);
   private JLabel label = new JLabel("input");
   private JRadioButton radio1 = new JRadioButton("this");
   private JRadioButton radio2 = new JRadioButton("next");
   private JCheckBox check = new JCheckBox("Check", false); // без подтвеждения ( если true. уже проверенный чек ).
    public SimpleGUI(){
        super("Simple Example");
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label);
        container.add(input);
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);
        radio1.setSelected(true); // автоматически выбрана.
        container.add(radio2);
        container.add(check);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }
    class ButtonEventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String massage = "";
            massage+= "Button pressed \n";
            massage+= "Text is " + input.getText() + "\n";
            massage+= (radio1.isSelected()? "radio 1" : "radio2") + "is selected " + "\n";
            massage+= "Check is " + ((check.isSelected())? "checked" : "unchecked");
            JOptionPane.showMessageDialog(null, massage, "Output",JOptionPane.PLAIN_MESSAGE);
        }
    }
}
