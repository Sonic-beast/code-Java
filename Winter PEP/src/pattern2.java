import java.util.Scanner;

public class pattern2 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i=i+2){
            int x=(num-i)/2;
            for(int k=1;k<=x;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


//        for (int i = 1; i <= num; i++) {
//            for (int j = i; j <= num-i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= (2 * i - 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}


//5-1/2
//5-3/2
