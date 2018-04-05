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
        
        TU.jenis = "Airbus 747";
        TU.kelas = "First Class";
        TU.jmlkursi = 30;
        TU.jmlawak = 50;
        TU.warna = "Putih Pink";
        
        TU.cetakInfo();
    }
}
