/*
 NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menghitung kubus

 */
package if2_10117073_latihan41_massajenis;

import java.util.Scanner;

public class IF2_10117073_LATIHAN41_MassaJenis {

    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        Scanner scn = new Scanner(System.in);
        System.out.println("=====Massa Jenis Kubus=====");
        System.out.print("Sisi : ");
        kubus.setSisi(scn.nextInt());
        System.out.print("Massa : ");
        kubus.setMassa(scn.nextInt());
        System.out.println("");
        
        System.out.println("===Hasil Peritungan===");
        System.out.println("Volume      : "+kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa Jenis : "+kubus.hitungMassaJenis(kubus.getMassa(),
                                            kubus.hitungVolume(kubus.getSisi())));
         
    }
    
}
