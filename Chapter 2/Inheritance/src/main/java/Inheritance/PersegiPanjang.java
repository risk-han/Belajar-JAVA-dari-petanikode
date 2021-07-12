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
public class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;
    
    float luas(){
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + luas);
        return luas;
    }
    float keliling(){
        float keliling = 2 * panjang + lebar;
        System.out.println("Kelilin persegi panjang: " + keliling);
        return keliling;
    }
}
