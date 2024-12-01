public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа");

        System.out.println("Задача №1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + salary;
            i = i + 1;

            System.out.println(" Месяц " + i + ", сумма накоплений равна " + total);

        }

        System.out.println("Задача №2");
        int y = 1;
        int max = 10;
        while (y <= max) {
            System.out.print(y + " ");
            y = y + 1;
        }
        System.out.println();
        for (int x = 10; x > 0; x = x - 1) {
            System.out.print(x + " ");
        }

        System.out.println("Задача №3");
        int population = 12000000;
        int born = 17;
        int death = 8;
        int dif = born - death;
        int i1 = 2023;
        while (i1 <= 2032) {
            population += population * dif / 1000;
            i1++;
            System.out.println("Год " + i1 + " численность населения составляет " + population);
            System.out.println(population);
        }

        System.out.println("Задача №4");
        int month = 15000;
        int totalWithPenny = 0;
        i = 0;
        while (totalWithPenny < 12000000) {
            totalWithPenny = totalWithPenny + totalWithPenny * 7 / 100;
            totalWithPenny = totalWithPenny + month;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " + totalWithPenny);
        }

        System.out.println("Задача №5");
        int salary1 = 15_000;
        int total1 = 0;
        int month1 = 1;
        for (; total1 <= 12_000_000; month1++) {
            total1 += total1 / 100 * 7;
            total1 += salary1;
            if (month1 % 6 == 0) {
                System.out.println(" Месяц " + month1 + " сумма равна " + total1);
            }
        }

        System.out.println("Задача №6");
        int salary2 = 15000;
        int total2 = 0;
        int year = 9;
        int monthsInYear = 12;
        for (int month2 = 1; month2 <= year * monthsInYear; month2++) {
            total2 += total2 / 100 * 7;
            total2 += salary2;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + " сумма равна " + total2);
            }
        }

            System.out.println("Задача №7");
            int firstFriday = 3;
            int daysMouth = 31;
            int friday = firstFriday;
            int week = 7;
            while (friday <= daysMouth) {
                System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет");
                friday += week;
            }

            System.out.println(" задача 8 ");
            int spanKamets = 79;
            int startDate = 200;
            int finalDate = 100;
            int currentYear = 2023;
            int pastBecentenary = currentYear - startDate;
            for (int year1 = 0; year1 <= currentYear + finalDate; year1 = year1 + spanKamets) {
                if (year1 >= pastBecentenary) {
                    System.out.println(year1);
                    if (year1 > currentYear) {
                        break;
                    }
                }
            }
        }
    }