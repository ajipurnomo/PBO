/*
 * NAMA       : AJI PURNOMO
 * KELAS      : IF2
 * MATAKULIAH : PBO2
 * NIM        : 10117073
 * DESKRIPSI PROGRES : Program ini berisi program penggunaan formating
 */
package pbo2.pkg10117073.latihan11.formating;

public class PBO210117073LATIHAN11FORMATING {

    public static void main(String[] args) {
        int i = 3546764;
        int iMinus = -i;
        System.out.println("i : " + i);
        System.out.printf("%%d : %d%n", i);
        System.out.printf("%%10d : %10d%n", i);
        System.out.printf("%%+10d : %+10d%n", i);
        System.out.printf("%%+10d : %+10d%n", iMinus);
        System.out.printf("%%,10d : %,10d%n", i);
        System.out.printf("%%-10d : %-10d%n", i);
        double f = 5675482.982;
        System.out.println("f : f" + f);
        System.out.printf("%%f : %f%n", f);
        System.out.printf("%%.2f : %.2f%n", f);
        System.out.printf("%%12.2f : %12.2f%n", f);
        System.out.printf("%%,12.2f : %,12.2f%n", f);
    }
    
}
