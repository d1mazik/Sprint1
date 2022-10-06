

//Carnivorous ärver från Plants
public class Carnivorousplant extends Plants{


    public Carnivorousplant(String name, double height) {
        super(name, height);
        types = "Carnivorousplant";
    }
    //polymorfism + uträkning
    public double calculateLiquid(){
        return Liquid.PROTEIN_LIQUID.amount + (0.2 * getHeight());
    }

    //för att få ut namnen på vätske typ
    public String typeLiquid(){
        return Liquid.PROTEIN_LIQUID.liquidType;
    }


}
