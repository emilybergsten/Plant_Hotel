package Växthotell;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {
    private List<Plants> plants;

    //KOnstruktor som körs när hotellet skapas
    public Hotel(){
        plants = new ArrayList<>();

        plants.add (new Palm("Laura", 5.0));
        plants.add (new Palm("Olof", 1.0));
        plants.add (new Cactus("Igge", 0.2));
        plants.add (new CarnivorousPlant("Meatloaf", 0.7));


    }// metod som söker efter en växt
    public Plants findPlant(String name){
        for (Plants plant: plants){
            if (plant.getName().equalsIgnoreCase(name)){
                return plant; //om växt hittades
            }
        }
        return null; // hittade inte växt

        // kolla det här extra

    }

    public List<Plants> getPlants() {
        return plants;
    }
}


