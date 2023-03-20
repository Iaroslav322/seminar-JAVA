package lesson5;
//1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class HW1 {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();
        phoneBook.put("Смыженков", List.of("+7(999)9999999", "+7(999)8888888", "+7(999)7777777"));
        phoneBook.put("Денисов", List.of("+7(800)5553535", "+7(920)7654321"));
        phoneBook.put("Сидоров",List.of("+7(555)3456776","+7(800)1234567"));

        System.out.println(phoneBook);
    }
}
