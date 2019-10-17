/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rata2nilai;

import java.util.Scanner;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : (Object Oriented) Program Rata Rata Nilai
 */

public class Rata2Nilai {
    public static int[] nilaiMhs = new int[10];
    public static int banyakMhs;	
    public static double rataNilai;
    
    public static void hitungRata2(int bMhs) {
        double temp = 0; 
        
        Scanner scanner = new Scanner(System.in);
        if(bMhs >10){
            System.out.println("Maaf Banyak Mahasiswa terlalu banyak,silahkan isi ulang kembali ");
        }
        else{
            for(int i = 1 ; i <= bMhs ; i++){
                System.out.print("Nilai Mahasiswa ke- " + i + " : ");
                nilaiMhs[i] = scanner.nextInt();
                temp += nilaiMhs[i]; 
            }
            rataNilai = temp / bMhs;  
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        banyakMhs = input.nextInt();

        hitungRata2(banyakMhs);
        System.out.println("");
        System.out.println("Maka, Rata-Rata Nilainya adalah : " + rataNilai);
        System.out.println("(Developed by Zaenal Anzarry)");
	
    }
}
    

