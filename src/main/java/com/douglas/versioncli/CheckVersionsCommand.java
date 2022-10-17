package com.douglas.versioncli;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import picocli.CommandLine;
import picocli.CommandLine.Parameters;

import java.util.concurrent.Callable;

import static com.douglas.versioncli.util.CompareVersionsUtils.compareVersions;


@Component
@RequiredArgsConstructor
@EqualsAndHashCode()
@CommandLine.Command(
        name = "CheckVersions",
        description = "it receive two different versions and compare it"
)
public class CheckVersionsCommand implements Callable<Integer> {

    @Parameters(index = "0", description = "1st version")
    private String version1;

    @Parameters(index = "1", description = "2nd version")
    private String version2;

    public Integer call(){
        Integer result = compareVersions(version1, version2);
        System.out.println(result);
        return result;
    }

}
