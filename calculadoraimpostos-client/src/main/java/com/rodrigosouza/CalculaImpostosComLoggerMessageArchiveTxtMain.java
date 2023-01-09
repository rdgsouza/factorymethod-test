package com.rodrigosouza;

import com.rodrigosouza.loggerarchiveTxt.LoggerMessageArchiveTxt;

public class CalculaImpostosComLoggerMessageArchiveTxtMain {

    public static void main(String[] args) {

        LoggerMessageArchiveTxt loggerMessageArchiveTxt = new LoggerMessageArchiveTxt();

        CalculadoraDeImpostos calculadoraDeImpostos =
                new CalculadoraDeImpostos(loggerMessageArchiveTxt);

        calculadoraDeImpostos.calcular();
    }

}
