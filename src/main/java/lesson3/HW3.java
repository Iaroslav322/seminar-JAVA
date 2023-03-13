package lesson3;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Random;

public class HW3 {
    public static void main(String[] args) {
        forExample();
        ex2();
    }

    public static void forExample() {
        Random rnd = new Random();
        ArrayList<Integer> ourList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-10, 10);
            ourList.add(val);
        }
        List<Integer> listWithoutDuplicates = ourList.stream().distinct().toList();
        System.out.println("Наш список из чисел" + ourList);
        System.out.println("Удалили дублирующие значения " + listWithoutDuplicates);
    }

    public static void ex2() {
        List<String> auto = new ArrayList<>();
        HashMap<String, Integer> autoCount = new HashMap<>();
        Random rand = new Random();

        String[] solarAutoCar = {"Mercedes", "BMW", "AUDI", "FORD", "TOYOTA", "SUBARU", "LADA", "Nissan"};
        for (int i = 0; i < 20; i++) {
            int randIndex = rand.nextInt(solarAutoCar.length);
            auto.add(solarAutoCar[randIndex]);
        }
        System.out.println("Сисок брендов автомобилей " + Arrays.toString(solarAutoCar));
        System.out.println("Наш список с повторяющимися названиями брендов: " + auto);
        List<String> listWithoutDuplicates_ = auto.stream().distinct().collect(Collectors.toList());
        System.out.println("Список без дублей: " + listWithoutDuplicates_);
    }
}