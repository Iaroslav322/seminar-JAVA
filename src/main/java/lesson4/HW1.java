package lesson4;
import java.util.*;
//1. Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.
public class HW1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<String> strsList = new LinkedList<> ();

        while (true) {
            System.out.println();
            System.out.println("Введите строку: ");
            String inputString = in.nextLine();

            if (inputString.length() == 0) {
                System.out.println("Строка не должна быть пустой.");
                continue;
            }
            if (inputString.equals("print")) {
                ListIterator<String> itr = strsList.listIterator(strsList.size());
                while (itr.hasPrevious()) {
                    System.out.println(itr.previous());
                }

            } else if (inputString.equals("revert")) {

                try {
                    System.out.println("Последняя строка удалена:\t" + strsList.removeLast());
                    System.out.println(strsList);

                }
                catch (Exception e){
                    System.out.println("Список пуст");
                }
            } else {
                strsList.add(inputString);
                System.out.println("Новая сторока добавлена в список");
            }

        }

    }

}
