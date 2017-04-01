import org.junit.Assert;
import org.junit.Test;

/**
 * Created by S.Effendi on 2017/03/31.
 */
public class BridgeTest {

    @Test
    public void BridgeTest() throws Exception {

        Mobility mobility1 = new Distance(8,7 , 15, new Bike1());
        mobility1.goDistance();
    }

    @Test
    public void BridgeTest1() throws Exception {

        Mobility mobility1 = new Distance(10,11,21, new Bike2());
        Assert.assertFalse(mobility1.equals("State"));
    }
}
