/**
 * Created by S.Effendi on 2017/03/31.
 */
public class Waiter3 extends WaiterExcellence{
    @Override
    public String requestOrder(int req){
        if(req > 30 & req < 45){
            return "Order is very late, Waiter borders on having terrible waiter skills";
        }
        else{
            return excel.requestOrder(req);
        }
    }
}
