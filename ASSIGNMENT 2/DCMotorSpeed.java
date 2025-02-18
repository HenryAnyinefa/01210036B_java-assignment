import java.util.Scanner;

public class DCMotorSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Voltage (V): ");
        double voltage = scanner.nextDouble();

        System.out.print("Enter Back EMF (V): ");
        double backEMF = scanner.nextDouble();

        System.out.print("Enter Motor Constant (RPM/V): ");
        double motorConstant = scanner.nextDouble();

        // Input validation
        if (motorConstant <= 0) {
            System.out.println("Error: Motor constant must be greater than zero.");
        } else if (voltage < backEMF) {
            System.out.println("Error: Voltage must be greater than or equal to Back EMF.");
        } else {
            double speed = (voltage - backEMF) * motorConstant;
            System.out.println("Motor Speed = " + speed + " RPM");
        }

        scanner.close();
    }
}
