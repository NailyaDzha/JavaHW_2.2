public class Main {
    public static void main(String[] args) {
        int client_balance = 200;
        int new_sum = 1101;

        int bonus;
        if (new_sum >= 1000 + 100) {
            bonus = 1 * new_sum / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Ваш бонус: " + bonus);

        int total_client_balance = client_balance + new_sum + bonus;
        System.out.println("Ваш баланс: " + total_client_balance);
    }

}