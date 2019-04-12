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

public class Array {
    public static void main(String[] args) {

        // membuat array buah-buahan
        int jumlah;
        Scanner scan = new Scanner(System.in);
        jumlah = scan.nextInt();
        String[] buah = new String[jumlah];

        // membuat scanner
        

        // mengisi data ke array
        for( int i = 0; i < buah.length; i++ ){
            System.out.print("Buah ke-" + i + ": ");
            buah[i] = scan.nextLine();
        }

        System.out.println("---------------------------");

        // menampilkan semua isi array
        for( String b : buah ){
            System.out.println(b);
        }

    }
}
