import org.junit.Assert;
import org.junit.Test;

/**
 * Created by S.Effendi on 2017/04/01.
 */
public class Chain_Of_Responsibility_Test {

    @Test
    public void Waiter1ExcellenceTest() throws Exception {
        WaiterExcellence we1 = new Waiter1();
        Assert.assertEquals(we1.requestOrder(17),"Order on time, Waiter Exceptional handling skills...");
    }

    @Test
    public void Waiter2ExcellenceTest() throws Exception {
        WaiterExcellence we2 = new Waiter2();
        Assert.assertEquals(we2.requestOrder(27), "Order is running late, Waiter presents reasonable waiter skills...");
    }

    @Test
    public void Waiter3ExcellenceTest() throws Exception {
        WaiterExcellence we3 = new Waiter3();
        Assert.assertEquals(we3.requestOrder(37), "Order is very late, Waiter borders on having terrible waiter skills");
    }
}
