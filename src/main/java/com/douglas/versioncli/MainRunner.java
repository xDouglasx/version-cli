package com.douglas.versioncli;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;
import picocli.CommandLine;

@Component
@RequiredArgsConstructor
public class MainRunner implements CommandLineRunner, ExitCodeGenerator {

    private final CheckVersionsCommand command;

    private final CommandLine.IFactory factory;

    private int exitCode;

    @Override
    public void run(String... args) {
        exitCode = new CommandLine(command, factory).execute(args);
    }

    @Override
    public int getExitCode() {
        return exitCode;
    }
}
