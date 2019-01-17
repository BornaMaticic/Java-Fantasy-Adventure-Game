package Players.Fighters;

import Interfaces.IAttack;
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

    public void attack(IAttack attackee){
        Enemy attackedEnemy = (Enemy) attackee;
        int attackDamage = this.ATK - attackedEnemy.getDEF();
        attackDamage = snapToZero(attackDamage);
        attackedEnemy.lowerHP(attackDamage);
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
