package src;

public class WaterPokemon extends Pokémon{

    //    2 private variables
    private double height;
    private double weight;

    // 1 constructor
    public WaterPokemon(String name, int hp, int xp, double height, double weight) {
        super(name, hp, xp);
        this.height = height;
        this.weight = weight;
    }

    //    2 methods
    public void hydroPump(double waterWeightToInflate) {
        setWeight(getWeight() + waterWeightToInflate);
    }

    public void surf(double waterHeightToInflate) {
        setHeight(getHeight() + waterHeightToInflate);
    }

    //    1 override
    @Override
    public void defence(int amount) {
        super.defence((int) (amount*1.1));
    }

    //    2 getters
    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    //    2 setters
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
