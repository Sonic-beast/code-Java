import java.util.Scanner;

public class checkRotationString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        char[] arr1=s1.toCharArray();
        char c1=arr1[arr1.length-1];
        for(int i=arr1.length-1;i>0;i--){
            arr1[i]=arr1[i-1];
        }
        arr1[0]=c1;
        String s1m=new String(arr1);
        if(s1m.equals(s2)){
            System.out.println("Both the strings are rotated");
        }else{
            System.out.println("not rotated");
        }
        System.out.println(s1m);
    }
}
