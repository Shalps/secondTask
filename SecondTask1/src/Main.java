import java.util.Scanner;

import static ru.netology.service.CustomsService.calculateCustoms;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в <калькулятор пошлин>");

        System.out.print("Введите цену товара (в руб.):");
        int price = scanner.nextInt();

        System.out.print("Введите вес товара (в кг.):");
        int productWeight = scanner.nextInt();


        int result =  calculateCustoms(price, productWeight);
        System.out.print("Размер пошлины (в руб.) составит:"+result);
    }


}
