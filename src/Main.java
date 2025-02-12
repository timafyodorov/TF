
public class Main {
    public static void main(String[] args) {

        int dog = 80000;
        byte cat = 36;
        short paper = 3789;
        long sH = 8484;
        float main = 3.75F;
        double car = 1.708;


        System.out.println("dog: " + dog + " тип - int");
        System.out.println("cat: " + cat + " тип - byte");
        System.out.println("paper: " + paper + " тип - short");
        System.out.println("sH: " + sH + " тип - long");
        System.out.println("main: " + main + " тип - float");
        System.out.println("car: " + car + " тип - double");

        float flower = 27.12F;
        long universe = 987678965549L;
        double scarf = 2.786;
        int man = 569;
        short couple = -159;
        long f = 27897;
        byte game = 67;


        int lyudmilaStudents = 23;
        int annaStudents = 27;
        int ekaterinaStudents = 30;
        int totalPaper = 480;
        int totalStudents = lyudmilaStudents + annaStudents + ekaterinaStudents;
        double paperPerStudent = (double) totalPaper / totalStudents;
        System.out.printf("На каждого ученика рассчитано %.2f листов бумаги. \n", paperPerStudent);

        int bottlesPer2Minutes = 16;
        int bottlesPerMinute = bottlesPer2Minutes / 2;
        int minutesIn1Day = 24 * 60;
        int minutesIn3Days = minutesIn1Day * 3;
        int minutesIn1Month = 30 * minutesIn1Day;
        int bottlesIn20Minutes = bottlesPerMinute * 20;
        int bottlesIn1Day = bottlesPerMinute * minutesIn1Day;
        int bottlesIn3Days = bottlesPerMinute * minutesIn3Days;
        int bottlesIn1Month = bottlesPerMinute * minutesIn1Month;


        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок.");
        System.out.println("За сутки машина произвела " + bottlesIn1Day + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок.");
        System.out.println("За 1 месяц машина произвела " + bottlesIn1Month + " штук бутылок.");


        int bananas = 5 * 80;
        int milk = 2 *105 / 100;
        int iceCream = 2*100;
        int eggs = 4 * 70;
        int totalWeightGrams = bananas + milk + iceCream + eggs;
        double totalWeightKilograms = totalWeightGrams / 1000.0;
        System.out.println("Вес спортзавтрака в граммах: " + totalWeightGrams + " г.");
        System.out.println("Вес спортзавтрака в килограммах: " + totalWeightKilograms + " кг.");


        double weightToLoseKg = 7;
        double weightToLoseGrams = weightToLoseKg * 1000;
        double minLossPerDay = 250;
        double maxLossPerDay = 500;
        double daysMin = weightToLoseGrams / minLossPerDay;
        double daysMax = weightToLoseGrams / maxLossPerDay;
        double averageDays = (daysMin + daysMax) / 2;
        System.out.println("Если спортсмен будет терять по 250 грамм в день, то похудение займет: " + daysMin + " дней.");
        System.out.println("Если спортсмен будет терять по 500 грамм в день, то похудение займет: " + daysMax + " дней.");
        System.out.println("Среднее количество дней для похудения: " + averageDays + " дней.");


        double mSalary = 67760;
        double dSalary = 83690;
        double kSalary = 76230;  

        double raise = 0.1;

        double mNewSalary = mSalary * (1 + raise);
        double dNewSalary = dSalary * (1 + raise);
        double kNewSalary = kSalary * (1 + raise);

        double mYearlyBefore = mSalary * 12;
        double dYearlyBefore = dSalary * 12;
        double kYearlyBefore = kSalary * 12;

        double mYearlyAfter = mNewSalary * 12;
        double dYearlyAfter = dNewSalary * 12;
        double kYearlyAfter = kNewSalary * 12;
        double mIncomeDiff = mYearlyAfter - mYearlyBefore;
        double dIncomeDiff = dYearlyAfter - dYearlyBefore;
        double kIncomeDiff = kYearlyAfter - kYearlyBefore;


        System.out.println("Маша теперь получает " + mNewSalary + " рублей. Годовой доход вырос на " + mIncomeDiff + " рублей.");
        System.out.println("Денис теперь получает " + dNewSalary + " рублей. Годовой доход вырос на " + dIncomeDiff + " рублей.");
        System.out.println("Кристина теперь получает " + kNewSalary + " рублей. Годовой доход вырос на " + kIncomeDiff + " рублей.");
    }}


