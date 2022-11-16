/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum4.soal2;

import java.util.Scanner;

/**
 *
 * @author LIDYA RAHMI
 */
public class soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        String judul, penulis, tahun, genre, sinopsis;
        int pilihan, volume;
                
        System.out.println("Pilih buku yang ingin diinputkan: ");
        System.out.println("1 = Novel");
        System.out.println("2 = Komik");
        
        System.out.print("Masukkan pilihan: ");
        pilihan = input.nextInt();
        input.nextLine();
        
        switch (pilihan) {
            case 1 -> {
                System.out.print("Judul: ");
                judul = input.nextLine();
                
                System.out.print("Penulis: ");
                penulis = input.nextLine();
                System.out.print("Tahun Terbit: ");
                tahun = input.nextLine();
                System.out.print("Genre: ");
                genre = input.nextLine();
                System.out.print("Sinopsis: ");
                sinopsis = input.nextLine();
                Novel novel1= new Novel(judul, penulis, tahun, genre, sinopsis);
                System.out.println(novel1.getNovelDetail());
            }
            case 2 -> {
                System.out.print("Judul: ");
                judul = input.nextLine();
                
                System.out.print("Penulis: ");
                penulis = input.nextLine();
                System.out.print("Tahun Terbit: ");
                tahun = input.nextLine();
                System.out.print("Volume: ");
                volume = input.nextInt();
                input.nextLine();
                System.out.print("Sinopsis: ");
                sinopsis = input.nextLine();
                Komik komik1= new Komik(judul, penulis, tahun, volume, sinopsis);
                System.out.println(komik1.getKomikDetail());
            }
            default -> System.out.println("Tidak ada pilihan");
        }
        
    }
    }
    

