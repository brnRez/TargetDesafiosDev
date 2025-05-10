package com.target.Desafio2;

import java.util.Scanner;

public class desafio2 {
    public static boolean fibonacci(int n){
        int a = 0;
        int b = 1;

        while (b < n) {
            int prox = a+b;
            a = b;
            b = prox;
            
        }

        return (b == n || n == 0);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Verificador de Fibonacci");
        System.out.println("----------------------");
        System.out.println("Digite um número inteiro:");
        int n = scanner.nextInt();
        if (fibonacci(n)){
            System.out.println("O Número Pertence a Sequência.");
        }else{
            System.out.println("O Número Não Pertence a Sequência.");
        }
    }

}
