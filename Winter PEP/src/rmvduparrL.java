import java.util.ArrayList;
public class rmvduparrL {
    public  static void main(String args[]){
        ArrayList<Integer> arrL=new ArrayList<>();
        arrL.add(10);
        arrL.add(20);
        arrL.add(10);
        arrL.add(30);
        arrL.add(40);
        arrL.add(20);
        arrL.add(50);
        for (int i=0;i<arrL.size();i++){
            for(int j=i+1;j<arrL.size();j++) {
                if (arrL.get(i) == arrL.get(j)) {
                    arrL.remove(j);
                }
            }
        }
        System.out.println(arrL);


    }

}
