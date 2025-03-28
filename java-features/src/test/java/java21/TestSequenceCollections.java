package java21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.SequencedCollection;

/**
 * Tests the {@link java.util.SequencedCollection}
 * @see <a href="https://openjdk.org/jeps/431">jep 431</a>
 */
public class TestSequenceCollections {

    @Test
    void testSequenceCollections(){
        SequencedCollection<String> strings = Arrays.asList("one", "tow", "three");

        Assertions.assertEquals("one", strings.getFirst());
        Assertions.assertEquals("three", strings.getLast());

        strings = strings.reversed();

        Assertions.assertEquals("three", strings.getFirst());
        Assertions.assertEquals("one", strings.getLast());

    }
}
