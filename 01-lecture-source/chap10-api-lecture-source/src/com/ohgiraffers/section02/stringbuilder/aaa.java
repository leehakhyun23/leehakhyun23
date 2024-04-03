package com.ohgiraffers.section02.stringbuilder;

import java.util.StringTokenizer;

public class aaa {
    public static void main(String[] args) {

        String colorStr = "red*orange#blue/yellow green";
        StringTokenizer colorTokenizer = new StringTokenizer(colorStr, "*#/ ");
        while (colorTokenizer.hasMoreTokens()){
            System.out.println("colorTokenizer : " + colorTokenizer.nextToken());
        }
    }
}
