public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        int balance = 100;
        int replenishmentAmount = 1000;

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int bonus = replenishmentAmount >= 1000 ? replenishmentAmount / 100 : 0;  // тернарный вариант

/* Длинный вариант решения:

        if (replenishmentAmount >= 1000) {
            bonus = replenishmentAmount / 100;
        } else {
            bonus = 0;
        }
*/

        int newBalance = bonus + replenishmentAmount + balance;

        System.out.println("Вам начисленно бонусных рублей - " + bonus);
        System.out.println("Ваш баланс = " + newBalance);
    }
}
