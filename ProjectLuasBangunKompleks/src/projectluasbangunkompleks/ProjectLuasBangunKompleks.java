/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author PC
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi();
        Lingkaran ling1 = new Lingkaran();
        
        double LuasBangunDatar = persegi1.hitungLuas(42) + (ling1.hitungLuas(42/2)*2);
        System.out.println("Luas bangun datar tersebut adalah : " + LuasBangunDatar);
    }
    
}

