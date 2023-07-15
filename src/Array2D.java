import java.util.Scanner;

public class Array2D {
    public static boolean search(int arr[][],int key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
               if(arr[i][j]==key){
                   System.out.println("key at index "+i + ","+j);
                   return true;
               }
            }

        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

           int n = sc.nextInt();
           int m  = sc.nextInt();
           int key = 5;
        int arr[][] = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]= sc.nextInt();
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        search(arr, key);

    }
}
