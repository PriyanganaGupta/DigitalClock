import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//import java.util.*;




public class myWindow extends JFrame
{

    private JLabel heading;
    private JLabel clockLabel;
    private Font font = new Font("", Font.BOLD,35);
 myWindow()
 {
    super.setTitle("My Clock");
    super.setSize(400,400);
    super.setLocation(300,50);
    this.GUI();
    // this.startClock();
    super.setVisible(true);
 }   


public void GUI()
{
    //gui

    heading = new JLabel("My Clock");
    clockLabel = new JLabel("clock");
    //clockLabel.setText("TESTING/");
    heading.setFont(font);
    clockLabel.setFont(font);

    this.setLayout(new GridLayout(2,1));
   this.add(heading);
   this.add(clockLabel);
}

public void startclock()
{   
    int delay=1000; //ms
    Timer timer = new Timer(delay, new ActionListener(){

        public void actionPerformed(ActionEvent e){
           // LocalDateTime now =LocalDateTime.now();
            //DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");
           //String time_formate= new Date().toString();
            clockLabel.setText(new Date().toString());

        }

    });
    timer.start();

    //ye interface actionPerformed met
      
}
}