/*
 NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menghitung gaji total pegawai 

 */
package if2_10117073_latihan43_gajipegawai;

import java.util.Scanner;

public class IF2_10117073_LATIHAN43_GajiPegawai {

 
    public static void main(String[] args) {
        GajiPegawai gajipeg = new GajiPegawai();
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");   
        gajipeg.totalGaji(gajipeg.getUangTransport(), gajipeg.getUangTunjangan(), gajipeg.getGajiPokok());
         gajipeg.tampilData("Rizki Adam Kurniawan", "Jalan Semar dlm 4 No 72/66", 
                            (250000),(300000),(4500000),(gajipeg.totalGaji(250000, 300000, 4500000)));                           
        
         
         
         
         
         
         
       /*
        System.out.println("Nama Karyawan  : ");
         gajipeg.setNama("Rizki Adam Kurniawan");
        System.out.println("Alamat         : ");
         gajipeg.setAlamat("Jalan Semar dlm 4 No 72/66");
        System.out.println("Uang Transport : ");
         gajipeg.setUangTransport(250000);
        System.out.println("Uang Tunjangan : ");
         gajipeg.setUangTunjangan(300000);
        System.out.println("Gaji Pokok : ");
         gajipeg.setGajiPokok(4500000);
       */
       // System.out.println("TOTAL GAJI : "+gajipeg.totalGaji(gajipeg.getUangTransport(), 
          //                 gajipeg.getUangTunjangan(),gajipeg.getGajiPokok()));
                           
    }
    
}
