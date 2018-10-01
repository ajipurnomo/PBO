/*
NAMA    : Aji Purnomo
KELAS   : IF 2
NIM     : 10117073
Deskripsi : mengeja nama orang per karakter huruf penyusun namanya
 */
package if2_10117073_latihan25_ejaannama;

import java.util.Scanner;

public class IF2_10117073_LATIHAN25_EjaanNama {
    
    public static void main(String[] args) {
        int i;
        int panjang;
        
        System.out.print("Masukkan Nama Depan Anda untuk Dieja : ");
        Scanner scn = new Scanner(System.in);
        String inputnama = scn.nextLine();
        panjang = inputnama.length();
         
        System.out.println("Nama yg mau dihitung : "+inputnama);
       
            
         for (i = 0; i<panjang; i++){
             System.out.println("Huruf ke-"+i+ ":"+inputnama.charAt(i));
    }
  
    }
    
}
