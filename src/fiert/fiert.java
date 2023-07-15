package fiert;

import java.util.Scanner;

public class fiert {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int  t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[]  = new int[n];
            int max =0 ;
            for (int i = 0; i < arr.length; i++) {
                arr[i]= sc.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr.length; j++) {
                    if(max >(arr[i]&arr[j])){
                        System.out.print(max);
                    }

                }
                System.out.println();
            }
        }
    }
}
