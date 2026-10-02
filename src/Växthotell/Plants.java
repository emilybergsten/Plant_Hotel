package Växthotell;

public abstract class Plants implements FluidCalculator {

    Plants[] list = new Plants [4];
    private FluidType fluidType; // Inkapsling

    public Plants(FluidType fluidType) {}
    private String name;
    private float height;
    private String FluidType;

    public Plants(String name, float height, String fluidType) {
        this.name = name;
        this.height = height;
        FluidType = fluidType;


    }
}


