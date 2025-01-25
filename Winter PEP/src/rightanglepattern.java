import java.util.Scanner;

public class rightanglepattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i || i==num){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }
    }
}
