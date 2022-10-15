import java.util.ArrayList;

public class QUEUE implements IQueuable{
    ArrayList<String> DeQueue;

    public QUEUE() {
        DeQueue = new ArrayList<>();
    }

    @Override
    public ArrayList<String> enqueue(String value) {
        this.DeQueue.add(value);

        return this.DeQueue;
    }

    @Override
    public String dequeue() {
        String out_string = this.DeQueue.remove(0);;

        return out_string;
    }

    @Override
    public ArrayList<String> getQueue() {
        return this.DeQueue;
    }

    @Override
    public int size() {
        return this.DeQueue.size();
    }
}
