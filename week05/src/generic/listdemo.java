package generic;

import Pokemonster.Charizard;
import Pokemonster.Pikachu;
import Pokemonster.Pokemon;
import Pokemonster.Squirtle;

import java.util.ArrayList;

public class listdemo {
    public static void main(String[] args) {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pikachu(new NoFly()));
        pokemons.add(new Squirtle(new NoFly()));
        pokemons.add(new Charizard(new Wings()));

        for(Pokemon p : pokemons)
            p.attack();
    }
}
