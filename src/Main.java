import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        {
            System.out.println("Задача №1");
            // целочисленный массив
            int[] arrFirst = new int[3];
            arrFirst[0] = 1;
            arrFirst[1] = 2;
            arrFirst[2] = 3;
            for (int i = 0; i < arrFirst.length; i++) {
                System.out.println(arrFirst[i]);
            }
            // массив, хранящий числа с плавающей точкой
            float[] arrSecond = {1.57f, 7.654f, 9.986f};
            for (int i = 0; i < arrSecond.length; i++) {
                System.out.println(arrSecond[i]);
            }
            // произвольный массив
            int[] arrThird = new int[34];
            arrThird[31] = 1;
            arrThird[32] = 3;
            arrThird[33] = 0;
            for (int i = 0; i < arrThird.length; i++) {
                System.out.println(arrThird[i]);
            }
        }
        {
            System.out.println(" ");
            System.out.println("Задача №2");
            // целочисленный массив
            int[] arrFirst = new int[3];
            arrFirst[0] = 1;
            arrFirst[1] = 2;
            arrFirst[2] = 3;
            for (int i = 0; i < arrFirst.length; i++) {
                System.out.print(arrFirst[i] + ", ");
            }
                System.out.print(arrFirst[arrFirst.length - 1]);

            // массив, хранящий числа с плавающей точкой
            System.out.println(" ");
            float[] arrSecond = {1.57f, 7.654f, 9.986f};
            for (int i = 0; i < arrSecond.length; i++) {
                System.out.print(arrSecond[i] + ", ");
            }
                System.out.println(arrSecond[arrSecond.length - 1]);

            // произвольный массив
            int[] arrThird = new int[34];
            arrThird[31] = 1;
            arrThird[32] = 3;
            arrThird[33] = 0;
            for (int i = 0; i < arrThird.length; i++) {
                System.out.print(arrThird[i] + ", ");
            }
                System.out.println(arrThird[arrThird.length - 1]);
        }
        {
            System.out.println(" ");
            System.out.println("Задача №3");
            // целочисленный массив
            int[] arrFirst = new int[3];
            arrFirst[0] = 1;
            arrFirst[1] = 2;
            arrFirst[2] = 3;
            for (int i = arrFirst.length - 1; i > 0; i--) {
                System.out.print(arrFirst[i] + ", ");
            }
            System.out.print(arrFirst[0]);

            // массив, хранящий числа с плавающей точкой
            System.out.println(" ");
            float[] arrSecond = {1.57f, 7.654f, 9.986f};
            for (int i = arrSecond.length - 1; i > 0; i--) {
                System.out.print(arrSecond[i] + ", ");
            }
            System.out.println(arrSecond[0]);

            // произвольный массив
            int[] arrThird = new int[34];
            arrThird[31] = 1;
            arrThird[32] = 3;
            arrThird[33] = 0;
            for (int i = arrThird.length - 1; i > 0; i--) {
                System.out.print(arrThird[i] + ", ");
            }
            System.out.println(arrThird[0]);
        }
        {
            System.out.println(" ");
            System.out.println("Задача №4");
            // целочисленный массив
            int[] arrFirst = new int[3];
            arrFirst[0] = 1;
            arrFirst[1] = 2;
            arrFirst[2] = 3;

            for (int i = 0; i < arrFirst.length; i++) {
                if (arrFirst[i] % 2 != 0) {
                    arrFirst[i] = arrFirst[i] + 1;
                }
                System.out.print(arrFirst[i] + "; ");
            }
            System.out.println(" ");

            // можно вывести через метод Arrays.toString
            System.out.println(Arrays.toString(arrFirst));
        }

    }
}