/*NAMA : Aji Purnomo
KELAS : IF 2
NIM   : 10117073
Deskripsi : program untuk menampilkan info tentang beberapa jenis kendaraan

 */
package if2_10117073_latihan57_vehicle;
public class Skateboard extends Vehicle{
    private double myBoardLength;
    //--------------------------
    public Skateboard(){
        System.out.println("SkateBoard");
    }

    public double getBoardLength() {
        return myBoardLength;
    }
    public void setMyBoardLength(double BoardLength) {
        this.myBoardLength = BoardLength;
    }
    
}
