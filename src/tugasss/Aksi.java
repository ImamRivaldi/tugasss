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
        
        System.out.print("Jenisnya \t: ");
        System.out.println(TU.getJenis());
        System.out.print("Kelasnya \t: ");
        System.out.println(TU.getKelas());
        System.out.print("Jumlah Kursinya \t: ");
        System.out.println(TU.getJmlkursi());
        System.out.print("Jumlah Awak Kabin \t: ");
        System.out.println(TU.getJmlawak());
        System.out.print("Warnanya \t: ");
        System.out.println(TU.getWarna());
        System.out.println("==================================");
        
        Pesawat GI = new Pesawat();
        GI.setJenis("Airbus A330");
        GI.setKelas("Economy");
        GI.setJmlkursi(50);
        GI.setJmlawak(80);
        GI.setWarna("Putih dan Biru");
        GI.setMaskapai("Garuda Indonesia");
        GI.cetakInfo();
        System.out.println("Maskapai \t:"+GI.getMaskapai());
        GI.throttle();
    }
}
