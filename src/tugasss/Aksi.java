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
        
        System.out.print("Jenisnya \t\t: ");
        System.out.println(TU.getJenis());
        System.out.print("Kelasnya \t\t: ");
        System.out.println(TU.getKelas());
        System.out.print("Jumlah Kursinya \t: ");
        System.out.println(TU.getJmlkursi());
        System.out.print("Jumlah Awak Kabin \t: ");
        System.out.println(TU.getJmlawak());
        System.out.print("Warnanya \t\t: ");
        System.out.println(TU.getWarna());
        System.out.println("=====================================");
        System.out.println("===============Pesawat===============");
        
        Pesawat GI = new Pesawat();
        GI.setJenis("Airbus A330");
        GI.setKelas("Economy");
        GI.setJmlkursi(50);
        GI.setJmlawak(80);
        GI.setWarna("Putih dan Biru");
        GI.setMaskapai("Garuda Indonesia");
        GI.setHargatiket(400000);
        GI.cetakInfo();
        System.out.println("Maskapai \t: "+GI.getMaskapai());
        System.out.println("Harga Tiket \t: "+GI.getHargatiket());
        GI.throttle();
        System.out.println("========================================");
        System.out.println("===============Helikopter===============");
        
        Helikopter H1 = new Helikopter();
        H1.setJenis("Eurocopter");
        H1.setKelas("Military");
        H1.setJmlkursi(12);
        H1.setJmlawak(10);
        H1.setWarna("Abu - Abu");
        H1.setTipe("Eurocopter AS565 Panther");
        H1.setSpeedmax(306);
        H1.cetakInfo();
        System.out.println("Tipe \t\t: "+H1.getTipe());
        System.out.println("Speed Maximun \t: "+H1.getSpeedmax()+" km/h");
        System.out.println("=====================================");
        System.out.println("=================Roket===============");
        
        Rocket R1 = new Rocket();
        R1.setJenis("Pesawat Ulang - Alik");
        R1.setKelas("Penelitian");
        R1.setJmlkursi(11);
        R1.setJmlawak(11);
        R1.setWarna("Putih dan Hitam");
        R1.setNama("Space Shuttle");
        R1.setMilik("NASA");
        R1.cetakInfo();
        System.out.println("Nama \t\t: "+R1.getNama());
        System.out.println("Milik \t\t: "+R1.getMilik());
        System.out.println("=====================================");
    }
}
