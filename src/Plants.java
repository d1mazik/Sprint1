public abstract class Plants implements PlantsInterface {
    //här skapar jag konstruktor, inkapsling och metoder för calculateLiquid och typeOfLiquid
    private String name;
    private double height;
    protected String types;

    public Plants(String name, double height){
        this.name = name;
        this.height = height;
    }
    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public String getTypes() {
        return types;
    }
    public double calculateLiquid(){
        return 0;
    }
    public String typeLiquid(){
        return typeLiquid();
    }
}


