import javax.swing.*;
import java.beans.Visibility;
public class main {
    public static void main(String args[]){
        JFrame frame = new JFrame("Setup");
        //frame.setContentPane(new Setup().contentpane);
        frame.setContentPane(new QView().$$$getRootComponent$$$());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setTitle("OSCSuite | Siwat INC");
        frame.setVisible(true);
    }
}
