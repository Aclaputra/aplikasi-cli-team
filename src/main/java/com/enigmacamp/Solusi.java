package com.enigmacamp;

interface SolusiInterface {
    void NilaiTerbesarDanTerkecil();
    void MencariNilaiMinusTerbesarYangHilang();
    void CutTheBamboo();
    void MencariNamaGanjil();
}
public class Solusi implements SolusiInterface{
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

    }

    @Override
    public void CutTheBamboo() {

    }

    @Override
    public void MencariNamaGanjil() {

    }
}
