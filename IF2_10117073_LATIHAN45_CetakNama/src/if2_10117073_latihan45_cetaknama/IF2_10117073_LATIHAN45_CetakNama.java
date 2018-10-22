/*
 NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk mencetak nama sesuai jumlah yang kita inginkan

 */
package if2_10117073_latihan45_cetaknama;

import java.util.Scanner;


public class IF2_10117073_LATIHAN45_CetakNama {

    public static void main(String[] args) {
        System.out.println("===Aplikasi Pencetak Nama===");
        Printer print = new Printer();
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        print.setNama(scn.nextLine());
        System.out.print("Mau mencetak nama berapa kali ? : ");
        print.setJmlCetak(scn.nextInt());
        
        System.out.println("Nama Anda : "+print.getNama());
        System.out.println("Hasil Cetak :");
        
        int i = 1;
        
        while ( i <= print.getJmlCetak()) {
            System.out.println((i)+". "+print.getNama());
            i++;
        }
        
    }
    
}
