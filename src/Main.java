import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задание 1");
        int one = 934;
        System.out.println("Значение переменной one с типом int равно " + one);
        byte two = 34;
        System.out.println("Значение переменной two с типом byte равно " + two);

        short three = 4532;
        System.out.println("Значение переменной three с типом short равно " + three);
        long four = 234596450L;
        System.out.println("Значение переменной four с типом long равно " + four);
        float five = 2.5f;
        System.out.println("Значение переменной five с типом float равно " + five);

        double six = 3.2;
        System.out.println("Значение переменной six с типом double равно " + six);
    }

    public static void task2() {
        System.out.println("Задание 2");
        float a = (float) 27.12;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);

        double c = 2.786;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        char e = 159;
        System.out.println(e);

        int f = 27897;
        System.out.println(f);

        byte g = 67;
        System.out.println(g);
    }
public static void task3(){
    System.out.println("Задание 3");

    byte firstTeacher = 23;
    System.out.println("У первого учителя " + firstTeacher + " ученика.");

    byte secondTeacher = 27;
    System.out.println("У второго учителя " + secondTeacher + " учеников.");

    byte thirdTeacher = 30;
    System.out.println("У третьего учителя " + thirdTeacher + " учеников.");

    short paperQuantity = 480;
    System.out.println("Общее количество бумаги на всех " + paperQuantity + " листов.");

    int numberOfStudents = firstTeacher + secondTeacher + thirdTeacher;
    System.out.println("Колличество учеников " + numberOfStudents + " человек.");

    int sheetsPerPerson = paperQuantity / numberOfStudents;
    System.out.println("На каждого ученика расчитано " + sheetsPerPerson + " листов бумаги." );

    System.out.println("Таким образом каждому учителю в класс полагается: ");

    int firstTeacher1 = firstTeacher * sheetsPerPerson;
    System.out.println("Первому учителю " + firstTeacher1 + " листов.");

    int secondTeacher2 = secondTeacher * sheetsPerPerson;
    System.out.println("Второму учителю " + secondTeacher2 + " листов.");

    int thirdTeacher2 = thirdTeacher * sheetsPerPerson;
    System.out.println("Третьему учителю " + thirdTeacher2 + " листов.");

}
public static void task4() {
    System.out.println("Задание 4");

    byte quantity = 16;              // деталей по условию
    byte minutes = 2;               // минут по условию
    System.out.println("Колличество деталей за " + minutes + " минуты " + quantity + " штук.");
    byte minutes2 = 20;             // минут по условию
    byte days1 = 1;                 // дней по условию
    byte days2 = 3;               // дней по условию
    byte days3 = 30;             // дней по условию
    byte hoursInADay = 24;       // часов в сутках
    byte minutesInAnHour = 60;   // минут в часе
    int numberOfMinutes1 = days1 * hoursInADay * minutesInAnHour;  // колличество минут
    int numberOfMinutes2 = days2 * hoursInADay * minutesInAnHour;  // колличество минут
    int numberOfMinutes3 = days3 * hoursInADay * minutesInAnHour;  // колличество минут
    int quantityPerMinute = quantity / minutes;
    System.out.println("Колличество деталей в минуту " + quantityPerMinute + " шт.");

    int performance = minutes2 * quantityPerMinute;
    System.out.println("За " + minutes2 + " минут, машина произвела " + performance + " штук бутылок.");

    int performance1 = numberOfMinutes1 * quantityPerMinute;
    System.out.println("За " + days1 + " день, машина произвела " + performance1 + " штук бутылок.");

    int performance2 = numberOfMinutes2 * quantityPerMinute;
    System.out.println("За " + days2 + " день, машина произвела " + performance2 + " штук бутылок.");

    int performance3 = numberOfMinutes3 * quantityPerMinute;
    System.out.println("За " + days3 + " день, машина произвела " + performance3 + " штук бутылок.");
    }
     public static void task5() {
         System.out.println("Задание 5");

         byte totalNumber = 120;
         byte whitePaint = 2;
         byte blackPaint = 4;

         int totalNumber1 = whitePaint + blackPaint;
         System.out.println("Колличество банок на класс " + totalNumber1 + " шт.");

         int numberOfClasses = totalNumber / totalNumber1;
         System.out.println("Общее колличество классов " + numberOfClasses);

         int totalOfWhitePaint = whitePaint * numberOfClasses;
         System.out.println("Общее колличество белой краски " + totalOfWhitePaint + " штук.");

         int totalOfBlackPaint = blackPaint * numberOfClasses;
         System.out.println("Общее колличество коричневой краски " + totalOfBlackPaint + " штук.");

         System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + totalOfWhitePaint + " банок белой краски и " + totalOfBlackPaint + " банок коричневой краски.");
     }

public static void task6() {
    System.out.println("Задание 6");

        byte banana = 5;   // 80 гр
        short milk = 200;  // 105гр-100мл
        byte iceCream = 2; // 100гр
        byte eggs = 4;  // 1- 70гр
        float grPerKg = 1000f;
        byte grBanana = 80;
        byte grMilk = 105;
        byte grIceCream = 100;
        byte grEggs = 70;
    int weightBanana = banana * grBanana;
    System.out.println("Общий вес бананов " + weightBanana + " гр.");

    int weightMilk = (grMilk * milk) / 100;
    System.out.println("Общий вес молока " + weightMilk + " гр.");

    int weightIceCream = iceCream * grIceCream;
    System.out.println("Общий вес мороженного-пломбир " + weightIceCream + " гр.");

    int weightEggs = eggs * grEggs;
    System.out.println("Общий вес яиц " + weightEggs + " гр.");

    int totalWeight = weightEggs + weightBanana + weightMilk + weightIceCream;
    System.out.println("Вес такого спротзавтрака " + totalWeight + " гр.");
    float totalWeight1 = totalWeight / grPerKg;
    System.out.println("Вес такого спротзавтрака " + totalWeight1 + " кг.");
}

public static void task7() {
    System.out.println("Задание 7");
int weightForLossInGrams = 7_000;
int lossWeightPerDayMin = 250;
int lossWeightPerDayMax = 500;
double maxDaysCount = (double) weightForLossInGrams / lossWeightPerDayMin;
double minDaysCount = (double) weightForLossInGrams / lossWeightPerDayMax;
double lossWeightPerDayAverage = (lossWeightPerDayMin + lossWeightPerDayMax)/2D;
double averageDaysCount = weightForLossInGrams / lossWeightPerDayAverage;
    System.out.println("Минимальное количество дней для похудения " + minDaysCount);
    System.out.println("Максимальное количество дней для похудения " + maxDaysCount);
    System.out.printf(Locale.US,"Среднее количество дней для похудения %2f%n", + averageDaysCount);



    }
    public static void task8(){
        System.out.println("Задание 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashaUp = masha * 10 / 100;
        int denisUp = denis * 10 / 100;
        int kristinaUp = kristina * 10 / 100;
        int mashaNew = masha + mashaUp;
        int denisNew = denis + denisUp;
        int kristinaNew = kristina + kristinaUp;
        int mashaYearUp = mashaUp * 12;
        int denisYearUp = denisUp * 12;
        int kristinaYearUp = kristinaUp * 12;
        System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + mashaYearUp + " рублей");
        System.out.println("Маша теперь получает " + denisNew + " рублей. Годовой доход вырос на " + denisYearUp + " рублей");
        System.out.println("Маша теперь получает " + kristinaNew + " рублей. Годовой доход вырос на " + kristinaYearUp + " рублей");
    }


     }