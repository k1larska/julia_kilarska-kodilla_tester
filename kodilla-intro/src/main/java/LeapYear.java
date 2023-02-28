public class LeapYear {
    public static void main(String[] args) {
        int year = 1572;
        if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
            System.out.println("Przestępny");
        } else {
            System.out.println("Nie przestępny");
        }
    }
}
