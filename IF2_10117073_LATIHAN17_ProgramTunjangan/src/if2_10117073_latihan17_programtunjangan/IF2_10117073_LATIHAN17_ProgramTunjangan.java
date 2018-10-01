/*
NAMA    : Aji Purnomo
KELAS   : IF 2
NIM     : 10117073
Deskripsi : menghitung total gaji sesuai status menikah atau tidak menikah
 */
package if2_10117073_latihan17_programtunjangan;

import java.util.Scanner;

public class IF2_10117073_LATIHAN17_ProgramTunjangan {

      public static void main(String[] args) {
        //KAMUS
        int tunjangan;
        int gaji_total;
        //============================================== 
           
        System.out.print("Berapa Gaji Pokok Anda ? Rp.");
        Scanner input1 = new Scanner(System.in);
        String gaji_pokok = input1.next();
        int gajipokok = Integer.valueOf(gaji_pokok);
        System.out.println("Gaji pokok anda adalah Rp."+gaji_pokok);
        
        System.out.println(""); //ENTER
        
        System.out.print("Status Anda (Menikah/Belum Menikah) ? ");
        Scanner input2 = new Scanner(System.in);
        String status = input2.next();
               
        if (status.equals("Menikah") || status.equals("menikah")){
            tunjangan = (35 * gajipokok) / 100;
            gaji_total = gajipokok + tunjangan;
            System.out.println("Karena Status Anda "+status+" maka gaji total anda adalah Rp."+gaji_total);
        }//end if
        else  {
            tunjangan = 0;
            gaji_total = gajipokok + tunjangan;
            System.out.println("Karena Status Anda "+status+" maka gaji total anda adalah Rp. "+gaji_total);
        }
                       
    }
    
}
