import java.util.Scanner;

public class leftanglepattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++) {
                if(j>num-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }
    }
}
