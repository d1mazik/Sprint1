import javax.swing.*;

//här ger jag namn och längd på växter
public class PrintOut {

    Plants cactus = new Cactus("Igge",0.2);
    Plants palmen = new Palms("Laura", 5);
    Plants palmen1 = new Palms("Putte", 1);
    Plants carnivorous = new Carnivorousplant("Meatloaf", 0.7);


//här skriver jag ut hälsning
    public void startProgram(){
        JOptionPane.showMessageDialog(null,"Welcome to plant hotel!");
        getPlant();
    }
// här ska användaren söka upp växten med hjälp av namnet
    private void getPlant() {
        String plant = JOptionPane.showInputDialog("Which plant will get food?");
        double liquidTotal;

        if(plant.equalsIgnoreCase(cactus.getName())){
           liquidTotal = cactus.calculateLiquid();
           JOptionPane.showMessageDialog(null, "Plant " + cactus.getName() +
                   " of kind " + cactus.getTypes() + " should have " + liquidTotal + "l " + cactus.typeLiquid() + " per day.");
        }
        else if(plant.equalsIgnoreCase(palmen.getName())){
            liquidTotal = palmen.calculateLiquid();
            JOptionPane.showMessageDialog(null, "Plant " + palmen.getName() +
                    " of kind " + palmen.getTypes() + " should have " + liquidTotal + "l " + palmen.typeLiquid()+ " per day." );
        }else if(plant.equalsIgnoreCase(palmen1.getName())){
            liquidTotal = palmen1.calculateLiquid();
            JOptionPane.showMessageDialog(null, "Plant " + palmen1.getName() +
                    " of kind " + palmen1.getTypes() + " should have " + liquidTotal + "l " + palmen1.typeLiquid() + " per day.");
        }else if(plant.equalsIgnoreCase(carnivorous.getName())){
            liquidTotal = carnivorous.calculateLiquid();
            JOptionPane.showMessageDialog(null, "Plant " + carnivorous.getName() +
                    " of kind " + carnivorous.getTypes() + " should have " + liquidTotal + "l " + carnivorous.typeLiquid() + " per day.");
        }else {
            JOptionPane.showMessageDialog(null, "This plant is not available at the hotel.\nTry another plant");
            getPlant();//liten loop om man skriver fel, då börjar den om
        }
    }
}
