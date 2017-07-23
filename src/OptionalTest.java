import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by anna on 2017.07.21..
 */
public class OptionalTest {
    public static void main(String[] args){
        Optional<Integer> opt = Optional.empty();
        System.out.println(opt);
        System.out.println(opt.orElseGet(()-> 7));

        System.out.println("And now Stream starts.. ");
        Stream<Integer> stream = Stream.iterate(2, x -> x + 1).limit(6);

        //stream.limit(5).forEach(System.out::println);

        //Optional<Integer> min = stream.min((s1, s2) -> s1 - s2);

        //System.out.println(stream.anyMatch(x -> x == 4));

        //System.out.println(stream.reduce(1, (x1, x2) -> x2, (x1, x2) -> null ));

        //System.out.println(stream.map(x->x-2).sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        System.out.println("Now Streams on primitive types go..");

        //IntStream intStream = stream.mapToInt(s -> s);

        IntStream ints = stream.flatMapToInt(x -> IntStream.of(x));

        OptionalInt optionalInt = ints.max();

        System.out.println(optionalInt);
    }
}
