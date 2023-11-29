package StreamTest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

abstract class Pokemon{
    protected int level;
    protected String name;

    public Pokemon(int level,String name){
        this.level = level;
        this.name = name;
    }
    public abstract void evolve();
}

class Pikachu extends Pokemon{
    public Pikachu(int level,String name){
        super(level, name);
    }

    public void evolve(){
        if (this.level >= 16){
            this.name="Raichu";
            System.out.println("피카츄가 라이츄로 진화합니다.");
        }else {
            System.out.println("피카츄의 레벨이 부족합니다.");
        }
    }
}


public class pokemonDemo {
    public static void main(String[] args) {
        List<Pikachu> pokemons = Stream.of(
                new Pikachu(15,"피카1"),
                new Pikachu(16,"피카2"),
                new Pikachu(17,"피카3")
        ).collect(Collectors.toList());

        //pokemons.forEach(Pikachu::evolve);
        pokemons.forEach(l -> l.evolve());
    }
}
