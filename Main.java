import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Laptop> laptop = new HashSet<>();
        laptop.add(new Laptop("Asus", 16, 256, "Windows 11", "grey"));
        laptop.add(new Laptop("Lenovo", 12, 512, "Windows 10", "black"));
        laptop.add(new Laptop("MacBook", 8, 256, "macOS", "white"));
        laptop.add(new Laptop("Asus VivoBook", 32, 1000, "Windows 11","grey"));
        laptop.add(new Laptop("Aser", 16, 512, "Windows 10","red"));
        laptop.add(new Laptop("Huawei", 16, 512, "Windows 11", "black"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой параметр вас интересует");
        System.out.println(" 1 - объём оперативной памяти");
        System.out.println(" 2 - объём диска");
        System.out.println(" 3 - система");
        System.out.println(" 4 - цвет корпуса");
        int param = scanner.nextInt();
        scanner.nextLine();

        switch (param) {
            case 1:
                System.out.println("Введите минимальный объем ram: ");
                int minram = scanner.nextInt();
                scanner.nextLine();
                laptop = FilterUtils.filterByRAM(laptop, minram);
                
                break;
            case 2:
                System.out.println("Введите минимальный объем hdd: ");
                int minhdd = scanner.nextInt();
                scanner.nextLine();
                laptop = FilterUtils.filterByRAM(laptop, minhdd);

                break;
            case 3:
                System.out.print("Введите операционную систему: ");
                String OSystem = scanner.nextLine();
                laptop = FilterUtils.filterByOSystem(laptop,OSystem);

            break;
            case 4:
                System.out.print("Введите цвет: ");
                String bcolor = scanner.nextLine();
                laptop = FilterUtils.filterByColor(laptop, bcolor);
        
                break;
            default:
                System.out.println("Некорректный выбор ");
                // return;
           scanner.close();
        }
       
        System.out.println("\nРезультаты фильтрации:");
        if (laptop.isEmpty()) {
            System.out.println("Ноутбуки по заданным критериям не найдены.");
        } else {
            for (Laptop notebook : laptop) {
                System.out.println(notebook);
            }
        }
       
    }
}
