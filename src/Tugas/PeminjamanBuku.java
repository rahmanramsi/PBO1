/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Risda
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PeminjamanBuku {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int data; //buat variabel data untuk menyimpan jumlah banyak inputan nantinya. 
        System.out.println("PERPUSTAKAAN RISDA");
        System.out.println("==================");
        System.out.print("Masukkan banyak Inputan = ");
        data = Integer.parseInt(input.readLine()); //Memasukkan banyak inputan berupa angka ke variabel data
        //membuat variabel array 
        String[] Kode0644          = new String[data];
        String[] Judul0644         = new String[data];
        String[] NamaAnggota0644   = new String[data];
        String[] tglpinjam0644     = new String[data];
        String[] tglkembali0644    = new String[data];
        //Input perulangan sesuai jumlah angka yang dimasukkan ke variabel data
        //misal yang dimasukkan 2 brarti perulangan inputnya sebanyak 2x
        for (int a=0;a<data;a++){
             System.out.println("------Data ke-"+ (a+1) +"------");
             Kode0644[a] = "PI0" + (a+1) + "A"; //membuat kode otomatis sesuai urutan input 
             System.out.print("Judul Buku       = ");
                Judul0644[a] = input.readLine(); //membuat inputan judul buku
             System.out.print("Nama             = ");
                NamaAnggota0644[a] = input.readLine(); //membuat inputan nama
             System.out.print("Tanggal Peminjaman = ");
             tglpinjam0644[a] = input.readLine(); //membuat inputan tanggal peminjaman
             System.out.print("Tanggal Pengembalian = ");
             tglkembali0644[a] = input.readLine(); ////membuat inputan tanggal kembali        
        }
        
        //Output
        System.out.println("Banyak data : " + data); //menampilkan jumlah data yang telah diinput
        //Membuat perulangan output sebanyak jumlah data yang ada
        for (int a=0; a<data;a++){
            System.out.println("----------------------------------");
            System.out.println("Data Peminjaman ke- " + (a+1));
            System.out.println("Kode                    : "+ Kode0644[a]);
            System.out.println("Judul Buku              : "+ Judul0644[a]);
            System.out.println("Nama Anggota            : "+ NamaAnggota0644[a]);
            System.out.println("Tanggal Peminjaman      : "+ tglpinjam0644[a]);
            System.out.println("Tanggal Kembali         : "+ tglkembali0644[a]);
            System.out.println("----------------------------------");
        }
    }
}
