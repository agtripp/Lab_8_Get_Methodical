import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalPrice = 0;
        boolean keepGoing = true;
        while (keepGoing) {
            totalPrice += SafeInput.getRangedDouble(in, "Enter the price of your next item: ", .50, 10.00);
            keepGoing = SafeInput.getYNConfirm(in, "Would you like to keep going? ");}
        System.out.printf("Your Total Price is $%.2f", totalPrice);

    }
}