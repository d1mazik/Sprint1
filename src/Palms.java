
//palms ärver från Plants
public class Palms extends Plants{


    public Palms(String name, double height) {
        super(name, height);
        types = "Palms";
    }

    //polymorfism + uträkning
    public double calculateLiquid(){
        return Liquid.TAP_WATER.amount * getHeight();
    }

    //för att få ut namnen på vätske typ
    public String typeLiquid(){
        return Liquid.TAP_WATER.liquidType;
   }
}

