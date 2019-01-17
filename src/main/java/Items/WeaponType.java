package Items;

public enum WeaponType {
    SLEDGEHAMMER("Sledgehammer", 10, -2),
    SWORD("Sword", 5, 2),
    FLYSWATTER("Flyswatter", 1, 0),
    MACE("Mace", 3, 1),
    PEN("Pen", 6, -10),
    AXE("Axe", 25, -3),
    SHIELD("Shield", -2, 10);

    private final String name;
    private final int attack, def;

    WeaponType(String name, int attack, int def) {
        this.name = name;
        this.attack = attack;
        this.def = def;
    }

    public int getAttack() {
        return attack;
    }

    public int getDef() {
        return def;
    }

    public String getName() {
        return name;
    }
}
