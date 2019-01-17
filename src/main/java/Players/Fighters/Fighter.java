package Players.Fighters;

import Players.Player;
import Enemies.Enemy;

public abstract class Fighter extends Player {

    private int ATK, ATKBonus, DEFBonus;

    public Fighter(String name, int HP, int ATK, int DEF, int ATKBonus, int DEFBonus) {
        super(name, HP, DEF);
        this.ATK = ATK;
        this.ATKBonus = ATKBonus;
        this.DEFBonus = DEFBonus;
    }

    public void attack(Enemy enemy){
        int attackDamage = this.ATK - enemy.getDEF();
        attackDamage = snapToZero(attackDamage);
        enemy.lowerHP(attackDamage);
    }

    public int getATK() {
        return ATK;
    }

    public int getATKBonus() {
        return ATKBonus;
    }

    public int getDEFBonus() {
        return DEFBonus;
    }

    private int snapToZero(int amount){
        if (amount < 0) {amount = 0;}
        return amount;
    }
}
