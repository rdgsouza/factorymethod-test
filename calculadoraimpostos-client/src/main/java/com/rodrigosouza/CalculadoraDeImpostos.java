package com.rodrigosouza;

import com.rodrigosouza.logger.Logger;

import java.util.Scanner;

public class CalculadoraDeImpostos {

    private Logger logger;

    public CalculadoraDeImpostos(Logger logger) {
        this.logger = logger;
    }

    public void calcular() {

        System.out.println("Digite o seu sálario bruto");

        Scanner teclado = new Scanner(System.in);

        double valor = teclado.nextDouble();

        if (valor < 1900) {
            logger.log("não ha dedução fiscal");

        } else if (valor >= 1900.00 && valor < 2800.00) {
            logger.log("A dedução fiscal é de 7.5%");
            logger.log("Voce deve deduzir o valor de " + valor * 0.075 + " reais");

        } else if (valor >= 2800.00 && valor < 3751.00) {
            logger.log("A dedução fiscal é de 15%");
            logger.log("Voce deve deduzir o valor de " + valor * 0.15 + " reais");

        } else if (valor >= 3751.00 && valor < 4664.00) {
            logger.log("A dedução fiscal é de 22,5%");
            logger.log("Voce deve deduzir o valor de " + valor * 0.225 + " reais");

        } else {
            logger.log("A dedução fiscal é de 27,5%");
            logger.log("Voce deve deduzir o valor de " + valor * 0.275 + " reais");

        }

    }
}