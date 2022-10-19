package team25.team25;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


public class Information implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String message = "ФИО и номера зачетных книжек\n";
        message += "-------------------------------\n";
        message += "Налигацкий Евгений | 20150096\n";
        message += "Аминев Алексей | 20130087\n";
        message += "Вяхирев Алексей | 20130485\n";
        
        JOptionPane.showMessageDialog(null, message , "Сообщение" , JOptionPane.PLAIN_MESSAGE);
    }
}