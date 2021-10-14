package trenirovka;

public class trenirovka2 {
    public static void main(String[] args) {
        // System.out.println(otDo(10,10 ));
        // pozNeg(-1);
        // System.out.println(polNeg(-212));
        // string1("wars", 100);
       // System.out.println(CheckLeapYear(2024));
        System.out.println(CheckLeapYear1( 100));
    }

    //1. Написать метод, принимающий на вход два целых числа и проверяющий,
    //что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    // в противном случае – false.
    public static boolean otDo(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);

    }
    // 2. Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.

    public static void pozNeg(int a) {
        if (a >= 0) {
            System.out.println("pozitive");
        } else {
            System.out.println("negative");
        }
        //3.Задание.
        // Написать метод, которому в качестве параметра передается целое число.
        //Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    }

    public static boolean polNeg(int a) {
        return a < 0;
    }

    //4. Написать метод, которому в качестве аргументов передается строка и число,
    // метод должен отпечатать в консоль указанную строку, указанное количество раз;

    public static void string1(String wars, int num) {
        for (int i = 1; i < num; i++) {
            System.out.println(i + wars);
        }
    }
    // 5.Задание
    //   Написать метод, который определяет, является ли год високосным,
    //  и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным,
    //  кроме каждого 100-го, при этом каждый 400-й – високосный.


    public static boolean CheckLeapYear(int a) {
        if (a % 4 == 0) {
            if ((a % 100 != 0) || (a % 400 == 0)) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }

        public static boolean CheckLeapYear1(int year) {
            if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }

    }






