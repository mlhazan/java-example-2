package Bitwise;
/**
 * A = +12 = 0000 1100
 * B = +05 = 0000 0101
 * --------------------
 *           0000 0100 =4
 * @author Hasan
 */
public class AND {

     public static void main(String[] args) {
          byte a = 12;
          byte b = 5;
          byte c = (byte)(a & b);

          System.out.println("a & b = " + c);
     }

}
