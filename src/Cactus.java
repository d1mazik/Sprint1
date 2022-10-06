
//cactus ärver från Plants
public class Cactus extends Plants {

    public Cactus(String name, double height) {
        super(name, height);
         types = "Cactus";
    }
    //polymorfism + uträkning
    public double calculateLiquid(){
        return Liquid.MINERAL_WATER.amount;
    }

    //för att få ut namnen på vätske typ
    public String typeLiquid(){
        return Liquid.MINERAL_WATER.liquidType;
    }
}
