public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int balans = 100;
        int cash = 1100;
        int Bonus = cash / 100;
        if (cash >= 1000) {
            int Total = balans + cash + Bonus;
            System.out.println(Total + "_Balans");
            System.out.println(Bonus + "_Bonus");
        } else {
            int Total = balans + cash;
            System.out.println(Total + "_Balans");
        }


        System.out.println(cash + "_Popolnenie");



    }


}