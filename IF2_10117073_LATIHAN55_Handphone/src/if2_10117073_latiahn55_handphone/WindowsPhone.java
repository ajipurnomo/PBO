/*
NIM     : 10117073;
Nama    : AJI PURNOMO
Kelas   : IF2
Deskripsi : program untuk menampilkan beberapa data handphone berdasarkan jenisnya
 */
package if2_10117073_latiahn55_handphone;
public class WindowsPhone extends Handphone{
    private String wpkeyStore;
    //-----------------------
    public WindowsPhone(String man, String os, String model, int harga) {
        super(man, os, model, harga);
        manufacture = "Nokia";
        operatingSystem = "Win8";
        this.model = "Lumia";
        this.harga = 1000000;
    }

    public String getWpkeyStore() {
        return wpkeyStore;
    }
    public void setWpkeyStore(String wpkeyStore) {
        this.wpkeyStore = wpkeyStore;
    }
    
}
