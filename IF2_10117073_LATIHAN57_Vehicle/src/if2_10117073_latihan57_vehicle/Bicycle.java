/*NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menampilkan info tentang beberapa jenis kendaraan

 */
package if2_10117073_latihan57_vehicle;
public class Bicycle extends Vehicle{
    private int myGearCount;
    //---------------------
    public Bicycle(){
        System.out.println("Bicycle");
    }

    
    public int getGearCount() {
        return myGearCount;
    }
    public void setGearCount(int GearCount) {
        this.myGearCount = GearCount;
    }
}
    
