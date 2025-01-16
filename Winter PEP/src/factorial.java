import java.util.Scanner;
public class factorial {
    public int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int x=sc.nextInt();
        factorial f=new factorial();
        System.out.println(f.fact(x));

    }
}
