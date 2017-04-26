import java.util.Scanner;

public class Sdvig {
    
    public static void main(String... args) {
    
    int[] mass = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9  };
    
    Scanner in = new Scanner(System.in);
    System.out.println("Введите число k");
    int k = in.nextInt();//считываем целое число
    System.out.print("Исходный массив: ");
    for (int i : mass) {
    System.out.print(i + " ");
    }
    
    System.out.println();
    new Sdvig().reverse(mass, k); // кидаем массив и число на которое нужно
    // сдвинуть
    System.out.print("Массив после сдвига: ");
    for (int i : mass) {
    System.out.print(i + " ");
    }
    
    }
    
    public int[] reverse(int[] input, int sdvig) {
    if (sdvig > input.length || sdvig < 1) {
    System.out.println("Неверное количество сдвигов");
    return input;
    }
    
    int[] output = new int[input.length];
    int j = 0;
    for (int i : input) {
    output[j++] = i;
    }
    int tmp = sdvig;
    
    for (int i = 0; i < output.length; i++) {
    if (sdvig > 0) {
    input[i] = output[output.length - sdvig];
    sdvig--;
    } else {
    input[i] = output[i - tmp];
    }
    }
    return input;
    }
    
}
