import java.util.Scanner;
public class nomer1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int day;
        int month;
        int year;
        System.out.print("Введите день: ");
        day = sc.nextInt();
        System.out.print("Введите месяц: ");
        month = sc.nextInt();
        System.out.print("Введите год: ");
        year = sc.nextInt();
        System.out.print(+day);
                System.out.print("/");
                System.out.print(+month);
                System.out.print("/");
                System.out.print(+year);


                boolean isTrueDate = true;
                if(month > 12)
                {
                    isTrueDate = false;
                }
                else if (month == 1 || month == 3 || month == 5 || month ==  7 || month ==  8 || month ==  10 || month == 12)
                {
                    if (day <= 31)
                    {   
                        isTrueDate = true;
                    }
                    else if (day >= 31)
                    {
                        isTrueDate = false;
                    }
                }
                else if (month == 4 || month == 6 || month == 9 || month == 11)
                {
                    if (day <= 30)
                    {
                        isTrueDate = true;
                    }
                    else if (day >= 30)
                    {
                        isTrueDate = false;
                    }



                 }
                 else if (month == 2) 
                 {
                    if (year % 4 == 0) 
                    {
                        if (day <= 29)
                        {
                            isTrueDate = true;
                        }
                        else if (day >= 29)
                        {
                            isTrueDate = false;
                        }
                    }
                    else if (year % 4 != 0)
                    {
                        if (day <= 28)
                        {
                            isTrueDate = true;
                        }
                        else if (day >= 28)
                        {
                            isTrueDate = false;
                        }
                     }
                }
                if(isTrueDate)
                {
                    System.out.println(" Все верно");
                }
                if(!isTrueDate)
                {
                    System.out.println(" Неправильно");
                }

               
                sc.close(); 
    
            }
        } 