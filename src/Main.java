public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int balans = 100;
        int cash = 1100;
        int bonus = cash / 100;
        if (cash >= 1000) {
            int total = balans + cash + bonus;
            System.out.println(total + "_Balans");
            System.out.println(bonus + "_Bonus");
        } else {
            int total = balans + cash;
            System.out.println(total + "_Balans");
        }


        System.out.println(cash + "_Popolnenie");



    }


}