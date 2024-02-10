package com.cli.application;

import java.util.ArrayList;
import java.util.Scanner;

interface SolusiInterface {
    void NilaiTerbesarDanTerkecil();
    void MencariNilaiMinusTerbesarYangHilang();
    void CutTheBamboo();
    void MencariNamaGanjil();
}

public class Solusi implements SolusiInterface {
    @Override
    public void NilaiTerbesarDanTerkecil() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String[] strNum = sc.nextLine().split("[,]",0);
        for (String str : strNum) {
            numbers.add(Integer.parseInt(str));
        }

        int max = numbers.get(0);
        int min = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
            if (numbers.get(i)< min) {
                min = numbers.get(i);
            }
        }

        System.out.println("max: " + max + " min: " + min);
    }

    @Override
    public void MencariNilaiMinusTerbesarYangHilang() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String[] strNum = sc.nextLine().split("[,]",0);
        for (String str : strNum) {
            numbers.add(Integer.parseInt(str));
        }
        System.out.println(findMin(numbers));
    }

    public static Integer findMin(ArrayList<Integer> numbers) {
        int missing = 0;

        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) > numbers.get(j)) {
                    // Tukar elemen jika tidak dalam urutan yang benar
                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0) {
                if (i == 0 && numbers.get(i) != -1) {
                    missing = -2;
                } else if (i > 0 && numbers.get(i) - numbers.get(i - 1) > 1) {
                    missing = numbers.get(i - 1) + 1;
                }
            }
        }

        if (missing == 0 && numbers.get(numbers.size() - 1) < 0) {
            missing = numbers.get(numbers.size() - 1) + 1;
        }

        return missing;

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
            System.out.print("|");
            for (int j = 0; j < ruasBambu[i]; j++) {
                System.out.print("-");
            }
            System.out.println();
        }

        // Simulasi pemotongan ruas bambu
        for (int siklus = 1; siklus <= jumlahSiklus; siklus++) {
            for (int i = 0; i < ruasBambu.length; i++) {
                ruasBambu[i]--;
            }
            System.out.print("\nCycle Cuts " + siklus + ":\n");
            for (int i = 0; i < ruasBambu.length; i++) {
//                System.out.print(ruasBambu[i] + " ");
                System.out.print("|");
                for (int j = 0; j < ruasBambu[i]; j++) {
                    System.out.print("-");
                }
                System.out.println();
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
                // bisa pakai substring
                if (i != splittedInput.length -2)
                    output += ",";
            }
        }

        System.out.println(output);
    }
}
