package lesson6;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class main {
    public static void main(String[] args) {

        Set<NoteBook> set = new HashSet<>();
        set.add(new NoteBook("Notebook 1", 8, "Windows10", 70000, "Xiaomi"));
        set.add(new NoteBook("Notebook 2", 16, "Windows10", 65000, "Asus"));
        set.add(new NoteBook("Notebook 3", 32, "MacOS", 185000, "MacBook PRO"));
        set.add(new NoteBook("Notebook 4", 64, "linux", 90000, "Lenovo"));

            HW operation = new HW(set);
        operation.start();

    }
}
