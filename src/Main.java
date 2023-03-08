public class Main {
    public static void main(String[] args) {

        // если клиент пополняет счёт более чем на 1000 рублей,
        // то сотовый оператор дарит ему по 1 рублю за каждые полные 100 рублей пополнения

        int a = 500;  //Начальный счет
        int b = 1200; //Сумма пополнения
        int bonus;

        if (b > 1000) {
            bonus = b / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Счет клиента: " + (a + b + bonus) + " рублей");
    }
}