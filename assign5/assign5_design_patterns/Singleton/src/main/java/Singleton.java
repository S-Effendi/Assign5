/**
 * Created by S.Effendi on 2017/03/31.
 */
public class Singleton {
    private static Singleton fishBowl = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (fishBowl == null) {
            fishBowl = new Singleton();
        }
        return fishBowl;
    }

    public int fishBorn(int fishPopulation, int fishIncrease) {
        return fishPopulation + fishIncrease;
    }

    public int fishDeath(int fishPopulation, int fishDecrease){
        return fishPopulation - fishDecrease;
    }

    public int fishPlague(int fishPopulation, int fishBreached){
        return fishPopulation/fishBreached;
    }
}
