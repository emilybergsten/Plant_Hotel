package Växthotell;


import java.util.Scanner;

public class Menu {


    private Hotel hotel; // Menyn behöver känna till hotellet för att nå växterna
    private Scanner scanner;

    public Menu() {
        this.hotel = new Hotel(); // Skapar hotellet och dess växter
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        boolean running = true;
        System.out.println("Välkommen till Växthotellet Greenest!");

        // Skriv ut alla växter och deras typ
        System.out.println("Här är alla växter på hotellet:");
        for (Plants p : hotel.getPlants()) {
            String colorCode = "\u001B[0m"; // Standardfärg

            // Kontrollera växttyp med instanceof för att sätta rätt färg
            if (p instanceof CarnivorousPlant) {
                colorCode = "\u001B[31m"; // Röd för köttätande växt
            } else if (p instanceof Palm) {
                colorCode = "\u001B[36m"; // Brun/Gul för palm
            } else if (p instanceof Cactus) {
                colorCode = "\u001B[32m"; // Grön för kaktus
            }

            // Skriv ut med färg och återställer direkt efter
            System.out.println(colorCode + "- " + p.getName() + " (" + p.getClass().getSimpleName() + ")" + "\u001B[0m");// skriver smidigare ut klassen
        }

        System.out.println("----------------------------------------");
        while (running) {
            System.out.println("\nVilken växt vill du veta mer om? (Skriv namnet eller 'avsluta'):");
            System.out.print("> ");

            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("avsluta")) {
                running = false;
                System.out.println("Programmet avslutas. Hejdå!");
                break;
            }

            // Menyn frågar hotellet efter växten
            Plants foundPlant = hotel.findPlant(input);

            if (foundPlant != null) {
                System.out.println("----------------------------------------");
                System.out.println("Växt: " + foundPlant.getName());
                System.out.println("Vätskemängd: " + foundPlant.calculateFluid() + " liter");
                System.out.println("Vätsketyp: " + foundPlant.getFluidType().getDisplayString());
                System.out.println("----------------------------------------");
            } else {
                System.out.println("Hittade ingen växt med det namnet. Försök igen.");
            }
        }
        scanner.close();
    }
}
