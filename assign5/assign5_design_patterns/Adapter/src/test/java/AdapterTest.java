import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by S.Effendi on 2017/03/31.
 */
public class AdapterTest {

    FlowerClassPalette fcp = new FlowerClassPalette();

    @Before
    public void SetUp() throws Exception{

    }

    @Test
    public void AdapterTest() throws Exception {

        Assert.assertEquals(fcp.getTulip().getFlowerType(),"Blue");
    }

    @Test
    public void AdapterTest1() throws Exception {

        Assert.assertEquals(fcp.getLily().getFlowerType(),"White");
    }
}
