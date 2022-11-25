import java.util.Scanner;
import java.util.Calendar;
public class n1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("День рождения: ");  
        int day = scanner.nextInt() ;     
        System.out.print("Месяц рождения: ");   
        int month = scanner.nextInt() ;    
        System.out.print("Год рождения: ");  
        int year = scanner.nextInt() ; 
        int years_old = (Math.abs(Calendar.getInstance().get(Calendar.YEAR) - year));           
        int months_old = (Calendar.getInstance().get(Calendar.MONTH)+1 - month );           
         int days_old = (31 + Calendar.getInstance().get(Calendar.DATE) - day);  
         System.out.print(years_old + " лет " + months_old + " месяцев " + days_old + " дней "); 
         scanner.close(); 
}
}
