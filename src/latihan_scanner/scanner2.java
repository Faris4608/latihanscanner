/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_scanner;

import java.util.Scanner;

/**
 *
 * @author LT440P
 */
public class scanner2 {

    public static void main(String[] args) {
        int kkm = 75, a = 100, b = 85, c = 80;
         System.out.print("Nama : " );
        Scanner inama = new Scanner(System.in);
       String nama = inama.nextLine();
        System.out.print("Alamat : " );
        Scanner ialamat = new Scanner(System.in);
       String alamat = ialamat.nextLine();
              System.out.print("Input Kelas : " );
      Scanner ikelas = new Scanner(System.in);
       String kelas = ikelas.nextLine();
              System.out.print("Input nilai (1-100) : ");
        Scanner inilai = new Scanner(System.in);
        String nilai = inilai.nextLine();
        int pnilai = Integer.parseInt(nilai);
        System.out.println("Nilaimu Adalah     " + nilai);
         if (pnilai > 100) {
            System.out.println("Input Nilai MAKS 100");
        }
         else if (pnilai > kkm) {
            System.out.println("Kamu Lulus");
        }
          if (pnilai < kkm) {
            System.out.println("Kamu Tidak Lulus");
        }
          else if (pnilai < c) {
            System.out.println("Nilai Kamu C");
        }  else if (pnilai < b) {
            System.out.println("Nilai Kamu B");
        }  else if (pnilai < a) {
            System.out.println("Nilai Kamu A");
        }
       
      

 }

}
