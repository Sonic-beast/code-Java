import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class mergetwolist {
    public static void main(String args[]){
        ArrayList<Integer> arrL=new ArrayList<>();
        ArrayList<Integer> arrL2=new ArrayList<>();
        arrL.add(20);
        arrL.add(40);
        arrL.add(50);
        arrL2.add(10);
        arrL2.add(30);
        arrL2.add(60);
        for(int i=0;i<arrL2.size();i++){
            arrL.add(arrL2.get(i));
        }
        System.out.println(arrL);
//        arrL.add(arrL2);  // arraylist inside arraylist
        Collections.sort(arrL); //sorting
        System.out.println(arrL);


    }
}
