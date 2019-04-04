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

public class PDAM {
    public static void main(String[] args) {
        int volume, bayar;
        int tarif = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Jumlah volume :");
        volume = scan.nextInt();
        
        if(volume >=0 && volume <=15){
            tarif = 250;
        }
        else if(volume >=16 && volume <=30){
            tarif = 450;
        }else if(volume >=31 && volume <=50){
            tarif = 675;
        }else if(volume > 50){
            tarif = 1125;
        }else{
            System.out.println("Hasil tidak diketahui");
        }
        
        bayar = tarif * volume;
        //output
        System.out.println("Jumlah Volume yang dipakai " + volume + " m3");
        System.out.println("Total Bayar : Rp " + bayar);
        System.out.println();
      }
    
}
