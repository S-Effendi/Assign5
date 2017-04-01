/**
 * Created by S.Effendi on 2017/03/31.
 */
public class Artist implements CloneObject{
    private String name;

    public Artist(String name) {
        this.name = name;
    }

    @Override
    public CloneObject makeCopy()
    {
        return new Artist(name);
    }

    @Override
    public String toString(){
        return  name;
    }
}
