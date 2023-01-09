package com.rodrigosouza.loggerconsole;

import com.rodrigosouza.createlogger.LoggerCreatetor;
import com.rodrigosouza.logger.Logger;

public class LoggerMessageConsole extends Logger {

    @Override
    protected LoggerCreatetor loggerCreate() {
        return new LoggerCreatetorConsole();
    }
}
