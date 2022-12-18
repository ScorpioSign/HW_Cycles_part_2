public class Task5 {
    //Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд,
    // а только каждый шестой. Должны быть видны накопления за 6, 12, 18, 24-й и следующие месяцы.
    public static void main(String[] args) {
        double sum = 15000;
        int monthNumber = 1;
        while (sum <= 12000000) {
            sum = sum * 1.07;
            if(monthNumber % 6 == 0) {
                System.out.printf("\nМесяц %d : сумма накоплений составляет %.2f рублей", monthNumber, sum);
            }
            monthNumber ++;
        }
    }
}
