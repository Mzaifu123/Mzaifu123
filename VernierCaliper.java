import java.util.Scanner;

public class VernierCaliper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompts for main scale reading
        System.out.print("Enter main scale reading (in mm): ");
        double mainScaleReading = scanner.nextDouble();

        // Prompts for vernier scale reading
        System.out.print("Enter vernier scale reading (number of divisions coinciding): ");
        int vernierScaleReading = scanner.nextInt();

        // Constant: smallest count on the vernier scale (in mm)
        final double vernierConstant = 0.02;

        // Calculate the total measurement
        double measurement = mainScaleReading + (vernierScaleReading * vernierConstant);

        // Display the result
        System.out.printf("The measurement is: %.2f mm\n", measurement);

        scanner.close();
    }
}
