package src;
public class ElectricPokemon extends Pokémon {

//    2 private variables
    private String type;
    private int level;

// 1 constructor
    public ElectricPokemon(String name, int hp, int xp, String type, int level) {
        super(name, hp, xp);
        this.type = type;
        this.level = level;
    }

//    2 methods
    public void recharge(int hpToRecharge) {
        setHp(getHp() + hpToRecharge);
    }
    public void boost(int xpToBoost) {
        setXp(getXp() + xpToBoost);
    }

//    1 override
    @Override
    public void attack(int amount) {
        super.attack((int) (amount*1.1));
    }

//    2 getters
    public String getType() {
        return type;
    }
    public int getLevel() {
        return level;
    }

//    2 setters
    public void setType(String type) {
        this.type = type;
    }
    public void setLevel(int level) {
        this.level = level;
    }
}
