package Växthotell;

public class Plants implements FluidCalculator {

    Plants[] list = new Plants [4];

    private String name;
    private float height;
    private String FluidType;

    public Plants(String name, float height, String fluidType) {
        this.name = name;
        this.height = height;
        FluidType = fluidType;


    }
}


