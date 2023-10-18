import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testPascal() {
        assertEquals(1, Main.pascal(0, 0));
        assertEquals(1, Main.pascal(1, 0));
        assertEquals(1, Main.pascal(1, 1));
        assertEquals(6, Main.pascal(4, 2));
        assertEquals(20, Main.pascal(6, 3));
    }
}
