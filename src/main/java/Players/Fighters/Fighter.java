package Players.Fighters;

import Players.Player;
import Enemies.Enemy;

public abstract class Fighter extends Player {

    private int ATK, ATKBonus, DEFBonus;

    public Fighter(String name, int HP, int DEF, int ATK, int ATKBonus, int DEFBonus) {
        super(name, HP, DEF);
        this.ATK = ATK;
        this.ATKBonus = ATKBonus;
        this.DEFBonus = DEFBonus;
    }

    public void attack(Enemy enemy){

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
}
