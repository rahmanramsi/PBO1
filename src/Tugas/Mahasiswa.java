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

public class Mahasiswa {
    public static void main(String[] args) {
    // TODO code application logic here
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    int data =0;
    String[] nama    = new String[30];
    String[] nim     = new String[15];
    Double[] IPS1    = new Double[20];
    Double[] IPS2    = new Double[20];
    Double[] IPS3    = new Double[20];
    Double[] IPS4    = new Double[20];
    Double[] IPS5    = new Double[20];
    Double[] IPK    = new Double[20];
    String[] hasil     = new String[15];

    System.out.println("BIODATA MAHASISWA");
    System.out.println("+===============INPUTAN============================+");
    try{
        System.out.print("Masukkan banyak data = ");
        data = Integer.parseInt(input.readLine());
        for (int a=0;a<data;a++){
             System.out.println("------Data ke-"+ (a+1) +"------");
             System.out.print("Masukan Nim        = ");
                nim[a] = input.readLine();
             System.out.print("Masukan Nama       = ");
                nama[a] = input.readLine();
             System.out.print("Jumlah IP Semester 1  = ");
                IPS1[a] = Double.parseDouble(input.readLine());
             System.out.print("Jumlah IP Semester 2  = ");
                IPS2[a] = Double.parseDouble(input.readLine());
             System.out.print("Jumlah IP Semester 3  = ");
                IPS3[a] = Double.parseDouble(input.readLine());
             System.out.print("Jumlah IP Semester 4  = ");
                IPS4[a] = Double.parseDouble(input.readLine());
             System.out.print("Jumlah IP Semester 5  = ");
                IPS5[a] = Double.parseDouble(input.readLine());
             // Hitung IPK
                IPK[a] = (IPS1[a]+IPS2[a]+IPS3[a]+IPS4[a]+IPS5[a])/5;
             // Mencari Hasil
             if(IPK[a] >=0 && IPK[a] <=2.6){
                    hasil[a] = "Tidak Memuaskan";
                }else if(IPK[a] >2.6 && IPK[a] <=3.4){
                    hasil[a] = "Memuaskan";
                }else if (IPK[a] >3.4&& IPK[a] <=4){
                    hasil[a] = "Dengan Pujian";
                }else{
                    System.out.println("Hasil tidak diketahui");
                }
         }
    } catch (IOException e ){
      System.out.println("Error");
    }

    System.out.println("+==============HASIL OUTPUT========================+");
    System.out.println("Banyak data : " + data);
    for (int a=0; a<data;a++){
        System.out.println("Data Mahasiswa ke- " + (a+1));
        System.out.println("Nim                     : "+ nim[a]);
        System.out.println("Nama                    : "+ nama[a]);
        System.out.println("Jumlah IP Semester 1    : "+ IPS1[a]);
        System.out.println("Jumlah IP Semester 2    : "+ IPS2[a]);
        System.out.println("Jumlah IP Semester 3    : "+ IPS3[a]);
        System.out.println("Jumlah IP Semester 4    : "+ IPS4[a]);
        System.out.println("Jumlah IP Semester 5    : "+ IPS5[a]);
        System.out.println("Total  IPK              : "+ IPK[a]);
        System.out.println("Hasil                   : "+ hasil[a]);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    }   
}
