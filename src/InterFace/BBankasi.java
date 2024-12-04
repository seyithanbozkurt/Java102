package InterFace;

public class BBankasi implements IBanka{
    private String bankaAdi;
    private String terminalID;
    private String password;

    BBankasi(String bankaAdi, String terminalID, String password){
        this.bankaAdi=bankaAdi;
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
        return false;
    }

    @Override
    public boolean payment(String price, String cardNumber, String date, String cvc) {
        return false;
    }
}
