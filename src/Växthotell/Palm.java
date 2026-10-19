package Växthotell;

public class Palm extends Plants {


    private static final double WATER_VOLUME = 0.5; //inkapsling

    public Palm (String name, double height){

        super(name, height, FluidType.WATER);
    }

    // Arv
    @Override
    public double calculateFluid() {
        return WATER_VOLUME * getHeight();

    }

}
