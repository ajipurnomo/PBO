/*NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menampilkan info tentang beberapa jenis kendaraan

 */
package if2_10117073_latihan57_vehicle;
public class Vehicle {
    private String myBrand;
    private String myModel;
    //--------------------
    public Vehicle(){
        
    }

    public String getBrand() {
        return myBrand;
    }
    public void setBrand(String Brand) {
        this.myBrand = Brand;
    }

    public String getModel() {
        return myModel;
    }
    public void setModel(String Model) {
        this.myModel = Model;
    }
    
}
