import java.util.PriorityQueue;

public class priorityqueueex {
    public static void main(String args[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        PriorityQueue<String> pqs=new PriorityQueue<>();
        pq.offer(10);
        pq.offer(5);
        pq.offer(20);
        pq.offer(1);
        System.out.println(pq); // random order will print
//        while (!pq.isEmpty()){   //removes and prints same element one by one
//            System.out.println(pq.poll());
//        }


        // prints smallest element using poll


        int x=pq.peek();
        for(int i:pq){
            if(x>i){
                x=i;
            }
        }
        System.out.println(x);

        //peek first element

        pqs.offer("Banana");
        pqs.offer("Apple");
        pqs.offer("Cherry");
        System.out.println(pqs);
        System.out.println(pqs.peek());
    }
}
