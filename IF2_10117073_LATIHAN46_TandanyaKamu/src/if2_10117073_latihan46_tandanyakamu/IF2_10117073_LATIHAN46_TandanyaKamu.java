/*
 NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk mendeskripsikan orang sesuai usianya

 */
package if2_10117073_latihan46_tandanyakamu;

import java.util.Scanner;


public class IF2_10117073_LATIHAN46_TandanyaKamu {
    public static void main(String[] args) {
        Age usia = new Age(0);
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan Tahun Lahir Anda : ");
        usia.setYearBirth(scn.nextInt());
        
        System.out.println("===Hasil Perhitungan Umur===");
        System.out.println("Tahun Lahir Anda : "+usia.getYearBirth());
        System.out.println("Hari Ini Tahun : "+usia.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah : "+usia.hitungUmur(0)+" tahun");
        
        System.out.println("Tandanya Kamu "+usia.tandanyaKamu(usia.hitungUmur(0)));
    }
    
}
