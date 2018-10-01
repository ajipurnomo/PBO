/*
NAMA    : Aji Purnomo
KELAS   : IF 2
NIM     : 10117073
Deskripsi : membandingkan besar kecil dua buah nilai yg diinputkan oleh user
 */
package if2_10117073_latihan24_perbandinganduabuahnilai;

import java.util.Scanner;

public class IF2_10117073_LATIHAN24_PerbandinganDuaBuahNilai {
    public static void main(String[] args) {
        
        int n1;
        int n2;
        String lagi; //variabel pengontrol aktifitas
        Scanner scn = new Scanner(System.in);
        
        System.out.println("========Program Perbandingan Nilai========");
    
        do {            
            System.out.print("Masukkan nilai pertama : ");
            n1 = scn.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            n2 = scn.nextInt();
            
        // rumus perbandingan
            if (n1 > n2) {
                System.out.println("Hasil : "+n1+" Lebih BESAR dari "+n2+"\n");
            }else if(n1 < n2){
                System.out.println("Hasil : "+n1+" Lebih KECIL dari "+n2+"\n");
            }else
                System.out.println("Hasil : "+n1+" sama dengan "+n2+"\n");
                
        // ketikkan "Tidak" bila ingin berhenti aktifitas
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            lagi = scn.next();
            
            System.out.println("");//memberi jarak satu baris
        } while (!lagi.equals("Tidak")  );
    
    }//end public static
}//end public class
