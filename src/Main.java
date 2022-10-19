public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int cashInAmount = 2000;
        int bonusAmount = 0;
        if (cashInAmount > 1000) {
            bonusAmount = cashInAmount / 100;
        };
        int resultBalance = initialBalance + cashInAmount + bonusAmount;

        System.out.println(resultBalance);
    }
}
