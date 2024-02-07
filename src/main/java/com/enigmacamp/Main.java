package com.enigmacamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solusi solusi = new Solusi();


        boolean keluar = false;
        while (!keluar) {
            System.out.println("""
            +----------------------------------------------------+
            | 1. Mencari Nilai Terkecil dan Terbesar             |
            | 2. Mencari Elemen/Nilai Minus Terbesar yang Hilang |
            | 3. Cut The Bamboo                                  |
            | 4. Mencari Nama yang Ganjil                        |
            | X. Keluar                                          |
            +----------------------------------------------------+
            Pilih Opsi Menu: XX      
            """);
            String input = sc.nextLine();
            switch (input) {
                case "1":
                    System.out.println("== output ==");
                    solusi.NilaiTerbesarDanTerkecil();
                    break;
                case "2":
                    System.out.println("== output ==");
                    solusi.MencariNilaiMinusTerbesarYangHilang();
                    break;
                case "3":
                    System.out.println("== output ==");
                    solusi.CutTheBamboo();
                    break;
                case "4":
                    System.out.println("== output ==");
                    solusi.MencariNamaGanjil();
                    break;
                case "x":
                    keluar = true;
                    break;
                default:
                    System.out.println("pilihan opsi tidak ditemukan, silahkan coba lagi.");
            }
        }
    }
}