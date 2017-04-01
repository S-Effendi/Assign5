/**
 * Created by S.Effendi on 2017/03/31.
 */
public class Painting implements CloneObject{
    private String paintStyle;
    public Painting(String paintStyle){
        this.paintStyle = paintStyle;
    }

    @Override
    public CloneObject makeCopy(){
        return new Painting(paintStyle);
    }

    @Override
    public String toString(){
        return paintStyle;
    }
}
