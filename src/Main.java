
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int birthYear;


        Scanner china = new Scanner(System.in);

        System.out.print("Enter Birth year :");
        birthYear = china.nextInt();


        if (birthYear % 12 == 1) {
            System.out.println("Your Chinise Zodiac is : Monkey");
        } else if (birthYear % 12 == 2) {
            System.out.println("Your Chinise Zodiac is : Rooster");
        } else if (birthYear % 12 == 3) {
            System.out.println("Your Chinise Zodiac is : Dog");
        } else if (birthYear % 12 == 4) {
            System.out.println("Your Chinise Zodiac is : Pig");

        }else if (birthYear % 12 == 5) {
            System.out.println("Your Chinise Zodiac is : Mouse");
        }else if (birthYear % 12 == 6) {
            System.out.println("Your Chinise Zodiac is : Ox");
        }else if (birthYear % 12 == 7) {
            System.out.println("Your Chinise Zodiac is : Tiger");
        }else if (birthYear % 12 == 8) {
            System.out.println("Your Chinise Zodiac is : Dragon");
        }else if (birthYear % 12 == 9) {
            System.out.println("Your Chinise Zodiac is : Snake");
        }else if (birthYear % 12 == 10) {
            System.out.println("Your Chinise Zodiac is : Horse");
        }else if (birthYear % 12    == 11) {
            System.out.println("Your Chinise Zodiac is : Sheep");
        }else {
            System.out.println(" Enter valid year !");
        }
    }
}
