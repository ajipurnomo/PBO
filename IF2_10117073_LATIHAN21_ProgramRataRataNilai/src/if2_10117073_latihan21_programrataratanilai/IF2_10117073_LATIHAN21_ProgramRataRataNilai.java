/*
NAMA    : Aji Purnomo
KELAS   : IF 2
NIM     : 10117073
Deskripsi : menghitung nilai rata-rata mahasiwa dengan jumlah mahasiswa ditentukan oleh user
 */
package if2_10117073_latihan21_programrataratanilai;

import java.util.Scanner;

public class IF2_10117073_LATIHAN21_ProgramRataRataNilai {
          
    public static void main(String[] args) {
        int i;
        double rata;
        double nilaitotal;
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        Scanner mahasiswa = new Scanner(System.in);
        String input_mhs = mahasiswa.next();
        int mhs = Integer.valueOf(input_mhs);
        
        i = 1;
        nilaitotal=0;
        do {
          System.out.print("Nilai Mahasiswa ke-"+ i++ +": ");
          Scanner nilai = new Scanner (System.in);
          String inputnilai = nilai.next(); 
          int input_nilai = Integer.valueOf(inputnilai);                  
           nilaitotal += input_nilai;
           rata = nilaitotal / mhs;
        } //end do
       while (i <= mhs);  
        System.out.println("");
        System.out.println("Maka, rata-rata nilainya adalah : " +rata);
              
    }//end public static
} //end public class 

