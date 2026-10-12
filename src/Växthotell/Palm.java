package Växthotell;

public class Palm extends Plants {



    private static final double WATER_VOLUME = 0.5;

    public Palm (String name, double height){

        super(name, height, FluidType.WATER);
    }
    // Polymorfism där palm har egen uträkning för vätska
    @Override
    public double calculateFluid() {
        return WATER_VOLUME * getHeight();

    }

}
