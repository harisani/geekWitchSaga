import static org.junit.Assert.assertEquals;

import org.example.Witch;
import org.junit.Test;

public class WitchTest {

    @Test
    public void testAverageKills() {
        assertEquals(4.5, Witch.averageKills(10, 12, 13, 17),0.0001);
    }
    @Test
    public void testAverageKillsNegativeAge() {
        assertEquals(-1, Witch.averageKills(-1, 11, 1, 11),0.0001);
    }
}