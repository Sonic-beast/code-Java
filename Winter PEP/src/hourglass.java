import java.util.Scanner;

public class hourglass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        int rows=(num*2)-1;
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=num;j++) {

                if(i<=num){
                    if( j<=i-1){
                        System.out.print(" ");
                    }else{
                        System.out.print(" *");
                    }
                }else{
                    if(j<=rows-i){
                        System.out.print(" ");
                    }else{
                        System.out.print(" *");
                    }
                }

            }
            System.out.println();
        }
    }
}

//11111  1
//01111  2
//00111  3
//00011  4
//00001  5
//00011  6 rows-i 9-6
//00111  7 9-7
//01111  8 9-8
//11111  9 5-5=0



//9
//13
//172
//191
//7
//258
