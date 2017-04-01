import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by S.Effendi on 2017/03/31.
 */
public class PokemonTrainer {
    SecondEvolutionPokemonFactory sepf = new SecondEvolutionPokemonFactory();
    SecondEvolutionPokemonFactory sepf1 = new SecondEvolutionPokemonFactory();
    ThirdEvolutionPokemonFactory tepf = new ThirdEvolutionPokemonFactory();
    ThirdEvolutionPokemonFactory tepf1 = new ThirdEvolutionPokemonFactory();

    @Test
    public void CharmeleonTest() throws Exception {

        Assert.assertEquals(sepf.getPokemonName("Charmeleon").getPokemonName(), "Charmeleon");
    }

    @Test
    public void WartortleTest() throws Exception {

        Assert.assertEquals(sepf1.getPokemonName("Wartortle").getPokemonName(), "Wartortle");
    }

    @Test
    public void CharizardTest() throws Exception {

        Assert.assertEquals(tepf.getPokemonName("Charizard").getPokemonName(), "Charizard");
    }

    @Test
    public void BlastoiseTest() throws Exception {

        Assert.assertEquals(tepf1.getPokemonName("Blastoise").getPokemonName(), "Blastoise");
    }
}
