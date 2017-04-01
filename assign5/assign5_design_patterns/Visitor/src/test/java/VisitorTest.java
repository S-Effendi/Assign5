import org.junit.Assert;
import org.junit.Test;

/**
 * Created by S.Effendi on 2017/04/01.
 */
public class VisitorTest {

    @Test
    public void estateAgencyTest() throws Exception {
        Agency agency = new EstateAgent();
        agency.assess(new EstateAgentClient());

    }

    @Test
    public void estateAgencyTest1() throws Exception {
        Agency agency1 = new EstateAgent();
        Assert.assertTrue(agency1.equals(agency1));
    }
}
