import java.util.Scanner;

public class diamond {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        for(int i=1;i<=(num*2)-1;i++){
            for(int j=1;j<=num;j++) {

                if(i>num){
                        if(j<=i-num){
                            System.out.print(" ");
                        }else {
                            System.out.print(" *");
                        }
                }else{
                    if(j>num-i){
                        System.out.print(" *");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
                System.out.println();
        }
    }
}
//00001
//00011
//00111
//01111
//11111
//01111 6
//00111 7
//00011
//00001
