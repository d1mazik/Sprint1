
//här skapar jag enum, ger värde och namn på typ av vätska
//inspiration från videolektioner
public enum Liquid {

    TAP_WATER("tap water", 0.5),
    MINERAL_WATER("mineral water", 0.02),
    PROTEIN_LIQUID("protein water", 0.1);

    public final String liquidType;
    public final double amount;


    Liquid(String liquidType, double amount) {
        this.liquidType = liquidType;
        this.amount = amount;

    }
}
