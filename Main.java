public class Main {
//    1)public static  int add(int a, int b);
//    Условие: Вернуть сумму двух чисел a и b.
public static  int add(int a, int b){
    return a+b;
}
  //2)public static  void printMessage(String message);
//    Условие: Вывести строку message в консоль.
public static  void printMessage(String message){
    System.out.println(message);
}
  //3)public static int subtract(int a, int b);
//    Условие: Вернуть разность чисел a и b.
        public static int subtract(int c, int d){
            return c-d;
        }

//            4)public static  void greet();
//    Условие: Напечатать в консоли стандартное приветствие, например, "Hello, world!".
    public static  void greet(){
    String test="Hello, world";
    System.out.println(test);
    }
//            5)public static  int square(int number);
//    Условие: Вернуть квадрат числа number.
public static  int square(int number){
    return number*number;
}
//            6)public static int kub(int number);
//    Условие: Вернуть kub числа number.
public static int kub(int number){
    return number*number*number;
}
//            7)public static  boolean isEven(int number);
//    Условие: Вернуть true, если число number чётное, иначе false.
public static  boolean isEven(int number) {
    return number%2==0;
}
//            8)public static boolean isNeqativ(int number);
//    Условие: Вернуть true, если число number отрицательное иначе false.
public static boolean isNeqativ(int number){
    return number<0;
}
//            9)public static void printNumber(int number);
//    Условие: Вывести число number в консоль.
public static void printNumber(int number){
    System.out.println(number);
}
//10)public static boolean areEqual(int a, int b);
//    Условие: Вернуть true, если числа a и b равны, иначе false.
public static boolean areEqual(int a, int b){
    return a==b;
}
//            11)public static int multiply(int a, int b);
//    Условие: Вернуть произведение чисел a и b.
public static int multiply(int a, int b){
    return a*b;
}
    public static void main(String[] args) {
        System.out.println(add(10,11 ));
        printMessage("");
        System.out.println(subtract(22,33 ));
        greet();
        System.out.println(square(8));
        System.out.println(kub(2));
        System.out.println(isEven(7));
        System.out.println(isNeqativ(-5));
        printNumber(6);
        System.out.println(areEqual(4,4));
        System.out.println(multiply(4,7));

    }
}