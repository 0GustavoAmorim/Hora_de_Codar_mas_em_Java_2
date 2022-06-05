package com.company;

import java.util.Scanner;

public class Ex_19 {
    public static void main(String[] args) {
        double vParcelas = 0;
        int p;
        Scanner in = new Scanner(System.in);
        System.out.println("Informe em quantas parcelas deseja pagar:  ");
        p = in.nextInt();

        if (p > 15){
            System.out.println("O limite de parcelas é 15!");
        }
        else {
            vParcelas = 18.230 / p;
        }
        System.out.printf("Parcelado em %dx você pagara R$ %.3f nas parcelas", p, vParcelas);
    }
}
