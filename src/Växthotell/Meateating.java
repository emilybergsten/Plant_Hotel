package Växthotell;

public class Meateating  extends Plants {

    @Override
    public float calculateFluid() {
        return 0.1 + (0.2 x height) +Växthotell.FluidType;
    }

    public Meateating(String name, float height, String fluidType) {
        super(name, height, fluidType);
    }
}
