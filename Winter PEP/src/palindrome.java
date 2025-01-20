import java.util.Scanner;

public class palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.next();
        String s1="";
        for(int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            String x=String.valueOf(c);
            s1=s1.concat(x);
        }
        System.out.println(s1);
        if(str.equals(s1)){
            System.out.println("Its palindrome");
        }else{
            System.out.println("ITs not a palindrome");
        }
    }
}
