public class Main {
    public static void main(String[] args) {
        Account miguelAccount = new Account(
                "096.067.043-27",
                "12367261937216397213",
                200.00,
                false
        );

        miguelAccount.withdraw(0);
        System.out.println(miguelAccount.getBalance());
    }
}