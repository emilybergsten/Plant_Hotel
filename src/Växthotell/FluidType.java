package Växthotell;

public enum FluidType {
    WATER("Kranvatten"),
    MINERAL_WATER("Mineralvatten"),
    PROTEIN_DRINK("Proteindryck");

    private final String displayString;

    FluidType(String displayString) {
        this.displayString = displayString;
    }
    public String getDisplayString() {
        return displayString;
    }
}
