package Pokemonster;

public class Squirtle extends Pokemon {
    public Squirtle(Flyable f) {
        super();  // 부모 클래스의 기본 생성자 호출 (생략 가능)
        System.out.println("꼬북꼬북");
        //this.setLevel(1);
        this.level = 1;
//        this.attackRate = 48;  //0단계 진화 포켓몬은 최소최대 공격력 차 3을 둔다
        this.attackRate = (int)(Math.random() * 4)+ 45;
        this.defenceRate = 65;
        this.setHp(44);
        this.name = "꼬부기";
        this.flyable = f; // Association, has-a
        this.skills = new String[]{"물대포", "할퀴기", "거품"};
        this.specialAttackRate = new int[]{80, 40, 50};
    }

    @Override
    public void attack() {
        System.out.println(this.name + "이(가) 광역 물대포 공격을 시전합니다");
    }
}
