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
public class Nomor1 {
    
    public static void main(String[]args){
        
        int galon, bBesar, bKecil, gelas, hGal, hBes, hKec, hGel;
        double discG, discBB, discBK, discGel, hargaTot, hargaTotDisc, jmlHargaTot;
        
        hGal = 30000;
        hBes = 5000;
        hKec = 3000;
        hGel = 1000;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Nota Warung Air Murah");
        System.out.println("Nama : Paulus Caesario Dito Putra Hartono");
        System.out.println("NIM  : 205314159");
        
        System.out.println();
        
        System.out.print("Masukkan jumlah Galon   : ");
        galon = input.nextInt() * hGal;
        System.out.print("Masukkan jumlah B.Besar : ");
        bBesar = input.nextInt() * hBes;
        System.out.print("Masukkan jumlah B.Kecil : ");
        bKecil = input.nextInt() * hKec;
        System.out.print("Masukkan jumlah Gelas   : ");
        gelas = input.nextInt() * hGel;
        
        System.out.println();
        
        discG = 0.15 * galon;
        discBB = 0.12 * bBesar;
        discBK = 0.1 * bKecil;
        discGel = 0.2 * gelas;
        
        hargaTot = galon + bBesar + bKecil + gelas;
        hargaTotDisc = discG + discBB + discBK + discGel;
        jmlHargaTot = hargaTot - hargaTotDisc;
        
        System.out.println("Jml Kemasan @ \tharga \tdiscount");
        System.out.println("=================================");
        System.out.println("1 Galon   " +hGal +"\t" +galon +"\t" +discG);
        System.out.println("1 B.Besar " +hBes +"\t" +bBesar +"\t" +discBB);
        System.out.println("1 B.Kecil " +hKec +"\t" +bKecil +"\t" +discBK);
        System.out.println("1 Gelas   " +hGel +"\t" +gelas +"\t" +discGel);
        System.out.println("=================================");
        
        System.out.print("Total \t");
        System.out.print("\t" +(int)hargaTot);
        System.out.println("   " +(int)hargaTotDisc);
        System.out.println("Dibayarkan : " +jmlHargaTot);
        
    }
}
