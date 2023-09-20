
public class PokemonGame {
    public static void main(String[] args) {

        NoFly noFly = new NoFly();
        Pikachu pikachu = new Pikachu(noFly);  // Association, Has -a (Aggregation)  한쪽만 사라지고 남은 하나는 다른곳에 사용되는 것
        //pikachu.setFlyable(new NoFly());  // 프로그램 실행 중 동적으로 나는 방식을 변경

        pikachu.performFly(); // Association (Composition) 같이 사라지는것

    }
}
