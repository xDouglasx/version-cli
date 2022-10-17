package com.douglas.versioncli.util;

import org.junit.jupiter.api.Test;

import static com.douglas.versioncli.util.CompareVersionsUtils.compareVersions;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareVersionsUtilsTest {

    @Test
    public void secondVersionIsHigher(){

        String version1 = "1.2.3";
        String version2 = "1.2.3.4";

        assertEquals(compareVersions(version1, version2), -1);
    }

    @Test
    public void firstVersionIsHigher(){

        String version1 = "1.2.3.4";
        String version2 = "1.2.3.3.1";

        assertEquals(compareVersions(version1, version2), 1);
    }

    @Test
    public void equalVersions(){

        String version1 = "1.2.3.4.29";
        String version2 = "1.2.3.4.29";

        assertEquals(compareVersions(version1, version2), 0);
    }

    @Test
    public void equalVersions_1digit(){

        String version1 = "1";
        String version2 = "1";

        assertEquals(compareVersions(version1, version2), 0);
    }
}
