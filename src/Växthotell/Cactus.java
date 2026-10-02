package Växthotell;

public class Cactus extends Plants {

    @Override
    public float calculateFluid() {
        return 0.02 + Växthotell.FluidType;
    }

    public Cactus(String name, float height, String fluidType) {
        super(name, height, fluidType);
    }
}

