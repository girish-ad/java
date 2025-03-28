package releases.java21;

import java.util.Arrays;
import java.util.SequencedCollection;

public class SeqCollections {

    public static void main (String[] str){
        SequencedCollection<String> strings = Arrays.asList("one", "tow", "three");
        System.out.println(strings.getFirst());
        System.out.println(strings.getLast());

        strings=  strings.reversed();

        strings.forEach(System.out::println);

        System.out.println(strings.getFirst());
        System.out.println(strings.getLast());
    }
}
