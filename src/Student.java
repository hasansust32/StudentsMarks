import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JPanel Main;
    private JButton calculateButton;
    private JTextField textStudentName;
    private JTextField textAvg;
    private JTextField textMark2;
    private JTextField textMark3;
    private JTextField textTotal;
    private JTextField textGrade;
    private JTextField textMark1;

    public Student() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                int m1, m2, m3, tot;
                double avg;

                m1 = Integer.parseInt(textMark1.getText());
                m2 = Integer.parseInt(textMark2.getText());
                m3 = Integer.parseInt(textMark3.getText());

//                This is changed by Hasan Mahmud



                tot = m1 + m2 + m3;
                textTotal.setText(String.valueOf(tot));

                avg = tot /3 ;
                textAvg.setText(String.valueOf(avg));

                if (avg > 50){
                    textGrade.setText("Pass");
                }
                else{
                    textGrade.setText("Fail");
                }



            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
