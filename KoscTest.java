import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class KoscTest {

    @Test
    public void rzutKością() {
        Kosc kosc1 = new Kosc();
        kosc1.zablokuj();
        if (!kosc1.dostepna)
        {
            int val = kosc1.wartosc;
            kosc1.rzutKością();
            Assert.assertEquals(kosc1.wartosc,val);

        }
    }
    @Test
    public void rzutKością2() {
        Kosc kosc1 = new Kosc();
        kosc1.rzutKością();
        Assert.assertTrue(kosc1.wartosc>=1&&kosc1.wartosc<=6);

    }
}