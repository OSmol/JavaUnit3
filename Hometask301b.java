package unit3;

import java.util.*;

public class Hometask301b {

    public static void main(String[] args) 
        {
            double byn,dollar,code;

            try (Scanner sc = new Scanner(System.in)){

            System.out.println("Введите код валюты\n 1 Белорусские рубли \n 2 Доллары США"); 
            code=sc.nextInt();

            //For BYN Conversion
            if(code == 1)
            {
                System.out.println("Введите сумму в белорусских рублях");
                byn = sc.nextFloat();
                 
                dollar = byn / 2.23;
                System.out.println("Dollar : "+dollar);
            }

            //For Dollar Conversion
            else if (code == 2)
            {
                System.out.println("Введите сумму в долларах США");
                dollar = sc.nextFloat();

                byn = dollar * 0.45;
                System.out.println("byn : "+byn);

            }

            else
                System.out.println("Вы ввели неверное значение");
            }

    }
                
}