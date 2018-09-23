package latihan4_kambing;
//NAMA  : Aji Purnomo
//KELAS : IF 2
//NIM   : 10117073
//Deskripsi Program : Menampilkan jumlah kambing dari variabel yang sudah diatur
//                    di dalam codingan
public class Kambing {
    public void tambahKambing() {
        //DEKLARASI variabel lokal
        int jumlahKambing = 0;
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " +jumlahKambing);
    }
    public static void main(String[] args) {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
        
        
    }
    
}
