package Växthotell;

public class CarnivorousPlant extends Plants {

    @Override
    public float calculateFluid() {
        return 0.1 + (0.2 * height) +Växthotell.FluidType;
    }

    public CarnivorousPlant(String name, float height, String fluidType) {
        super(name, height, fluidType);
    }
}
