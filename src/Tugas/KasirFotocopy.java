/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author W7
 */
import java.util.Scanner;

public class KasirFotocopy {
  
    public static void main(String[] args){
        //membuat variabel
        boolean jalan=true;
        double jumlah, diskon, bayar;
        double harga=250.0;
        String member;
        Scanner scan = new Scanner(System.in);
        

            // mengambil input
            System.out.println("Apakah ada kartu member ?");
            System.out.print("Ketik Ya atau Tidak : ");
            member = scan.nextLine();
            System.out.print("Total Fotocopy: ");
            jumlah = scan.nextInt();

            // proses
            if (member.equalsIgnoreCase("ya")) {
                if (jumlah > 0) {
                    diskon = harga* jumlah * 0.25;
                } else if (jumlah > 500) {
                    diskon = harga* jumlah * 0.30;
                } else if (jumlah > 800) {
                    diskon = harga* jumlah * 0.50;
                } else {
                    diskon = 0;
                }

            } else {
                if (jumlah > 300) {
                    diskon = harga* jumlah * 0.10;
                } else if (jumlah > 500) {
                    diskon = harga* jumlah * 0.25;
                } else {
                    diskon = 0;
                }
            }
            // output2
            bayar = harga*jumlah;
            System.out.println("Total Bayar : Rp " + bayar);
            // total yang harus dibayar
            bayar = bayar - diskon;
            // output1
            System.out.println("Total Diskon: Rp " + diskon);
            System.out.println("Total Bayar + Diskon : Rp " + bayar);
            System.out.println();
    }
}