/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4.soal2;

/**
 *
 * @author LIDYA RAHMI
 */
public class Komik extends Buku {
    private final int volume;
    private final String sinopsis;
    String KomikDetail;

         
    public Komik(String j, String p, String t, int v, String s){
       super.judul=j;
       super.penulis=p;
       super.tahun=Integer.valueOf(t);
       this.volume=v;
       this.sinopsis=s;
    }
    
     public String getKomikDetail() {
        return  "\nData yang baru diinputkan adalah \nSebuah komik dengan judul \"" +judul+ "\". Komik tersebut dibuat oleh " + penulis + " dan diterbitkan pada tahun" + tahun + 
                ". Sampai saat ini komik tersebut memiliki jumlah volume sebanyak " + volume + "buah." + "\nSinopsis : " + sinopsis;
    }
}
     
    

