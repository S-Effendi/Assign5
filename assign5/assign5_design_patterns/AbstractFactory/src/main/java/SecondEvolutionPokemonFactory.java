/**
 * Created by S.Effendi on 2017/03/31.
 */
public class SecondEvolutionPokemonFactory implements PokemonFactory {
    @Override
    public Pokemon getPokemonName(String pokemonElement){

        if(pokemonElement == null)
        {
            return null;
        }

        if(pokemonElement.equalsIgnoreCase("Charmeleon"))
        {
            return new SecondEvolutionCharmander();
        }
        else if (pokemonElement.equalsIgnoreCase("Wartortle"))
        {
            return new SecondEvolutionSquirtle();
        }
        return null;
    }
}
