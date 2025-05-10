package com.target.Desafio5;

import java.util.Scanner;

public class desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma Palavra ou Frase:");
        String entrada = scanner.nextLine();
        
        String inverso = "";

        for (int i = entrada.length() - 1; i >= 0; i--) {
            inverso += entrada.charAt(i);
        }

        System.out.println("Linha invertida: " + inverso);
    }
}
