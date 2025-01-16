import java.util.Scanner;

public class prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num=sc.nextInt();
        boolean flag=false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                flag=false;
            }else{
                flag=true;
                break;
            }
        }
        if(flag==true){
            System.out.println("Its prime");
        }else{
                System.out.println("Its not prime");
            }
        }
    }

