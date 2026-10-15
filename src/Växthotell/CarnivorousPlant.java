package Växthotell;

public class CarnivorousPlant extends Plants {


    private static final double PROTEIN_BASE = 0.1;
    private static final double PROTEIN_HEIGHT = 0.2;


    public CarnivorousPlant (String name, double height){

        super(name, height, FluidType.PROTEIN_DRINK);
    }

    // Polymorfism där köttätande växt har egen uträkning för vätska
    @Override
    public double calculateFluid() {
        return PROTEIN_BASE + (PROTEIN_HEIGHT * getHeight());

    }

}
