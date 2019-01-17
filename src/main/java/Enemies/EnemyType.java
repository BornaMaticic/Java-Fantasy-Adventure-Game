package Enemies;

public enum EnemyType {
    CHARIZARD("Charizard", 20, 8, 4, false, false),
    SQUIRREL("Squirrel", 5, 4, 2, true, true),
    CHARMELON("Charmelon", 15, 5, 3, false, false),
    CHARMANDER("Charmander", 10, 3, 2, false, false),
    ICESQUIRREL("Ice Squirrel", 5, 4, 11, false, true),
    DRAGON("Dragon", 30, 8, 4, false, false),
    ICEDRAGON("Ice Dragon", 30, 8, 2, false, true),
    ORC("Orc", 50, 8, 2, false, false);

    private final String name;
    private final int HP, ATK, DEF;
    private final boolean weakToIce, weakToFire;

    EnemyType(String name, int HP, int ATK, int DEF, boolean weakToIce, boolean weakToFire) {
        this.name = name;
        this.HP = HP;
        this.ATK = ATK;
        this.DEF = DEF;
        this.weakToIce = weakToIce;
        this.weakToFire = weakToFire;
    }

    public String getName() {
        return name;
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

    public boolean isWeakToIce() {
        return weakToIce;
    }

    public boolean isWeakToFire() {
        return weakToFire;
    }
}
