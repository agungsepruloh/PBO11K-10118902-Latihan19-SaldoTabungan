package com.pbo;

import java.util.Locale;

/*
 * #Author
 * Nama  : Agung Sepruloh
 * Kelas : IF-11K
 * NIM   : 10118902
 * Deskripsi program: program ini akan menampilkan saldo tabungan selama 6 bulan berturut-turut dengan bunga 5% perbulan
 *
 */

public class SaldoTabungan {

    public static void main(String[] args) {
        int saldo_awal = 2500000;
        int saldo_akhir = saldo_awal;
        for (int i = 1; i <= 6; i++) {
            saldo_akhir += saldo_akhir * 15 / 100;
            System.out.print("Saldo di bulan ke-".concat(String.valueOf(i)));
            System.out.println(String.format(Locale.ROOT, " Rp %,3d",  saldo_akhir).replace(",", "."));
        }
    }
}