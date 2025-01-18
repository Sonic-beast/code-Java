import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row : ");
        int row=sc.nextInt();
        System.out.println("Enter col: ");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("Enter element for: "+"r"+i+" "+"c"+j);
                arr[i][j]=sc.nextInt();
            }
        }
        for(int []i:arr){
            for(int j:i){
                if(j<min){
                    min=j;
                }
                if(j>max){
                    max=j;
                }

            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("min element is: "+min);
        System.out.println("max element is: "+max);
    }
}
