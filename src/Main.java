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
        System.out.println("Provide the first number");
        int firstval = scanner.nextInt();
        System.out.println("Tell me what you would like to do. Type: 1 to add, 2 to substract, 3 to multiply, 4 to divide");
        String val = scanner.next();
        System.out.println("Provide the second number");
        int secondval = scanner.nextInt();


        switch (val){
            case "1":
                System.out.println(kalkulator.add(firstval,secondval));
            break;
            case "2":
                System.out.println(kalkulator.sub(firstval,secondval));
            break;
            case "3":
                System.out.println(kalkulator.mult(firstval,secondval));
            break;
            case "4":
                System.out.println(kalkulator.div(firstval,secondval));
                break;

        }



    }
}