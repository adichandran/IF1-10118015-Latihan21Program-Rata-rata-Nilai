/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan21rataratanilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program Perhitungan rata-rata nilai mhs
 */
public class IF110118015Latihan21rataratanilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
            System.out.print("Masukkan Banyaknya Mahasiswa : ");
            int jumlahmhs = input.nextInt();
            double ratanilai = 0;
            for( int i = 0; i < jumlahmhs; i++){
		System.out.print("Nilai Mahasiswa ke-" + (i+1) + " : ");
            ratanilai += input.nextInt();
	}
	ratanilai /= jumlahmhs;
        System.out.println();
	System.out.println("Maka, Rata-rata Nilainya adalah " + ratanilai);
        System.out.println("(Developed by : Adi Chandra Nugraha)");
    }
    
}
