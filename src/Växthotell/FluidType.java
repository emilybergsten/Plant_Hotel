package Växthotell;

public enum FluidType {
    WATER("kranvatten"),
    MINERAL_WATER("mineralvatten"),
    PROTEIN_DRINK("proteindryck");

    private final String displayString;

    FluidType(String displayString) {
        this.displayString = displayString;
    }
    public String getDisplayString() {
        return displayString;
    }
}
