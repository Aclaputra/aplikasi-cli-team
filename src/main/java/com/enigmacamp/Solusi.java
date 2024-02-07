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
