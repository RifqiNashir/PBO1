
package Tugas1;

import Constructor.pembeli;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    }
    
    Tiket dTiket = new Tiket("", 0, 0, "", 0, 0, "", 0, 0)
    Tiket trTiket = new Tiket("", 0, 0, 0)
    
    String hotel, pesawat, tujuan;
    int jmlKamar, jmlPenumpang;
    double hrgTiketPesawat, hrgKamar, diskon, total;
    
    try{
        do{
            System.out.println("--- MENU TIKET ---");
            System.out.println("1. Input Data Transaksi");
            System.out.println("2. Lihat Data Tiket");
            System.out.println("3. Keluar");
            int menu = Integer.parseInt(br.readLine());
            switch (menu) {
                case 1:
                    //Input Data Transaksi
                    System.out.println("--- Input Data Transaksi ---");
                    System.out.print("Nama Hotel : ");
                    String hotel = br.readLine();
                    System.out.print("Jumlah Kamar : ");
                    int jmlKamar = Integer.parseInt(br.readLine());
                    System.out.print("Harga Per Kamar : ");
                    double hrgKamar = Double.parseDouble(br.readLine());
                    System.out.print("Nama Pesawat : ");
                    String pesawat = br.readLine();
                    System.out.print("Jumlah Penumpang : ");
                    int jmlPenumpang = Integer.parseInt(br.readLine());
                    System.out.print("Harga Tiket Pesawat : ");
                    System.out.print("Tujuan : ");
                    
               
                    break;
                case 2:
                    //Lihat Data Tiket
                    System.out.println("--- Transaksi Tiket Pesawat Dan Hotel ---");
                    System.out.print("Tujuan : ");
                    String tujuan = br.readLine();
                    System.out.println("Nama Hotel " + getHotel(), "Jumlah Kamar" + getJmlKamar(), "Harga Per Kamar " + getHrgKamar());
                    System.out.print("Total Biaya Kamar Hotel Dengan Diskon 45% : ");
                    double diskon = Double.parseDouble(br.readLine());
                    System.out.println("Nama Pesawat " + getPesawat(), "Jumlah Penumpang" + getJmlPenumpang(), "Harga Tiket Pesawat " + getHrgTiketPesawat());
                    
                    System.out.println("Total Harga Tiket Pesawat : " + getTotal(), "dengan biaya asuransi 29.000/orang");
                
                    //Keluar
                    System.exit(0);
            }
                    
        }while(true);
    }catch(Exception e) {
        System.out.println(e.getMessage());
    }
    
}
