public class Main {
    public static void main(String[] args) {
        QUEUE stuff = new QUEUE();
        stuff.enqueue("abc");
        stuff.enqueue("dac");
        System.out.println(stuff.getQueue());
        System.out.println(stuff.dequeue());
        System.out.println(stuff.getQueue());


        STACK stuff2 = new STACK();
        stuff2.enqueue("abc");
        stuff2.enqueue("dac");
        System.out.println(stuff2.getQueue());
        System.out.println(stuff2.dequeue());
        System.out.println(stuff2.getQueue());


    }
}