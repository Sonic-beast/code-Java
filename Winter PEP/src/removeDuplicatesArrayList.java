import java.util.ArrayList;

public class removeDuplicatesArrayList {
    public static void main(){
        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(3);
        a1.add(2);
        a1.add(2);
        a1.add(6);
        for(int i=0;i< a1.size();i++){
            for(int j=i+1;j<a1.size();j++){
                if(a1.get(i)==a1.get(j)){
                    a1.remove(j);
                }
            }
        }

        for(int i:a1){
            System.out.println(i);
        }
    }
}
