/*
NIM     : 10117073;
Nama    : AJI PURNOMO
Kelas   : IF2
Deskripsi : program untuk mengetahui karakter toko di film detective Conan
 */
package if2_10117073_latihan59_detectiveconan;

import java.util.Scanner;
public class Karakter {
    
    public Karakter (String kar){
        
    }
public String tampilHasil (String karakter){
       String inputlagi;
              
        Tokoh tokoh = new Tokoh("");
        Scanner input = new Scanner(System.in); 
        System.out.println("");
        System.out.print("Masukkan nama tokoh : ");
        tokoh.setNama(input.nextLine());
        if (tokoh.getNama().equals("Conan") || (tokoh.getNama().equals("conan"))){
            karakter=tokoh.getNama()+" adalah orang yang penolong, baik, cerdik "
                                    + "dan pintar menelusuri kasus yang terjadi";     
            System.out.println(karakter);
        }else if (tokoh.getNama().equals("Paman") || (tokoh.getNama().equals("paman"))){
            karakter=tokoh.getNama()+" adalah orang yang genit pada wanita, suka heboh dan"
                    + " mudah panik ";                                        
            System.out.println(karakter);
        }else if (tokoh.getNama().equals("Santa") || (tokoh.getNama().equals("santa"))){
            karakter=tokoh.getNama()+" adalah seorang anak kecil yang imut, lucu dan"
                    + "tingkahnya sering tidak sengaja mempermudah tugas Detective Conan";
            System.out.println(karakter);
        }else if (tokoh.getNama().equals("Penculik") || (tokoh.getNama().equals("penculik"))){
            karakter=tokoh.getNama()+" adalah orang yang mudah untuk berprasangka buruk,"
                    + "gara-gara sifat itu dia sampai menculik ibunya Santa";
            System.out.println(karakter);
        }else if (tokoh.getNama().equals("Ibu Santa") || (tokoh.getNama().equals("ibu santa")) || 
                 (tokoh.getNama().equals("ibu Santa")) ){
            karakter=tokoh.getNama()+" adalah orang yang pendiam dan kalem serta berparas cantik";
            System.out.println(karakter);
        }else 
            System.out.println("Karakter yang anda masukkan tidak ada dalam daftar, coba masukkan lagi ?? (Ya/Tidak");
            Scanner input1 = new Scanner(System.in); 
            inputlagi = input1.nextLine();
            if (inputlagi.equals("Ya") || (inputlagi.equals("ya"))){
                tampilHasil("Tekan Enter untuk Keluar");
            }else System.out.println("Terimakasih program dianggap selesai");
            
        return karakter;
}    
}
    
   
    

