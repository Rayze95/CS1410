package mobiles;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MobilesTests
{

    @Test
    public void makeMobiletest1 ()
    {
        Mobile m6 = new Mobile(28, 7, new Mobile(10), new Mobile(40));
        Mobile m5 = new Mobile(12, 18, new Mobile(3), new Mobile(2));
        Mobile m4 = new Mobile(5, 20, new Mobile(20), m5);
        Mobile m3 = new Mobile(24, 12, m4, new Mobile(50));
        Mobile m2 = new Mobile(30, 10, new Mobile(25), m3);
        Mobile m1 = new Mobile(20, 40, m2, m6);
        assertEquals(7, m1.bobCount());
        assertEquals(50, m1.heaviestBob());
        assertEquals(6, m1.rodCount());
        assertEquals(6, m1.depth());
        assertEquals(150, m1.weight());
        assertEquals(false, m1.isBalanced());
    }
    @Test
    public void makeMobiletest2 ()
    {
        Mobile m6 = new Mobile(28, 7, new Mobile(10), new Mobile(40));
        Mobile m5 = new Mobile(12, 18, new Mobile(3), new Mobile(2));
        Mobile m4 = new Mobile(5, 20, new Mobile(20), m5);
        Mobile m3 = new Mobile(24, 12, m4, new Mobile(50));
        Mobile m2 = new Mobile(29, 10, new Mobile(25), m3);
        Mobile m1 = new Mobile(20, 40, m2, m6);
    assertEquals("", m1.isBalanced());
    }
}

    


