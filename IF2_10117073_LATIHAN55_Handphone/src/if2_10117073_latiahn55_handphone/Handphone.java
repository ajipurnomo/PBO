/*
NIM     : 10117073;
Nama    : AJI PURNOMO
Kelas   : IF2
Deskripsi : program untuk menampilkan beberapa data handphone berdasarkan jenisnya
 */
package if2_10117073_latiahn55_handphone;
public class Handphone {
    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;
    //-------------------
    public Handphone(String man, String os,String model, int harga){
        
    }
    public void displayProduct(){ //kalau void boleh tanpa parameter
        //Android andro = new Android("", "", "", 0);      
        System.out.println("Manufaktur : "+manufacture);
        System.out.println("OS : "+operatingSystem);
        System.out.println("Model : "+model);
        System.out.println("Harga : "+harga);    
       
    }
}
