import java.util.Scanner;

public class Main {
    //Creating a method for finding the # seats available
    //
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("How many carriages are on the train?");
        int carriages = scanner.nextInt();
        System.out.println(carriages * 100);


        System.out.println("How many adult tickets have been sold?");
        int adult = scanner.nextInt();
        System.out.println(adult);

        System.out.println("How many child tickets have been sold?");
        int child = scanner.nextInt();
        System.out.println(child);

        System.out.println("How many bike tickets have been sold?");
        int bike = scanner.nextInt();
        System.out.println(bike * 2);

        // method for performing the calculations
        //
        int seats_left = (carriages-adult-child-bike);
        System.out.println("There are " + seats_left + " seats left.");

        return;
    }
}







