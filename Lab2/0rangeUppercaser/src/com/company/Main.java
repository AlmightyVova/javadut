package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        replaceWithUpperCase("asderfdhgjvbn");
    }

    static void replaceWithUpperCase(String str) {
        Matcher m = Pattern.compile("[h-t]").matcher(str);

        StringBuilder sb = new StringBuilder();
        int last = 0;
        while (m.find()) {
            System.out.println("Before: "+sb);
            sb.append(str, last, m.start());
            System.out.println("After: "+sb);
            sb.append(m.group(0).toUpperCase());
            last = m.end();
        }
        sb.append(str.substring(last));
        System.out.println(sb.toString());
    }
}
