/**
 * Created by S.Effendi on 2017/03/31.
 */
public class Waiter1 extends WaiterExcellence{
    @Override
    public String requestOrder(int req){
        if(req < 20) {
            return "Order on time, Waiter Exceptional handling skills...";
        }
        else {
            return excel.requestOrder(req);
        }
    }
}
