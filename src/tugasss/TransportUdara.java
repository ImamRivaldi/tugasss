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
public class TransportUdara {
    String jenis;
    String kelas;
    int jmlkursi;
    int jmlawak;
    String warna;
    
    void cetakInfo(){
        System.out.println("Jenis\t: "+jenis+"\n"+"Kelas\t: "+kelas+"\n"+
                "Jumlah Kursi\t: "+jmlkursi+"\n"+"Jumlah Awak\t: "+jmlawak+"\n"+
                "Warna\t: "+warna);
    }
}
