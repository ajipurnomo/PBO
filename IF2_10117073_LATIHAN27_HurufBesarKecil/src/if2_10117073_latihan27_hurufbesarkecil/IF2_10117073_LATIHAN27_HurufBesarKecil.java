/*
NAMA    : Aji Purnomo
KELAS   : IF 2
NIM     : 10117073
Deskripsi : mengubah kalimat inputan user menjadi huruf besar atau huruf kecil
 */
package if2_10117073_latihan27_hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class IF2_10117073_LATIHAN27_HurufBesarKecil {
    public static void main(String[] args) {
       String kalimat;
        System.out.print("Masukkan Kalimat : ");
        Scanner scn = new Scanner(System.in);
        kalimat = scn.nextLine();
        
        String kalimatUpper = kalimat.toUpperCase();
        String kalimatLower = kalimat.toLowerCase();
        System.out.println("===HASIL FORMATTING===");
        System.out.println("Huruf BESAR : "+kalimatUpper);
        System.out.println("Huruf KECIL : "+kalimatLower);
       
    }
    
}
