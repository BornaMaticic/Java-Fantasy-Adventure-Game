package Enemies;

import Players.Player;

public class Enemy {

    private int HP, ATK, DEF;

    public Enemy(int HP, int ATK, int DEF) {
        this.HP = HP;
        this.ATK = ATK;
        this.DEF = DEF;
    }

    public int getHP() {
        return HP;
    }

    public int getATK() {
        return ATK;
    }

    public int getDEF() {
        return DEF;
    }

    public void lowerHP(int lowered){
        HP -= lowered;
    }

    public void lowerATK(int lowered){
        ATK -= lowered;
    }

    public void lowerDEF(int lowered){
        DEF -= lowered;
    }

    public void attack(Player player){
    
    }


}
