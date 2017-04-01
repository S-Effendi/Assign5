/**
 * Created by S.Effendi on 2017/03/31.
 */
public class Distance extends Mobility {
    private int distance, point_a, point_b;

    public Distance(int distance, int point_a, int point_b, Bridge bridge){
        super(bridge);
        this.distance = distance;
        this.point_a = point_a;
        this.point_b = point_b;
    }

    public void goDistance(){
        bridge.rideBike(distance,point_a,point_b);
    }
}
