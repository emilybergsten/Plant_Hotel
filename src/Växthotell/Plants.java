package Växthotell;

public abstract class Plants implements FluidCalculator {

    Plants[] list = new Plants [4];
    private FluidType fluidType; // Inkapsling


        private String name;
        private float height;
        private enum FluidType ;

     public Plants(Växthotell.FluidType fluidType) {}

    public Plants(String name, float height, enum (fluidType)) {
        this.name = name;
        this.height = height;
        FluidType = fluidType;


    }
}


