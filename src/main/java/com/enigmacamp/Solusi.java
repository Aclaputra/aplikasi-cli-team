package com.enigmacamp;

import java.util.Arrays;
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
        int[] numbers = {6, 2, 4, 10, 5};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("max: " + max + " min: " + min);
    }

    @Override
    public void MencariNilaiMinusTerbesarYangHilang() {
        System.out.println(findMin(new Integer[]{0, 2, 4, -1, -3, -4}));
    }

    public static Integer findMin(Integer[] numbers) {
        int missing = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    // Tukar elemen jika tidak dalam urutan yang benar
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                if (i == 0 && numbers[i] != -1) {
                    missing = -2;
                } else if (i > 0 && numbers[i] - numbers[i - 1] > 1) {
                    missing = numbers[i - 1] + 1;
                }
            }
        }

        if (missing == 0 && numbers[numbers.length - 1] < 0) {
            missing = numbers[numbers.length - 1] + 1;
        }

        return missing;

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
