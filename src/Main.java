public class Main {
    public static void main(String[] args) {

        int account = 100;
        int payment = 1500;

        int bonus;
        if (payment >= 1000)
            bonus = payment / 100 * 1;

        else
            bonus = 0;
        {
            System.out.println("количество бонусных рублей:" + bonus);
        }
        int total = account + payment + bonus;
        {
            System.out.println("итоговый счет:" + total);
        }

    }
}
