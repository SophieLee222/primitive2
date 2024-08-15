public class Main {
    public static void main(String[] args) {

        int initialBalance = 100;
        int topUpSum = 1100;
        int oneBonus = 100;

        int finalBalance;
        int bonuses;
        if (topUpSum >= 1000) {
            bonuses = topUpSum / oneBonus;
            finalBalance = initialBalance + topUpSum + bonuses;
        } else {
            bonuses = 0;
            finalBalance = initialBalance + topUpSum;
        }
        System.out.println("Итоговый баланс: " + finalBalance);
        System.out.println("Количество начисленных бонусов: " + bonuses);

    }
}