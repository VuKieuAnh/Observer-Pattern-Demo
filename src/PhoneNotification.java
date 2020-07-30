public class PhoneNotification implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Day la thong bao tren dien thoai: "+ message);
    }
}
