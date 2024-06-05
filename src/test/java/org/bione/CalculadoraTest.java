package org.bione;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
     void setUp() {
        calculadora = new Calculadora();
    }

    @Test
     void testCalcularIMC() {
        assertEquals(22.86, calculadora.calcularIMC(70, 1.75), 0.01);
    }

    @Test
    void testInterpretarIMCAdultoFemininoPesoBaixoMaximo64() {
        assertEquals("Baixo peso", calculadora.interpretarIMC(56.6, 1.75, 64, "Feminino"));
    }

    @Test
    void testInterpretarIMCAdultoFemininoPesoNormalMinimo64() {
        assertEquals("Peso normal", calculadora.interpretarIMC(56.7, 1.75, 64, "Feminino"));
    }

    @Test
    void testInterpretarIMCAdultoFemininoPesoNormalMaximo64() {
        assertEquals("Peso normal", calculadora.interpretarIMC(75, 1.75, 64, "Feminino"));
    }

    @Test
    void testInterpretarIMCAdultoFemininoSobrepesoMinimo64() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(75.1, 1.75, 64, "Feminino"));
    }

    @Test
    void testInterpretarIMCAdultoFemininoSobrepesoMaximo64() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(90.3, 1.75, 64, "Feminino"));
    }

    @Test
    void testInterpretarIMCAdultoFemininoObesidadeGrauIMinimo64() {
        assertEquals("Obesidade grau I", calculadora.interpretarIMC(90.4, 1.75, 64, "Feminino"));
    }

    @Test
    void testInterpretarIMCAdultoFemininoObesidadeGrauIMaximo64() {
        assertEquals("Obesidade grau I", calculadora.interpretarIMC(105.6, 1.75, 64, "Feminino"));
    }

    @Test
    void testInterpretarIMCAdultoFemininoObesidadeGrauIIMinimo64() {
        assertEquals("Obesidade grau II", calculadora.interpretarIMC(105.7, 1.75, 64, "Feminino"));
    }

    @Test
    void testInterpretarIMCAdultoFemininoObesidadeGrauIIMaximo64() {
        assertEquals("Obesidade grau II", calculadora.interpretarIMC(120.9, 1.75, 64, "Feminino"));
    }

    @Test
    void testInterpretarIMCAdultoFemininoObesidadeGrauIIIMinimo64() {
        assertEquals("Obesidade grau III (obesidade mórbida)", calculadora.interpretarIMC(121, 1.75, 64, "Feminino"));
    }
    @Test
    void testInterpretarIMCAdultoFemininoPesoBaixoMaximo18() {
        assertEquals("Baixo peso", calculadora.interpretarIMC(56.6, 1.75, 18, "Feminino"));
    }

    @Test
    void testInterpretarIMCAdultoFemininoPesoNormalMinimo18() {
        assertEquals("Peso normal", calculadora.interpretarIMC(56.7, 1.75, 18, "Feminino"));
    }

    @Test
    void testInterpretarIMCAdultoFemininoPesoNormalMaximo18() {
        assertEquals("Peso normal", calculadora.interpretarIMC(75, 1.75, 18, "Feminino"));
    }

    @Test
    void testInterpretarIMCAdultoFemininoSobrepesoMinimo18() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(75.1, 1.75, 18, "Feminino"));
    }

    @Test
    void testInterpretarIMCAdultoFemininoSobrepesoMaximo18() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(90.3, 1.75, 18, "Feminino"));
    }

    @Test
    void testInterpretarIMCAdultoFemininoObesidadeGrauIMinimo18() {
        assertEquals("Obesidade grau I", calculadora.interpretarIMC(90.4, 1.75, 18, "Feminino"));
    }

    @Test
    void testInterpretarIMCAdultoFemininoObesidadeGrauIMaximo18() {
        assertEquals("Obesidade grau I", calculadora.interpretarIMC(105.6, 1.75, 18, "Feminino"));
    }

    @Test
    void testInterpretarIMCAdultoFemininoObesidadeGrauIIMinimo18() {
        assertEquals("Obesidade grau II", calculadora.interpretarIMC(105.7, 1.75, 18, "Feminino"));
    }

    @Test
    void testInterpretarIMCAdultoFemininoObesidadeGrauIIMaximo18() {
        assertEquals("Obesidade grau II", calculadora.interpretarIMC(120.9, 1.75, 18, "Feminino"));
    }

    @Test
    void testInterpretarIMCAdultoFemininoObesidadeGrauIIIMinimo18() {
        assertEquals("Obesidade grau III (obesidade mórbida)", calculadora.interpretarIMC(121, 1.75, 18, "Feminino"));
    }

    @Test
    void testInterpretarIMCAdultoMasculinoPesoBaixoMaximo64() {
        assertEquals("Baixo peso", calculadora.interpretarIMC(56.6, 1.75, 64, "Masculino"));
    }

    @Test
     void testInterpretarIMCAdultoMasculinoPesoNormalMinimo64() {
        assertEquals("Peso normal", calculadora.interpretarIMC(56.7, 1.75, 64, "Masculino"));
    }

    @Test
     void testInterpretarIMCAdultoMasculinoPesoNormalMaximo64() {
        assertEquals("Peso normal", calculadora.interpretarIMC(75, 1.75, 64, "Masculino"));
    }

    @Test
     void testInterpretarIMCAdultoMasculinoSobrepesoMinimo64() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(75.1, 1.75, 64, "Masculino"));
    }

    @Test
     void testInterpretarIMCAdultoMasculinoSobrepesoMaximo64() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(90.3, 1.75, 64, "Masculino"));
    }

    @Test
     void testInterpretarIMCAdultoMasculinoObesidadeGrauIMinimo64() {
        assertEquals("Obesidade grau I", calculadora.interpretarIMC(90.4, 1.75, 64, "Masculino"));
    }

    @Test
     void testInterpretarIMCAdultoMasculinoObesidadeGrauIMaximo64() {
        assertEquals("Obesidade grau I", calculadora.interpretarIMC(105.6, 1.75, 64, "Masculino"));
    }

    @Test
     void testInterpretarIMCAdultoMasculinoObesidadeGrauIIMinimo64() {
        assertEquals("Obesidade grau II", calculadora.interpretarIMC(105.7, 1.75, 64, "Masculino"));
    }

    @Test
     void testInterpretarIMCAdultoMasculinoObesidadeGrauIIMaximo64() {
        assertEquals("Obesidade grau II", calculadora.interpretarIMC(120.9, 1.75, 64, "Masculino"));
    }

    @Test
     void testInterpretarIMCAdultoMasculinoObesidadeGrauIIIMinimo64() {
        assertEquals("Obesidade grau III (obesidade mórbida)", calculadora.interpretarIMC(121, 1.75, 64, "Masculino"));
    }

    @Test
    void testInterpretarIMCAdultoMasculinoPesoBaixoMaximo18() {
        assertEquals("Baixo peso", calculadora.interpretarIMC(56.6, 1.75, 18, "Masculino"));
    }

    @Test
    void testInterpretarIMCAdultoMasculinoPesoNormalMinimo18() {
        assertEquals("Peso normal", calculadora.interpretarIMC(56.7, 1.75, 18, "Masculino"));
    }

    @Test
    void testInterpretarIMCAdultoMasculinoPesoNormalMaximo18() {
        assertEquals("Peso normal", calculadora.interpretarIMC(75, 1.75, 18, "Masculino"));
    }

    @Test
    void testInterpretarIMCAdultoMasculinoSobrepesoMinimo18() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(75.1, 1.75, 18, "Masculino"));
    }

    @Test
    void testInterpretarIMCAdultoMasculinoSobrepesoMaximo18() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(90.3, 1.75, 18, "Masculino"));
    }

    @Test
    void testInterpretarIMCAdultoMasculinoObesidadeGrauIMinimo18() {
        assertEquals("Obesidade grau I", calculadora.interpretarIMC(90.4, 1.75, 18, "Masculino"));
    }

    @Test
    void testInterpretarIMCAdultoMasculinoObesidadeGrauIMaximo18() {
        assertEquals("Obesidade grau I", calculadora.interpretarIMC(105.6, 1.75, 18, "Masculino"));
    }

    @Test
    void testInterpretarIMCAdultoMasculinoObesidadeGrauIIMinimo18() {
        assertEquals("Obesidade grau II", calculadora.interpretarIMC(105.7, 1.75, 18, "Masculino"));
    }

    @Test
    void testInterpretarIMCAdultoMasculinoObesidadeGrauIIMaximo18() {
        assertEquals("Obesidade grau II", calculadora.interpretarIMC(120.9, 1.75, 18, "Masculino"));
    }

    @Test
    void testInterpretarIMCAdultoMasculinoObesidadeGrauIIIMinimo18() {
        assertEquals("Obesidade grau III (obesidade mórbida)", calculadora.interpretarIMC(121, 1.75, 18, "Masculino"));
    }

    @Test
    void testInterpretarIMCIdosoMasculinoBaixoPesoMaximo() {
        assertEquals("Baixo peso", calculadora.interpretarIMC(51.6, 1.55, 65, "Masculino"));
    }

    @Test
    void testInterpretarIMCIdosoMasculinoPesoNormalMinimo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(51.7, 1.55, 65, "Masculino"));
    }

    @Test
    void testInterpretarIMCIdosoMasculinoPesoNormalMaximo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(63.6, 1.55, 65, "Masculino"));
    }

    @Test
    void testInterpretarIMCIdosoMasculinoSobrepesoMinimo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(63.7, 1.55, 65, "Masculino"));
    }

    @Test
    void testInterpretarIMCIdosoMasculinoSobrepesoMaximo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(70.8, 1.55, 65, "Masculino"));
    }

    @Test
    void testInterpretarIMCIdosoMasculinoObesidadeGrauIMinimo() {
        assertEquals("Obesidade grau I", calculadora.interpretarIMC(70.9, 1.55, 65, "Masculino"));
    }

    @Test
    void testInterpretarIMCIdosoMasculinoObesidadeGrauIMaximo() {
        assertEquals("Obesidade grau I", calculadora.interpretarIMC(82.8, 1.55, 65, "Masculino"));
    }

    @Test
    void testInterpretarIMCIdosoMasculinoObesidadeGrauIIMinimo() {
        assertEquals("Obesidade grau II", calculadora.interpretarIMC(82.9, 1.55, 65, "Masculino"));
    }

    @Test
    void testInterpretarIMCIdosoMasculinoObesidadeGrauIIMaximo() {
        assertEquals("Obesidade grau II", calculadora.interpretarIMC(94.8, 1.55, 65, "Masculino"));
    }

    @Test
    void testInterpretarIMCIdosoMasculinoObesidadeGrauIIIMinimo() {
        assertEquals("Obesidade grau III (obesidade mórbida)", calculadora.interpretarIMC(94.9, 1.55, 65, "Masculino"));
    }

    @Test
    void testInterpretarIMCIdosaFemininoBaixoPesoMaximo() {
        assertEquals("Baixo peso", calculadora.interpretarIMC(45.2, 1.45, 65, "Feminino"));
    }

    @Test
    void testInterpretarIMCIdosaFemininoPesoNormalMinimo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(45.3, 1.45, 65, "Feminino"));
    }

    @Test
    void testInterpretarIMCIdosaFemininoPesoNormalMaximo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(55.7, 1.45, 65, "Feminino"));
    }

    @Test
    void testInterpretarIMCIdosaFemininoSobrepesoMinimo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(55.8, 1.45, 65, "Feminino"));
    }

    @Test
    void testInterpretarIMCIdosaFemininoSobrepesoMaximo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(66.2, 1.45, 65, "Feminino"));
    }

    @Test
    void testInterpretarIMCIdosaFemininoObesidadeGrauIMinimo() {
        assertEquals("Obesidade grau I", calculadora.interpretarIMC(66.3, 1.45, 65, "Feminino"));
    }

    @Test
    void testInterpretarIMCIdosaFemininoObesidadeGrauIMaximo() {
        assertEquals("Obesidade grau I", calculadora.interpretarIMC(76.7, 1.45, 65, "Feminino"));
    }

    @Test
    void testInterpretarIMCIdosaFemininoObesidadeGrauIIMinimo() {
        assertEquals("Obesidade grau II", calculadora.interpretarIMC(76.8, 1.45, 65, "Feminino"));
    }

    @Test
    void testInterpretarIMCIdosaFemininoObesidadeGrauIIMaximo() {
        assertEquals("Obesidade grau II", calculadora.interpretarIMC(87.2, 1.45, 65, "Feminino"));
    }

    @Test
    void testInterpretarIMCIdosaFemininoObesidadeGrauIIIMinimo() {
        assertEquals("Obesidade grau III (obesidade mórbida)", calculadora.interpretarIMC(87.3, 1.45, 65, "Feminino"));
    }


    @Test
     void testInterpretarIMCCriancaMeninoBaixoPeso2AnosMaximo() {
        assertEquals("Baixo peso", calculadora.interpretarIMC(11.7, 0.90, 2, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoPesoNormal2AnosMinimo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(11.8, 0.90, 2, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoPesoNormal2AnosMaximo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(14.9, 0.90, 2, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoSobrepeso2AnosMinimo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(15, 0.90, 2, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoSobrepeso2AnosMaximo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(15.7, 0.90, 2, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoObesidade2AnosMinimo() {
        assertEquals("Obesidade", calculadora.interpretarIMC(15.8, 0.90, 2, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaBaixoPeso2AnosMaximo() {
        assertEquals("Baixo peso", calculadora.interpretarIMC(10.4, 0.85, 2, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaPesoNormal2AnosMinimo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(10.5, 0.85, 2, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaPesoNormal2AnosMaximo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(12.6, 0.85, 2, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaSobrepeso2AnosMinimo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(12.7, 0.85, 2, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaSobrepeso2AnosMaximo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(13.3, 0.85, 2, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaObesidade2AnosMinimo() {
        assertEquals("Obesidade", calculadora.interpretarIMC(13.4, 0.85, 2, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoBaixoPeso4AnosMaximo() {
        assertEquals("Baixo peso", calculadora.interpretarIMC(14.8, 1.05, 4, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoPesoNormal4AnosMinimo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(14.9, 1.05, 4, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoPesoNormal4AnosMaximo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(19.2, 1.05, 4, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoSobrepeso4AnosMinimo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(19.3, 1.05, 4, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoSobrepeso4AnosMaximo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(20.3, 1.05, 4, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoObesidade4AnosMinimo() {
        assertEquals("Obesidade", calculadora.interpretarIMC(20.4, 1.05, 4, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaBaixoPeso4AnosMaximo() {
        assertEquals("Baixo peso", calculadora.interpretarIMC(13.4, 1.00, 4, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaPesoNormal4AnosMinimo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(13.5, 1.00, 4, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaPesoNormal4AnosMaximo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(17.4, 1.00, 4, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaSobrepeso4AnosMinimo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(17.5, 1.00, 4, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaSobrepeso4AnosMaximo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(18.4, 1.00, 4, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaObesidade4AnosMinimo() {
        assertEquals("Obesidade", calculadora.interpretarIMC(18.5, 1.00, 4, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoBaixoPeso6AnosMaximo() {
        assertEquals("Baixo peso", calculadora.interpretarIMC(17.8, 1.15, 6, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoPesoNormal6AnosMinimo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(17.9, 1.15, 6, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoPesoNormal6AnosMaximo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(23.1, 1.15, 6, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoSobrepeso6AnosMinimo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(23.2, 1.15, 6, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoSobrepeso6AnosMaximo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(24.4, 1.15, 6, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoObesidade6AnosMinimo() {
        assertEquals("Obesidade", calculadora.interpretarIMC(24.5, 1.15, 6, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaBaixoPeso6AnosMaximo() {
        assertEquals("Baixo peso", calculadora.interpretarIMC(16.3, 1.10, 6, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaPesoNormal6AnosMinimo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(16.4, 1.10, 6, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaPesoNormal6AnosMaximo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(21.1, 1.10, 6, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaSobrepeso6AnosMinimo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(21.2, 1.10, 6, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaSobrepeso6AnosMaximo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(22.3, 1.10, 6, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaObesidade6AnosMinimo() {
        assertEquals("Obesidade", calculadora.interpretarIMC(22.4, 1.10, 6, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoBaixoPeso8AnosMaximo() {
        assertEquals("Baixo peso", calculadora.interpretarIMC(21, 1.25, 8, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoPesoNormal8AnosMinimo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(21.1, 1.25, 8, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoPesoNormal8AnosMaximo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(28.9, 1.25, 8, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoSobrepeso8AnosMinimo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(29, 1.25, 8, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoSobrepeso8AnosMaximo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(30.4, 1.25, 8, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoObesidade8AnosMinimo() {
        assertEquals("Obesidade", calculadora.interpretarIMC(30.5, 1.25, 8, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaBaixoPeso8AnosMaximo() {
        assertEquals("Baixo peso", calculadora.interpretarIMC(19.4, 1.20, 8, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaPesoNormal8AnosMinimo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(19.5, 1.20, 8, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaPesoNormal8AnosMaximo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(26.6, 1.20, 8, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaSobrepeso8AnosMinimo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(26.7, 1.20, 8, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaSobrepeso8AnosMaximo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(28, 1.20, 8, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaObesidade8AnosMinimo() {
        assertEquals("Obesidade", calculadora.interpretarIMC(28.1, 1.20, 8, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoBaixoPeso10AnosMaximo() {
        assertEquals("Baixo peso", calculadora.interpretarIMC(26.4, 1.35, 10, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoPesoNormal10AnosMinimo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(26.5, 1.35, 10, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoPesoNormal10AnosMaximo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(35.5, 1.35, 10, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoSobrepeso10AnosMinimo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(35.6, 1.35, 10, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoSobrepeso10AnosMaximo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(39.1, 1.35, 10, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoObesidade10AnosMinimo() {
        assertEquals("Obesidade", calculadora.interpretarIMC(39.2, 1.35, 10, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaBaixoPeso10AnosMaximo() {
        assertEquals("Baixo peso", calculadora.interpretarIMC(24.5, 1.30, 10, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaPesoNormal10AnosMinimo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(24.6, 1.30, 10, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaPesoNormal10AnosMaximo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(32.9, 1.30, 10, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaSobrepeso10AnosMinimo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(33, 1.30, 10, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaSobrepeso10AnosMaximo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(36.3, 1.30, 10, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaObesidade10AnosMinimo() {
        assertEquals("Obesidade", calculadora.interpretarIMC(36.4, 1.30, 10, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoBaixoPeso12AnosMaximo() {
        assertEquals("Baixo peso", calculadora.interpretarIMC(30.4, 1.45, 12, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoPesoNormal12AnosMinimo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(30.5, 1.45, 12, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoPesoNormal12AnosMaximo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(45.2, 1.45, 12, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoSobrepeso12AnosMinimo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(45.3, 1.45, 12, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoSobrepeso12AnosMaximo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(47.3, 1.45, 12, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninoObesidade12AnosMinimo() {
        assertEquals("Obesidade", calculadora.interpretarIMC(47.4, 1.45, 12, "Masculino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaBaixoPeso12AnosMaximo() {
        assertEquals("Baixo peso", calculadora.interpretarIMC(30.3, 1.40, 12, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaPesoNormal12AnosMinimo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(30.4, 1.40, 12, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaPesoNormal12AnosMaximo() {
        assertEquals("Peso normal", calculadora.interpretarIMC(42.1, 1.40, 12, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaSobrepeso12AnosMinimo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(42.2, 1.40, 12, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaSobrepeso12AnosMaximo() {
        assertEquals("Sobrepeso", calculadora.interpretarIMC(44, 1.40, 12, "Feminino"));
    }

    @Test
     void testInterpretarIMCCriancaMeninaObesidade12AnosMinimo() {
        assertEquals("Obesidade", calculadora.interpretarIMC(44.1, 1.40, 12, "Feminino"));
    }

}
