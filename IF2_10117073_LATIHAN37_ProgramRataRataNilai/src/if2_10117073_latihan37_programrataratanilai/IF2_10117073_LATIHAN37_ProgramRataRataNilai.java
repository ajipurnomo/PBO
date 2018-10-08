/*NAMA   : AJI PURNOMO
NIM    : 10117073
KELAS  : IF 2
Deskripsi : Program untuk menghitung nilai rata-rata dari beberapa nilai mahasiswa yang diinputkan oleh user
*/
package if2_10117073_latihan37_programrataratanilai;

import java.util.Scanner;
public class IF2_10117073_LATIHAN37_ProgramRataRataNilai {
    public static void main(String[] args) {
       Mahasiswa mah = new Mahasiswa();
        Scanner scn = new Scanner(System.in);

        int n;
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = scn.nextInt();

        mah.HitungTotal(mah.nilaiMhs, n);
        mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs, n);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : " + mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs, n));
        System.out.println("Developed by : Aji Purnomo");
    }
    
}
