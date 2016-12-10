package Bitwise;
/**
 * A = +12 = 00001100
 * 0 0 0 0 1 1 0 0 +12
 * 0 0 1 1 0 0     Shifting left 2 bits
 * 0 0 1 1 0 0 0 0 Fill empty bits with 0s
 * B = 48 = 12 x 2^2
 * @author Hasan
 */
public class ShiftLeft {

     public static void main(String[] args) {
          byte a = 12;
          byte b = (byte)(a << 2);
          System.out.println("a << 2 = "+b);
          
          /**
           * 0001 0110
           * 1011 0000
           * 
           *  011 0000
           *  100 1111
           *        +1
           *    1010000 = 80
           *   11010000 = -80
           */
          byte c = 22;
          byte d = (byte)(c << 3);
          System.out.println("c << 3 = "+d);
     }

}
