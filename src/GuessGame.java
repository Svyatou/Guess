import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    Scanner s = new Scanner(System.in);
    String Player = s.next();
    int n = s.nextInt();
    public final int MAX = n;
    void start () {
        int i = 0;
        Random random = new Random();
        Player[] name= new Player[n];
        for (i = 0; i < n; i++) {
            Player n = new Player();
            name[i] = n;
        }
//        int name = s.nextInt();



        System.out.println("Я загадываю число от 0 до " + MAX);
        int number = random.nextInt(MAX);

        System.out.println();
//        while (true) {
//            System.out.println("Число которое нужно угадать " + number);
//            n.guess(MAX);
//            n.guess(MAX);
//            n.guess(MAX);
//
//            System.out.println("Первый игрок думает, что это " + p1.number);
//            System.out.println("Второй игрок думает, что это " + p2.number);
//            System.out.println("Третий игрок думает, что это " + p3.number);
//
//            if (p1.number == number || p2.number == number || p3.number == number) {
//                System.out.println("У нас есть победитель!");
//
//                if (p1.number == number) {
//                    System.out.println("Первый игрок угадал!");
//                }
//                if (p2.number == number) {
//                    System.out.println("Второй игрок угадал!");
//                }
//                if (p3.number == number) {
//                    System.out.println("Третий игрок угадал!");
//                }
//                break;
//            }

            System.out.println("Никто не угадал.");
            System.out.println("Игроки пробуют еще раз.");
        }

//        System.out.println("Конец игры.");
//        System.exit(-1);
    }
//}
