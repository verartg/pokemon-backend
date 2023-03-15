package src;
public class Main {
    public static void main(String[] args) {
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 35, 10, "electric", 3);
        pikachu.recharge(20);
        pikachu.attack(4);
        System.out.println("De pokémon " + pikachu.getName() + " van het type " + pikachu.getType() + ", level " + pikachu.getLevel() + " heeft z'n hp verhoogd naar " + pikachu.getHp());
        System.out.println("Ook is zijn xp verhoogd na z'n attack naar " + pikachu.getXp());

        WaterPokemon squirtle = new WaterPokemon("Squirtle", 44, 14, 0.5, 9);
        System.out.println("De pokémon " + squirtle.getName() + " met een hoogte van " + squirtle.getHeight() + " en gewicht van " + squirtle.getWeight());
        squirtle.hydroPump(12);
        squirtle.surf(5);
        System.out.println("heeft na z'n hydropump- en surf aanval, z'n hoogte verhoogd naar " + squirtle.getHeight() + " en gewicht naar " + squirtle.getWeight());
        squirtle.defence(4);
        System.out.println("na een aanval is z'n hp omlaag gegaan naar " + squirtle.getHp());


    }
}
