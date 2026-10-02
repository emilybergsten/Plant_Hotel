package Växthotell;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    Palm palm1 = new Palm("Laura", 5, kranvatten);
    Palm palm2 = new Palm("Olof", 1, kranvatten);
    Cactus cactus1 = new Cactus("Igge", 0.2, mineralvatten);
    CarnivorousPlant carni = new CarnivorousPlant("Meatloaf", 0.7, proteindryck);


        boolean running = true;
        while (running){

        System.out.println ("Växthotellet Greenest");
        System.out.println ("----------");
        System.out.println ("Växter på hotellet:");


       
        System.out.println ("Vilken växt ska få vätska?");
        String input = scanner.nextLine().trim().toLowerCase();

        }




    }


}
