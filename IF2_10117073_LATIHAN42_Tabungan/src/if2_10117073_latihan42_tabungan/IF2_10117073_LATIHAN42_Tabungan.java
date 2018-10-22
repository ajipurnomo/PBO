/*
 NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menghitung saldo tabungan setelah saldo diambil
 */
package if2_10117073_latihan42_tabungan;

import java.util.Scanner;

public class IF2_10117073_LATIHAN42_Tabungan {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);        
        System.out.println("===Program Penarikan Uang===");
     
        System.out.print("Masukkan Saldo Awal : ");
        Tabungan tabungan = new Tabungan(scn.nextInt());
        System.out.print("Jumlah Uang yang diambil : ");
        int x = scn.nextInt();
              
        System.out.println("Saldo Akhir : "+tabungan.ambilUang(x));
        
        
        
    }//public static
}

    

    

