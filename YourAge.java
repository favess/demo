import java.util.Scanner;

public class YourAge {
 
    public static void main(String[] args){

        System.out.println("type in your age");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.printf("you are %d years old\n", age);
        System.out.println("input current year");
        int curentYear = input.nextInt();
        System.out.println("input the year you want to calculate your age in");
        int futureYear = input.nextInt();
        CalculateAgeInYear ageCalculator = new CalculateAgeInYear(age, curentYear, futureYear);
        System.out.printf("you will be %d years old in %d ", ageCalculator.CalculateAge(), futureYear);
        input.close();
    }

}
