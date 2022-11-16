/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4.soal2;

/**
 *
 * @author LIDYA RAHMI
 */
public class Novel extends Buku {
   private final  String genre;
   private final String sinopsis;
   String NovelDetail;
    
    
    public Novel(String j, String p, String t, String g, String s){
        super.judul=j;
        super.penulis=p;
        super.tahun=Integer.valueOf(t);
        this.genre=g;
        this.sinopsis=s;
    }
    
    public String getNovelDetail() {
        return  "\nData yang baru diinputkan adalah \nSebuah novel bergenre " + genre + " dengan judul \""+ judul
                +"\". Novel tersebut ditulis oleh " + penulis + " dan diterbitkan pada tahun " + tahun + "\nSinopsis : " + sinopsis;
    }    

    
}


