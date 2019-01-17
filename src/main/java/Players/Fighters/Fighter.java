package Players.Fighters;

import Interfaces.IAttack;
import Items.Weapon;
import Players.Player;
import Enemies.Enemy;

public abstract class Fighter extends Player {

    private int ATK, ATKBonus, DEFBonus;
    private Weapon weapon;

    public Fighter(String name, int HP, int ATK, int DEF, int ATKBonus, int DEFBonus) {
        super(name, HP, DEF);
        this.ATK = ATK;
        this.ATKBonus = ATKBonus;
        this.DEFBonus = DEFBonus;
    }

    public void attack(IAttack attackee){
        Enemy attackedEnemy = (Enemy) attackee;
        int attackDamage = getAttackStrength() - attackedEnemy.getDEF();
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

    public int getAttackStrength() {
        int attack = ATK;
        if (this.weapon != null) {attack += weapon.getAttack();}
        return attack;
    }

    public int getDEF(){
        int defense = this.DEF;
        if (this.weapon != null) {defense += weapon.getDefense();}
        return defense;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    private int snapToZero(int amount){
        if (amount < 0) {amount = 0;}
        return amount;
    }

    public void pickUpWeapon(Weapon weapon){
        this.weapon = weapon;
    }
}
