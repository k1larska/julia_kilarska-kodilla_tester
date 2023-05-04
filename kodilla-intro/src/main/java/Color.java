
import java.util.Scanner;

public class Color {
    public static String pickColor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first letter of the color: ");
        char letter = scanner.next().charAt(0);

        String color;
        switch (letter) {
            case 'r':
                color = "red";
                break;
            case 'g':
                color = "green";
                break;
            case 'b':
                color = "blue";
                break;
            case 'y':
                color = "yellow";
                break;
            default:
                color = "unknown color";
                break;
        }

        return color;
    }
    public static void main(String[] args) {
        String color = Color.pickColor();
        System.out.println("You chose: " + color);
    }

}