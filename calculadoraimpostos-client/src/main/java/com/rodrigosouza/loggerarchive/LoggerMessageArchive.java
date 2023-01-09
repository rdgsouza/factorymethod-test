package com.rodrigosouza.loggerarchive;

import com.rodrigosouza.createlogger.LoggerCreatetor;
import com.rodrigosouza.logger.Logger;

public class LoggerMessageArchive extends Logger {

    @Override
    protected LoggerCreatetor loggerCreate() {
        return new LoggerCreatetorArchive();
    }
}
