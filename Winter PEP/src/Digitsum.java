public class Digitsum {
    public static void main(String args[]){
        int num=6312;
        int res=0;
        while(num!=0){
            int x=num%10;
            res=res+x;
            num=num/10;
        }
        System.out.println(res);

    }
}
