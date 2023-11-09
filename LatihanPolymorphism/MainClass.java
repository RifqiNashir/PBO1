
package LatihanPolymorphism;

import java.awt.event.AdjustmentListener;
import java.io.*;

public class MainClass {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //instance of class
        Laundry master = new Laundry("", "", 0);
        TransaksiLaundry transaksi = new TransaksiLaundry("", "", "", "", 0, "", "", 0);
        
        //deklarasi variabel
        String jenis, nama, metode
        
        //menu
        //loop
        do {
            System.out.println("-- LAUNDRYKU --");
            System.out.println("1. Menu Master");
            System.out.println("2. Menu Transaksi");
            System.out.println("3. Menu Cari Data");
            System.out.println("4. Menu Keluar");
            System.out.print("Masukkan Pilihan Menu : ");
            int menu = Integer.parseInt(br.readLine());
            switch (menu){
                case 1:
                    System.out.println("-- 1. Menu Master Data");
                    //input --> class laundry
                    System.out.print("Entri jenis cucian : ");
                    jenis = br.readLine();
                    System.out.print("Entri harga : ");
                    harga = Integer.parseInt(br.readLine());
                    System.out.print("Entri Metode : ");
                    metode = br.readLine();
                    master = new Laundry(jenis, metode, harga);
                    break;
                case 2:
                    System.out.println("-- 2. Menu Transaksi");
                    break;
                case 3:
                    System.out.println("-- 3. Menu Cari Data");
                    break;
                default:
            }
            
        }while (true) {            
            
        }
    }
    
}
