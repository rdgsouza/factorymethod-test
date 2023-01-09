package com.rodrigosouza.loggerarchiveTxt;

import com.rodrigosouza.createlogger.LoggerCreatetor;
import com.rodrigosouza.logger.Logger;

public class LoggerMessageArchiveTxt extends Logger {

    @Override
    protected LoggerCreatetor loggerCreate() {
        return new LoggerCreatetorArchiveTxt();
    }
}
