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

    }

    @Override
    public void MencariNamaGanjil() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        input.split("//+g");
    }
}
