/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116435.luthfiazizalpaqih.latihan49.biayaemaskawin;

/**
 *
 * @author Luthfi
 * NIM  : 10116435
 * NAMA : Luthfi Aziz Al Paqih
 */
public class PBOUlang10116435LuthfiAzizAlPaqihLatihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        BiayaEmas bimas = new BiayaEmas();
        bimas.setEmasKawin(15.7);
        bimas.setHargaSatuGram(570000);
        
        System.out.println("Hendi membeli emas kawin : " + bimas.getEmasKawin() 
                + " gram");
        System.out.println("Harga 1 gram emas per bulan oktober ini : Rp. " 
                + bimas.getHargaSatuGram());
        System.out.println();
        
        double emas_kawin = bimas.getEmasKawin();
        double harga_satu_gram = bimas.getHargaSatuGram();
        
        System.out.println("Total pembayaran yang harus dikeluarkan : Rp. " 
                + bimas.hitungTotalPembayaran(emas_kawin, harga_satu_gram));
    }
    
}
