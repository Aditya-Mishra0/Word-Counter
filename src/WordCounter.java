import javax.swing.*;
import java.awt.*;

public class WordCounter {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Word Counter") ;
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setBounds(100,100,500,500);

        JLabel label = new JLabel("Enter Words ") ;
        label.setFont(new Font("Times New Roman", Font.BOLD ,25));
        label.setBounds(50,20,150,25);

        JTextArea textArea = new JTextArea() ;
        textArea.setBounds(50,50,375,200);
        textArea.setFont(new Font("Serif",Font.PLAIN,18 ));

        JButton button = new JButton("Count") ;
        button.setBounds(345,265,80,40);

        button.addActionListener(e -> {
        String text = textArea.getText().trim() ;

        if(!text.isEmpty()){
            String [] word = text.trim().split("\\s+") ; //trim to remove any space between the numbers
            JOptionPane.showMessageDialog(jFrame,"Total Words: " +word.length);
        }
        else{
            JOptionPane.showMessageDialog(jFrame,"Please Enter Text. ","Warning",JOptionPane.WARNING_MESSAGE);
        }
        });

        jFrame.add(label) ;
        jFrame.add(textArea) ;
        jFrame.add(button) ;

        jFrame.setVisible(true);

    }
}
