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

    public static void task1 () {
        System.out.println("Задача 1");
       int a = 100000;
       byte b = 22;
       short c = 2222;
       long d = 300000000;
       float e = 21212155154545454553.302100000000000000000000000001f;
       double f = 526.256;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        double a = 27.12;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int ludmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int allStudents = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int oneStudent = 480 / allStudents;
        System.out.println("На каждого ученика расчитано " + oneStudent + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int machinePerformancePerMinute = 16 / 2;
        int twentyMinutes = machinePerformancePerMinute * 20;
        int perDay = machinePerformancePerMinute * 60 * 24;
        int threeDays = perDay * 3;
        int oneMonth = perDay * 30;
        var a = "20 минут";
        var b = "в сутки";
        var c = "за 3 дня";
        var d = "за 1 месяц";
        System.out.println("За " + a + " машина произвела " + twentyMinutes + " штук бутылок");
        System.out.println("За " + b + " машина произвела " + perDay + " штук бутылок");
        System.out.println("За " + c + " машина произвела " + threeDays + " штук бутылок");
        System.out.println("За " + d + " машина произвела " + oneMonth + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int paintTotal = 120;
        int brownPaintPerClass = 4;
        int whitePaintPerClass = 2;
        int oneClass = brownPaintPerClass + whitePaintPerClass;
        int classesTotal = paintTotal / oneClass;
        int brownTotal = brownPaintPerClass * classesTotal;
        int whiteTotal = whitePaintPerClass * classesTotal;
        System.out.println("В школе, где  " + classesTotal + " классов, нужно " + whiteTotal + " банок белой краски и " + brownTotal + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int bananas = 5 * 80;
        int milk = 105 * 2;
        int iceCream = 2 * 100;
        int rawEggs = 4*70;
        int totalWeightGrams = bananas + milk + iceCream + rawEggs;
        double totalWeightKg = totalWeightGrams*0.001;
        System.out.println("Общий вес завтрака составляет " + totalWeightGrams + " граммов или " + totalWeightKg + " килограмм");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int totalWeight = 7;
        double firstOption = 0.25;
        double secondOption = 0.5;
        double daysFirstOption = totalWeight/firstOption;
        double daysSecondOption = totalWeight/secondOption;
        System.out.println("Чтобы добиться результатов похудения, при потере веса 250 грамм в день, понадобиться " + daysFirstOption + " дней. А при потери веса 500 грамм в день понадобиться " + daysSecondOption + " дней");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        double coefficient = 1.1;
        int mashaToday = 67760;
        int denisToday = 83690;
        int kristinaToday = 76230;
        double mashaFuture = mashaToday*coefficient;
        double denisFuture = denisToday*coefficient;
        double kristinaFuture = kristinaToday*coefficient;
        int mashaTodayYear = mashaToday*12;
        int denisTodayYear = denisToday*12;
        int kristinaTodayYear = kristinaToday*12;
        double mashaFutureYear = mashaFuture*12;
        double denisFutureYear = denisFuture*12;
        double kristinaFutureYear = kristinaFuture*12;
        double differenceMasha = mashaFutureYear-mashaTodayYear;
        double differenceDenis = denisFutureYear-denisTodayYear;
        double differenceKristina = kristinaFutureYear-kristinaTodayYear;
        System.out.println("Маша теперь получает " + mashaFuture + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + denisFuture + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + kristinaFuture + " рублей. Годовой доход вырос на " + differenceKristina + " рублей");

    }
}