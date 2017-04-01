/**
 * Created by S.Effendi on 2017/03/31.
 */
public class ThirdEvolutionPokemonFactory implements PokemonFactory {

    @Override
    public Pokemon getPokemonName(String pokemonElement) {

        if (pokemonElement == null) {
            return null;
        }

        if (pokemonElement.equalsIgnoreCase("Charizard")) {
            return new ThirdEvolutionCharmander();
        } else if (pokemonElement.equalsIgnoreCase("Blastoise")) {
            return new ThirdEvolutionSquirtle();
        }
        return null;
    }
}