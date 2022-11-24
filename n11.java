import java.util.Calendar;
import java.util.Scanner;
import java.time.LocalDate;
public class n11 {   
     static int month, year, day;
  public static void main(String[] args) {  
 Scanner scanner1 = new Scanner(System.in);
  System.out.print("Введите день рождения: ");
  while (!scanner1.hasNextInt()) {
    System.out.println("Ошибка!");
    System.out.print("Введите день  рождения: ");
    scanner1.next();
}
Scanner scanner2 = new Scanner(System.in);
  System.out.print("Введите месяц рождения: ");
  while (!scanner2.hasNextInt()) {
    System.out.println("Ошибка!");
    System.out.print("Введите месяц рождения: ");
    scanner2.next();
}
Scanner year = new Scanner(System.in);
  System.out.print("Введите год рождения: ");
  while (!year.hasNextInt()) {
    System.out.println("Ошибка!");
    System.out.print("Введите год рождения: ");
    year.next();
}
LocalDate current_date = LocalDate.now();
int current_Year = current_date.getYear();
int current_Month = current_date.getMonthValue();
int yearsold = (Math.abs(current_Year-year)) ;
int monthold = (Math.abs(Calendar.getInstance().get(Calendar.MONTH)+1-month)) ;
int dayold = (Math.abs(Calendar.getInstance().get(Calendar.DATE)-day)) ;
System.out.println(yearsold + " лет " + monthold + " месяцев " + dayold + " дней ");
 }  
}
    
    
    
    
    
    