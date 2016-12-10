package Bitwise;

import java.util.Scanner;
import java.util.Stack;

public class PrintBits {

     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Please Enter Integer");
          int input = scanner.nextInt();
          Stack stack = new Stack();
          System.out.println("The integer in Bit is :");
          int displayMask = 1 << 31;
          // System.out.println(input);
          System.out.println(displayMask);
       
          for (int j = 1; j <= 32; j++) {
               // System.out.print((displayMask & input) == 0 ? '0' : '1');
               stack.add((displayMask & input) == 0 ? '0' : '1');
               input <<= 1;

          }
          for (int j = 1; j <= 32; j++) {
               System.out.print(stack.pop());
               if (j % 8 == 0) {
                    System.out.print(" ");
               }
          }

     }
}
