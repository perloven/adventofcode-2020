package day1;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class Sum2020 {
    public static void main(String[] args) throws Exception {
        try (Stream<String> lines = Files.lines(Paths.get("resources/1.1-input.txt"))) {
            Collection<Integer> processed = new ArrayList<>();
            lines.forEachOrdered(l -> {
                int curValue = Integer.parseInt(l);
                processed.forEach(p -> {
                    if (curValue + p == 2020) {
                        System.out.printf("Found 2020 sum! Value 1: <%d>, value 2: <%d>, their product: <%d>", curValue, p, curValue * p);
                    }
                });
                processed.add(curValue);
            });
        }
    }
}
