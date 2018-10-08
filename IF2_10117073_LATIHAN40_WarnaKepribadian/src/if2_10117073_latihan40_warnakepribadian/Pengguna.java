/*
NAMA   : AJI PURNOMO
NIM    : 10117073
KELAS  : IF 2

 */
package if2_10117073_latihan40_warnakepribadian;

import java.util.Scanner;
public class Pengguna {
    public String namaUser;
    Scanner scn = new Scanner(System.in);

    public void memasukkanNama() {
        System.out.print("NAMA KAMU : ");
        namaUser = scn.next();
}
}
