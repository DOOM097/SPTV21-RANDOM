
package sptv21random;

import java.util.Random;
import java.util.Scanner;

public class SPTV21random {

    public static void main(String[] args) {
        System.out.println("Привет!");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int cash = 3;
        do{
            System.out.println("---- New run ----");
            System.out.println("Кээшш = "+cash);
            int myNumber = random.nextInt(11);
            int n = 0;
            do{
                System.out.print("Загадано число от 0 до 10, угадай: ");
                int yourNumber = scanner.nextInt();
                if(myNumber == yourNumber){
                    System.out.println("Ура! Ты угадал! держи 1 евро");
                    cash++;
                    break;
                }else{
                    System.out.println("НЕТ, попробуй еще раз.");
                }
                n++;
                if(n > 2){
                    System.out.println("Ты проиграл, давай 1 евро :)");
                    cash--;
                    break;
                }
            }while(true);
            System.out.println("Чтобы выйти нажми 0, продолжить - нажми любую клавишу");
            int repeat = scanner.nextInt();
            if(repeat == 0 || cash == 0){
                System.out.printf("В твоем кармане %d EUR, gg noob %n",cash);
                break;
            }
        }while(true);
        
    }
    
}
