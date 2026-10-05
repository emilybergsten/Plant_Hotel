package Växthotell;

public class CarnivorousPlant extends Plants {

    @Override
    public double calculateFluid() {
        return 0.1 + (0.2 * height) +Växthotell.FluidType;
    }

    public CarnivorousPlant(String name, double height) {
        super(name, height);
    }
}
