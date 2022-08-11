package com.roshan.practice;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {
    String ver = "03.02.01_03_________";
       String result =  getPatternTwoResult(ver);
        System.out.println(result);
    }

    private static String getPatternTwoResult(String version) {
        StringBuilder verBuff = new StringBuilder();
        try {
            String ver = version.substring(0, version.indexOf("_"));
            String[] result = ver.split("\\.");
            for (int i = 0; i < result.length; i++) {
                verBuff.append(stripStartingZeros(result[i]));
                verBuff.append(".");
            }
            verBuff.deleteCharAt(verBuff.length() - 1);

        } catch (Exception e) {
            //LOGGER.error("Error in pattern2 ", e);
        }

        return verBuff.toString();

    }

    private static String stripStartingZeros(final String number) {
        String num = StringUtils.stripStart(number, "0");
        if (num.isEmpty()) {
            return "0";
        }
        return num;
    }
}
