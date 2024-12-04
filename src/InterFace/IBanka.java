package InterFace;

public interface IBanka {
    final String hostİp=  "127.0.0.1";

    boolean connect(String ipAddress );

    boolean payment(String price, String cardNumber, String date, String cvc );
}
