/*
NAMA    : Aji Purnomo
KELAS   : IF 2
NIM     : 10117073
Deskripsi : menentukan nilai terbesar dan terkecil dari beberapa
            nilai mahasiswa yang dimasukkan
 */
package if2_10117073_latihan23_nilaiterbesarterkecil;

import java.util.Scanner;

public class IF2_10117073_LATIHAN23_NilaiTerbesarTerkecil {

    public static void main(String[] args) {
        int i;
        int tampilsemua;
        int nBesar, nKecil;
        
        System.out.println("=======Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=======");
        System.out.print("Masukkan Nama Petugas : ");
        Scanner nama = new Scanner (System.in);
        String inputnama = nama.next();
        
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        Scanner n = new Scanner (System.in);
        int input_n = n.nextShort();
        System.out.println("");
     
        tampilsemua =0;
         nBesar = 0;
         nKecil = 100;
         i=1;
         int inputnilai;
        do {      
            System.out.print("Masukkan Nilai Mahasiswa ke- "+ i++ +": ");
            Scanner nilai = new Scanner (System.in);
            inputnilai = nilai.nextInt();  
            
            nBesar = ((nBesar <= inputnilai)?inputnilai:nBesar);
            nKecil = ((nKecil >= inputnilai)?inputnilai:nKecil);
            }        
            while (i <= input_n);
        
        System.out.println(""); //GARIS BARU  
        System.out.println("====Hasil Nilai Mahasiswa====");
        
                 
            
        System.out.println("Nilai TERBESAR adalah : "+nBesar);
        System.out.println("Nilai TERKECIL adalah : "+nKecil);
        System.out.println(""); //GARIS BARU    
        
       
        
       
        
        
    }   
}
