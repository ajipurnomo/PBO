/*
NAMA    : Aji Purnomo
KELAS   : IF 2
NIM     : 10117073
Deskripsi : menghitung berbagai aspek pengukuran dari sebuah lingkaran HANYA
            dengan memasukkan ukuran diameternya saja
 */
package if2_10117073_latihan22_perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class IF2_10117073_LATIHAN22_PerhitunganLingkaran {
    public static void main(String[] args) {
        String d; // variabel untuk validasi saja
        double diameter; //variabel yg untuk operand
        double r; //jari-jari
        double L; //luas
        double K; //keliling
        
        Scanner scn = new Scanner(System.in);
        System.out.println("======Perhitungan Lingkaran======");
        
        do {            
            System.out.print("Masukkan nilai diameter lingkaran : ");
            d = scn.nextLine();
            //validasi input yang masuk
            System.out.println((!d.matches("[0-9]*"))
                               ?"Nilai Diameter Tidak Sesuai\n":"");
        } while (!d.matches("[0-9]*"));
        
        System.out.println("\n======Hasil Perhitungan Lingkaran======");
        //konversi dari string ke double, agar bisa dijumlahkan
        diameter = Double.parseDouble(d); 
        
       //RUMUS
        r = diameter/2;
        System.out.printf("Jari-jari Lingkaran = %.0f cm %n",r);
        
        L = Math.PI*r*r;
        System.out.printf("Luas Lingkaran = %.2f cm %n",L);
        
        K = 2*Math.PI*r;
        System.out.printf("Keliling Lingkaran = %.2f cm %n",K);
        
    } //public static   
}//public class
