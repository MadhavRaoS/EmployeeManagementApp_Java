package employee.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {

    Splash(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.gif"));
        Image i2 = i1.getImage().getScaledInstance(1152,648, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1152,648);
        add(image);


        setSize(1152,648);
        setLocation(200,50);
        setLayout(null);
        setVisible(true);

        try{
            Thread.sleep(3000);
            setVisible(false);
            new Login();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Splash();
    }
}