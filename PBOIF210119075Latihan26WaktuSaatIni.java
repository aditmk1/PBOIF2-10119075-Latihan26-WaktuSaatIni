/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119075.latihan26.waktusaatini;
/**
 * @author  
 * Nama  : Aditiya Musthafa Kamil
 * Kelas : PBOIF2
 * NIM   : 10119075
 * Deskripsi Program : Program ini berisi program yang menampilkan Waktu Saat Ini
 **/
import java.util.Date;
import java.text.SimpleDateFormat;
public class PBOIF210119075Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date tanggal = new Date();
        
        SimpleDateFormat format = new SimpleDateFormat("E dd MMM yyyy HH:mm:ss");
        System.out.println("Hari ini :"+ format.format(tanggal));
        
        System.out.println("==================================================");
        System.out.println("Developed by Aditiya Musthafa Kamil");
    }
    
}
