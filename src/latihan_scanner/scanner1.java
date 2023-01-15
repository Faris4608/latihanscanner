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
public class scanner1{
{
        // TODO code application logic here
       int kkm = 70;
        Scanner nilai = new Scanner(System.in);
        System.out.println("Masukan Nilai Mu :");
        String hasil = nilai.nextLine();
        int foo = Integer.parseInt(hasil);
        if (foo > 100) {
            System.out.println("Maksimal Input Nilai : 100");
        } else if (foo > kkm) {
            System.out.println("Kamu lulus:");
        } else {
            System.out.println("kamu gagal");
        }
 
    }}