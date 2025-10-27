import java.util.Scanner;

public class Methodes {
    public static void numberSquared(int number) {
        return number * number;
        
        System.out.println("Квадрат числа " +number+" дорівнює "+ result);
    }
    public static double volumeOfCylinder(double radius, double height) {
        return radius *radius * height * Math.PI;

    }
    public static int sumInArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {

             sum += array[i];
        }
        return sum;

    }
    public static void reversedText(String textToReverse) {
        String reversed = new StringBuilder(textToReverse).reverse().toString();
        System.out.println("Рядок в зворотньому порядку: " + reversed);

    }
    public static int numberToPower(int a, int b) {
        int aToThePowerOfb=(int) Math.pow(a,b);
        return aToThePowerOfb;


    }
    public static void printNtimes(int n,String textToPrint) {
        for (int i = 1; i <= n; i++) {
            System.out.println(textToPrint);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1) Введіть ціле число: ");
        int userInput = scanner.nextInt();
        System.out.println("Квадрат числа " + userInput +" дорівнює "+ numberSquared(userInput));

        System.out.print("2) Введіть радіус циліндра:");
        double radiusInput = scanner.nextDouble();
        System.out.print("Введіть висоту циліндра:");
        double heightInput = scanner.nextDouble();
        System.out.println("Об'єм циліндра з радіусом "+ radiusInput
                + " і висотою "+heightInput+" дорівнює "+
                volumeOfCylinder(radiusInput, heightInput));

        System.out.print("3) Введіть кількість чисел в масиві :");
        int sizeOfArray = scanner.nextInt();
        int [] arrayInput = new int [sizeOfArray];
        System.out.print("Введіть  чисела масиву :");
        for (int i = 0; i < sizeOfArray; i++) {
            arrayInput[i] = scanner.nextInt();
        }
        System.out.println("Сума всіх елементів масиву дорівнює "
                +sumInArray(arrayInput));

        System.out.print("4) Введіть рядок: ");
        scanner.nextLine();
        String textToReverseInput = scanner.nextLine();
        reversedText(textToReverseInput);

        System.out.print("5) Введіть підстепеневий вираз: ");
        int aInput = scanner.nextInt();
        System.out.print("Введіть показник степеню: ");
        int bInput = scanner.nextInt();
        System.out.println("Результат "+aInput+"^"+bInput
                + " дорівнює " + numberToPower(aInput, bInput));

        System.out.println("6) Введіть ціле число n: ");
        int nInput = scanner.nextInt();
        System.out.println("Введіть текстовий рядок:");
        scanner.nextLine();
        String textInput = scanner.nextLine();
        printNtimes(nInput, textInput);

    }
}
