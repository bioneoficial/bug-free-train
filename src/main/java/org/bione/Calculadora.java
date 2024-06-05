package org.bione;

import java.util.HashMap;
import java.util.Map;

public class Calculadora {

    private static final Map<Integer, double[]> percentisMeninos = new HashMap<>();
    private static final Map<Integer, double[]> percentisMeninas = new HashMap<>();

    static {
        percentisMeninos.put(2, new double[]{14.9, 18.4, 19.2});
        percentisMeninos.put(4, new double[]{14.0, 17.8, 18.8});
        percentisMeninos.put(6, new double[]{13.7, 17.7, 18.8});
        percentisMeninos.put(8, new double[]{13.7, 18.6, 19.8});
        percentisMeninos.put(10, new double[]{14.2, 19.8, 21.2});
        percentisMeninos.put(12, new double[]{15.0, 21.2, 22.7});

        percentisMeninas.put(2, new double[]{14.6, 18.0, 18.8});
        percentisMeninas.put(4, new double[]{13.9, 17.3, 18.4});
        percentisMeninas.put(6, new double[]{13.7, 17.3, 18.6});
        percentisMeninas.put(8, new double[]{13.9, 18.3, 19.6});
        percentisMeninas.put(10, new double[]{14.5, 19.7, 21.1});
        percentisMeninas.put(12, new double[]{15.3, 21.3, 22.6});
    }

    public double calcularIMC(double peso, double altura) {
        if (altura <= 0 || peso <= 0) {
            throw new IllegalArgumentException("Peso e altura devem ser maiores que zero.");
        }
        return peso / (altura * altura);
    }

    public String interpretarIMC(double peso, double altura, int idade, String genero) {
        double imc = calcularIMC(peso, altura);
        if (idade < 18) {
            return interpretarIMCCriancas(imc, idade, genero);
        } else if (idade >= 65) {
            return interpretarIMCIdosos(imc, genero);
        } else {
            return interpretarIMCAdultos(imc);
        }
    }

    private String interpretarIMCAdultos(double imc) {
        int imcInt = (int) Math.round(imc);
        if (imcInt < 16) {
            return "Baixo peso muito grave";
        } else if (imcInt >= 16 && imcInt < 17) {
            return "Baixo peso grave";
        } else if (imcInt >= 17 && imcInt < 18.5) {
            return "Baixo peso";
        } else if (imcInt >= 18.5 && imcInt < 25) {
            return "Peso normal";
        } else if (imcInt >= 25 && imcInt < 30) {
            return "Sobrepeso";
        } else if (imcInt >= 30 && imcInt < 35) {
            return "Obesidade grau I";
        } else if (imcInt >= 35 && imcInt < 40) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III (obesidade mórbida)";
        }
    }

    private String interpretarIMCIdosos(double imc, String genero) {
        int imcInt = (int) Math.round(imc);
        if (genero.equals("Feminino")) {
            if (imcInt < 22) {
                return "Baixo peso";
            } else if (imcInt >= 22 && imcInt < 27) {
                return "Peso normal";
            } else if (imcInt >= 27 && imcInt < 32) {
                return "Sobrepeso";
            } else if (imcInt >= 32 && imcInt < 37) {
                return "Obesidade grau I";
            } else if (imcInt >= 37 && imcInt < 42) {
                return "Obesidade grau II";
            } else {
                return "Obesidade grau III (obesidade mórbida)";
            }
        } else {
            if (imcInt < 22) {
                return "Baixo peso";
            } else if (imcInt >= 22 && imcInt < 27) {
                return "Peso normal";
            } else if (imcInt >= 27 && imcInt < 30) {
                return "Sobrepeso";
            } else if (imcInt >= 30 && imcInt < 35) {
                return "Obesidade grau I";
            } else if (imcInt >= 35 && imcInt < 40) {
                return "Obesidade grau II";
            } else {
                return "Obesidade grau III (obesidade mórbida)";
            }
        }
    }

    private String interpretarIMCCriancas(double imc, int idade, String genero) {
        int imcInt = (int) Math.round(imc);
        double[] percentis;

        if (genero.equalsIgnoreCase("Masculino")) {
            percentis = percentisMeninos.get(idade);
        } else {
            percentis = percentisMeninas.get(idade);
        }

        if (percentis == null) {
            throw new IllegalArgumentException("Idade não suportada para cálculo de IMC infantil.");
        }

        if (imcInt < percentis[0]) {
            return "Baixo peso";
        } else if (imcInt >= percentis[0] && imcInt < percentis[1]) {
            return "Peso normal";
        } else if (imcInt >= percentis[1] && imcInt < percentis[2]) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}
