package com.rodrigosouza.logger;

import com.rodrigosouza.createlogger.LoggerCreatetor;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Logger {

    protected abstract LoggerCreatetor loggerCreate();

    public void log(String message){
        LoggerCreatetor logger = loggerCreate();
        String dateTime = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
        logger.print(message + " (Logger gerado: Data e hora: " + dateTime + ")");
    }
}