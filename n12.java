import java.util.Scanner;
 
public class n12 {
    private static final String[] TIME_YEAR = {"Зима", "Весна", "Лето", "Осень"};
 
    public static void main(String[] args) {
        int month;
        do {
            System.out.print("Введите месяц: ");
            month = new Scanner(System.in).nextInt();
        } while (month < 1 || month > 12);
        System.out.println("Время года: " + TIME_YEAR[month == 12 ? 0 : month / 3]);
        
    }
}