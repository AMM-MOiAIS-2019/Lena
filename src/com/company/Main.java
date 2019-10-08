package com.company;

import java.util.Arrays;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Main {

    public static void main(String[] args) {
        String[] str = "Текст текст    повторяется текст несколько раз слово раз слово два слово раз\n повторяется!!!"
                .replaceAll("\\p{P}","").toLowerCase()
                .split("\\s+");

        Arrays.stream(str)
                .collect(
                    groupingBy(x -> x, counting()))
                .forEach((w,c) -> System.out.println(String.format("%s: %d",w,c)));
        /*
          Arrays.stream(args)
                .map(word -> word.replaceAll("\\p{P}","").toLowerCase().trim())
                .collect(
                    groupingBy(x -> x, counting()))
                .forEach((w,c) -> System.out.println(String.format("%s: %d",w,c)));

        */
    }
}

