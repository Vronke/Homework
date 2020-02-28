package GeekBrains;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //question1();
        question2();
    }

    public static void question1(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int answer;
        while (true){
            boolean isWin = false;
            int hidden = random.nextInt(10);
            System.out.println("Угадай число которое я загадал от 0 до 9");
            System.out.print("Введи число от 0 до 9: ");
            for (int i = 0; i < 3; i++) {
                answer = sc.nextInt();

                if (hidden == answer){
                    System.out.println("Ты угадал!");
                    isWin = true;
                    break;
                }
                else if (hidden > answer)
                    System.out.println("Моё загаданное число больше!");
                else
                    System.out.println("Моё загаданное число меньше!");
            }
            if (isWin)
                System.out.println("Поздравляю! Ты выиграл");
            else
                System.out.println("Повезёт в другой раз!");

            System.out.println("Желаешь ещё поиграть? (1 - да / 0 - нет)");

            while(true){
                int nextGame = sc.nextInt();
                if (nextGame == 0){
                    return;
                }
                else if (nextGame == 1){
                    break;
                }
            }
        }
    }

    public static void question2(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        char[] table = "###############".toCharArray();
        String[] words = { "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato" };
        String hidden = words[random.nextInt(words.length)];
        String answer;
        System.out.println("Я загадал слово! Попробуй отгадать его!");
        while (true){
            System.out.print("Введи слово = ");
            answer = sc.nextLine();
            if(answer.equals(hidden)){
                System.out.println("Слово угадано!");
                break;
            }
            table = check(hidden, answer, table);
            System.out.println(table);
        }
    }

    public static char[] check(String hidden, String answer, char[] table){
        int min = answer.length();
        if(hidden.length() < min)
            min = hidden.length();
        for (int i = 0; i < min; i++) {
            if(hidden.charAt(i) == answer.charAt(i))
                table[i] = hidden.charAt(i);
        }
        return table;
    }
}