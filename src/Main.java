public class Main {
    public static void main(String[] args) {
        // Задача 1
        int varInt = 1000000000;
        byte varByte = 100;
        short varShort= 10000;
        long varLong = 1_000_000_000L;
        float varFloat = 3.65f;
        float varFloat1 = (float) 0.555555555555;
        double varDouble = 3.1;
        System.out.println("Значение переменной varInt с типом int равно " + varInt);
        System.out.println("Значение переменной varByte с типом byte равно " + varByte);
        System.out.println("Значение переменной varShort с типом short равно " + varShort);
        System.out.println("Значение переменной varLong с типом long равно " + varLong);
        System.out.println("Значение переменной varFloat с типом float равно " + varFloat);
        System.out.println("Значение переменной varFloat1 с типом float равно " + varFloat1);
        System.out.println("Значение переменной varDouble с типом double равно " + varDouble);
        // Задача 2
        float varFloat2 = 27.12f;
        long varLong2 = 987_678_965_549L;
        double varDouble2 = 2.786;
        boolean varBoolean = false;
        char varChar2 = 569;
        short varShort2 = -159;
        int varInt2 = 27897;
        byte varByte2 = 67;
        // Задача 3
        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        int sumPupils = (lP + aS + eA);
        short paper = 480;
        int paperStudent = paper / sumPupils;
        System.out.println("На каждого ученика рассчитано " + paperStudent + " листов бумаги");
        // Задача 4
        int bottels = 16;
        int minutes = 2;
        int machinePerformance = bottels / minutes;
        int perfomance20Min = machinePerformance * 20;
        int perfomanceDay = perfomance20Min * 3 * 24;
        int perfomance3Day = perfomanceDay * 3;
        int perfomanceMonth = perfomance3Day * 10;
        System.out.println("За 20 минут работы машина произвела " + perfomance20Min + " бутылок");
        System.out.println("За сутки работы машина произвела " + perfomanceDay + " бутылок");
        System.out.println("За 3 дня работы машина произвела " + perfomance3Day + " бутылок");
        System.out.println("За 1 месяц работы машина произвела " + perfomanceMonth + " бутылок");
        // Задача 5
        byte jar = 120;
        byte oneClassJarWhite = 2;
        byte oneClassJarBrown = 4;
        int classAmount = jar / (oneClassJarWhite + oneClassJarBrown);
        int JarWhite = oneClassJarWhite * classAmount;
        int JarBrown = oneClassJarBrown * classAmount;
        System.out.println("В школе, где  " + classAmount + " классов, нужно " + JarWhite + " банок белой краски и " + JarBrown + " банок коричневой краски");
        // Задача 6
        byte bananaWeight = 80;
        byte milkWeight = 105;
        float MlPerGr = (float) milkWeight / 100;
        byte iceCreamWeigth = 100;
        byte eggWeight = 70;
        int bananas = 5;
        int milkMl = 200;
        int iceCream = 2;
        int eggs = 4;
        float breakfastWeightGr = bananaWeight * bananas + milkMl * MlPerGr + iceCreamWeigth * iceCream + eggWeight * eggs;
        System.out.println("Вес спорт-завтрака " + breakfastWeightGr + " гр");
        int grPerKg = 1000;
        float breakfastWeightKg = breakfastWeightGr / (float) grPerKg;
        System.out.println("Вес спорт-завтрака " + breakfastWeightKg + " кг");
        // Задача 7
        int needRestKg = 7;
        int needRestGr = needRestKg * grPerKg;
        int rest250PerDay = 250;
        int rest500PerDay = 500;
        int needDaysRest250PerDay = needRestGr / rest250PerDay;
        System.out.println("Если в день терять по 250 гр, уйдет на похудение " + needDaysRest250PerDay + " дней");
        int needDaysRest500PerDay = needRestGr / rest500PerDay;
        System.out.println("Если в день терять по 500 гр, уйдет на похудение " + needDaysRest500PerDay + " дней");
        int mediumRestDays = (needDaysRest250PerDay + needDaysRest500PerDay) / 2;
        int mediumRestDays1 = (needDaysRest250PerDay + needDaysRest500PerDay) % 2; // не понял как применить операцию остаток от деления в данном примере, если здесь он будет 0. сделал операцию остаток от деления чтобы выполнить задачу
        System.out.println("В среднем уйдет на похудение " + mediumRestDays + " дней");
        // Задача 8
        int mariaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        float salaryIncrease = (float) 0.1;
        System.out.println("Маша теперь получает " + (mariaSalary * (1 + salaryIncrease)) + " рублей. Годовой доход вырос на " + (mariaSalary * salaryIncrease * 12) + " рублей");
        System.out.println("Денис теперь получает " + (denisSalary * (1 + salaryIncrease)) + " рублей. Годовой доход вырос на " + (denisSalary * salaryIncrease * 12) + " рублей");
        System.out.println("Кристина теперь получает " + (kristinaSalary * (1 + salaryIncrease)) + " рублей. Годовой доход вырос на " + (kristinaSalary * salaryIncrease * 12) + " рублей");
    }
}