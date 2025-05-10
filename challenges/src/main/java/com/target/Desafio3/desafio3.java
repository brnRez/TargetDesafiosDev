package com.target.Desafio3;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class desafio3 {

    public static void main(String[] args) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            List<faturamento> faturamentos = mapper.readValue(new File("challenges\\src\\main\\java\\com\\target\\Desafio3\\faturamento.json"),
            new TypeReference<List<faturamento>>(){}
            );

            double menor = Double.MAX_VALUE;
            double maior = Double.MIN_VALUE;
            double soma = 0;
            int diasComFaturamento = 0;

            for (faturamento f : faturamentos) {
                double valor = f.getValor();
                if (valor >0 ){
                    if (valor<menor) menor = valor;
                    if (valor>maior) maior = valor;
                    soma+=valor;
                    diasComFaturamento++;
                }
            }

            double mediaMensal = soma / diasComFaturamento;

            int diasAcimaDaMedia = 0;
            for (faturamento f : faturamentos){
                if (f.getValor() > mediaMensal){
                    diasAcimaDaMedia++;
                }
            }

            System.out.println("Menor Faturamento: " + menor);
            System.out.println("Maior Faturamento: " + maior);
            System.out.println("Média Mensal: " + mediaMensal);
            System.out.println("Dias com Faturamento acima da média: " + diasAcimaDaMedia);

            
        }catch (IOException e) {
            System.err.println("Verifique o Arquivo JSON, Erro: " + e.getMessage());
        }
    
    
}

}
