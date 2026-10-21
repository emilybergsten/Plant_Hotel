package Växthotell;

import java.util.ArrayList;
import java.util.List;


public class Hotel {
    private List<Plants> plants;


    public Hotel(){
        plants = new ArrayList<>();

        plants.add (new Palm("Laura", 5.0));
        plants.add (new Palm("Olof", 1.0));
        plants.add (new Cactus("Igge", 0.2));
        plants.add (new CarnivorousPlant("Meatloaf", 0.7));// polymorfism



    }
    public Plants findPlant(String name){
        for (Plants plant: plants){
            if (plant.getName().equalsIgnoreCase(name)){
                return plant;
            }
        }
        return null;


    }

    public List<Plants> getPlants() { // metod som hämtar växter från Hotel

        return plants;
    }
}


