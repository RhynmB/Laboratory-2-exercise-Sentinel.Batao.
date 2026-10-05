import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int amount;
        int total =0;
        int count =0;

    System.out.println("Enter score (0 to stop): ");
    amount = input.nextInt();

    while (amount != -0) {

        total += amount;
        count++;

    System.out.println("Enter score (0 to stop): ");
    amount = input.nextInt();

    System.out.println("Total =" + total);
    System.out.println(" Count = " + count);}

    input.close();
    }
}