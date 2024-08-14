public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int Balans = 100;
        int Cash = 1100;
        int Bonus = Cash / 100;
        if (Cash >= 1000) {
            int Total = Balans + Cash + Bonus;
            System.out.println(Total + "_Balans");
            System.out.println(Bonus + "_Bonus");
        } else {
            int Total = Balans + Cash;
            System.out.println(Total + "_Balans");
        }


        System.out.println(Cash + "_Popolnenie");



    }


}