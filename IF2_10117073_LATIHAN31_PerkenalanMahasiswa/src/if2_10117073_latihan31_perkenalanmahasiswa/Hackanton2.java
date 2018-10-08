/*
NAMA  : AJI PURNOMO
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk memperkenalkan diri mahasiswa
*/
package if2_10117073_latihan31_perkenalanmahasiswa;
public class Hackanton2 {
    
    public static void main(String[] args) {
       Mahasiswa mhs1 = new Mahasiswa(); //panggil Class Mahasiswa, bikin variabel mhs1 yg dimasukkan ke Class Mahasiswa
                                         //booking tempat di class Mahasiswa dgn cara new Mahasiswa ()
       mhs1.nim = "12345";  //variabel mhs1 yg diatas tadi kita tunjuk ke variabel nim dari class Mahasiswa
       mhs1.nama = "Aji Purnomo";
       mhs1.perkenalkanDiri(mhs1.nim, mhs1.nama); //variabel mhs1 menunjuk procedure yg ada di class Mahasiswa
                                                  //kemudian memasukkan data ke dalam parameter procedure tersebut
       
        System.out.println("");
        
       Mahasiswa mhs2 = new Mahasiswa();
       mhs2.nim = "54321";
       mhs2.nama = "Aji Purnomo dari IF 2";
       mhs2.perkenalkanDiri(mhs2.nim, mhs2.nama);
       
       
       
       
    }  
}
