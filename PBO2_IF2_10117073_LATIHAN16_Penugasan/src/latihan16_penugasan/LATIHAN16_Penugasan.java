/*
NAMA    : Aji Purnomo
KELAS   : IF 2
NIM     : 10117073
Deskripsi program :
 */
package latihan16_penugasan;
public class LATIHAN16_Penugasan {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 0;
        
        System.out.println("Nilai a = "+a);
        System.out.println("Nilai b = "+b);
        System.out.println("Nilai c = "+c +"\n");
    c = a + b;
    System.out.println("c = a + b = "+c);
    
    c += a;
    System.out.println("c += a = "+c);
            
    c -= a;        
    System.out.println("c -= a + "+c);
    
    c *= a;        
    System.out.println("c *= a = "+c);
    
    a = 10;
    c = 15;
    c /= a;
    System.out.println("c /= a = "+c);
    
    a = 10;
    c = 15;
    c %= a;
    System.out.println("c %= a = "+c);
    c <<= 2;
     System.out.println("c <<= 2 = "+c);
     c >>= 2;
      System.out.println("c >>= 2 = "+c);
      c >>= 2;
       System.out.println("c >>= a = "+c);
       c &=a;
        System.out.println("c &= 2 = "+c);
        c ^= a;
         System.out.println("c ^= a = "+c);
         c |= a;
          System.out.println("c |= a = "+c);
               
    }
    
}
