/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package praktikum4.soal1;

import java.util.Scanner;

/**
 *
 * @author LIDYA RAHMI
 */
public class soal1 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        String judul;
        String penulis;
        int tahun_terbit;
        
        System.out.print("Judul: ");
         judul = input.nextLine();     
        
        System.out.print("Penulis: ");
        penulis = input.nextLine();
        
        System.out.print("Tahun Terbit: ");
        tahun_terbit = input.nextInt();
        
        buku Books= new buku(judul, penulis, tahun_terbit);
        Books.display();
        
    }
}
