public class Main {
    public static void main(String[] args) {

        int account = 100;
        int payment = 1500;
        int bonus = payment / 100 * 1;
        int total = account + payment;

        if (payment >= 1000) {
            System.out.println(account + payment + bonus);
        } else {
            System.out.println(total);
        }

    }
}
