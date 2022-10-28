import java.util.ArrayList;

public class Server implements ISend{
    ArrayList<IReceive> Chatters = new ArrayList<>();

    public void add(IReceive x)
    {
        Chatters.add(x);
    }
    @Override
    public void send(String from, String message) {
        for(IReceive Chatter: Chatters)
        {
            Chatter.receive(from, message);
        }
    }
}