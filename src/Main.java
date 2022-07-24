import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**Car audi = new Car("Red", 5, "A4", false);
         System.out.println(audi.getAutomaticGearbox());
         audi.setAutomaticGearbox(true);
         System.out.println(audi.getAutomaticGearbox());

        Kalkulator calc = new Kalkulator();
        calc.add(5, 5);
        System.out.println(calc.add(5, 5));*/

        Kalkulator kalkulator = new Kalkulator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type the first number");
        int firstVariable = scanner.nextInt();
        System.out.println("Please type the second number");
        int secondVariable = scanner.nextInt();
        System.out.println("Your result is " + kalkulator.sub(firstVariable,secondVariable));


    }
}