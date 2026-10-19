package Växthotell;

public abstract class Plants implements FluidCalculator {

   // private FluidType fluidType; // Inkapsling

        private String name;
        private double height;
        private FluidType fluidType ;// inkapsling


    public Plants(String name, double height, FluidType fluidType) {
        this.name = name;
        this.height = height;
        this.fluidType = fluidType;
    }
        // inkapsling
    public String getName() {

        return name;
    }

    public double getHeight() {

        return height;
    }

    public FluidType getFluidType() {

        return fluidType;
    }

    @Override
    public abstract double calculateFluid();




}

