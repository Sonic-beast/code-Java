import java.util.LinkedList;
import java.util.Queue;

public class linkedLqueue {
    public static void main(String args[]){
        Queue<String> Lqu=new LinkedList<>();
        Queue<Integer> Lqu2=new LinkedList<>();
        Lqu.add("ALice"); //throws exception if queue is full
        Lqu.offer("Bob"); //returns false if queue is full
        System.out.println(Lqu);
        Lqu2.offer(10);
        Lqu2.offer(20);
        Lqu2.offer(30);
        System.out.println(Lqu2);
        Lqu2.poll();
        System.out.println(Lqu2);

    }
}
