import java.util.Date;

public class Main {
    public static void main(String[] args ) {
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
        int salaryMonth = 15000;
        int savings = 0;
        int i = 0;
        while (savings <= 2_459_000) {
            i++;
            savings = savings + salaryMonth;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savings + " рублей");
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
        int y = 0;
        while (y < 10) {
            y++;
            System.out.print(y + " ");
            ;
        }
        System.out.println(" ");
        for (; y >= 1; y--) {
            System.out.print(y + " ");
        }
        System.out.println("");

        System.out.println("Задание 3.");
        //Задание 3
        //В стране Y население равно 12 миллионам человек.
        //За год рождаемость составляет 17 человек на 1000 человек, смертность - 8 человек.
        //Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание,
        //что показатели рождаемости и смертности постоянны.
        //В консоль выведите результат операции на каждый год в формате "Год …, численность населения составляет … "
        int numberPopulation = 12_000_000;
        int birthRate = numberPopulation / 1000 * 17;
        int mortality = numberPopulation / 1000 * 8;
        int year = 2022; //сегодня год
        //System.out.println("Год "+year+" численность населения составляет "+numberPopulation);
        for (int z = 1; z <= 10; z++) {
            year++;
            numberPopulation = numberPopulation + birthRate - mortality;
            System.out.println("Год " + year + " численность населения составляет " + numberPopulation);
        }
        System.out.println("");

        System.out.println("Домашняя работа 2. Задание 1.");
        //4. Задание
        //Домашнее задание -2
        //Условие
        //Напишите программу, которая выводит в консоль сумму накоплений.
        //Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется ещё 7%.
        //Первоначальная сумма вклада Василия составляет 15 тысяч рублей.
        //Задание 1
        //Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить,
        // чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка от накоплений не меняется,
        // и всегда равен 7%. Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.
        int salaryMonth2 = 15000;
        int savings2 = 0;
        for (int k = 1; savings2 <= 12_000_000; k++) {
            savings2 = savings2 + salaryMonth2 + (savings2 + salaryMonth2) * 7 / 100;
            System.out.println("Месяц " + k + ", сумма накоплений равна " + savings2 + " рублей");
        }
        System.out.println("");

        System.out.println("Задание 2.");
        //Задание 2
        //Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд,
        // а только каждый шестой. Должны быть видны накопления за 6, 12, 18, 24 и далее месяцы.
        int salaryMonth3 = 15000;
        int savings3 = 0;
        for (int j = 1; savings3 <= 12_000_000; j++) {
            savings3 = savings3 + salaryMonth3 + (savings3 + salaryMonth3) * 7 / 100;
            if (j % 6 == 0) {
                System.out.println("Месяц " + j + ", сумма накоплений равна " + savings3 + " рублей");
            }
        }
        System.out.println("");

        System.out.println("Задание 3.");
        //Задание 3
        //Василий решил копить деньги ближайшие 9 лет. И он хочет знать, какой будет сумма его накоплений каждые полгода
        //на протяжении этих 9 лет.
        //Исходная сумма всё так же 15 тысяч рублей, проценты банка – 7% ежемесячно.
        //Напишите программу, которая будет выводить Василию сумму его накоплений за следующие каждые полгода в течение 9 лет.
        int salaryMonth4 = 15000;
        int savings4 = 0;
        for (int m = 1; m <= 108; m++) {
            savings4 = savings4 + salaryMonth4 + (savings4 + salaryMonth4) * 7 / 100;
            if (m % 6 == 0) {
                System.out.println("Месяц " + m + ", сумма накоплений равна " + savings4 + " рублей");
            }
        }
        System.out.println("");

        System.out.println("Задание 4.");
        //Задание 4
        //В вашей компании пятница является днем отчетным.
        //Нам нужно написать программу, которая считает дни месяца по датам, определяет,
        //какой день пятница, и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.
        //Условия задачи:
        //Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
        //Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
        //"Сегодня пятница, ...-е число. Необходимо подготовить отчет."
        //В нашем месяце 31 день. В результате у вас должно вывестись от 4 до 5 сообщений с напоминаниями по разным датам.
        String deyWeek="пятница";
        i=1; //первая пятница

        // Инициализация объекта date
        Date date = new Date();
        // Вывод текущей даты и времени с использованием toString()
        String str = String.format("Текущая дата и время: %tc ", date);



        Date date4 = new Date();

        // Вывод текущей даты с использованием toString()
        System.out.printf("%1$s %2$td %2$tB %2$tY", "Дата: ", date4);
        System.out.printf(str);
        //System.out.println("Сегодня пятница,... число. Необходимо подготовить отчет.");
        System.out.println("");

        System.out.println("Домашняя работа 3. Задание 1.");
        //6. Задание
        //Домашнее задание -3. Задание 1
        //Мы решили написать астрономическое приложение,которое считает,когда над Землей пролетают кометы и их можно будет увидеть.
        //Для начала нам нужно посчитать траекторию движения кометы, которая пролетает рядом с Землей каждый 79-й год,
        //начиная с нулевого.
        //Нам нужно узнать, в каких годах комета пролетала рядом с Землей за последние 200 лет и когда мы увидим ее в следующий раз.
        //Условия задачи:
        //В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления.
        //Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до текущего
        //(из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения периода расчета.
        //В результате решения задачи в консоль должен вывестись следующий результат:
        //1896
        //1975
        //2054
        int yearNew=2022;
        int year200=200;
        int year100=100;
        for (int y6=0;y6<yearNew+year100;y6+=79){
            if (y6>(yearNew-year200)&&y6<(yearNew+year100)){
                System.out.println((y6));
            }
        }

    }
}