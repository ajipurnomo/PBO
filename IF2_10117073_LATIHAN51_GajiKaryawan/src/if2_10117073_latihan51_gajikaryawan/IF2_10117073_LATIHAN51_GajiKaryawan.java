/*NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk mengitung gaji karyawan

 */
package if2_10117073_latihan51_gajikaryawan;

import java.util.Scanner;

public class IF2_10117073_LATIHAN51_GajiKaryawan {

    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan();
        Manager manager = new Manager();
        System.out.println("===Program Perhitungan Gaji Karyawan===");
        Scanner input = new Scanner(System.in);
       
        System.out.print("Masukkan NIK : ");
        karyawan.setNik(input.nextLine());
        System.out.print("Masukkan Nama : ");
        karyawan.setNama(input.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        karyawan.setGolongan(input.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        karyawan.setJabatan(input.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        manager.setKehadiran(input.nextInt());
        System.out.println("");//=====================
        System.out.println("===Hasil Perhitungan===");
        System.out.println("NIK  : "+karyawan.getNik());
        System.out.println("NAMA : "+karyawan.getNama());
        System.out.println("GOLONGAN : "+karyawan.getGolongan());
        System.out.println("JABATAN  : "+karyawan.getJabatan());      
        System.out.println("");//=====================
        System.out.println("TUNJANGAN GOLONGAN : "+manager.tunjanganGolongan(karyawan.getGolongan()));
        System.out.println("TUNJANGAN JABATAN : "+manager.tunjanganJabatan(karyawan.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : "+manager.tunjanganKehadiran(manager.getKehadiran()));
        System.out.println("");//========================
        System.out.println("GAJI TOTAL : Rp"+manager.gajiTotal());
        
        
        
    }
    
}
