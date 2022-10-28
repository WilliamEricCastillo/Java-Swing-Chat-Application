import javax.swing.*;
import java.awt.event.*;
public class Chatter implements ActionListener,IReceive {
    private JTextArea chat_display,user_input;
    private JButton send_button;

    private final String user_name;

    private final ISend server;

    Chatter(String user_name, ISend server){
        this.user_name = user_name;
        this.server = server;

        initialize();
    }

    public void initialize(){
        JFrame f = new JFrame("Chatty: " + user_name);
        f.setSize(450, 500);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setLayout(null);

        //displays conversation
        chat_display = new JTextArea();
        chat_display.setBounds(10, 20, 300, 350);
        chat_display.setEditable(false);
        chat_display.setLineWrap(true);


        //input field for chat user
        user_input = new JTextArea();
        user_input.setBounds(10, 400, 300, 50);
        user_input.setLineWrap(true);

        //send button
        send_button = new JButton("Send");
        send_button.setBounds(330, 400, 75, 50);

        //
        send_button.addActionListener(this);

        // adds each object to jframe
        f.add(chat_display);
        f.add(user_input);
        f.add(send_button);


        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        server.send(user_name,user_input.getText());
        user_input.setText("");
    }

    @Override
    public void receive(String from, String message)
    {
        chat_display.append(from + ": " + message + "\n");
    }
}






