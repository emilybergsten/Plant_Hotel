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

        // Skriv ut alla växter och deras typ direkt efter välkomnandet
        System.out.println("Här är alla växter på hotellet:");
        for (Plants p : hotel.getPlants()) {
            String colorCode = "\u001B[0m"; // Standardfärg

            // Kontrollera växttyp med instanceof för att sätta rätt färg
            if (p instanceof CarnivorousPlant) {
                colorCode = "\u001B[31m"; // Röd för köttätande växt
            } else if (p instanceof Palm) {
                colorCode = "\u001B[33m"; // Brun/Gul för palm
            } else if (p instanceof Cactus) {
                colorCode = "\u001B[32m"; // Grön för kaktus
            }

            // Skriv ut med färg och återställ sedan till standard direkt efter
            System.out.println(colorCode + "- " + p.getName() + " (" + p.getClass().getSimpleName() + ")" + "\u001B[0m");
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
    /*boolean running = true;

    while (running) {
        showMenu();
        int choice = readName("Vilken växt vill du ha information om?");

        switch (choice) {
            case 1:
                registerBooking();
                break;
            case 2:
                showAllBookings();
                break;
            case 3:
                showSummary();
                break;
            case 4:
                plant
                break;
            case 5:
                running = false;
                System.out.println("Programmet avslutas. Hejdå!");
                break;
            default:
                System.out.println("Ogiltigt val, försök igen.");
        }
    }
}
  public void showMenu() {
      System.out.println("\n--- Växthotellet Greenest ---");
      System.out.println("Alla incheckade växter");

      System.out.println("Laura");
      System.out.println("Igge");
      System.out.println("Meatloaf");
      System.out.println("Olof");
      System.out.println("Avsluta");
  }

private static String readName() {
    while (choice = !empty)

}*/
