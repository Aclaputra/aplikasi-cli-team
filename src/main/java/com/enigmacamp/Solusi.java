package com.enigmacamp;

import java.util.Arrays;
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
        int[] ruasBambu = new int[ruasInput.length];
        for (int i = 0; i < ruasInput.length; i++) {
            ruasBambu[i] = Integer.parseInt(ruasInput[i]);
        }

        // Input jumlah siklus pemotongan
        System.out.print("Number of cutting cycles: ");
        int jumlahSiklus = scanner.nextInt();

        // Simulasi pemotongan ruas bambu
        for (int siklus = 1; siklus <= jumlahSiklus; siklus++) {
            for (int i = 0; i < ruasBambu.length; i++) {
                ruasBambu[i]--;
            }
            System.out.print("\nCycle Cuts " + siklus + ":\n");
            for (int i = 0; i < ruasBambu.length; i++) {
                System.out.print(ruasBambu[i] + " ");
            }
        }

        System.out.println();
    }

    @Override
    public void MencariNamaGanjil() {
        Scanner sc = new Scanner(System.in);
        String[] splittedInput = sc.nextLine().split("\\s+");

        String output = "";
        for (int i=0; i<splittedInput.length; i++) {
            String nama = splittedInput[i];
            if (nama.length() % 2 == 1) {
                output += nama;
                if (i != splittedInput.length -2)
                    output += ",";
            }

        }

        System.out.println(output);
    }
}
