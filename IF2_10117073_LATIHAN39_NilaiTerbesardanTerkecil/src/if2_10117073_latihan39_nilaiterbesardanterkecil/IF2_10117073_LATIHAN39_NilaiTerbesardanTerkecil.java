/*
NAMA   : AJI PURNOMO
NIM    : 10117073
KELAS  : IF 2
Deskripsi : mengetahui nilai terbesar dan terkecil dari nilai yang diinputkan user
 */
package if2_10117073_latihan39_nilaiterbesardanterkecil;

import java.util.Scanner;

public class IF2_10117073_LATIHAN39_NilaiTerbesardanTerkecil {
    public static void main(String[] args) {
        Petugas ptg = new Petugas();
        Nilai dafNilai = new Nilai();
        Scanner scn = new Scanner(System.in);

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai=====");
        ptg.inputPetugas();
        dafNilai.inputJumlahMhs();

//        input nilai mhs
        for (int i=0; i<dafNilai.jumlahMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " = ");
            dafNilai.nilaiMhs[i] = scn.nextInt();
            dafNilai.hitungNilaiTerbesar(i);
            dafNilai.hitungNilaiTerkecil(i);
        }
        dafNilai.hasilNilaiMhs();

        System.out.println("\nNilai Terbesar adalah "+dafNilai.nBesar);
        System.out.println("Nilai Terkecil adalah "+dafNilai.nKecil);

        System.out.print("\nPetugas : "+ptg.namaPetugas+"\n");
    }
    
}
