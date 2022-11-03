import java.util.ArrayList;

public class ChatServer implements Transmission{
    private final ArrayList<UGotMessages> ChattyUsers = new ArrayList<>();

    public void add(UGotMessages ChatSession)
    {
        ChattyUsers.add(ChatSession);
    }
    @Override
    public void transmit(String user, String message) {
        for(UGotMessages Chatty: ChattyUsers)
        {
            Chatty.receive(user, message);
        }
    }
}