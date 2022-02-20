public class LessonTwo {
    public static void main(String[] args) {

        System.out.println("Пример №1");
        int a = -1;
        if (a >= 0 && a < 10) {
            System.out.println("Однозначное положительное");
        } else if (a >= 10 && a <= 99) {
            System.out.println("Двухзначное положительное");
        } else if (a >= 100) {
            System.out.println("Трёхзначное положительное");
        } else if (a < 0 && a > -10) {
            System.out.println("Однозначное отрицательное");
        } else if (a <= -10 && a >= -99) {
            System.out.println("Двухзначное отрицательное");
        } else if (a <= -100) {
            System.out.println("Трёхзначное отрицательное");
        }
        System.out.println("Программа закончена");

        System.out.println("Пример №2");
        int z = 2;
        int x = 4;
        int c = 3;
        if (c > (z + x)) {
            System.out.println("Треугольник не существует");
        } else if (x > (z + c)) {
            System.out.println("Треугольник не существует");
        } else if (z > (c + x)) {
            System.out.println("Треугольник не существует");
        } else {
            System.out.println("Треугольник существует");
        }
        System.out.println("Программа закончена");

        System.out.println("Пример №3 Версия 1");
        int v = 2;
        if (v == 0) {
            System.out.println(v = 10 + 1);
        } else {
            System.out.println(v > 0 ? (v + 1) : (v - 2));
        }

        System.out.println("Пример №3 Версия 2");
        int s = 2;
        switch (s) {
            case 0:
                System.out.println(s = 10 + 1);
                break;
            default:
                System.out.println(s > 0 ? (s + 1) : (s - 2));
                break;
        }

        System.out.println("Пример №4 Версия 1");
        int b = -2;
        int n = -1;
        int m = 1;
        if (b >= 0 && n >= 0 && m >= 0) {
            System.out.println("Три положительных числа");
        } else if (b >= 0 && n >= 0) {
            System.out.println("Два положительных числа");
        } else if (n >= 0 && m >= 0) {
            System.out.println("Два положительных числа");
        }  else if (b >= 0 && m >= 0) {
            System.out.println("Два положительных числа");
        } else if (b >= 0) {
            System.out.println("Одно положительное число");
        } else if (n >= 0) {
            System.out.println("Одно положительное число");
        } else if (m >= 0) {
            System.out.println("Одно положительное число");
        } else {
            System.out.println("Нет положительных чисел");
        }

        System.out.println("Пример №4 Версия 2");
// Решение этой задачи честно подсмотрел на форуме, сам не додумался //
        int f = 1;
        int g = -1;
        int h = 0;

        int d = (f > 0 ? 1 : 0) + (g > 0 ? 1 : 0) + (h > 0 ? 1 : 0);
        System.out.println("Количество положительных чисел - " +d);

        System.out.println("Пример №5");
        int j = 1;
        int k = 0;
        int l = -1;
        int q = (j > 0 ? 1 : 0) + (k > 0 ? 1 : 0) + (l > 0 ? 1 : 0);
        int w = (j < 0 ? 1 : 0) + (k < 0 ? 1 : 0) + (l < 0 ? 1 : 0);
        System.out.println("Количество положительных чисел - " +q);
        System.out.println("Количество трицательных чисел - " +w);

        System.out.println("Пример №6");
        int e = 8;
        int r = 8;
        if (e == r) {
            System.out.println("Числа равны");
        } else {
            int t = (e > r ? e : 0) + (r > e ? r : 0);
            System.out.println(+t);
        }

        System.out.println("Пример №7");
        int y = 1; //Количество програмистов//
        String o = "Программист";
        String p = "а";
        String u = "ов";
        if (y == 1){
            System.out.println(y + " Программист");
        } else if (y >= 2 && y <= 4){
            System.out.println(y + " " + o + p);
        } else if (y > 4){
            System.out.println(y + " " + o + u);
        } else if (y <= 0){
            System.out.println("Программисты отсутствуют");
        }
    }
}
