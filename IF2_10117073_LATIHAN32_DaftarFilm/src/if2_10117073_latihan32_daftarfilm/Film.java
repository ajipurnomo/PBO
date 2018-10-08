/*
  NAMA    : Aji Purnomo
  KELAS   : IF 2
  NIM     : 10117073
  Deskripsi :
 */
package if2_10117073_latihan32_daftarfilm;

public class Film {
   
   
    
    String filmName;
    String filmGenre;
    Double filmRating;
    int filmDuration;
    
    public void nowPlaying (String parName, String parGenre, Double parRating, int parDuration){
        System.out.println("Judul Film : "+parName);
        System.out.println("Genre Film : "+parGenre);
        System.out.println("Rating Film : "+parRating);
        System.out.println("Duration Film :"+parDuration+" menit");
    }
}
