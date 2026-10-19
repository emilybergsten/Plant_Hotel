package Växthotell;


public class Cactus extends Plants {


    private static final double MINERAL_VOLUME = 0.02; //inkapsling

    public Cactus (String name, double height){

        super(name, height, FluidType.MINERAL_WATER);
    }

    // Arv
    @Override
    public double calculateFluid() {

        return MINERAL_VOLUME;
    }
}
