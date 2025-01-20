import java.util.Scanner;

public class conversion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
//        int x=Integer.parseInt(str);
//        System.out.println(x+4);
        int num=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            int x=Character.getNumericValue(c);
            int power=str.length()-1-i;
            num=num+ (int)(x*Math.pow(10,power));
        }
        System.out.println(num);
    }
}

