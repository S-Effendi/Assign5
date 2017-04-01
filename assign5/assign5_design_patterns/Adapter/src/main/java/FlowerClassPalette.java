/**
 * Created by S.Effendi on 2017/03/31.
 */
public class FlowerClassPalette extends Flower implements FlowerPalette {

    @Override
    public Colour getRose(){
        return getRose();
    }

    @Override
    public Colour getLily(){
        Colour c = getColour();
        return currentColour(c, "White");
    }

    @Override
    public Colour getTulip(){
        Colour c = getColour();
        return currentColour(c, "Blue");
    }

    private Colour currentColour(Colour c, String t)
    {
        if (t == "Pink") {
            return new Colour("Pink");
        }else if (t == "White") {
            return new Colour("White");
        }
         else return new Colour("Blue");
        }
    }
