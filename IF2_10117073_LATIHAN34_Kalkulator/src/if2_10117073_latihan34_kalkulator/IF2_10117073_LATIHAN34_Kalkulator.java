/*
NAMA   : AJI PURNOMO
NIM    : 10117073
KELAS  : IF 2
Deskripsi : program untuk menghitung dua buah angka dan meampilkan berbagai hasil operasi perhitungan
            pada kedua angka tersebut
 */
package if2_10117073_latihan34_kalkulator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IF2_10117073_LATIHAN34_Kalkulator {
    
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    Kalkulator kal = new Kalkulator();

        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        kal.value1 = scn.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kal.value2 = scn.nextDouble();

        //format dua digit di belakang koma
        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("\nHasil Penjumlahan : "+kal.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+kal.kurangBiangan());
        System.out.println("Hasil Perkalian : "+kal.kaliBilangan());
        System.out.println("Hasil Pembagian : "+df.format(kal.bagiBilangan()));
        System.out.println("Hasil Sisa : "+kal.sisaBilangan());

    }
}
    

