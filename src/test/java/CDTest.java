import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/8/17.
 */
public class CDTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        CD.clearAllCDs();
    }

    @Test
    public void CDObjectGetsCorrectlyCreated_true() throws Exception {
        CD cd = new CD("Taylor Swift", "pop", 2010, 10);
        assertEquals(true, cd instanceof CD);
    }
    @Test
    public void CDInstantiatesWithValue_true() throws Exception {
        CD cd = new CD("Taylor Swift", "pop", 2010, 10);
        assertEquals("Taylor Swift", cd.getValue());
    }
    @Test
    public void AllCDsAreCorrectlyReturned_true() {
        CD cd = new CD ("Taylor Swift", "pop", 2010, 10);
        CD cd2 = new CD ("Katy Perry", "rock", 2015, 15);
        assertEquals(2, CD.getAll().size());
    }
    @Test
    public void AllCDsContainsAllCDs_true() {
        CD cd = new CD ("Taylor Swift", "pop", 2010, 10);
        CD cd2 = new CD ("Katy Perry", "rock", 2015, 15);
        assertTrue(CD.getAll().contains(cd));
        assertTrue(CD.getAll().contains(cd2));
    }

}