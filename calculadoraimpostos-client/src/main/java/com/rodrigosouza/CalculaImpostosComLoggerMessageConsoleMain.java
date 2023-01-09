package com.rodrigosouza;

import com.rodrigosouza.loggerarchive.LoggerMessageArchive;
import com.rodrigosouza.loggerconsole.LoggerMessageConsole;

public class CalculaImpostosComLoggerMessageConsoleMain {

    public static void main(String[] args) {

        LoggerMessageConsole loggerMessageConsole = new LoggerMessageConsole();

        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos(loggerMessageConsole);

        calculadoraDeImpostos.calcular();
    }

}
