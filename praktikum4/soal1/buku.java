/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4.soal1;

/**
 *
 * @author LIDYA RAHMI
 */
public class buku {
    private String judul;
     private String penulis;
     private int tahun_terbit;


 public buku(String j, String p, int t){
   this.judul=j;
   this.penulis=p;
   this.tahun_terbit=t;
}


    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getTahun_terbit() {
        return tahun_terbit;
    }

    public void setTahun_terbit(int tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }
       public void display(){
           System.out.println("Judul adalah " + getJudul());
           System.out.println("Penulis adalah " + getPenulis());
           System.out.println("Tahun Terbit adalah " + getTahun_terbit());
    }
    
    
    
}
