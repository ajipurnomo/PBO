/*
NAMA    : Aji Purnomo
KELAS   : IF 2
NIM     : 10117073
Deskripsi : Mengganti kata tertentu yg sudah dimasukkan user di dalam kalimat 
 */
package if2_10117073_latihan28_gantikata;

import java.util.Scanner;


public class IF2_10117073_LATIHAN28_GantiKata {

    public static void main(String[] args) {
        String kalimat1;
        String kalimat2;
        String pilihkata;
        String jadikata;
        
        System.out.println("===Program Mengganti Kata===");
        System.out.print("Masukkan Kalimat : ");
        Scanner scn = new Scanner(System.in);
        kalimat1 = scn.nextLine();
         
        
        String katabaru;
        System.out.print("Ganti kata : ");
        Scanner scn1 = new Scanner(System.in);
        pilihkata = scn1.nextLine();
        
        System.out.print("Menjadi kata : ");
        Scanner scn2 = new Scanner(System.in);
        jadikata = scn2.nextLine();
        
        kalimat2 = (kalimat1).replaceAll(pilihkata, jadikata);
        
        System.out.println("Kalimat Awal : "+kalimat1);
        System.out.println("Kalimat Baru : "+kalimat2);
    }
    
}
