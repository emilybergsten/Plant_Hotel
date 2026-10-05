package Växthotell;

public abstract class Plants implements FluidCalculator {

    //Plants[] list = new Plants [4];
    private FluidType fluidType; // Inkapsling


        private String name;
        private double height;
        //private enum FluidType ;

    public Plants() {

    }

    public Plants(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }
    //public Plants(Växthotell.FluidType fluidType) {
    // }

    //public Plants(String name, float height, enum (fluidType)) {
      //  this.name = name;
        //this.height = height;
       // FluidType = fluidType;


    }
}


