import java.util.Scanner;

public class nomer21 {

public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Введите номер месяца: ");

        int mon=sc.nextInt();

        if(mon>12||mon<1)
        {
            System.out.print("Неправильно");
        }

        else if(mon>=3&&mon<=5)
        {
            System.out.print("Весна");
        }

        else if(mon>=6&&mon<=8)
        {
            System.out.println("Лето");
        }

        else if(mon>=9&&mon<=11)
        {
            System.out.print("Осень");
        }

        else if(mon==12||mon==1||mon==2)
        {
            System.out.print("Зима");
        }
}
}

