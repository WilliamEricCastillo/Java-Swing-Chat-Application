import javax.swing.*;
import java.awt.EventQueue;

public class Main {
    static Server server01 = new Server();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                        if ("Nimbus".equals(info.getName())) {
                            UIManager.setLookAndFeel(info.getClassName());
                            break;
                        }
                    }
                } catch (Exception e) {
                    // If Nimbus is not available, you can set the GUI to another look and feel.
                }
                server01.add(new Chatter("William", server01));
                server01.add(new Chatter("Jin", server01));
            }
        });
    }

}

