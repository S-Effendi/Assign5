/**
 * Created by S.Effendi on 2017/03/31.
 */
public abstract class WaiterExcellence {
    WaiterExcellence excel;

    public void setExcel(WaiterExcellence excel){
        this.excel = excel;
    }
    public abstract String requestOrder(int req);
}
