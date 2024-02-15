public class Main {
    public static void main(String[] args) {

        int amount = 3450; // сумма пополнения
        int balance1 = 100; // начальный баланс

        int bonus;
        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }

        int balance2 = balance1 + bonus + amount; // итоговый баланс

        System.out.println("Бонусов начислено: " + bonus);
        System.out.println("Сейчас на балансе: " + balance2);



    }
}