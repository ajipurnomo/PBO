/*
NAMA   : AJI PURNOMO
NIM    : 10117073
KELAS  : IF 2
Deskripsi : Menghitung tunjangan karyawan berdasarkan jumlah gaji dan status perkawinan
 */
package if2_10117073_latihan35_programtunjangan;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class IF2_10117073_LATIHAN35_ProgramTunjangan {

    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Karyawan kar = new Karyawan();

        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp. ");
        kar.gajiPokok = scn.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) :");
        kar.status = scn.next();

        kar.HasilHitung(kar.status, kar.gajiPokok);
    }
    
}
