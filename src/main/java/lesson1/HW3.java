package lesson1;
import javax.naming.Name;
import java.util.Scanner;
import java.time.LocalTime;
public class HW3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите Ваше имя: ");
        String Name = iScanner.next();
        String a;
        int Hour = LocalTime.now().getHour();
        if (Hour == 23 || Hour < 5)
            a = "Доброй ночи";
        else if (Hour < 12)
            a = "Доброе утро";
        else if (Hour < 18)
            a = "Добрый день";
        else
            a = "Добрый вечер";
        System.out.println(a + ", " + Name + "!");
        iScanner.close();
    }
}
