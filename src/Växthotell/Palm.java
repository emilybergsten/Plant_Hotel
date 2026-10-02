package Växthotell;

public class Palm extends Plants {

    @Override
    public float calculateFluid() {
        return 0.5 x height;
        + (Växthotell.FluidType);

    }
    public Palm(String name, float height, String fluidType) {
        super(name, height, fluidType);
    }
}
