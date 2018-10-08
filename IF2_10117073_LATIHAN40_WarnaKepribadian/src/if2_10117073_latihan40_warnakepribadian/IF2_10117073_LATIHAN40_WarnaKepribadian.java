/*
NAMA   : AJI PURNOMO
NIM    : 10117073
KELAS  : IF 2
Deskripsi : program untuk mengetahui kepribadian orang berdasarkan warna pilihannya
 */
package if2_10117073_latihan40_warnakepribadian;

import java.util.Scanner;
public class IF2_10117073_LATIHAN40_WarnaKepribadian {

    public static void main(String[] args) {
        Warna wrn = new Warna();
        Pengguna usr = new Pengguna();
        Scanner scn = new Scanner(System.in);

        wrn.menampilkanTemplate();
        wrn.pilihWarnaFavorit();
        usr.memasukkanNama();

        System.out.println("\n====HASIL TEST KEPRIBADIAN "+ usr.namaUser.toUpperCase()+"====");
        wrn.tesKepribadian(wrn.namaWarna,usr.namaUser);
    }
    
}
