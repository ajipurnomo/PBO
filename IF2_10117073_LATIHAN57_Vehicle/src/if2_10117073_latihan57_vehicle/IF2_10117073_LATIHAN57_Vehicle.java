/*NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menampilkan info tentang beberapa jenis kendaraan
 */
package if2_10117073_latihan57_vehicle;
public class IF2_10117073_LATIHAN57_Vehicle {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setBrand("Trek Bike");
        bicycle.setModel("7.4FX");
        bicycle.setGearCount(23);
        System.out.println("Brand : "+bicycle.getBrand());
        System.out.println("Model : "+bicycle.getModel());
        System.out.println("Jumlah Gear : "+bicycle.getGearCount());
        System.out.println("");//----------------------------------
        Skateboard skate = new Skateboard();
        skate.setBrand("Ally Skate");
        skate.setModel("Rocket");
        skate.setMyBoardLength(54.5);
        System.out.println("Brand : "+skate.getBrand());
        System.out.println("Model : "+skate.getModel());
        System.out.println("Jumlah Gear : "+skate.getBoardLength());
    }
    
}
