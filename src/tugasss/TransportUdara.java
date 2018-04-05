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
    private String jenis;
    private String kelas;
    private int jmlkursi;
    private int jmlawak;
    private String warna;
    
    void cetakInfo(){
        System.out.println("Jenis\t: "+jenis+"\n"+"Kelas\t: "+kelas+"\n"+
                "Jumlah Kursi\t: "+jmlkursi+"\n"+"Jumlah Awak\t: "+jmlawak+"\n"+
                "Warna\t: "+warna);
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public int getJmlkursi() {
        return jmlkursi;
    }

    public void setJmlkursi(int jmlkursi) {
        this.jmlkursi = jmlkursi;
    }

    public int getJmlawak() {
        return jmlawak;
    }

    public void setJmlawak(int jmlawak) {
        this.jmlawak = jmlawak;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
}
