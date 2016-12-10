package Bitwise;
/**
 * a = 000 1010
 *     111 0101----1s Complement
 *           +1
 * ------------
 *     111 0110
 *    
 *    1111 0110 add 1 at left for negative
 * ^b=0000 1001 =9
 * @author Hasan
 */
public class NOTNegative {

     public static void main(String[] args) {

          byte a = -10;

          byte b = (byte)~a;

          System.out.println("^b = " + b);
     }
}
