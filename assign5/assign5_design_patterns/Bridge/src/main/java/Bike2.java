/**
 * Created by S.Effendi on 2017/03/31.
 */
public class Bike2 implements Bridge{
    @Override
    public void rideBike(int distance, int point_a, int point_b){
        distance = 0;
        distance = distance - point_b;

        System.out.println("Bike 1's distance from point A to point B is: " + distance);
    }
}
