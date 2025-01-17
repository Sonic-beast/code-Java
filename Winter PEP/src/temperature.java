import java.util.Scanner;

public class temperature {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int F=sc.nextInt();
        if(F<-100 && F>300){
            System.out.println("Temperature is not valid!");
        }
        System.out.println(5*(F-32)/9+" C");

    }
}
