package latihan3_memasukkan_nilai_darikeyboard;
//NAMA  : Aji Purnomo
//KELAS : IF 2

import java.util.Scanner;

//NIM   : 10117073
//Deskripsi Program : Program ini untuk mmemasukkan nilai dari keyboard, 
//                    kemudian ditampilkan ke layar
public class LATIHAN3_Memasukkan_Nilai_DariKeyboard {

    public static void main(String[] args) {
        System.out.print("Masukkan Nama Anda : ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
        
    }
    
}
