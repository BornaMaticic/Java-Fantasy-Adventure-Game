package Players.Fighters;

import Interfaces.IAttack;
import Items.Weapon;
import Players.Player;
import Enemies.Enemy;

public abstract class Fighter extends Player {

    private int ATK;
    private double ATKBonus, DEFBonus;
    private Weapon weapon;

    public Fighter(String name, int HP, int ATK, int DEF, double ATKBonus, double DEFBonus) {
        super(name, HP, DEF);
        this.ATK = ATK;
        this.ATKBonus = ATKBonus;
        this.DEFBonus = DEFBonus;
    }

    public void attack(IAttack attackee){
        Enemy attackedEnemy = (Enemy) attackee;
        int attackDamage = getATK() - attackedEnemy.getDEF();
        attackDamage = snapToZero(attackDamage);
        attackedEnemy.lowerHP(attackDamage);
    }

    public double getATKBonus() {
        return ATKBonus;
    }

    public double getDEFBonus() {
        return DEFBonus;
    }

    public int getATK() {
        int attack = (int) Math.round(ATK * ATKBonus);
        if (this.weapon != null) {attack += weapon.getAttack();}
        return attack;
    }

    public int getDEF(){
        int defense = (int) Math.round(this.DEF * DEFBonus);
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
