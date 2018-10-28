/*
NIM     : 10117073;
Nama    : AJI PURNOMO
Kelas   : IF2
Deskripsi : program untuk menampilkan beberapa data handphone berdasarkan jenisnya

 */
package if2_10117073_latiahn55_handphone;
public class IF2_10117073_LATIAHN55_Handphone {

    public static void main(String[] args) {    
       Android android = new Android("", "", "", 0);                       
        android.displayProduct();
        android.setKeyStore("234ibfd3840fo"); 
        System.out.println("Android Key Store : "+android.getKeyStore()); 
        System.out.println("");//-------------------------------------      
        
       BlackBerry bb = new BlackBerry("", "", "", 0);
        bb.displayProduct();
        bb.setPinBB("BHS249");
        System.out.println("PIN : "+bb.getPinBB());        
        System.out.println("");//-------------------------------------
        
       WindowsPhone ws = new WindowsPhone("", "", "", 0);
        ws.displayProduct();
        ws.setWpkeyStore("UUUQIJWORJ");
        System.out.println("Wp Key Store : "+ws.getWpkeyStore());
        
       
    
  
    }
    
}
