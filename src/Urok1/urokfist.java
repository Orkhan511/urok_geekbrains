package Urok1;

public class urokfist {
    public static void main(String[] args){
/*
1.Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой,
где a, b, c, d – целочисленные входные параметры этого метода;
2.Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах
от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
3.Написать метод, которому в качестве параметра передается целое число, метод должен проверить
положительное ли число передали, или отрицательное. Замечание: ноль считаем положительным числом.
Результат работы метода вывести в консоль
4.Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вернуть
приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.
5.*Написать метод, который определяет является ли год високосным. Каждый 4-й год является високосным, кроме к
аждого 100-го, при этом каждый 400-й – високосный. Для проверки работы вывести результаты работы метода в консоль
        */
        System.out.println(methodA(2,3,2,3));

        System.out.println(methodB(10, 10));

        methodC(0);
        methodC(-1);

        System.out.println(methodE("Geekbrains"));

        System.out.println(methodF(2018));
        System.out.println(methodF(2016));
        System.out.println(methodF(2000));
        System.out.println(methodF(1900));
    }

    public static float methodA(int a, int b, int c, int d){
        float result = (a * (b + ((float)c / d)));
        return result;
    }

    public static boolean methodB(int a, int b){
        boolean result = true;
        int c = a+b;
        if(c > 10 && c <= 20){
            return true;
        }
        else{
            return false;
        }
    }

    public static void methodC(int a){
        if(a >= 0){
            System.out.println(a + " is positive");
        }
        else{
            System.out.println( a + " is negative");
        }
    }

    public static String methodE(String name){
        String helloMessage = "Привет "+ name + "!";
        return helloMessage;
    }

    public static boolean methodF(int year){
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }


}
