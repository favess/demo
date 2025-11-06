import java.util.Scanner;

public class YourAge {
 
    public static void main(String[] args){

        System.out.println("type in your age");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.printf("you are %d years old\n", age);
        input.close();
    }

}
