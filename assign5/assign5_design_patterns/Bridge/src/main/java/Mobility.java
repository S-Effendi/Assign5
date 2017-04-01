/**
 * Created by S.Effendi on 2017/03/31.
 */
public abstract class Mobility {
    protected Bridge bridge;

    protected Mobility(Bridge bridge){
        this.bridge = bridge;
    }
    public abstract void goDistance();
}
