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
public class Persegi extends BangunDatar{
    float sisi;
    
    
    float luas(){
        float luas = sisi * sisi;
        System.out.println("Luas persegi: " + luas);
        return luas;
    }
    
    float keliling(){
        float keliling = 4 * sisi;
        System.out.println("Keliling persegi: " + keliling);
        return keliling;
    }
}
