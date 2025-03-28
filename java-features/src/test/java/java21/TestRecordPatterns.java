package java21;

import org.example.java21.Color;
import org.example.java21.ColoredPoint;
import org.example.java21.Point;
import org.example.java21.RandomPoint;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests RecordPatterns @See <a href="https://openjdk.org/jeps/440">JEP 440 - RecordPatterns</a>
 */
public class TestRecordPatterns {

    @Test
    void testRecordPatterns() {

        Point p = new Point(3, 4);
        Assertions.assertEquals(7, beforeRecordPatterns(p));
        Assertions.assertEquals(7, afterRecordPatterns(p));

        ColoredPoint cp = new ColoredPoint(p, Color.RED);
        RandomPoint rp = new RandomPoint(cp);

        Assertions.assertEquals(Color.RED, getColor(rp));
        Assertions.assertNull( getColor(null));

    }

    private int beforeRecordPatterns(Object obj) {
        if (obj instanceof Point) {
            return ((Point) obj).x() + ((Point) obj).y();
        }
        return 0;
    }

    private int afterRecordPatterns(Object obj) {
        if (obj instanceof Point(int x, int y)) {
            return x + y;
        }
        return 0;
    }

    private Color getColor(RandomPoint rp){
        if(rp instanceof  RandomPoint(ColoredPoint cp)){
            return rp.coloredPoint().color();
        }
        return null;
    }

}


