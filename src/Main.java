import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numWeeks;
        System.out.println("enter number of weeks");
        numWeeks = input.nextInt();

        int days = numWeeks * 7;
        System.out.println(days + " "+ "days");
        int hours = days * 24;
        System.out.println(hours + " "+ "hours");
        int minutes = hours * 60;
        System.out.println(minutes + " "+ "minutes" );
        int seconds = minutes * 60;
        System.out.println(seconds + " "+ "seconds");
    }
}
