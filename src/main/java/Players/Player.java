package Players;

import Interfaces.IAttack;

public abstract class Player implements IAttack {

    private String name;
    private int HP, DEF;

    public Player(String name, int HP, int DEF) {
        this.name = name;
        this.HP = HP;
        this.DEF = DEF;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public int getDEF() {
        return DEF;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void raiseHP(int raised){
        this.HP += raised;
    }

    public void lowerHP(int lowered){
        this.HP -= lowered;
        if (HP < 0) { HP = 0;}
    }


}
