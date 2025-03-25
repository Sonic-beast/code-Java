import java.util.ArrayList;

public class IntersectionArrayList {
    public static void main(String args[]){
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        a1.add(3);
        a1.add(5);
        a1.add(2);
        a1.add(6);
        a2.add(5);
        a2.add(9);
        a2.add(2);
        for(int i: a1){
            for(int j: a2){
                if(i==j){
                    res.add(j);
                }
            }
        }
        for(int i:res){
            System.out.println(i);
        }

    }
}
