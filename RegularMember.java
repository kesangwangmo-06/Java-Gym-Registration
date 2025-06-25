public class RegularMember extends GymMember{
    // Attributes specific to RegularMember
    private final int attendanceLimit; 
    private boolean isEligibleForUpgrade; 
    private String removalReason; 
    private String referralSource; 
    private String plan; 
    private double price; 

    // Constructor to initialize RegularMember with default and parameterized values
    public RegularMember(int id,String name,String location,String phone,String email,String gender,String DOB,String membershipStartDate, String referralSource){
        super(id,name,location,phone,email,gender,DOB,membershipStartDate);
        this.isEligibleForUpgrade=false;
        this.attendanceLimit=30; 
        this.removalReason=""; 
        this.plan="basic"; 
        this.price=6500; 
    }

    // Getter methods to access private attributes
    public int getattendanceLimit(){
        return attendanceLimit;
    }

    public boolean getisEligibleForUpgrade(){
        return isEligibleForUpgrade;
    }

    public String getremovalReason(){
        return removalReason;
    }

    public String referralSource(){
        return referralSource;
    }

    public String getPlan(){
        return plan;
    }

    public double getprice(){
        return price;
    }

    // Overrides abstract method from GymMember
    @Override
    public void markAttendance() {
        attendance++; // Increment attendance
        loyaltyPoints += 5; // Add loyalty points per visit
        if(attendance >= attendanceLimit){ // Check if upgrade eligibility is met
            isEligibleForUpgrade=true;
        }
    }

    // Method to return price based on plan type
    public double getPlanPrice(String plan){
        switch(plan.toLowerCase()){
            case "basic":
                return 6500;
            case "standard":
                return 12500;
            case "deluxe":
                return 18500;
            default:
                return -1; // Invalid plan option
        }
    }

    // Method to upgrade the membership plan if eligible
    public String upgradePlan(String newPlan){
        if(!isEligibleForUpgrade){
            return "You are not eligible for an upgrade";
        }
        double newPrice=getPlanPrice(newPlan);
        if(newPrice == -1){
            return "The selected plan is not available";
        }
        if(newPlan.equalsIgnoreCase(plan)){
            return "You are already subscribed to this plan";
        }
        this.plan=newPlan;
        this.price=newPrice;
        return "Your plan has been successfully upgraded to " + newPlan + " at " + newPrice;
    }

    // Method to reset RegularMember attributes, used when membership is reverted
    public void revertRegularMember(String removalReason){
        super.resetMember(); 
        this.isEligibleForUpgrade=false;
        this.plan = "basic"; 
        this.price = 6500; 
        this.removalReason = removalReason; // Sets the removal reason provided
    }

    // Method to display RegularMember details
    @Override
    public String toString() {
        return "TYPE: Regular\n"
        + "ID: " + getid() + "\n"
        + "Name: " + getname() + "\n"
        + "Location: " + getlocation() + "\n"
        + "Phone: " + getphone() + "\n"
        + "Email: " + getemail() + "\n"
        + "Start Date: " + getmembershipStartDate() + "\n"
        + "Plan: " + getPlan() + "\n"
        + "Price: " + getprice() + "\n"
        + "Attendance: " + getattendance() + "\n"
        + "Loyalty Points: " + getloyaltyPoints() + "\n"
        + "Eligible for Upgrade: " + getisEligibleForUpgrade() + "\n"
        + "Active: " + isActive() + "\n";
    }

}

