package Växthotell;


import static Växthotell.FluidType.MINERAL_WATER;

public class Cactus extends Plants {


    public Cactus(String name, double height) {
        super(name, height);
    }

    @Override
    public double calculateFluid() {
        return 0.02;
    }


    //public Cactus(String name, float height, FluidType) {
    // super(name, height, FluidType);
    //}
    public FluidType getFluidType() {
        return MINERAL_WATER;
    }
}




