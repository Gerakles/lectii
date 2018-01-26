public class Kata2 {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        if (fighter1.health > fighter2.health) {
            firstAttacker.equals( fighter1 );
        } else {
            firstAttacker.equals( fighter2 );
        }
        while (fighter1.health <= 0 && fighter2.health > 0) {

        }
//        String Winner = null;
//        if (firstAttacker == fighter1.name) {
//        }
//        while (fighter1.health <= 0 ||fighter2.health <=0) {
//            Winner = fighter1 - fighter2;

            return firstAttacker;
        }
    }

    class Fighter {
        public String name;
        public int health, damagePerAttack;
        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }