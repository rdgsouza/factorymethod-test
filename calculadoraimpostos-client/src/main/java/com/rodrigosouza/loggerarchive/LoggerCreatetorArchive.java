package com.rodrigosouza.loggerarchive;

import com.rodrigosouza.createlogger.LoggerCreatetor;

public class LoggerCreatetorArchive implements LoggerCreatetor {

    private static final String loggerTypeArchive = " * Logger do tipo: Archive * ";

    @Override
    public void print(String msg) {
        System.out.println(msg + loggerTypeArchive);
    }
}