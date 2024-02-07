package com.enigmacamp;

import java.util.Scanner;

interface SolusiInterface {
    void NilaiTerbesarDanTerkecil();
    void MencariNilaiMinusTerbesarYangHilang();
    void CutTheBamboo();
    void MencariNamaGanjil();
}
public class Solusi implements SolusiInterface{
    @Override
    public void NilaiTerbesarDanTerkecil() {

    }

    @Override
    public void MencariNilaiMinusTerbesarYangHilang() {

    }

    @Override
    public void CutTheBamboo() {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah bambu dan panjang ruasnya
        System.out.print("Initials (separate with commas): ");
        String[] ruasInput = scanner.nextLine().split(",");

        // Input jumlah siklus pemotongan
        System.out.print("Number of cutting cycles: ");
        int jumlahSiklus = scanner.nextInt();

        // Konversi array string dari input menjadi int dan print bambu input
        int[] ruasBambu = new int[ruasInput.length];
        System.out.println("Initials: ");
        for (int i = 0; i < ruasInput.length; i++) {
            ruasBambu[i] = Integer.parseInt(ruasInput[i]);
            System.out.print("\n|");
            for (int j = 0; j < ruasBambu[i]; j++) {
                System.out.print("-");
            }
        }

        // Simulasi pemotongan ruas bambu
        for (int siklus = 1; siklus <= jumlahSiklus; siklus++) {
            for (int i = 0; i < ruasBambu.length; i++) {
                ruasBambu[i]--;
            }
            System.out.print("\nCycle Cuts " + siklus + ":\n");
            for (int i = 0; i < ruasBambu.length; i++) {
//                System.out.print(ruasBambu[i] + " ");
                System.out.print("\n|");
                for (int j = 0; j < ruasBambu[i]; j++) {
                    System.out.print("-");
                }
            }
        }
        System.out.println();
    }

    @Override
    public void MencariNamaGanjil() {

    }
}
