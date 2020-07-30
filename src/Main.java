public class Main {
    public static void main(String[] args) {
        BankingAccount bankingAccount = new BankingAccount();
        bankingAccount.add(new PhoneNotification());
        bankingAccount.add(new AppBankingNotification());
        bankingAccount.update("tai khoan cua ban bi tru");
    }
}
