import java.util.TreeMap;

public class treemap {
    public static void main(String args[]){
        TreeMap<String,Integer> map=new TreeMap<>();
        map.put("hello",5);
        map.put("ak",2);
        map.put("okay",4);
        System.out.println(map);
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.firstEntry());


    }
}
