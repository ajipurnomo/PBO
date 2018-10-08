/*
 NAMA    : Aji Purnomo
 KELAS   : IF 2
 NIM     : 10117073
Deskripsi : membuat program untuk login
 */
package if2_10117073_latihan33_userlogin;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class IF2_10117073_LATIHAN33_UserLogin {

    private static String usName;
    private static String passWord;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan Username = ");
        usName = scn.next();

        System.out.print("Masukkan Password = ");
        passWord = scn.next();

        User cek = new User();
        cek.pengecekkanLogin(usName, passWord);
    }
    
}
