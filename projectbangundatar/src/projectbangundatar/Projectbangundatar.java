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
public class Projectbangundatar {
    public static void main(String[] args) {
        PersegiPanjang C = new PersegiPanjang();
        C.panjang = 17;
        C.lebar = 8;
        
        C.hitungLuas();
        C.hitungKeliling();
        
        PersegiPanjang D = new PersegiPanjang();
        D.panjang = 26;
        D.lebar = 14;
        
        D.hitungLuas();
        D.hitungKeliling();
        
        Lingkaran L1 = new Lingkaran();
        L1.jejari= 6;
        
        L1.hitungLuasL();
        L1.hitungKelilingL();
                
        Lingkaran L2 = new Lingkaran();
        L2.jejari= 12;
        
        L2.hitungLuasL();
        L2.hitungKelilingL();
    }
}