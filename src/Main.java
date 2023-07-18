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
        System.out.println("Задача 1");
        byte orange = 36;
        short apple = 237;
        int car = 367890;
        long maus = 2000009999;
        System.out.println("апельсинов - " + orange + "шт, яблок - " + apple + "шт, машин - " + car + "шт, мышей - " + maus + "шт ");
    }

    public static void task2() {
        System.out.println("Задача 2");
        double a = 27.12;
        long b = 987678965549l;
        float c = 2.786f;
        short d = 569;
        int e = -159;
        double f = 27897;
        byte z = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(z);
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte a = 23;
        byte b = 27;
        byte c = 30;
        int x = 480 / (a + b + c);
        System.out.println("На каждого ученика рассчитано " + x + " листов бумаги.");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte a = 16;
        int x = a / 2;
        int b = x * 20;
        System.out.println("За 20 мин машина произвела " + b + "штук бутылок");
        int c = x * 60 * 24;
        System.out.println("За сутки машина произвела " + c + "штук бутылок");
        int d = c * 3;
        System.out.println("За 3 дня машина произвела " + d + "штук бутылок");
        int e = d * 10;
        System.out.println("За месяц машина произвела " + e + "штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        byte a = 120;
        int x = 120 / (2 + 4);
        int white = x * 2;
        int brown = x * 4;
        System.out.println("В школе, где " + x + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        byte oneBanana = 80;
        byte oneMilk = 105;
        byte oneIce = 100;
        byte oneEg = 70;
        float coct = (oneBanana * 5) + (oneMilk * 2) + (oneIce * 2) + (oneEg * 4);
        float coctKG = coct / 1000;
        System.out.println("вес завтрака в граммах - " + coct + ", вес завтрака в кило - " + coctKG);
    }

    public static void task7() {
        System.out.println("Задача 7");
        short ves = 7000;
        short a = 250;
        short b = 500;
        int z = ves / a;
        int x = ves / b;
        System.out.println("если спортсмен будет терять каждый день по 250 грамм, то похудеет через " + z + "дней, а если каждый день будет худеть на 500 грамм, то через " + x + "дней");
        float cr = (x+z)/2;
        System.out.println("в среднем, с этим рационом спртсмен похудеет через " + cr + " дней");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int ma = 67760;
        double maUv = ma + (0.1 * ma);
        double maR = (maUv*12)-(ma*12);
        int de = 83690;
        double deUv = de + (0.1 * de);
        double deR = (deUv*12)-(de*12);
        int kr = 76230;
        double krUv = kr + (kr * 0.1);
        double krR = (krUv*12)-(kr*12);
        System.out.println("Маша теперь получает " + maUv  + " рублей. Годовой доход вырос на " + maR + " рублей");
        System.out.println("Денис теперь получает " + deUv  + " рублей. Годовой доход вырос на " + deR + " рублей");
        System.out.println("Кристина теперь получает " + krUv  + " рублей. Годовой доход вырос на " + krR + " рублей");
    }

}