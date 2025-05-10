package com.target.Desafio4;

import java.util.HashMap;
import java.util.Map;

public class desafio4 {

    public static void main(String[] args) {
        Map<String, Double> faturamentoEstado = new HashMap<>();
        faturamentoEstado.put("SP", 67836.43);
        faturamentoEstado.put("RJ", 36678.66);
        faturamentoEstado.put("MG", 29229.88);
        faturamentoEstado.put("ES", 27165.48);
        faturamentoEstado.put("Outros", 19849.53);

        double faturamentoTotal = 0;

        for (double valor : faturamentoEstado.values()) {
            faturamentoTotal += valor;
        }

        System.out.println("Faturamento Total Mensal: " + faturamentoTotal);

        System.out.println("Percentual de Representação SP: " + (faturamentoEstado.get("SP") / faturamentoTotal) * 100 + "%");
        System.out.println("Percentual de Representação RJ: " + (faturamentoEstado.get("RJ") / faturamentoTotal) * 100 + "%");
        System.out.println("Percentual de Representação MG: " + (faturamentoEstado.get("MG") / faturamentoTotal) * 100 + "%");
        System.out.println("Percentual de Representação ES: " + (faturamentoEstado.get("ES") / faturamentoTotal) * 100 + "%");
        System.out.println("Percentual Restante: " + (faturamentoEstado.get("Outros") / faturamentoTotal) * 100 + "%");
    }

}

