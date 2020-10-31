package pboif2.pkg10119079.latihan25.ejaannama;

import java.util.Scanner;
/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class PBOIF210119079Latihan25EjaanNama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        
        System.out.print("Masukan nama depan untuk di eja : ");
        nama=input.nextLine();
        
        System.out.println("Ejaan untuk " + nama + " adalah: ");
        char[] huruf = nama.toCharArray();
         for(int i = 0; i <huruf.length; i++){
             System.out.println("Huruf ke-" + (i+1) + " : " + huruf[i]);
         }
    }
}
