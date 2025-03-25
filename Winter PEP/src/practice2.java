import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
public class practice2 {
    public static void main(String args[]){

        //ArrayList::::

//        ArrayList<Integer> arrL= new ArrayList<>();
//        ArrayList<String> arrl2=new ArrayList<>();
//        arrl2.add("red");
//        arrl2.add("blue");
//        arrl2.add("green");
//        System.out.println(arrl2);
//        arrl2.set(1, "yellow");
//        System.out.println(arrl2);


        //linkedList:::

//          LinkedList<String> likd=new LinkedList<>();
//          likd.add("monday");
//          likd.add("tuesday");
//          likd.add("wednesday");
//        System.out.println(likd.get(0));
//
//

        //sets:::::

//        Set<Integer> st=new HashSet<>();
        int target=5,x=0;
        int arr[]={2,5,1,3,4};
        int size=arr.length;
        for(int i=0;i<size;i++){
            if(arr[i]==target){
                x=i;
            }
        }
        for(int i=x;i<size-1;i++){
            arr[i]=arr[i+1];
        }
//        size--;


        for (int i:arr){
            System.out.println(i);
        }
    }
}
