public class Main {
    public static void main(String[] args) {

        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }

        for (int b = 10; b >= 1; b--) {
            System.out.println(b);
        }

        for (int c = 0; c <= 17; c = c + 2) {
            System.out.println(c);
        }

        for (int d = 10; d >= -10; d--) {
            System.out.println(d);
        }

        for (int e = 1904; e <= 2096; e = e + 4) {
            System.out.println(e + " год является високосным");
        }

        for (int f = 7; f <= 98; f = f + 7) {
            System.out.println(f);
        }

        for (int g = 1; g <= 512; g = g * 2) {
            System.out.println(g);
        }

        int h = 29000;
        int i = 0;
        for (int j = 1; j <= 12; j++) {
            i = i + i / 100;
            i = i + h;
            System.out.println("Месяц " + j + ", сумма накоплений равна " + i + " рублей");
        }

    }
}