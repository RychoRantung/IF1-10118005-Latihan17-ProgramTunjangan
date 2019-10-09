/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program : program ini berisi program yang menampilkan program tunjangan
 */
public class IF110118005Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================Program Tunjangan=====================");
        System.out.print("Berapa Gaji Pokok Anda Perbulan? \t: Rp. ");
        double gajiPokok = sc.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) \t \t: ");
        String menikah = sc.next();
        double tunjangan = 0;
        if (menikah.equals("Menikah")){
            tunjangan = gajiPokok*0.35;
        }
        double totalGaji = gajiPokok+tunjangan;
        
        System.out.println("==========Hasil Perhitungan Gaji Anda=============");
        System.out.println("Gaji Pokok \t :" + gajiPokok);
        System.out.println("Tunjangan \t :" + tunjangan);
        System.out.println("Total Gaji \t :"+ totalGaji);    
}
}
    
