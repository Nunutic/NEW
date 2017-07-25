import java.util.Arrays;
import java.util.List;

/**
 * Created by anna on 2017.07.25..
 */
public class ParallelStream {
    List<String> vals = Arrays.asList("a", "b", "c", "d", "e", "f", "g",
            "a", "b", "c", "d", "e", "f", "g",
            "a", "b", "c", "d", "e", "f", "g",
            "a", "b", "c", "d", "e", "f", "g");
    String join = vals.parallelStream()
            .peek(System.out::println)
            .reduce("_",
                    (a, b)->{
                System.out.println("reducing "+a+" and "+b+" Thread: "+Thread.currentThread().getName());
                return a.concat(b);
                },
                    (a, b)->{
                System.out.println("combining "+a+" and "+b+" Thread: "+Thread.currentThread().getName());
                return a.concat(b);
            }
            );
    //System.out.println(join);
}
