package com.rodrigosouza;

import com.rodrigosouza.loggerarchive.LoggerMessageArchive;
import com.rodrigosouza.loggerconsole.LoggerMessageConsole;

public class CalculaImpostosComLoggerMessageArchiveMain {

    public static void main(String[] args) {

        LoggerMessageArchive loggerMessageArchive = new LoggerMessageArchive();

        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos(loggerMessageArchive);

        calculadoraDeImpostos.calcular();
    }

}
