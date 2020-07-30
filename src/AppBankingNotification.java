public class AppBankingNotification implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Day la thong bao tren app: "+ message);
    }
}
