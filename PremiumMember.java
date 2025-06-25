public class PremiumMember extends GymMember{
    // Premium membership attributes
    private final double premiumCharge; 
    private String personalTrainer; 
    private boolean isFullPayment; 
    private double paidAmount; 
    private double discountAmount; 

    // Constructor to initialize premium member details
    public PremiumMember(int id,String name,String location,String phone,String email,String gender,String DOB, String membershipStartDate, String personalTrainer){
        super(id,name,location,phone,email,gender,DOB,membershipStartDate);
        this.premiumCharge=50000;
        this.personalTrainer=personalTrainer;
        this.isFullPayment=false;
        this.paidAmount=0; 
        this.discountAmount=0; 
    }

    // Getter methods for accessing private attributes
    public double getpremiumCharge(){
        return premiumCharge;
    }

    public String getpersonalTrainer(){
        return personalTrainer;
    }

    public boolean getisFullPayment(){
        return isFullPayment;
    }

    public double getpaidAmount(){
        return paidAmount;
    }

    public double getdiscountAmount(){
        return discountAmount;
    }

    // Overrides the markAttendance method from GymMember
    @Override
    public void markAttendance() {
        attendance++; // Increment attendance count
        loyaltyPoints += 10; // Premium members earn 10 loyalty points per visit
    }

    // Method to handle payment of the due amount
    public String payDueAmount(double amount) {
        if (isFullPayment) {
            return "The full payment is already made.";
        }

        if (paidAmount + amount > premiumCharge) {
            return "The amount is more than required. Kindly pay only the required amount.";
        }

        this.paidAmount += amount;
        double remainingAmount = premiumCharge - this.paidAmount;

        if (this.paidAmount == premiumCharge) {
            isFullPayment = true;
            return "The payment is fully made.";
        } else {
            return "Payment successful. Remaining amount to be paid: " + remainingAmount;
        }
    }

    // Method to calculate and apply discount if full payment is made
    public void CalculateDiscount(){
        if(isFullPayment){
            discountAmount = 0.10 * premiumCharge; // 10% discount if full payment is completed
            System.out.println("Your discount has successfully been added to your plan");
        }
        else{
            System.out.println("Discount is only available if the payment is fully made ");
        }
    }

    // Method to revert premium member details and reset attributes
    public void revertPremiumMember(){
        super.resetMember(); 
        this.personalTrainer=""; 
        this.isFullPayment=false;
        this.paidAmount=0; 
        this.discountAmount=0;
    }

    // Method to display premium member details
    @Override
    public String toString() {
        return "TYPE: Premium\n"
        + "ID: " + getid() + "\n"
        + "Name: " + getname() + "\n"
        + "Location: " + getlocation() + "\n"
        + "Phone: " + getphone() + "\n"
        + "Email: " + getemail() + "\n"
        + "Start Date: " + getmembershipStartDate() + "\n"
        + "Trainer: " + getpersonalTrainer() + "\n"
        + "Paid Amount: " + getpaidAmount() + "\n"
        + "Discount: " + getdiscountAmount() + "\n"
        + "Loyalty Points: " + getloyaltyPoints() + "\n"
        + "Full Payment: " + getisFullPayment() + "\n"
        + "Active: " + isActive() + "\n";
    }

}
