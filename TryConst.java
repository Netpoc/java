public class TryConst{
    private String username;
    int age;

    public TryConst(){}

    public void setUsername(String username) {
        if (username.trim().length() > 5) {
            this.username = username;
        } else {
            System.out.println("Invalid Convention");
        }
    }
    public String getUsername() {
        return username;
    }

    public TryConst(String username) {
        this.username = username;

    }

    public TryConst(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public static void main(String[] args) {
        TryConst tryConst = new TryConst("Peter", 23);
        tryConst.setUsername("Bolahh");
        System.out.println(tryConst.getUsername());

        Payment payment = new Payment("0200367763", "MTN", 1000, "GHC");
        System.out.println(payment.getPhoneNumber());

        Shape rec = new Rectangle(10, 45, 100);
        rec.findArea();
        
    }
}

