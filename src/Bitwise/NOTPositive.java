package Bitwise;
/**
 * A = +12 = 00001100
 *For B
 *11110011 (Sign + Magnitude)
 *1110011 (Magnitude)
 *0001100 1’s Complement
 *     +1
 *0001101 2’s Complement
 *0001101 = 13
 *(C = -13) 
 * @author Hasan
 */
public class NOTPositive {

     public static void main(String[] args) {

          byte a = +12;

          byte b = (byte)~a;

          System.out.println("a & b = " + b);
     }
}
