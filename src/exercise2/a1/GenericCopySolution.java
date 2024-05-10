package exercise2.a1;

import java.util.ArrayList;
import java.util.List;

public class GenericCopySolution {
    public static <T> void copy(List<? extends T> source, List<? super T> target) {
        for(T t: source) {
            target.add(t);
        }
    }

    public static void main(String[] args) {
        List<Number> original = List.of(43, 241, 34, 546, 2, 5, 3246);
        List<Number> copy = new ArrayList<>();

        GenericCopySolution.copy(original, copy);

        System.out.println(copy);
    }
}
