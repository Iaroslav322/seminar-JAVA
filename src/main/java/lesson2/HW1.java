package lesson2;
import java.util.Scanner;
//1. Напишите метод, который принимает на вход строку (String) и определяет
// является ли строка палиндромом (возвращает boolean значение).
public class HW1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку для проверки: ");
        StringBuilder sb = new StringBuilder(scan.nextLine());
        palindrome(sb);
    }
    public static void palindrome(StringBuilder a){
        StringBuilder a_pal = new StringBuilder(a).reverse();
        if (a.toString().equals(a_pal.toString()) == true) System.out.println("Введенная строка, " + a + " - палиндром!");
        else System.out.println("Введенная строка, " + a + " - не палиндром!");
    }
}