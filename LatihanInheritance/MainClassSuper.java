
package LatihanInheritance;

import java.io.*;

public class MainClassSuper {

    public static void main(String[] args) throws IOException{ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        subClass sb = new subClass(0,"","");
        
        System.out.println("--- INPUT ---");
        System.out.print("Masukkan Nama : ");
        String nama = br.readLine();
        System.out.print("Masukkan Keterangan : ");
        String ket = br.readLine();
        System.out.print("Masukkan Usia : ");
        int usia = Integer.parseInt(br.readLine());
        
        //Masukkan data ke object constructor
        sb = new subClass(usia, nama, ket);
        System.out.println("Nama Anda : " + sb.getNama());
        System.out.println("Keterangan : " + sb.getKet());
        System.out.println("Usia Anda : " + sb.getUsia());
        
    }
    
}
