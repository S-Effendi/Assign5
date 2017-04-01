import org.junit.Assert;
import org.junit.Test;

/**
 * Created by S.Effendi on 2017/04/01.
 */
public class StrategyTest {

    @Test
    public void marblesTest() throws Exception {
        CollectionUpdate collect = new CollectionUpdate(new CollectionAdd());
        Assert.assertEquals(collect.checkMarbleCollection(12,5),17);
    }

    @Test
    public void marblesTest1() throws Exception {
        CollectionUpdate collect = new CollectionUpdate(new CollectionLost());
        Assert.assertEquals(collect.checkMarbleCollection(23,2),21);
    }
}
