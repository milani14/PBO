/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar;

/**
 *
 * @author ADMIN
 */
public class Lingkaran {
   int jejari;
    
    void hitungLuasL(){
        double luas;
        if(jejari % 7 == 0){
            luas = jejari * jejari * 22/7;
        }
        else{
            luas = jejari * jejari * 3.14;
        }
        System.out.println("Luas lingkaran: " + luas + " satuan panjang");
    }
    
    void hitungKelilingL(){
        double keliling;
        if(jejari % 7 == 0){
            keliling = 2 * jejari * 22/7;
        }
        else{
            keliling = 2 * jejari * 3.14;
        }
        System.out.println("Keliling lingkaran: " + keliling + " satuan panjang");
    }

}