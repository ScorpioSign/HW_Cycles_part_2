public class Task4 {
// Василий решил положить деньги на накопительный счет,
// где каждый месяц к сумме его вклада добавляется еще 7%. Первоначальная сумма вклада — 15 тысяч рублей.
//Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить,
// чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка от накоплений не меняется,
// а всегда равен 7%.
//Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу
public static void main(String[] args) {
    double sum = 15000;
    int monthNumber = 1;
    while (sum <= 12000000) {
        sum = sum * 1.07;
        System.out.printf("\nМесяц %d : сумма накоплений составляет %.2f рублей", monthNumber, sum);
        monthNumber++;
    }

}
}
