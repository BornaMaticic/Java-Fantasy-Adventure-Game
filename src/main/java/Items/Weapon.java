package Items;

public class Weapon {

    private String name;
    private int attack, defense;

    public Weapon(WeaponType weaponType) {
        this.attack = weaponType.getAttack();
        this.defense = weaponType.getDef();
        this.name = weaponType.getName();
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public String getName() {
        return name;
    }
}
