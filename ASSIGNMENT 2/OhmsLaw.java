import java.util.Scanner;

public class OhmsLaw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 'V' for Voltage, 'I' for Current, or 'R' for Resistance (unknown parameter): ");
        char unknown = scanner.next().charAt(0);

        double voltage = 0, current = 0, resistance = 0;
        
        switch (Character.toUpperCase(unknown)) {
            case 'V':
                System.out.print("Enter Current (A): ");
                current = scanner.nextDouble();
                System.out.print("Enter Resistance (Ω): ");
                resistance = scanner.nextDouble();
                voltage = current * resistance;
                System.out.println("Voltage = " + voltage + "V");
                break;

            case 'I':
                System.out.print("Enter Voltage (V): ");
                voltage = scanner.nextDouble();
                System.out.print("Enter Resistance (Ω): ");
                resistance = scanner.nextDouble();
                if (resistance != 0) {
                    current = voltage / resistance;
                    System.out.println("Current = " + current + "A");
                } else {
                    System.out.println("Resistance cannot be zero.");
                }
                break;

            case 'R':
                System.out.print("Enter Voltage (V): ");
                voltage = scanner.nextDouble();
                System.out.print("Enter Current (A): ");
                current = scanner.nextDouble();
                if (current != 0) {
                    resistance = voltage / current;
                    System.out.println("Resistance = " + resistance + "Ω");
                } else {
                    System.out.println("Current cannot be zero.");
                }
                break;

            default:
                System.out.println("Invalid input.");
        }
        scanner.close();
    }
}
