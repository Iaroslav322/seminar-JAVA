package lesson;
import java.util.List;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        notebooks ChuwiAH401 = new notebooks("Honor", "MagicBook", "Grey", 15.6, "LCD", 8, 256, "SSD");
        notebooks SamsungS101 = new notebooks("Xiaomi", "RedmiBook", "Black", 15.6, "LCD", 8, 512, "SSD");
        notebooks SamsungS150 = new notebooks("HP", "250 G9", "Green", 17.0, "TFT", 16, 512, "SSD");
        notebooks AsusTUF504 = new notebooks("Acer", "Extensa", "Red", 15.6, "OLED", 32, 2048, "HDD 2.0");
        notebooks AsusTUF555 = new notebooks("ASUS", "VivoBook", "White", 15.6, "TFT", 16, 1024, "SSD");

        List<notebooks> notebookList = List.of(ChuwiAH401, SamsungS101, SamsungS150, AsusTUF504, AsusTUF555);

        Scanner scannerUser = new Scanner(System.in);
        System.out.println("Выберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
        int choiceUserSearch = scannerUser.nextInt();
        Scanner scannerRequestUserForSearch = new Scanner(System.in);
        System.out.println("Напишите интересующий цвет или бренд: ");
        String requestUserForSearch = scannerRequestUserForSearch.nextLine();

        if (choiceUserSearch == 1) {
            for (notebooks color : notebookList) {
                if (color.getColor().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(color.printInfo());
                }
            }

        } else if (choiceUserSearch == 2) {
            for (notebooks brand : notebookList) {
                if (brand.getBrand().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(brand.printInfo());
                }
            }
        } else {
            System.out.println("Ошибка.\nВыберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
        }

        scannerUser.close();
    }
}