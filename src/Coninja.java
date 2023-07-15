import java.util.Scanner;

public class Coninja {
    public static boolean printlval(String str ){

return true;
          }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        String str[] =new String[n] ;
        for (int i = 0; i < str.length; i++) {
            str[i]= sc.nextLine();
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
    }}
}
