package InterFace;

public class ABankasi implements IBanka{
    private String bankaAdi;
    private String terminalID;
    private String password;

    public ABankasi(String bankaAdi, String terminalID, String password) {
        this.bankaAdi = bankaAdi;
        this.terminalID=terminalID;
        this.password=password;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Kullanici ip: " + ipAddress);
        System.out.println("Makina ip: " + this.hostİp);
        System.out.println(this.bankaAdi + "Baglanildi");
        return true;
    }

    @Override
    public boolean payment(String price, String cardNumber, String date, String cvc) {
        System.out.println("Bankadan cevap bekleniyor...");
        System.out.println("İşlem basarili");
        return false;
    }
}
