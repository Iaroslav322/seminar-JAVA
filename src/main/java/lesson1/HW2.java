package lesson1;

public class HW2 {
    public static void main(String[] args) {
        int[] mas = {3,2,2,3};

        System.out.println("Исходный массив: ");
        PrintMas(mas);
        ReplaceMas(mas,3);
        System.out.println("\nПреобразованный массив:");
        PrintMas(mas);
    }

    public static void ReplaceMas(int[] mas, int value) {
        int i = 0;
        for (int a: mas){
            if (a == value)
                continue;
            mas[i++]=a;
        }
        for (int j=i; j < mas.length; j++ )
            mas [j] = value;
    }

    public static void PrintMas(int[]mas) {
        for (int i : mas)
            System.out.print(i+ " ");

    }
}
