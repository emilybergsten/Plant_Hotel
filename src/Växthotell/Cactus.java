package Växthotell;


public class Cactus extends Plants {


    private static final double MINERAL_VOLUME = 0.02;

    public Cactus (String name, double height){

        super(name, height, FluidType.MINERAL_WATER);
    }

    // Polymorfism där kaktus har egen uträkning för vätska
    @Override
    public double calculateFluid() {

        return MINERAL_VOLUME;
    }
}
