package com.douglas.versioncli.util;


public class CompareVersionsUtils {

    private static final String SPLIT_REG_EX  = "\\.";

    public static Integer compareVersions(String version1, String version2){
        String[] version1String = version1.split(SPLIT_REG_EX);
        String[] version2String = version2.split(SPLIT_REG_EX);

        //check which version has the higher length
        int maxSize = Math.max(version1String.length, version2String.length);

        //compare each major.minor.etc numbers
        for(int n = 0; n < maxSize; n++){
            int v1 = n < version1String.length ? Integer.parseInt(version1String[n]) : 0;
            int v2 = n < version2String.length ? Integer.parseInt(version2String[n]) : 0;

            if(v1 > v2) return 1;
            if(v2 > v1) return -1;
        }
        return 0;
    }
}
