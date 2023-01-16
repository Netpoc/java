/**
 * momo payment processing
 */
public class Payment {
    //number to process payment
    private String phoneNumber;
    //payment network
    private String network;
    //amount to pay
    private double amount;
    //currentcy of payment
    private String currency;

    /**
     * 
     * @param phoneNumber phone number for payment
     * @param network payment network
     * @param amount transaction amount
     * @param currency currency of transaction
     */
    public Payment(String phoneNumber, String network, double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
        this.network = network;
        this.phoneNumber = formatPhoneNumber(phoneNumber);
        
        
        
    }
    private String formatPhoneNumber(String number) {
        if (number.startsWith("0") && number.length() == 10) {
            return "+234" + number.substring(1,10);
        }
        return number;
    }
    /**
     * 
     * @return string of payment number with +233
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
}