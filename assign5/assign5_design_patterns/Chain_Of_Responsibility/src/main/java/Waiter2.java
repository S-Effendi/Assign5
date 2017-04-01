/**
 * Created by S.Effendi on 2017/03/31.
 */
public class Waiter2 extends WaiterExcellence{
    @Override
    public String requestOrder(int req){
        if(req > 20 & req < 30 ){
            return "Order is running late, Waiter presents reasonable waiter skills...";
        }
        else{
            return excel.requestOrder(req);
        }
    }
}
