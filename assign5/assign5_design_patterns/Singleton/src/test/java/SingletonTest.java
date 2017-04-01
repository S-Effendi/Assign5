import org.junit.Assert;
import org.junit.Test;

/**
 * Created by S.Effendi on 2017/03/31.
   Testing the fish population after breach of plague.
 */

public class SingletonTest {
    Singleton sing = Singleton.getInstance();

    @Test
    public void fishPopulationTest() throws Exception {
            Assert.assertEquals("Expected value was inadequate: ", sing.fishPlague(10,5), 2);
        }
    }

