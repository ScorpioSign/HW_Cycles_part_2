public class Task2 {
    //Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
    //На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
    //Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int y = 10; y >= 0; y--) {
            System.out.print(y + " ");
        }
    }
}
