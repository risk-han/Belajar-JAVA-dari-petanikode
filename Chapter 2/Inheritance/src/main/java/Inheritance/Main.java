/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args){
        //membuat objek bangun datar
//        BangunDatar bangunDatar = new BangunDatar();
        
        //membuat objek persegi dan mengisi nilai property
        Persegi persegi = new Persegi();
        persegi.sisi = 2;
        
        //membuat objek Lingkaran dan mengisi nilai property
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;
        
        //membuat objek Persegi Panjang dan mengisi nilai property
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
        
        //membuat objek Segitiga dan mengisi nilai property
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = 12;
        mSegitiga.tinggi = 8;
        
        //memanggil method luas dan keliling
//        bangunDatar.luas();
//        bangunDatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        mSegitiga.luas();
        mSegitiga.keliling();
    }
}
