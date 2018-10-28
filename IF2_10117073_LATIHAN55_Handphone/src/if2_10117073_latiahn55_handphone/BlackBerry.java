/*
NIM     : 10117073;
Nama    : AJI PURNOMO
Kelas   : IF2
Deskripsi : program untuk menampilkan beberapa data handphone berdasarkan jenisnya
 */
package if2_10117073_latiahn55_handphone;
public class BlackBerry extends Handphone{
    private String pinBB;

    public BlackBerry(String man, String os, String model, int harga) {
        super(man, os, model, harga);
        manufacture = "BlackB";
        operatingSystem = "RIM";
        this.model = "Curve";
        this.harga = 2000000;
    }

    public String getPinBB() {
        return pinBB;
    }
    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
    
}
