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
public class Lingkaran extends BangunDatar {
    float r;
    float pi = (float) 3.14;
    float luas(){
        
        float luas = r * pi;
        System.out.println("Luas lingkaran: " + luas);
        return luas;
    }
    
    float keliling(){
        float keliling = 2 * pi * r;
        System.out.println("Keliling lingkaran: " + keliling);
        return keliling;
    }
}
