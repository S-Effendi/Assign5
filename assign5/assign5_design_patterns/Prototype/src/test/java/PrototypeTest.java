import org.junit.Assert;
import org.junit.Test;

/**
 * Created by S.Effendi on 2017/03/31.
 */
public class PrototypeTest {

    @Test
    public void artistTest() throws Exception {
        Artist artist = new Artist("Vincent Van Gogh");
        Assert.assertEquals(artist.makeCopy().toString(),"Vincent Van Gogh");
    }

    @Test
    public void paintingTest() throws Exception {
        Painting painting = new Painting("Expressionist");
        Assert.assertEquals(painting.makeCopy().toString(),"Expressionist");
    }
}
