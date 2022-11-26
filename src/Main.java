import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Циклы 2");
        System.out.println("Домашняя работа 1. Задание 1.");
        //2. Задание
        //Домашнее задание - 1
        //Задание 1
        //Продолжим работать с накоплениями. Продолжите работать с кодом, который вы написали в предыдущем уроке.
        //С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
        // что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
        //Результат программы должен быть выведен в консоль в формате "Месяц … , сумма накоплений равна … рублей"
        // с тем количеством месяцев, необходимым для накопления данной суммы.
        int salaryMonth=15000;
        int savings=0;
        int i=0;
        while (savings<=2_459_000){
            i++;
            savings=savings+salaryMonth;
            System.out.println("Месяц "+i+", сумма накоплений равна "+savings+" рублей");
        }
        System.out.println("");

        System.out.println("Задание 2.");
        //Задание 2
        //Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
        //На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
        //Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
        //Не забудьте выполнить переход на новую строку между двумя циклами.
        //В результате программы вывод должен получиться следующий:
        //1 2 3 4 5 6 7 8 9 10
        //10 9 8 7 6 5 4 3 2 1
        int y=0;
        while (y<10){
            y++;
            System.out.print(y+" ");;
        }
        System.out.println(" ");
        for (;y>=1;y--){
            System.out.print(y+" ");
        }
        System.out.println("");

        System.out.println("Задание 3.");
        //Задание 3
        //В стране Y население равно 12 миллионам человек.
        //За год рождаемость составляет 17 человек на 1000 человек, смертность - 8 человек.
        //Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание,
        //что показатели рождаемости и смертности постоянны.
        //В консоль выведите результат операции на каждый год в формате "Год …, численность населения составляет … "
        int numberPopulation=12_000_000;
        int birthRate=numberPopulation/1000*17;
        int mortality=numberPopulation/1000*8;
        int year=2022; //сегодня год
        System.out.println("Год "+year+" численность населения составляет "+numberPopulation);
        for (int z=1 ;z < 10;z++){
           year=year+1;
           numberPopulation=numberPopulation+birthRate-mortality;
        System.out.println("Год "+year+" численность населения составляет "+numberPopulation);
        }
    }
}