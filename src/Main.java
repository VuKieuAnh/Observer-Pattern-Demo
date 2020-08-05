public class Main {
    public static void main(String[] args) {
        BankingAccount bankingAccount = new BankingAccount();
        PhoneNotification phoneNotification = new PhoneNotification();
        AppBankingNotification appBankingNotification = new AppBankingNotification();
        bankingAccount.add(phoneNotification);
        bankingAccount.add(appBankingNotification);
        bankingAccount.update("tai khoan cua ban bi tru");
        System.out.println("-----------------");
        bankingAccount.remove(phoneNotification);
        bankingAccount.add(new EmailNotification());
        bankingAccount.update("tai khoan dc cong them");
    }
}
