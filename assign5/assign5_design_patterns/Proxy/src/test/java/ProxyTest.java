import org.junit.Assert;
import org.junit.Test;

/**
 * Created by S.Effendi on 2017/04/01.
 */
public class ProxyTest {

    @Test
    public void proxyTest() throws Exception {

        Game game = new OnlineGame("TombRaider");
        Assert.assertSame(game.loadGame(), "TombRaider");
    }

    @Test
    public void testConnection() throws Exception {

        Game game1 = new OnlineGame("TombRaider");
        Assert.assertFalse(game1.equals("TombRaider"));
    }

}