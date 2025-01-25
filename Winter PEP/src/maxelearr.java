import java.util.Scanner;

public class maxelearr {
    public static void main(String args[]) {
//        int arr[] = {3, 5, 2, 10, 9, 0};
//          int arr[]={2,5,8,0,9,3,9};

        int[] arr ={9,9,9,9,9};
        int x2; //second largest element
        int x1; //largest element
        if (arr[0] >= arr[1]) {
            x1 = arr[0];
            x2= arr[1];
        } else {
            x1 = arr[1];
            x2= arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > x1) {
                x2=x1; //5
                x1 = arr[i];
            }
            if(arr[i]>x2 && arr[i]<x1){
                x2=arr[i];
            }
        }
        if(x1==x2){
            System.out.println("element not available");
        }

//        return x2;
        System.out.println(x2);
    }
}

