import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float a;
    // a = product cost
    System.out.println(
            "Ürününüzün maliyetini giriniz"
    );
    a = input.nextInt();
    float b ;
    System.out.println(
            "Kdv oranını giriniz"
    );
    b = input.nextInt();
    float c = a * (1+b/100);
    System.out.println(
            "ürününüzün fiyatı :" + c
    );
}

}