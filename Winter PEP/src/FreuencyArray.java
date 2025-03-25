import java.util.ArrayList;

public class FreuencyArray {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        int target=4;
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(4);
        int count=0;
        for(int i:list){
            if(i==target){
                count++;
            }
        }
        System.out.println(count);

    }
}
