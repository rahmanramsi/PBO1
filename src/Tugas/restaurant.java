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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class restaurant {
    public static void main(String[] args) throws IOException {
    // TODO code application logic here
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    int data;
    System.out.println("RESTAURAN RAHMAN RAMSI");
    System.out.println("+===============INPUT DATA====================+");
    System.out.print("Masukkan jumlah pelanggan = ");
    data = Integer.parseInt(input.readLine());
    String[] kode_pel0010           = new String[data];
    String[] nama0010               = new String[data];
    String[] nama_pesanan0010       = {"Ayam Goreng", "Ayam Goreng Kremes", "Kari Ayam", "Semur Ayam","Nasi Goreng Spesial" ,"Kepiting"};
    Integer[] harga0010             = {21000,26500,22000,24500,25000,28000};
    Integer[] pilih0010             = new Integer[data];
    Integer[] jumlah0010            = new Integer[data];
    Integer[] totalbayar0010        = new Integer[data];
        //Input Data Berulang
        for (int a=0;a<data;a++){
             kode_pel0010[a] = "P00" + (a+1) + "A";
             System.out.println("Kode Pelanggan = "+ kode_pel0010[a]);
             System.out.print("Masukan Nama       = ");
                nama0010[a] = input.readLine();
             System.out.println("Daftar Menu Makanan");
             System.out.println("-------------------");
             
            //Menampilkan List Menu
             for (int b=0; b<nama_pesanan0010.length;b++){
                System.out.println((b+1) + ". " + nama_pesanan0010[b] + "   = Rp." + harga0010[b]);
             }
             System.out.print("Pilih menu anda = ");
             pilih0010[a] = Integer.parseInt(input.readLine());
             System.out.print("Jumlah yang dipesan = ");
             jumlah0010[a] = Integer.parseInt(input.readLine());
             totalbayar0010[a] = jumlah0010[a] * (harga0010[pilih0010[a]-1]);
        }
        
        //Output Data
        System.out.println("+==============HASIL OUTPUT========================+");
        System.out.println("Banyak Pelanggan : " + data);
        for (int a=0; a<data;a++){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Kode Pelanggan               = " + kode_pel0010[a]);
        System.out.println("Nama Pelanggan               = "+ nama0010[a]);
        System.out.println("Nama Pesanan                 = "+ nama_pesanan0010[pilih0010[a]-1]);
        System.out.println("Jumlah Pesanan               = "+ jumlah0010[a]);
        System.out.println("Total yang harus dibayar     = Rp."+ totalbayar0010[a]);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    }
}
