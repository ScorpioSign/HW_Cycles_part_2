public class Task3 {
    //В стране Y население равно 12 миллионов человек.
    //Рождаемость составляет 17 человек на 1000, смертность — 8 человек.
    // Рассчитайте, какая численность населения будет через 10 лет,
    // если показатели рождаемости и смертности постоянны.
    //В консоль выведите результат операции на каждый год в формате:
    // «Год …, численность населения составляет …».
    public static void main(String[] args) {
        double population = 12_000_000;
        double birthPerYear = 0.017;
        double deathPerYear = 0.008;
        double populationGrowth = population * (birthPerYear - deathPerYear);
        int i = 1;
        while (i <= 10) {
            population = population + populationGrowth;
            //System.out.println("Год " + i + ": численность населения составляет " + population + " человек");
            System.out.printf("\nГод %d : численность населения составляет %.0f человек", i, population);
            i++;
        }
    }
}
