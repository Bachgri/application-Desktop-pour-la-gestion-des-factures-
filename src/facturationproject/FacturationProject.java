package facturationproject;

import frames.MainFrame;
import java.awt.Toolkit;

public class FacturationProject {

    public static void main(String[] args) {
        MainFrame F = new MainFrame();
        F.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        F.setVisible(true);
    }    
}
