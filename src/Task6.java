public class Task6 {
    // Василий решил, что будет копить деньги ближайшие 9 лет. Он хочет знать,
    // какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
    //Исходная сумма всё та же — 15 тысяч рублей, проценты банка – 7% ежемесячно.
    //Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.
    public static void main(String[] args) {
             manner1();//сделала по полугодиям, как поняла из условия
             manner2();//сделала по каждому шестому месяцу, как поняла из критериев оценки
    }
    public static void manner1() {
        System.out.print("Способ 1");
        double sum = 15000;
        int term = 9 * 12;
        int halfYear = 0;
        for (int monthNumber = 1; monthNumber <= term; monthNumber++) {
            sum = sum * 1.07;
            if (monthNumber % 6 == 0) {
                halfYear = halfYear + 1;
                System.out.printf("\nПолугодие %d : сумма накоплений составляет %.2f рублей", halfYear, sum);
            }
        }
        System.out.println();
    }
    public static void manner2() {
        System.out.print("Способ 2");
        double sum = 15000;
        int term = 9 * 12;
        for (int monthNumber = 1; monthNumber <= term; monthNumber++) {
            sum = sum * 1.07;
            if (monthNumber % 6 == 0) {
                System.out.printf("\nМесяц %d : сумма накоплений составляет %.2f рублей", monthNumber, sum);
            }
        }

    }
}
