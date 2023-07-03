import java.util.Scanner;
public class CtoF_Converter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Double celsiusTemperature;

            do {
                System.out.print("Please enter a valid temperature in Celsius: ");
                while (!scanner.hasNextDouble()) {
                    String input = scanner.next();
                    System.out.println("Sorry, \"" + input + "\" is not a valid number. Try again.");
                }
                celsiusTemperature = scanner.nextDouble();
            } while (celsiusTemperature == null);

            double fahrenheitTemperature = celsiusTemperature * 9 / 5 + 32;
            System.out.println("The equivalent temperature in Fahrenheit is: " + fahrenheitTemperature);
        }
    }
