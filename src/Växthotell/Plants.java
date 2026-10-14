package Växthotell;

public abstract class Plants implements FluidCalculator {

   // private FluidType fluidType; // Inkapsling

        private String name;
        private double height;
        private FluidType fluidType ;

    /*Plants palm1 = new Palm("Laura", 5);
    Plants palm2 = new Palm("Olof", 1);
    Plants cactus1 = new Cactus("Igge", 0.2);
    Plants carni = new CarnivorousPlant("Meatloaf", 0.7);*/

    public Plants() {

    }

    public Plants(String name, double height, FluidType fluidType) {
        this.name = name;
        this.height = height;
        this.fluidType = fluidType;
    }

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

