package src;
abstract class Pokémon {
    // variables
    private String name;
    private int hp;
    private int xp;

    //constructor
    public Pokémon(String name, int hp, int xp) {
        this.name = name;
        this.hp = hp;
        this.xp = xp;
    }

    // getters en setters
    public String getName() {
        return name;
    }
    public int getHp() {
        return hp;
    }
    public int getXp() {
        return xp;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHp(int hp) {this.hp = hp;}
    public void setXp(int xp) {
        this.xp = xp;
    }

    // methoden
    public void attack(int amount) {
        setXp(getXp() + amount);
    }
    public void defence(int damage) {
        setHp(getHp() - damage);
    }
}
