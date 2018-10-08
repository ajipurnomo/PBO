/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2_10117073_latihan39_nilaiterbesardanterkecil;

import java.util.Scanner;

public class Petugas {
    public String namaPetugas;
    Nilai dafNilai = new Nilai();
   

    public void inputPetugas() {
        System.out.print("Masukkan Nama Petugas : ");
         Scanner scn = new Scanner(System.in);
        namaPetugas = scn.next();
    }
    public void inputNilai() {
        int i;
        for ( i=0; i<dafNilai.jumlahMhs; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-"+(i+1)+" = ");
             Scanner scn = new Scanner(System.in);
            dafNilai.nilaiMhs[i] = scn.nextInt();
        }
}
}
