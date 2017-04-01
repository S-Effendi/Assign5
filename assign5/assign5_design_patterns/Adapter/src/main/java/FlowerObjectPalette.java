/**
 * Created by S.Effendi on 2017/03/31.
 */
public class FlowerObjectPalette implements FlowerPalette{
        private Flower flower = new Flower();

        @Override
        public Colour getRose(){
            return flower.getColour();
        }

        @Override
        public Colour getLily(){
            Colour c = flower.getColour();
            return currentColour(c, "White");
        }

        @Override
        public Colour getTulip(){
            Colour c = flower.getColour();
            return currentColour(c, "Blue");
        }

        private Colour currentColour(Colour c, String t)
        {

            return new Colour(c.getFlowerType());
        }
}
