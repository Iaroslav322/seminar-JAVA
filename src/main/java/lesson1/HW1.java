package lesson1;

import java.util.Random;

public class HW1 {
    public static void main(String[] args) {
        int [] array = new int[10];
        Random rnd = new Random();

        for (int i=0;i< array.length;i++){
            array[i] = rnd.nextInt(101);
            System.out.print(array[i] + " ");
        }
        int min = array[0];
        for(int i=0;i< array.length;i++){
            if(min > array[i]){
                min = array[i];
            }
        }

        System.out.println();
        System.out.println("Минимальный массив: "+ min);

        int max = array[0];
        for(int i=0;i< array.length;i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println();
        System.out.println("Максимальный массив: "+ max);
    }
}
