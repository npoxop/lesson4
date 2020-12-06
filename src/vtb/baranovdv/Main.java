package vtb.baranovdv;

public class Main {

    public static void main(String[] args) {

        //Написать программу для поиска минимального из двух чисел.
        System.out.println("Написать программу для поиска минимального из двух чисел:");
        int a = 100, b= 65;
        if(a<b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        System.out.println(" ");

        //Написать программу для вывода на экран таблицы умножения.
        System.out.println("Написать программу для вывода на экран таблицы умножения:");

        int x=1, y=1;
        while (y<=10){
            for(x=1; x<=10; x++)
                System.out.print(x*y + " ");
                System.out.println(" ");
            y++;
        }

        System.out.println(" ");

        //Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел.
        System.out.println("Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел:");

        for (int i = 1; i <= 10; i++)
            System.out.print(i + " ");

        System.out.println(" ");
    }
}