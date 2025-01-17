import java.util.Scanner;
import java.util.ArrayList;

public class inputuntil0 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter a num: ");
        int num;
        while(true){
            num = sc.nextInt();
            if(num==0){
                System.out.println("exit");
                break;
            }
            list.add(num);
        }
        System.out.println(list);
    }
}
