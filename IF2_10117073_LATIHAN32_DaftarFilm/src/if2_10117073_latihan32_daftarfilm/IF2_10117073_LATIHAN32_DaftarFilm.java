/*
 NAMA    : Aji Purnomo
 KELAS   : IF 2
 NIM     : 10117073
 Deskripsi : Program untuk menampilkan daftar film lengkap dengan rinciannya
 */
package if2_10117073_latihan32_daftarfilm;

public class IF2_10117073_LATIHAN32_DaftarFilm {

    public static void main(String[] args) {
           System.out.println("===Daftar Film Sedang Tayang===");
           System.out.println("");
        Film tampil = new Film();        
        tampil.filmName = "Venom";
        tampil.filmGenre = "Action, Horor, Scifi";
        tampil.filmRating = 8.5;
        tampil.filmDuration = 120;        
        tampil.nowPlaying(tampil.filmName, tampil.filmGenre, tampil.filmRating, tampil.filmDuration);
           System.out.println("");
        Film tampil1 = new Film();
        tampil1.filmName = "Small Foot";
        tampil1.filmGenre = "Animation";
        tampil1.filmRating = 9.0;
        tampil1.filmDuration = 96;
        tampil.nowPlaying(tampil1.filmName, tampil1.filmGenre, tampil1.filmRating, tampil1.filmDuration);
            System.out.println("");
        Film tampil2 = new Film();
        tampil2.filmName = "Crazy Rich Asian";
        tampil2.filmGenre = "Comedy";
        tampil2.filmRating = 7.8;
        tampil2.filmDuration = 119;
        tampil.nowPlaying(tampil2.filmName, tampil2.filmGenre, tampil2.filmRating, tampil2.filmDuration);
           System.out.println("");
        Film tampil3 = new Film();
        tampil3.filmName = "Asih";
        tampil3.filmGenre = "Horror";
        tampil3.filmRating = 6.0;
        tampil3.filmDuration = 100;
          tampil.nowPlaying(tampil3.filmName, tampil3.filmGenre, tampil3.filmRating, tampil3.filmDuration);
        
       
        
        
        
    }
    
}
