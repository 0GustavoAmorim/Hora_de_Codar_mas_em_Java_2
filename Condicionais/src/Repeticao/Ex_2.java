package Repeticao;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        int n=0, maior = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 3; i++){
            System.out.printf("Informe o %dº numero", i);
            n = in.nextInt();
            if (n > maior){
                maior = n;
            }
        }
        System.out.println("É o maior " + maior);
    }
}
