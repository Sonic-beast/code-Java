import java.util.Scanner;
import java.math.*;

public class armstrng {
            public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a num: ");
                int num2 = sc.nextInt();
                int num = num2,num1=num2;
                int digit = 0;
                int res=0;
                while (num != 0) {
                    num = num / 10;
                    digit++;
                }
                while(num1!=0) {
                    int x = num1 % 10;
                    double y = Math.pow(x, digit);
                    res += y;
                    num1 = num1 / 10;
                }

                if(res==num2){
                System.out.println("its an armstrong number");
                }else{
                    System.out.println("not an armstrong");
                }
            }
        }

