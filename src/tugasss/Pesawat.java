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
public class Pesawat extends TransportUdara{
    private String Maskapai;
    private int hargatiket;
    
    void throttle(){
        System.out.println("WUSHHHHHH.......");
    }

    public String getMaskapai() {
        return Maskapai;
    }

    public void setMaskapai(String Maskapai) {
        this.Maskapai = Maskapai;
    }

    public int getHargatiket() {
        return hargatiket;
    }

    public void setHargatiket(int hargatiket) {
        this.hargatiket = hargatiket;
    }
    
}
