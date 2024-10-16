//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    private static int sum(int[] arr) {
        int result = 0;
        for (int i : arr)
            result += i;

        return result;
    }

    public static void main(String[] args) {

        /*System.out.println("Enter temperature in celsius:");
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int f = c * (9 / 5) + 32;
        System.out.println("Temperature in farenheit:" + f);*/

        int[] letterDimensions = new int[3];
        int a = 0;
        
        System.out.println("Ange längd, tjocklek och bredd: ");
        while (a < 3) {

            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            letterDimensions[a] = i;
            a++;

        }
        if (140 < letterDimensions[0] && letterDimensions[0] < 600 && letterDimensions[1] < 100 && 90 < letterDimensions[2] && sum(letterDimensions) < 900 ){
            System.out.println("Godkänd");
        } else {
            System.out.println("Ej godkänd!");
        }

        Triangle t = new Triangle();
        t.poi


    }


}


