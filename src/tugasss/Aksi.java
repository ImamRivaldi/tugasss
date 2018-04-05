/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasss;

/**
 *
 * @author ACER
 */
public class Aksi {
    public static void main(String[] args) {
        TransportUdara TU = new TransportUdara();
        
        
        TU.setJenis("Boing 777");
        TU.setKelas("Economy");
        TU.setJmlkursi(50);
        TU.setJmlawak(100);
        TU.setWarna("Biru");
        
        TU.cetakInfo();
    }
}
