import java.util.Scanner;
import java.util.Calendar;    
public class n11 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);          
        int day_of_Birth;            
        do {
          System.out.println("День рождения: ");               
           while (!sc.hasNextInt()){
              System.out.println("Ошибка ");                    
              sc.next();                
            }
          day_of_Birth = sc.nextInt();              
            if (day_of_Birth > 31)
             {
              System.out.println("Ошибка. много дней ");               
             }
          if (day_of_Birth <= 0) {
              System.out.println("Ошибка. отрицательное число ");             
               }
      } 
      while ((day_of_Birth <= 0) || (day_of_Birth > 31) );    
              int month_of_Birth;            
              do {
          System.out.println("Месяц рождения: ");               
           while (!sc.hasNextInt())
           {

              System.out.println("Ошибка ");                   
               sc.next();              
                }
          month_of_Birth = sc.nextInt();             
             if (month_of_Birth > 12) {
              System.out.println("Ошибка. месяцев не больше 12 ");           
                 }
          if (month_of_Birth <= 0) {
              System.out.println("Ошибкаю отрицательное число ");               
             }
  } 
  while ((month_of_Birth <= 0) || (month_of_Birth > 12) );          
    int year_of_Birth;            
    do {
          System.out.println("Год рождения: ");           
               while (!sc.hasNextInt()){

              System.out.println("Ошибка ");                  
                sc.next();               
               }
          year_of_Birth = sc.nextInt();            
              if (year_of_Birth > 2022) {
              System.out.println("Вы либо младенец и не можете пользоваться программой, либо еще не родились.");               
             }
          if (year_of_Birth <= 1900) {
              System.out.println("Старичок ");             
               }
      }
       while ((year_of_Birth <= 1900) || (year_of_Birth > 2022) );         
          System.out.println("Дата рождения: " + year_of_Birth + " / " + month_of_Birth + " / " + day_of_Birth);           
           int years_old = (Calendar.getInstance().get(Calendar.YEAR) - year_of_Birth);           
            int months_old = (Calendar.getInstance().get(Calendar.MONTH) - month_of_Birth);           
             int days_old = (31 + Calendar.getInstance().get(Calendar.DATE) - day_of_Birth);          
               if (days_old > 31)
          System.out.print(years_old + " лет " + (months_old+1) + " месяцев " +( days_old-31) + " дней ");         
             else System.out.print(years_old + " лет " + months_old + " месяцев " + days_old + " дней ");       
                  sc.close();        
                }
}