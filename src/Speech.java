import java.util.Scanner;

/**
 * Created by User on 29.11.2015.
 */
public class Speech {
    public static void main(String[] args) throws java.io.IOException{
        String a,b,c,d;
        String yes,no;
        yes = "да";
        no = "нет";

        //System.out.println("Привет! Давай поговорим!");
        System.out.println("Как тебя зовут?");
        Scanner in = new Scanner(System.in);
        a = in.nextLine();
        System.out.printf("Очень приятно %s!\n", a);
        System.out.println("Как твои дела?");
        b = in.next();
        System.out.println("Можно вопрос? - отвечать только 'да' или 'нет'");
        c = in.next();
        //System.out.println(c.equals(yes));
        if (yes.equals(c))
            System.out.println("Ответ был ДА...значит тебя я заинтересовал!");
        else if (no.equals(c))
            System.out.println("Ответ был НЕТ....пойду жарить омлет(((");
        else System.out.println("Нужно было ответить 'да' или 'нет'...поехали дальше...");
        System.out.printf("%s...можно с тобой сходить на свидание?))\n", a);
        d = in.next();
        if (yes.equals(d))
            System.out.println("Ответ был ДА...я почти влюбился!!");
        else if (no.equals(d))
            System.out.println("Ответ был НЕТ....мда, скучно с тобой!");
        else System.out.println("Нужно было ответить 'да' или 'нет'...грамматику подучи!");

    }
}
