
package quizapplication;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start, back;
    Rules(String name){
        this.name = name;
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
        JLabel heading = new JLabel("Welcome " + name + " " + "Simple mind");
        heading.setBounds(50, 20, 700 ,30);
        heading.setFont(new Font("Viner Hand ITC ",Font.BOLD, 28));
        heading.setForeground(new Color(30, 144,254));
        add(heading);
        
        JLabel rules = new JLabel("Welcome " + name +"Simple mind");
        rules.setBounds(20, 90, 700 ,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN, 16 ));
        rules.setText(
        "<html>" +
"1. Time Limit: Set a reasonable time limit for each question to encourage quick thinking and prevent participants from looking up answers." + "<br><br>" +
"\n" +
"2. Difficulty Progression: Design the quiz to gradually increase in difficulty to maintain engagement and provide a sense of accomplishment." + "<br><br>" +
"\n" +
"3. Clear Instructions: Provide concise and unambiguous instructions for each question to avoid confusion or misinterpretation." + "<br><br>" +
"\n" +
"4. Randomization: Randomize the order of questions and answer choices to prevent participants from relying on patterns or memorization." + "<br><br>" +
"\n" +
"5. Multiple Attempts: Allow participants to attempt the quiz multiple times to promote learning and improvement." + "<br><br>" +
"\n" +
"6. Feedback: Offer informative feedback after each question, including explanations for correct and incorrect answers, to enhance learning and understanding." +"<br><br>" +
"\n" +
"7. Score Tracking: Keep track of participants' scores and display them at the end of the quiz to foster competition and motivation." +
"\n" +
  "<br><br>" + "<br><br>" +
                "<html>"
        
        
        );
        add(rules);
        
           back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
       
       
       setSize(800,650);
       setLocation(350,100);
       setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()== start){
             setVisible(false);
            new Quiz(name);
            
    }else{
            setVisible(false);
            new Login();
        }}
    public static void main(String[] args){ 
        new Rules("User");
    }
}
