import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Введите число a: ");
      float a = sc.nextFloat();
      System.out.print("Введите число b: ");
      float b = sc.nextFloat();
      if(a > b) System.out.println("a>b");
      if(a < b) System.out.println("a<b");
      if(a == b) System.out.println("a=b");
      float res1, res2, res3, res4;
      res1 = a + b;
      res2 = a - b;
      res3 = a * b;
      res4 = a / b;
      System.out.println("Результат: ");
      System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4);
    }
}