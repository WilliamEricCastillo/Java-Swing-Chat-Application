import javax.swing.*;
import java.awt.event.*;
public class Chatter implements ActionListener {
    JTextField chat_display, user_input;
    JButton send_button;

    JTextArea area;
    Chatter() {
        JFrame f = new JFrame();

        //displays conversation
        chat_display = new JTextField();
        chat_display.setBounds(10, 20, 300, 350);
        chat_display.setEditable(false);


        //input field for chat user
        user_input = new JTextField();
        user_input.setBounds(10, 400, 300, 50);

        //send button
        send_button = new JButton("Send");
        send_button.setBounds(330, 400, 50, 50);

        //
        send_button.addActionListener(this);

        // adds each object to jframe
        f.add(chat_display);
        f.add(user_input);
        f.add(send_button);

        //sets entire chat session size
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = user_input.getText();
        chat_display.setText(input);
    }

    public static void main(String[] args) {
        new Chatter();
    }
}





