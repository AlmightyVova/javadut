package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void main() {
        String str = "kftjewkfdmbnmcv,ngfjyohuortyetgjsdfnmcbmcvbfaiproiekgfh";
        String result = str.chars()
                .map(c -> (c >= 'H' && c <= 'L' || c >= 'h' && c <= 'l') ? Character.toUpperCase(c) : c)
                .collect(StringBuilder::new, (sb,c) -> sb.append((char)c), StringBuilder::append)
                .toString();
        System.out.println(result);
        }
}
