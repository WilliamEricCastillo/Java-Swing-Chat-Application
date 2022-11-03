import javax.swing.*;
import java.awt.EventQueue;

public class Main {
    static ChatServer server01 = new ChatServer();

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
                server01.add(new Chatty("William", server01));
                server01.add(new Chatty("Jin", server01));
                server01.add(new Chatty("J-Hope", server01));
                server01.add(new Chatty("Jimin", server01));
                server01.add(new Chatty("V", server01));
                server01.add(new Chatty("Suga", server01));
                server01.add(new Chatty("RM", server01));
                server01.add(new Chatty("JK", server01));
            }
        });
    }

}

