import java.util.TreeSet;

public class treeset {
    public static void main(String args[]){
        TreeSet<String> set=new TreeSet<>();
        set.add("Zebra");
        set.add("Apple");
        set.add("Mango");
        System.out.println(set);
        System.out.println(set.getFirst());
        System.out.println(set.getLast());


    }
}
