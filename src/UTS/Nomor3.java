/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.util.Scanner;

/**
 *
 * @author Dito
 */
public class Nomor3 {
    
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        double tugas, uts1, uts2, uas;
        double nilaiAngka;
        char nilaiHuruf;
        
        System.out.println("Perhitungan Nilai Akhir");
        System.out.println("Nama : Paulus Caesario Dito Putra Hartono");
        System.out.println("NIM  : 205314159");
        
        System.out.println();
        
        System.out.print("Masukkan Nilai Tugas : ");
        tugas = input.nextDouble();
        System.out.print("Masukkan Nilai UTS 1 : ");
        uts1 = input.nextDouble();
        System.out.print("Masukkan Nilai UTS 2 : ");
        uts2 = input.nextDouble();
        System.out.print("Mauskkan Nilai UAS   : ");
        uas = input.nextDouble();
        
        System.out.println();
        
        nilaiAngka = (tugas * 0.3) + (uts1 * 0.15) + (uts2 * 0.2) + (uas * 0.35);
        if (nilaiAngka >= 60){
            System.out.println("Selamat Anda LULUS");
        } else {
            System.out.println("Anda Tidak LULUS, TETAP SEMANGAT!");
        }
        
        if (nilaiAngka >= 80){
            nilaiHuruf = 'A';
        } else if (nilaiAngka >= 70){
            nilaiHuruf = 'B';
        } else if (nilaiAngka >= 60){
            nilaiHuruf = 'C';
        } else {
            nilaiHuruf = 'D';
        }
        System.out.println("Nilai Angka = " +nilaiAngka);
        System.out.println("Nilai Huruf = " +nilaiHuruf);
    }
}
