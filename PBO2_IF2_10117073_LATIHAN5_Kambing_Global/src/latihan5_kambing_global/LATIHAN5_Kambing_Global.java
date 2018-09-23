package latihan5_kambing_global;
//NAMA  : Aji Purnomo
//KELAS : IF 2
//NIM   : 10117073
//Deskripsi Program : Program ini untuk mmemasukkan nilai dari keyboard, 
//                    kemudian ditampilkan ke layar
public class LATIHAN5_Kambing_Global {
    //variabel jumlahkambing menjadi variabel instance
    int jumlahKambing = 88;
    
    //method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing : "+jumlahKambing);
    }
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah : "+jumlahKambing);
    }
    
    public static void main(String[] args) {
       KambingGlobal kambingSusu = new KambingGlobal();
       
       //menampilakn jumlah kambing yang ada saat program pertama kali berjalan
       kambingSusu.getJumlahKambing();
       
       //menambah satu kambing
       kambingSusu.tambahKambing();
       
       //menampilkan jumlah kambing yang ada
       kambingSusu.getJumlahKambing();
    }
    
}
