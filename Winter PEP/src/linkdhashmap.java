import java.util.LinkedHashMap;

public class linkdhashmap {
    public static void main(String args[]){
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        map.put("vikash",123);
        map.put("vaibhav",456);
        map.put("abhishek",789);
        System.out.println(map);
        map.put("vaibhav",000);
        System.out.println(map);
    }
}
