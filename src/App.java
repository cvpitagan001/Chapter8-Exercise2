import java.util.Scanner;

public class App {

    static Scanner get = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Food burger = new Food("Hamburger", 1.85, 9, 33, 1);
        Food salad = new Food("Salad", 2.00, 1, 11, 5);
        Food fries = new Food("Fries", 1.30, 11, 36, 4);
        Food soda = new Food("Soda", 0.95, 0, 38, 0);
        menu(burger, salad, fries, soda);
    }

    public static void menu(Food burger,Food salad,Food fries,Food soda) {
        System.out.format("%-10s %8s %8s %8s %8s %8s", "Item", "Price", "Fat(g)", "Carbs(g)", "Fiber(g)", "\n");
        System.out.format("%-10s %8s %8s %8s %8s %8s", "Hamburger", "$1.85", 9, 33, 1, "\n");
        System.out.format("%-10s %8s %8s %8s %8s %8s", "Salad", "$2.00", 1, 11, 5, "\n");
        System.out.format("%-10s %8s %8s %8s %8s %8s", "Fries", "$1.30", 11, 36, 4, "\n");
        System.out.format("%-10s %8s %8s %8s %8s %8s", "Soda", "$0.95", 0, 38, 0, "\n");

        input(burger, salad, fries, soda);
    }
    
    public static void input(Food burger,Food salad,Food fries,Food soda) {
        System.out.print("\nEnter number of " + burger.getItem() + ": ");
        int qtyBurger = get.nextInt();
        System.out.println("Each " + burger.getItem() + " has " + burger.getFat() + " fat, " + burger.getCarbs() + " of carbs, and " + burger.getFiber() + " of fiber.");

        System.out.print("Enter number of " + salad.getItem() + ": ");
        int qtySalad = get.nextInt();
        System.out.println("Each " + salad.getItem() + " has " + salad.getFat() + " fat, " + salad.getCarbs() + " of carbs, and " + salad.getFiber() + " of fiber.");

        System.out.print("Enter number of " + fries.getItem() + ": ");
        int qtyFries = get.nextInt();
        System.out.println("Each " + fries.getItem() + " has " + fries.getFat() + " fat, " + fries.getCarbs() + " of carbs, and " + fries.getFiber() + " of fiber.");

        System.out.print("Enter number of " + soda.getItem() + ": ");
        int qtySoda = get.nextInt();
        System.out.println("Each " + soda.getItem() + " has " + soda.getFat() + " fat, " + soda.getCarbs() + " of carbs, and " + soda.getFiber() + " of fiber.");

        double total = (qtyBurger * burger.getPrice()) + (qtySalad * salad.getPrice()) + (qtyFries * fries.getPrice()) + (qtySoda * soda.getPrice());
        System.out.println("\nYour order comes to: $" + total);
        
    }
}
