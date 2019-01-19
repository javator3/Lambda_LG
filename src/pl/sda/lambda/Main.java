package pl.sda.lambda;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        AddInterface add = (a, b) -> a + b;
        add.calc(4,2);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);

        for(Integer integer: numbers){
            System.out.println(integer);
        }

        Consumer<Integer> integerConsumer = n -> System.out.println(n);
        numbers.forEach(integerConsumer);

        numbers.forEach(System.out::println);

        List<Movie> movies = Arrays.asList(
                new Movie("Tytul",
                        "Jan",
                        LocalDate.of(2012, 02, 12),
                        44.45,
                        Arrays.asList("Michal", "Maciek")),
                new Movie("Tytul2",
                        "Jan",
                        LocalDate.of(2012, 02, 12),
                        44.45,
                        Arrays.asList("Michal", "Maciek"))
        );
// pierwszy stream
        List<String> titles = movies
                .stream()
                .map(f -> f.getTitle())
                .collect(Collectors.toList());
//drugi stream
        List<String> directors = movies
                .stream()
                .map(f -> f.getDirector())
                .collect(Collectors.toList());

        System.out.println(titles);
        System.out.println(directors);



//klasa anonimowa #####################################
//        AddInterface add2 = new AddInterface() {
//            @Override
//            public int calc(int a, int b) {
//                return a + b;
//            }
//        };
//######################################################

    }
}
