import java.math.BigDecimal;
import java.util.Scanner;
import java.math.BigDecimal;

import java.math.BigDecimal;

public class Kth {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            BigDecimal diff;


            String input1 = sc.nextLine();
            String input2 = sc.nextLine();


            BigDecimal a = new BigDecimal(input1);
            BigDecimal b = new BigDecimal(input2);


            diff = a.subtract(b);
           int decimal = Integer.parseInt(String.valueOf(diff),2);
          if(decimal%64==0){
              System.out.println("yes");
          }
          else{
              System.out.println("no");
          }

        }
    }