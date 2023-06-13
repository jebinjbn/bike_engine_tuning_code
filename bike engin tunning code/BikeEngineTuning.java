import java.util.Scanner;

class BikeEngineTuning {
    private int fuelMixture;
    private int ignitionTiming;

    public BikeEngineTuning() {
        fuelMixture = 0;
        ignitionTiming = 0;
    }

    public void setFuelMixture(int fuelMixture) {
        this.fuelMixture = fuelMixture;
    }

    public void setIgnitionTiming(int ignitionTiming) {
        this.ignitionTiming = ignitionTiming;
    }

    public void printSettings() {
        System.out.println("Current Tuning Settings:");
        System.out.println("Fuel Mixture: " + fuelMixture);
        System.out.println("Ignition Timing: " + ignitionTiming);
    }
}

public class Main {
    public static void main(String[] args) {
        BikeEngineTuning tuningSystem = new BikeEngineTuning();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Bike Engine Tuning System ===");
            System.out.println("1. Set Fuel Mixture");
            System.out.println("2. Set Ignition Timing");
            System.out.println("3. Print Tuning Settings");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter fuel mixture: ");
                    int fuelMixture = scanner.nextInt();
                    tuningSystem.setFuelMixture(fuelMixture);
                    System.out.println("Fuel mixture set successfully!");
                    break;

                case 2:
                    System.out.print("Enter ignition timing: ");
                    int ignitionTiming = scanner.nextInt();
                    tuningSystem.setIgnitionTiming(ignitionTiming);
                    System.out.println("Ignition timing set successfully!");
                    break;

                case 3:
                    tuningSystem.printSettings();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }
    }
}

