public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Task2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Task3");
        for (int a = 0; a <= 17; a = a + 2) {
            System.out.println(a);
        }

        System.out.println("Task4");
        for (int b = 10; b >= -10; b--) {
            System.out.println(b);
        }

        System.out.println("Task5");
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }

        System.out.println("Task6");
        for (int seven = 7; seven <= 98; seven = seven + 7) {
            System.out.println(seven);
        }

        System.out.println("Task7");
        for (int c = 1; c <= 512; c = c * 2) {
            System.out.println(c);
        }

        System.out.println("Task8");
        int summInMonth = 29000;
        int allMoney = 0;
        for (int i = 1; i <= 12; i++) {
            allMoney = allMoney + summInMonth;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + allMoney + " рублей");
        }

        System.out.println("Task8");

    }
}