/*
NIM     : 10117073;
Nama    : AJI PURNOMO
Kelas   : IF2
Deskripsi : program untuk menampilkan beberapa data handphone berdasarkan jenisnya
 */
package if2_10117073_latiahn55_handphone;
public class Android extends Handphone{
    private String keyStore;
    //---------------------

    public Android(String man, String os, String model, int harga) {
        super(man, os, model, harga);
        //isikan value yg ada di variabel parent, kemudian panggil isian disini di class tampil data di parent
        manufacture = "Samsung";
        operatingSystem = "Android";
        this.model = "Grand";
        this.harga = 3000000;       
    }

  
    

    public String getKeyStore() {
        return keyStore;
    }
    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }
    
}
