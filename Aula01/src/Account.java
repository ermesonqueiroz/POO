public class Account {
    private final String cpf;
    private final String accountNumber;
    private double balance;
    private boolean isSpecial;

    public Account(String cpf, String accountNumber, double balance, boolean isSpecial) {
        this.cpf = cpf;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.isSpecial = isSpecial;
    }

    public double getBonus() {
        return isSpecial ? balance * 0.1 : balance * 0.05;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public String getCpf() {
        return cpf;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void showData() {
        System.out.println("CPF: " + cpf);
        System.out.println("Número da conta: " + accountNumber);
        System.out.println("Saldo: " + balance);
    }

    public void transfer(double amount) {

    }
}
