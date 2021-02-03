package com.serverless;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResponderModel {

    private final String teamName = "XtreamCoder";

    public String answer(String question) {
        if ("".equals(question)){
            return teamName;
        }

        Matcher sumMatcher = Pattern.compile(".*what is the sum of (\\d+) and (\\d+)").matcher(question);
        if (sumMatcher.matches()) {
            return String.valueOf(Integer.parseInt(sumMatcher.group(1)) + Integer.parseInt(sumMatcher.group(2)));
        }

        Matcher nameMatcher = Pattern.compile(".*: what is your name").matcher(question);
        if (nameMatcher.matches()) {
            return teamName;
        }

        Matcher plusMatcher = Pattern.compile(".*: what is (\\d+) plus (\\d+):").matcher(question);
        if (plusMatcher.matches()) {
            if(Integer.parseInt(plusMatcher.group(1)) > Integer.parseInt(plusMatcher.group(2)) ){
                return plusMatcher.group(1);
            }else{
                return plusMatcher.group(2);
            }

        }


        return teamName;
    }

}