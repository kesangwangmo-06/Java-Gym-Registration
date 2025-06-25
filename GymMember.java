public abstract class GymMember{
    // Attributes with protected access modifier 
    protected int id;
    protected String name;
    protected String location;
    protected String phone;
    protected String email;
    protected String gender;
    protected String DOB;
    protected String membershipStartDate;
    protected int attendance;
    protected double loyaltyPoints;
    protected boolean activeStatus;

    // Constructor to give member details
    public GymMember(int id,String name, String location,String phone, String email,String gender,String DOB,String membershipStartDate){
        this.id= id;
        this.name= name;
        this.location= location;
        this.phone= phone;
        this.email=email;
        this.gender=gender;
        this.DOB=DOB;
        this.membershipStartDate=membershipStartDate;
        this.attendance=0; // Default attendance starts at 0
        this.loyaltyPoints=0; // Default loyalty points
        this.activeStatus=false; // Membership is inactive by default

    }
    // Accessor methods to get member attributes
    public int getid()
    {
        return id;
    }

    public String getname()
    {
        return name;
    }

    public String getlocation()
    {
        return location;

    }

    public String getphone()
    {
        return phone;
    }

    public String getemail()
    {
        return email;
    }

    public String getgender()
    {
        return gender;
    }

    public String getDOB()
    {
        return DOB;
    }

    public String getmembershipStartDate()
    {
        return membershipStartDate;
    }

    public int getattendance()
    {
        return attendance;
    }

    public double getloyaltyPoints()
    {
        return loyaltyPoints;
    }

    public boolean getactiveStatus()
    {
        return activeStatus;
    }

    // Abstract method of super class to be implemented in subclasses
    abstract void markAttendance();

    // Method to activate membership
    public void activemembership(){
        activeStatus=true;
        System.out.println("Your membership has been activated");
    }

    // Method to deactivate membership with a condition check
    public void deactivatemembership(){
        if(activeStatus){
            activeStatus = false;
            System.out.println("Your membership has been deactivated");
        } 
        else{
            System.out.println("The membership must be activated in order to deactivate it");

        }
    }

    // Method to reset member details like attendance and loyalty points
    public void resetMember(){
        activeStatus=false;
        attendance= 0;
        loyaltyPoints= 0;

    }

    public boolean isActive() {
        return activeStatus;
    }

    // Method to display member details
    public void display(){
        System.out.println("ID:" + id);
        System.out.println("Name:" + name);
        System.out.println("Location:" + location);
        System.out.println("Phone :" + phone);
        System.out.println("Email :" + email);
        System.out.println("Gender:" + gender);
        System.out.println("DOB:" + DOB);
        System.out.println("Membership Start Date:"+ membershipStartDate);
        System.out.println("Attendance:" + attendance);
        System.out.println("Loyalty Points:" + loyaltyPoints);
        System.out.println("Active Status:" + activeStatus);

    }

}
