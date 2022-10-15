import java.util.ArrayList;

public class STACK implements IQueuable{
    
    ArrayList<String> DeStack;
    String[] example ;

    public STACK() {
        DeStack = new ArrayList<>();
        example = new String[300] ;
    }
    @Override
    public ArrayList<String> enqueue(String value) {
        this.DeStack.add(0,value);

        return this.DeStack;
    }

    @Override
    public String dequeue() {
        String out_string = this.DeStack.remove(0);;

        return out_string;
    }

    @Override
    public ArrayList<String> getQueue() {
        return this.DeStack;
    }

    @Override
    public int size() {
        return this.DeStack.size();
    }

}
