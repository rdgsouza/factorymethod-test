package com.rodrigosouza.loggerconsole;

import com.rodrigosouza.createlogger.LoggerCreatetor;

public class LoggerCreatetorConsole implements LoggerCreatetor {

    private static final String loggerTypeConsole = " * Logger do tipo: Console * ";

    @Override
    public void print(String msg) {
        System.out.println(msg + loggerTypeConsole);
    }
}
