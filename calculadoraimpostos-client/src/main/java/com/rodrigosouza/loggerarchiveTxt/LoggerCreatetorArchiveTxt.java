package com.rodrigosouza.loggerarchiveTxt;

import com.rodrigosouza.createlogger.LoggerCreatetor;

public class LoggerCreatetorArchiveTxt implements LoggerCreatetor {

    private static final String loggerTypeArchive = " * Logger do tipo: Txt * ";

    @Override
    public void print(String msg) {
        //Aqui iria ter a logica para gerar um arquivo txt com a msg passada para o log
        //Mais resolvir só printar na console! rs :p
        System.out.println(msg + loggerTypeArchive);
    }
}