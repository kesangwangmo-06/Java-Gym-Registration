//importing swing components//
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

//Importing AWT components
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import java.awt.Frame;

public class GymGUI implements ActionListener {
    public static ArrayList<GymMember> allMembers = new ArrayList<>();//List to store all gym members
    private JFrame fr;
    private JPanel panelOne;
    private JLabel title,title1,title2;
    private JButton btnRm,btnPm;

    public static void main(String[]args){
        new GymGUI("Main");//Start the GUI
    }

    public GymGUI(String type){ 
        fr= new JFrame("Gym Registration Form");//create main frame
        title= new JLabel("Welcome to the Gym Memebership Form");
        title.setBounds(250,20,500,30);
        title.setFont(new Font("Arial",Font.BOLD,20));
        title1=new JLabel("Make the most of your fitness journey with us!");
        title1.setBounds(300,40,500,30);

        panelOne= new JPanel();
        panelOne.setLayout(null);
        panelOne.setBounds(40,70,800,100);
        panelOne.setBackground(Color.LIGHT_GRAY);//set backgorund color

        title2= new JLabel("Please select the desired membership type:");
        title2.setBounds(20,10,330,20);
        title2.setFont(new Font("Arial",Font.BOLD,15)); //set font

        //Regular member button
        btnRm= new JButton("Regular Member");
        btnRm.setBounds(320,40,150,20);
        btnRm.addActionListener(new ActionListener(){ //add actoin listener
                public void actionPerformed(ActionEvent e){
                    int response= JOptionPane.showConfirmDialog
                        (null,
                            "Do you want to proceed as a Regular Member?",
                            "Confirm Membership",
                            JOptionPane.YES_NO_OPTION
                        );
                    if (response == JOptionPane.YES_OPTION) {
                        new RegularPage();//open regular membership page
                    }
                }
            });
        //Premium member button
        btnPm= new JButton("Premium Member");
        btnPm.setBounds(500,40,150,20);
        btnPm.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    int response= JOptionPane.showConfirmDialog
                        (null,
                            "Do you want to proceed as a Premium Member?",
                            "Confirm Membership",
                            JOptionPane.YES_NO_OPTION
                        );
                    if (response == JOptionPane.YES_OPTION) {
                        new PremiumPage();//open premium membership page
                    }
                }
            });     
        //Add components to panel
        panelOne.add(title2);
        panelOne.add(btnRm);
        panelOne.add(btnPm);
        //add components to frame
        fr.add(title);
        fr.add(title1);
        fr.add(panelOne);
        fr.setLayout(null);//null layout
        fr.setVisible(true);//make frame visible
        fr.setSize(900,250);//set framee size
    }

    @Override
    public void actionPerformed(ActionEvent e){
    }
}
//Regular membership page
class RegularPage extends JFrame {
    //decalaring components
    private JPanel onePanel, twoPanel, rmP3, rmP4, rmP5;
    private JLabel rmLabel, rmL2, rmL3, rmL4, rmL7, rmL8, rmL9, rmL10, rmL11, rmL12, rml13, rml14, rml15, rml16, rml17, rml19, plans, plan1, price, attendanceLabel, loyaltyLabel;
    private JTextField panelTf1, panelTf2, panelTf3, panelTf4, panelTf5, panelTf6, panelTf7, panelTf8, loyaltyField, priceField,actField,dactiveField,rTf;
    private JRadioButton maleRadio, femaleRadio, cradio, ccradio, oradio, radio1, radio2, radio3, radio4, radio5;
    private JComboBox<String> comboDays, comboYears, comboMonths, comboDays_, comboYears_, comboMonths_, combor, combod, combo0;
    private JButton markAttendanceBtn, btndec, btnAdd,btnAct,rBtn,btnDis,cBtn,btnUpgrade,backBtn;
    private ButtonGroup genderGroup, paymentGroup,cancelGroup;
    private int attendance = 0;
    private int loyaltyPoints = 0;

    public RegularPage() {
        setTitle("Regular Membership Details");
        setLayout(null);
        setSize(900, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Title Label
        rmLabel = new JLabel("Regular Membership Form");
        rmLabel.setBounds(300, 20, 450, 35);
        rmLabel.setFont(new Font("Arial", Font.BOLD, 20));
        // Member Information Panel
        onePanel = new JPanel();
        onePanel.setLayout(null);
        onePanel.setBounds(40, 70, 800, 280);
        onePanel.setBackground(Color.LIGHT_GRAY);
        // Member Information Labels and Fields
        rmL2 = new JLabel("Member Information");
        rmL2.setBounds(20, 10, 200, 20);
        rmL2.setFont(new Font("Arial", Font.BOLD, 15));

        rmL3 = new JLabel("ID:");
        rmL3.setBounds(20, 60, 40, 20);
        panelTf1 = new JTextField();
        panelTf1.setBounds(90, 60, 150, 20);

        rmL4 = new JLabel("Name:");
        rmL4.setBounds(20, 90, 90, 20);
        panelTf2 = new JTextField();
        panelTf2.setBounds(90, 90, 150, 20);

        rmL7 = new JLabel("Phone:");
        rmL7.setBounds(20, 120, 60, 20);
        panelTf5 = new JTextField();
        panelTf5.setBounds(90, 120, 150, 20);

        rmL8 = new JLabel("Emergency No.");
        rmL8.setBounds(280, 120, 150, 20);
        panelTf6 = new JTextField();
        panelTf6.setBounds(370, 120, 150, 20);

        rmL9 = new JLabel("Email:");
        rmL9.setBounds(20, 150, 100, 20);
        panelTf7 = new JTextField();
        panelTf7.setBounds(90, 150, 150, 20);

        rmL10 = new JLabel("Location:");
        rmL10.setBounds(20, 180, 100, 20);
        panelTf8 = new JTextField();
        panelTf8.setBounds(90, 180, 150, 20);

        rmL11 = new JLabel("Gender:");
        rmL11.setBounds(20, 210, 200, 20);
        maleRadio = new JRadioButton("Male");
        maleRadio.setOpaque(false);
        femaleRadio = new JRadioButton("Female");
        femaleRadio.setOpaque(false);
        genderGroup = new ButtonGroup();

        maleRadio.setBounds(90, 210, 60, 15);
        femaleRadio.setBounds(170, 210, 70, 15);

        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        rmL12 = new JLabel("DOB:");
        rmL12.setBounds(20, 240, 70, 20);

        // Date of Birth Combo Boxes
        String[] day = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        comboDays = new JComboBox<>(day);
        comboDays.setBounds(90, 240, 80, 20);
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        comboMonths = new JComboBox<>(months);
        comboMonths.setBounds(180, 240, 80, 20);
        String[] years = new String[36];
        for (int i = 0; i <= 34; i++) years[i] = String.valueOf(1990 + i);
        comboYears = new JComboBox<>(years);
        comboYears.setBounds(270, 240, 80, 20);

        // Adding components to onePanel
        onePanel.add(rmL2);
        onePanel.add(rmL3);
        onePanel.add(panelTf1);
        onePanel.add(rmL4);
        onePanel.add(panelTf2);
        onePanel.add(rmL7);
        onePanel.add(panelTf5);
        onePanel.add(rmL8);
        onePanel.add(panelTf6);
        onePanel.add(rmL9);
        onePanel.add(panelTf7);
        onePanel.add(rmL10);
        onePanel.add(panelTf8);
        onePanel.add(rmL11);
        onePanel.add(maleRadio);
        onePanel.add(femaleRadio);
        onePanel.add(rmL12);
        onePanel.add(comboYears);
        onePanel.add(comboDays);
        onePanel.add(comboMonths);

        add(rmLabel);
        add(onePanel);

        // Membership Details Panel
        twoPanel = new JPanel();
        twoPanel.setLayout(null);
        twoPanel.setBounds(40, 370, 430, 170);
        twoPanel.setBackground(Color.LIGHT_GRAY);

        rml13 = new JLabel("Membership Details");
        rml13.setBounds(20, 10, 200, 20);
        rml13.setFont(new Font("Arial", Font.BOLD, 15));

        rml14 = new JLabel("Membership Start Date:");
        rml14.setBounds(20, 50, 200, 20);

        // Membership Start Date Combo Boxes
        comboDays_ = new JComboBox<>(day);
        comboDays_.setBounds(160, 50, 80, 20);
        comboMonths_ = new JComboBox<>(months);
        comboMonths_.setBounds(250, 50, 80, 20);
        comboYears_ = new JComboBox<>(years);
        comboYears_.setBounds(340, 50, 80, 20);

        rml15 = new JLabel("Membership Duration:");
        rml15.setBounds(20, 80, 200, 20);
        String[] duration = {"1 month", "3 months", "6 months", "1 year", "others"};
        combod = new JComboBox<>(duration);
        combod.setBounds(160, 80, 100, 20);

        rml16 = new JLabel("Referral Source:");
        rml16.setBounds(20, 110, 200, 20);
        String[] referral = {"Social Media", "Family/Friends", "Other"};
        combor = new JComboBox<>(referral);
        combor.setBounds(160, 110, 100, 20);

        rml17 = new JLabel("Payment Method:");
        rml17.setBounds(20, 140, 200, 20);
        cradio = new JRadioButton("Cash");
        cradio.setOpaque(false);
        ccradio = new JRadioButton("Credit");
        ccradio.setOpaque(false);
        oradio = new JRadioButton("Other");
        oradio.setOpaque(false);
        paymentGroup = new ButtonGroup();

        cradio.setBounds(160, 140, 60, 15);
        ccradio.setBounds(210, 140, 70, 15);
        oradio.setBounds(280, 140, 70, 15);
        paymentGroup.add(cradio);
        paymentGroup.add(ccradio);
        paymentGroup.add(oradio);

        add(twoPanel);
        twoPanel.add(rml13);
        twoPanel.add(rml14);
        twoPanel.add(comboYears_);
        twoPanel.add(comboDays_);
        twoPanel.add(comboMonths_);
        twoPanel.add(rml15);
        twoPanel.add(combod);
        twoPanel.add(rml16);
        twoPanel.add(rml17);
        twoPanel.add(combor);
        twoPanel.add(cradio);
        twoPanel.add(ccradio);
        twoPanel.add(oradio);

        // Plan Selection Panel
        rmP3 = new JPanel();
        rmP3.setLayout(null);
        rmP3.setBounds(480, 370, 350, 170);
        rmP3.setBackground(Color.LIGHT_GRAY);

        plans = new JLabel("Pick your plan");
        plans.setBounds(20, 10, 160, 20);
        plans.setFont(new Font("Arial", Font.BOLD, 15));

        plan1 = new JLabel("Plans:");
        plan1.setBounds(20, 50, 100, 20);
        String[] planS = {"Basic", "Standard", "Deluxe"};
        combo0 = new JComboBox<>(planS);
        combo0.setBounds(90, 50, 150, 20);

        price = new JLabel("Plan Price:");
        price.setBounds(20, 90, 100, 20);
        priceField = new JTextField("6500");
        priceField.setBounds(90, 90, 150, 20);
        priceField.setEditable(false);
        combo0.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    String selectedPlan = combo0.getSelectedItem().toString().toLowerCase();
                    int price;
                    switch (selectedPlan) {
                        case "basic":
                            price = 6500;
                            break;
                        case "standard":
                            price = 12500;
                            break;
                        case "deluxe":
                            price = 18500;
                            break;
                        default:
                            price = -1;
                    }
                    if (price == -1) {
                        priceField.setText("Invalid");
                    } else {
                        priceField.setText(String.valueOf(price));
                    }
                }
            });
        btnUpgrade= new JButton("Upgrade Plan");
        btnUpgrade.setBounds(90,120,150,25);
        btnUpgrade.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        int id = Integer.parseInt(panelTf1.getText());
                        String selectedPlan = combo0.getSelectedItem().toString();

                        for (GymMember member : GymGUI.allMembers) {
                            if (member instanceof RegularMember && member.getid() == id) {
                                RegularMember rm = (RegularMember) member;
                                String result = rm.upgradePlan(selectedPlan);
                                JOptionPane.showMessageDialog(null, result);
                                priceField.setText(String.valueOf(rm.getprice()));
                                return;
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Member ID not found!", "Error", JOptionPane.ERROR_MESSAGE);

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Enter valid numeric ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

        add(rmP3);
        rmP3.add(plans);
        rmP3.add(plan1);
        rmP3.add(combo0);
        rmP3.add(price);
        rmP3.add(priceField);
        rmP3.add(btnUpgrade);

        // Attendance and Loyalty Points Panel
        rmP4 = new JPanel();
        rmP4.setLayout(null);
        rmP4.setBounds(40, 560, 430, 120);
        rmP4.setBackground(Color.LIGHT_GRAY);

        attendanceLabel = new JLabel("Attendance:");
        attendanceLabel.setBounds(20, 20, 100, 20);
        markAttendanceBtn = new JButton("Mark Attendance");
        markAttendanceBtn.setBounds(160, 20, 150, 25);

        loyaltyLabel = new JLabel("Loyalty Points:");
        loyaltyLabel.setBounds(20, 60, 100, 20);
        loyaltyField = new JTextField("0");
        loyaltyField.setBounds(160, 50, 150, 25);
        loyaltyField.setEditable(false);

        markAttendanceBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        String inputId = JOptionPane.showInputDialog("Enter Member ID to mark attendance:");
                        int enteredId = Integer.parseInt(inputId);
                        boolean found = false;

                        for (GymMember member :GymGUI. allMembers) {
                            if (member.getid() == enteredId) {
                                found = true;
                                if (member.isActive()) {
                                    member.markAttendance();
                                    loyaltyField.setText(String.valueOf(member.getloyaltyPoints()));

                                    JOptionPane.showMessageDialog(null," Attendance marked Succesfully");
                                } else {
                                    JOptionPane.showMessageDialog(
                                        null,
                                        "Cannot mark attendance as membership is not active", 
                                        "Inactive Member",
                                        JOptionPane.WARNING_MESSAGE);
                                }
                                break;
                            }
                        }
                        if (!found) {
                            JOptionPane.showMessageDialog(null,
                                "Member ID not found",
                                "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null,
                            " Please enter a valid numeric ID.",
                            "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
        add(rmP4); 
        rmP4.add(attendanceLabel);

        rmP4.add(loyaltyLabel);
        rmP4.add(loyaltyField);
        rmP4.add(markAttendanceBtn);

        // Deactivation Panel
        rmP5 = new JPanel();
        rmP5.setLayout(null);
        rmP5.setBounds(480, 560, 370, 120);
        rmP5.setBackground(Color.LIGHT_GRAY);
        btndec = new JButton("Deactivate");
        btndec.setBounds(20, 20, 100, 15);
        dactiveField= new JTextField();
        dactiveField.setBounds(130,20,150,15);
        btndec.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        int enteredId = Integer.parseInt(dactiveField.getText());
                        boolean found = false;

                        for (GymMember member : GymGUI.allMembers) {
                            if (member instanceof RegularMember && member.getid() == enteredId) {
                                RegularMember rm = (RegularMember) member;

                                if (rm.isActive()) {
                                    String reason = "";

                                    if (radio1.isSelected()) reason = "Relocation";
                                    else if (radio2.isSelected()) reason = "Health Issues";
                                    else if (radio3.isSelected()) reason = "Temporary Break";
                                    else if (radio4.isSelected()) reason = "Lack of Time";
                                    else if (radio5.isSelected()) reason = "Other";

                                    if (reason.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Please select a reason for cancellation.");
                                        return;
                                    }

                                    rm.revertRegularMember(reason); // Sets removalReason
                                    GymGUI.allMembers.remove(rm); // Remove from active list
                                    JOptionPane.showMessageDialog(null, "Membership Deactivated. Reason: " + reason);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Membership is already inactive.");
                                }

                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            JOptionPane.showMessageDialog(null, "Member ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid numeric ID.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

        rml19 = new JLabel("Reasons for cancellation");
        rml19.setBounds(20, 40, 150, 20);
        radio1 = new JRadioButton("Relocation");
        radio1.setOpaque(false);
        radio2 = new JRadioButton("Health Issues");
        radio2.setOpaque(false);
        radio3 = new JRadioButton("Temp. Break");
        radio3.setOpaque(false);
        radio4 = new JRadioButton("Lack of Time");
        radio4.setOpaque(false);
        radio5 = new JRadioButton("Other");
        radio5.setOpaque(false);
        cancelGroup = new ButtonGroup();

        radio1.setBounds(100, 60, 110, 15);
        radio2.setBounds(220, 60, 110, 15);
        radio3.setBounds(100, 80, 110, 15);
        radio4.setBounds(220, 80, 110, 15);
        radio5.setBounds(180, 100, 70, 15);

        cancelGroup.add(radio1);
        cancelGroup.add(radio2);
        cancelGroup.add(radio3);
        cancelGroup.add(radio4);
        cancelGroup.add(radio5);

        add(rmP5);

        rmP5.add(btndec);
        rmP5.add(dactiveField);
        rmP5.add(rml19);
        rmP5.add(radio1);
        rmP5.add(radio2);
        rmP5.add(radio3);
        rmP5.add(radio4);
        rmP5.add(radio5);

        btnAdd = new JButton("Add");
        btnAdd.setBounds(40, 700, 70, 15);
        btnAdd.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        // Mandatory field check
                        if (panelTf1.getText().isEmpty() || panelTf2.getText().isEmpty() ||
                        panelTf5.getText().isEmpty() || panelTf6.getText().isEmpty() ||
                        panelTf7.getText().isEmpty() || panelTf8.getText().isEmpty() ||
                        (!maleRadio.isSelected() && !femaleRadio.isSelected()) ||
                        (!cradio.isSelected() && !ccradio.isSelected() && !oradio.isSelected())) {

                            JOptionPane.showMessageDialog(null,
                                "Please fill in all required fields and select gender/payment method.",
                                "Incomplete Form",
                                JOptionPane.WARNING_MESSAGE);
                            return;
                        }

                        int id = Integer.parseInt(panelTf1.getText());
                        String name = panelTf2.getText();
                        String phone = panelTf5.getText();
                        String email = panelTf7.getText();
                        String location = panelTf8.getText();
                        String gender = maleRadio.isSelected() ? "Male" : "Female";

                        String dob = comboDays.getSelectedItem() + " " + comboMonths.getSelectedItem() + " " + comboYears.getSelectedItem();
                        String startDate = comboDays_.getSelectedItem() + " " + comboMonths_.getSelectedItem() + " " + comboYears_.getSelectedItem();
                        String referral = combor.getSelectedItem().toString();
                        String plan = combo0.getSelectedItem().toString();
                        double price = Double.parseDouble(priceField.getText());

                        // Check for duplicate ID
                        for (GymMember m : GymGUI.allMembers) {
                            if (m.getid() == id) {
                                JOptionPane.showMessageDialog(null, "Duplicate ID not allowed!", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }

                        RegularMember rm = new RegularMember(id, name, location, phone, email, gender, dob, startDate, referral);
                        GymGUI.allMembers.add(rm);

                        JOptionPane.showMessageDialog(null, "Regular Member added successfully!");

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please enter valid numeric values for ID/Price", "Input Error", JOptionPane.ERROR_MESSAGE);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Unexpected Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
        add(btnAdd);

        btnAct=new JButton("Activate membership ");
        btnAct.setBounds(130,700,170,15);
        actField= new JTextField();
        actField.setBounds(310,700,120,15);

        btnAct.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        int enteredId = Integer.parseInt(actField.getText());
                        boolean found = false;

                        for (GymMember member : GymGUI.allMembers) {
                            if (member.getid() == enteredId) {
                                member.activemembership();
                                JOptionPane.showMessageDialog(null, "Membership Activated for ID: " + enteredId);
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            JOptionPane.showMessageDialog(null, "Member ID not found!", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid numeric ID.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
        rBtn= new JButton("Revert");
        rBtn.setBounds(450,700,150,15);
        rTf= new JTextField();
        rTf.setBounds(610,700,150,15);
        rBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        int enteredId = Integer.parseInt(rTf.getText());
                        boolean removed = false;

                        for (int i = 0; i < GymGUI.allMembers.size(); i++) {
                            GymMember member = GymGUI.allMembers.get(i);
                            if (member instanceof RegularMember && member.getid() == enteredId) {
                                RegularMember rm = (RegularMember) member;
                                rm.revertRegularMember("User requested removal or switched membership");
                                GymGUI.allMembers.remove(i);
                                JOptionPane.showMessageDialog(null, " Member has been reverted successfully");
                                removed = true;
                                break;
                            }
                        }

                        if (!removed) {
                            JOptionPane.showMessageDialog(null, "Regular Member ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Enter a valid numeric Member ID.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                    }
                }
            });

        btnDis = new JButton("Display");
        btnDis.setBounds(450, 720, 150, 15);
        btnDis.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JFrame displayFrame = new JFrame("Regular Members List");
                    displayFrame.setSize(900, 500);
                    displayFrame.setLayout(null);

                    JTextArea displayArea = new JTextArea();
                    displayArea.setEditable(false);

                    String allText = "";
                    for (GymMember p : GymGUI.allMembers) {
                        if (p instanceof RegularMember) {
                            allText += p.toString() + "\n--------------------------\n";
                        }
                    }

                    displayArea.setText(allText);

                    JScrollPane scrollPane = new JScrollPane(displayArea);
                    scrollPane.setBounds(20, 20, 840, 400);
                    displayFrame.add(scrollPane);

                    displayFrame.setVisible(true);
                }
            });
        JButton backBtn = new JButton("Back to Main Menu");
        backBtn.setBounds(440, 740, 160, 15);  
        backBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    dispose(); // Close current page
                    new GymGUI("Main"); // Open main menu
                }
            });
        add(backBtn);

        JButton btnSave = new JButton("Save to File");
        btnSave.setBounds(610, 740, 150, 15);
        btnSave.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        FileWriter fw = new FileWriter("AllMembers.txt", true); 
                        PrintWriter writer = new PrintWriter(fw);

                        for (GymMember member : GymGUI.allMembers) {
                            if (member instanceof RegularMember) {
                                RegularMember rm = (RegularMember) member;
                                writer.println("TYPE: Regular");
                                writer.println("ID: " + rm.getid());
                                writer.println("Name: " + rm.getname());
                                writer.println("Location: " + rm.getlocation());
                                writer.println("Phone: " + rm.getphone());
                                writer.println("Email: " + rm.getemail());
                                writer.println("Start Date: " + rm.getmembershipStartDate());
                                writer.println("Plan: " + rm.getPlan());
                                writer.println("Price: " + rm.getprice());
                                writer.println("Attendance: " + rm.getattendance());
                                writer.println("Loyalty Points: " + rm.getloyaltyPoints());
                                writer.println("Eligible for Upgrade: " + rm.getisEligibleForUpgrade());
                                writer.println("Active: " + rm.isActive());

                                writer.println();
                            }
                        }

                        writer.close();
                        JOptionPane.showMessageDialog(null, "Saved Regular Members to file!");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
                    }
                }
            });
        add(btnSave);

        JButton btnRead = new JButton("Read from File");
        btnRead.setBounds(770, 740, 150, 15);
        btnRead.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader("AllMembers.txt"));
                        JFrame fileFrame = new JFrame("Regular Members From File");
                        fileFrame.setSize(900, 500);
                        fileFrame.setLayout(null);

                        JTextArea displayArea = new JTextArea();
                        displayArea.setEditable(false);
                        JScrollPane scrollPane = new JScrollPane(displayArea);
                        scrollPane.setBounds(20, 20, 840, 400);

                        String fullText = "", line;
                        while ((line = reader.readLine()) != null) {
                            if (line.startsWith("TYPE: Regular") || !line.startsWith("TYPE:")) {
                                fullText += line + "\n";
                            }
                        }
                        reader.close();
                        displayArea.setText(fullText);
                        fileFrame.add(scrollPane);

                        JButton backBtn = new JButton("Back to Main Menu");
                        backBtn.setBounds(350, 440, 180, 30);
                        backBtn.addActionListener(ev -> {
                                    fileFrame.dispose();
                                    new GymGUI("Main");
                            });

                        fileFrame.add(backBtn);
                        fileFrame.setVisible(true);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Error reading file: " + ex.getMessage());
                    }
                }
            });
        add(btnRead);

        cBtn= new JButton("Clear");
        cBtn.setBounds(620,720,100,15);
        cBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Clear text fields
                    panelTf1.setText("");
                    panelTf2.setText("");
                    panelTf5.setText("");
                    panelTf6.setText("");
                    panelTf7.setText("");
                    panelTf8.setText("");
                    loyaltyField.setText("0");

                    priceField.setText("6500"); // default price
                    // Uncheck gender radio buttons
                    genderGroup.clearSelection();
                    // Uncheck payment method radio buttons
                    paymentGroup.clearSelection();
                    // Uncheck cancellation reasons
                    cancelGroup.clearSelection();
                    // Reset combo boxes to first item
                    comboDays.setSelectedIndex(0);
                    comboMonths.setSelectedIndex(0);
                    comboYears.setSelectedIndex(0);

                    comboDays_.setSelectedIndex(0);
                    comboMonths_.setSelectedIndex(0);
                    comboYears_.setSelectedIndex(0);

                    combo0.setSelectedIndex(0);     // plan combo
                    combod.setSelectedIndex(0);     // duration
                    combor.setSelectedIndex(0);     // referral

                    JOptionPane.showMessageDialog(null, "Form cleared successfully!");
                }
            });
        add(btnAdd);
        add(btnAct);
        add(btnAct);
        add(actField);
        add(rBtn);
        add(rTf);
        add(btnDis);
        add(cBtn);

        setLayout(null);
        setVisible(true);
        setSize(900,800);
    }
}

// start of premium page
class PremiumPage extends JFrame {
    private JPanel onePanel, twoPanel, rmP3, rmP4, rmP5;
    private JLabel rmLabel, rmL2, rmL3, rmL4,rmL6, rmL7, rmL8, rmL9, rmL10, rmL11, rmL12, rml13, rml14, rml15, rml16, rml17, rml19, plan1, price, attendanceLabel, loyaltyLabel,topay,amtdue;
    private JTextField panelTf1, panelTf2, panelTf3, panelTf4, panelTf5, panelTf6, panelTf7, panelTf8, loyaltyField, priceField,actField,dactiveField,rTf,trainersField,planTf,topaytf,amtduetf,plan1tf;
    private JRadioButton maleRadio, femaleRadio, cradio, ccradio, oradio, radio1, radio2, radio3, radio4, radio5;
    private JComboBox<String> comboDays, comboYears, comboMonths, comboDays_, comboYears_, comboMonths_, combor, combod;
    private JButton markAttendanceBtn, btndec, btnAdd, btnAct, rBtn, btnDis, cBtn, caldue, caldis, backBtn;
    private ButtonGroup genderGroup, paymentGroup,cancelGroup;
    private int attendance = 0;
    private int loyaltyPoints = 0;
    public PremiumPage() {
        setTitle("Premium Membership Details");
        setLayout(null);
        setSize(900, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Title Label
        rmLabel = new JLabel("Premium Membership Form");
        rmLabel.setBounds(300, 20, 450, 35);
        rmLabel.setFont(new Font("Arial", Font.BOLD, 20));

        // Member Information Panel
        onePanel = new JPanel();
        onePanel.setLayout(null);
        onePanel.setBounds(40, 70, 800, 280);
        onePanel.setBackground(Color.LIGHT_GRAY);

        // Member Information Labels and Fields
        rmL2 = new JLabel("Member Information");
        rmL2.setBounds(20, 10, 200, 20);
        rmL2.setFont(new Font("Arial", Font.BOLD, 15));

        rmL3 = new JLabel("ID:");
        rmL3.setBounds(20, 60, 40, 20);
        panelTf1 = new JTextField();
        panelTf1.setBounds(90, 60, 150, 20);

        rmL4 = new JLabel("Name:");
        rmL4.setBounds(20, 90, 90, 20);
        panelTf2 = new JTextField();
        panelTf2.setBounds(90, 90, 150, 20);

        rmL7 = new JLabel("Phone:");
        rmL7.setBounds(20, 120, 60, 20);
        panelTf5 = new JTextField();
        panelTf5.setBounds(90, 120, 150, 20);

        rmL8 = new JLabel("Emergency No.");
        rmL8.setBounds(280, 120, 150, 20);
        panelTf6 = new JTextField();
        panelTf6.setBounds(370, 120, 150, 20);

        rmL9 = new JLabel("Email:");
        rmL9.setBounds(20, 150, 100, 20);
        panelTf7 = new JTextField();
        panelTf7.setBounds(90, 150, 150, 20);

        rmL6=new JLabel("Trainers Name");
        rmL6.setBounds(280,150,150,20);
        trainersField=new JTextField();
        trainersField.setBounds(370,150,150,20);

        rmL10 = new JLabel("Location:");
        rmL10.setBounds(20, 180, 100, 20);
        panelTf8 = new JTextField();
        panelTf8.setBounds(90, 180, 150, 20);

        rmL11 = new JLabel("Gender:");
        rmL11.setBounds(20, 210, 200, 20);
        maleRadio = new JRadioButton("Male");
        maleRadio.setOpaque(false);
        femaleRadio = new JRadioButton("Female");
        femaleRadio.setOpaque(false);
        genderGroup = new ButtonGroup();

        maleRadio.setBounds(90, 210, 60, 15);
        femaleRadio.setBounds(170, 210, 70, 15);

        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        rmL12 = new JLabel("DOB:");
        rmL12.setBounds(20, 240, 70, 20);

        // Date of Birth Combo Boxes
        String[] day = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        comboDays = new JComboBox<>(day);
        comboDays.setBounds(90, 240, 80, 20);
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        comboMonths = new JComboBox<>(months);
        comboMonths.setBounds(180, 240, 80, 20);
        String[] years = new String[36];
        for (int i = 0; i <= 34; i++) years[i] = String.valueOf(1990 + i);
        comboYears = new JComboBox<>(years);
        comboYears.setBounds(270, 240, 80, 20);

        // Adding components to onePanel
        onePanel.add(rmL2);
        onePanel.add(rmL3);
        onePanel.add(panelTf1);
        onePanel.add(rmL4);
        onePanel.add(panelTf2);
        onePanel.add(rmL6);
        onePanel.add(trainersField);
        onePanel.add(rmL7);
        onePanel.add(panelTf5);
        onePanel.add(rmL8);
        onePanel.add(panelTf6);
        onePanel.add(rmL9);
        onePanel.add(panelTf7);
        onePanel.add(rmL10);
        onePanel.add(panelTf8);
        onePanel.add(rmL11);
        onePanel.add(maleRadio);
        onePanel.add(femaleRadio);
        onePanel.add(rmL12);
        onePanel.add(comboYears);
        onePanel.add(comboDays);
        onePanel.add(comboMonths);

        add(rmLabel);
        add(onePanel);

        // Membership Details Panel
        twoPanel = new JPanel();
        twoPanel.setLayout(null);
        twoPanel.setBounds(40, 370, 430, 170);
        twoPanel.setBackground(Color.LIGHT_GRAY);

        rml13 = new JLabel("Membership Details");
        rml13.setBounds(20, 10, 200, 20);
        rml13.setFont(new Font("Arial", Font.BOLD, 15));

        rml14 = new JLabel("Membership Start Date:");
        rml14.setBounds(20, 50, 200, 20);

        // Membership Start Date Combo Boxes
        comboDays_ = new JComboBox<>(day);
        comboDays_.setBounds(160, 50, 80, 20);
        comboMonths_ = new JComboBox<>(months);
        comboMonths_.setBounds(250, 50, 80, 20);
        comboYears_ = new JComboBox<>(years);
        comboYears_.setBounds(340, 50, 80, 20);

        rml15 = new JLabel("Membership Duration:");
        rml15.setBounds(20, 80, 200, 20);
        String[] duration = {"1 month", "3 months", "6 months", "1 year", "others"};
        combod = new JComboBox<>(duration);
        combod.setBounds(160, 80, 100, 20);

        rml16 = new JLabel("Referral Source:");
        rml16.setBounds(20, 110, 200, 20);
        String[] referral = {"Social Media", "Family/Friends", "Other"};
        combor = new JComboBox<>(referral);
        combor.setBounds(160, 110, 100, 20);

        rml17 = new JLabel("Payment Method:");
        rml17.setBounds(20, 140, 200, 20);
        cradio = new JRadioButton("Cash");
        cradio.setOpaque(false);
        ccradio = new JRadioButton("Credit");
        ccradio.setOpaque(false);
        oradio = new JRadioButton("Other");
        oradio.setOpaque(false);
        paymentGroup = new ButtonGroup();

        cradio.setBounds(160, 140, 60, 15);
        ccradio.setBounds(210, 140, 70, 15);
        oradio.setBounds(280, 140, 70, 15);
        paymentGroup.add(cradio);
        paymentGroup.add(ccradio);
        paymentGroup.add(oradio);

        add(twoPanel);
        twoPanel.add(rml13);
        twoPanel.add(rml14);
        twoPanel.add(comboYears_);
        twoPanel.add(comboDays_);
        twoPanel.add(comboMonths_);
        twoPanel.add(rml15);
        twoPanel.add(combod);
        twoPanel.add(rml16);
        twoPanel.add(rml17);
        twoPanel.add(combor);
        twoPanel.add(cradio);
        twoPanel.add(ccradio);
        twoPanel.add(oradio);

        // Plan Selection Panel
        rmP3 = new JPanel();
        rmP3.setLayout(null);
        rmP3.setBounds(480, 370, 350, 170);
        rmP3.setBackground(Color.LIGHT_GRAY);

        topay = new JLabel("To pay");
        topay.setBounds(20,20,100,20);
        topaytf = new JTextField("50000");
        topaytf.setBounds(100,20,150,20);

        plan1 = new JLabel("Paid Amount");
        plan1.setBounds(20, 50, 100, 20);
        plan1tf = new JTextField();
        plan1tf.setBounds(100,50,150,20);

        amtdue= new JLabel("Amount due");
        amtdue.setBounds(20,80,100,20);
        amtduetf= new JTextField();
        amtduetf.setBounds(100,80,150,20);

        price = new JLabel("Discount");
        price.setBounds(20, 110, 100, 20);

        priceField = new JTextField();
        priceField.setBounds(100, 110, 150, 20);

        JButton caldue = new JButton("Calculate Due");
        caldue.setBounds(170, 140, 130, 20);
        caldue.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        int id = Integer.parseInt(panelTf1.getText());
                        double paidNow = Double.parseDouble(plan1tf.getText());

                        boolean found = false;
                        for (GymMember gm : GymGUI.allMembers) {
                            if (gm instanceof PremiumMember && gm.getid() == id) {
                                PremiumMember pm = (PremiumMember) gm;
                                String result = pm.payDueAmount(paidNow);
                                double remaining = 50000 - pm.getpaidAmount();
                                if (remaining < 0) remaining = 0; // prevent negative display
                                amtduetf.setText(String.valueOf(remaining));

                                JOptionPane.showMessageDialog(null, result);
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            JOptionPane.showMessageDialog(null, "Premium Member ID not found.");
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Enter valid numeric values for ID and Amount.");
                    }
                }
            });

        JButton caldis= new JButton("discount");
        caldis.setBounds(20,140,130,20);
        caldis.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        double paidAmt = Double.parseDouble(plan1tf.getText());
                        if (paidAmt == 50000) {
                            double discount = 0.10 * paidAmt;
                            priceField.setText(String.valueOf(discount));
                            JOptionPane.showMessageDialog(null, "Full payment received. Discount applied!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Discount only available after full payment.");
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Invalid paid amount.");
                    }
                }
            });
        add(rmP3);
        rmP3.add(plan1);
        rmP3.add(price);
        rmP3.add(priceField);
        rmP3.add(topay);
        rmP3.add(amtdue);
        rmP3.add(topaytf);
        rmP3.add(amtduetf);
        rmP3.add(plan1tf);
        rmP3.add(caldis);
        rmP3.add(caldue);

        // Attendance and Loyalty Points Panel
        rmP4 = new JPanel();
        rmP4.setLayout(null);
        rmP4.setBounds(40, 560, 430, 120);
        rmP4.setBackground(Color.LIGHT_GRAY);

        attendanceLabel = new JLabel("Attendance:");
        attendanceLabel.setBounds(20, 20, 100, 20);
        markAttendanceBtn = new JButton("Mark Attendance");
        markAttendanceBtn.setBounds(160, 20, 150, 20);

        loyaltyLabel = new JLabel("Loyalty Points:");
        loyaltyLabel.setBounds(20, 60, 100, 20);
        loyaltyField = new JTextField("0");
        loyaltyField.setBounds(160, 60, 100, 20);
        loyaltyField.setEditable(false);

        markAttendanceBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        String inputId = JOptionPane.showInputDialog("Enter Member ID to mark attendance:");
                        int enteredId = Integer.parseInt(inputId);
                        boolean found = false;

                        for (GymMember member : GymGUI.allMembers) {
                            if (member.getid() == enteredId) {
                                found = true;

                                if (member.isActive()) {
                                    member.markAttendance(); 
                                    loyaltyField.setText(String.valueOf(member.getloyaltyPoints()));
                                    JOptionPane.showMessageDialog(null,
                                        " Attendance marked for sucessfully"
                                    );
                                } else {
                                    JOptionPane.showMessageDialog(null,
                                        "Cannot mark attendance as membership is not active  " ,
                                        "Inactive Member", JOptionPane.WARNING_MESSAGE);
                                }
                                break;
                            }
                        }

                        if (!found) {
                            JOptionPane.showMessageDialog(null,
                                "Member ID not found!",
                                "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null,
                            "Please enter a valid numeric ID.",
                            "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
        add(rmP4);
        rmP4.add(attendanceLabel);
        rmP4.add(loyaltyLabel);
        rmP4.add(loyaltyField);
        rmP4.add(markAttendanceBtn);

        // Deactivation Panel
        rmP5 = new JPanel();
        rmP5.setLayout(null);
        rmP5.setBounds(480, 560, 370, 120);
        rmP5.setBackground(Color.LIGHT_GRAY);

        btndec = new JButton("Deactivate");
        btndec.setBounds(20, 20, 100, 15);
        dactiveField= new JTextField();
        dactiveField.setBounds(130,20,150,15);
        btndec.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        int enteredId = Integer.parseInt(dactiveField.getText());
                        boolean found = false;

                        for (GymMember member : GymGUI.allMembers) {
                            if (member.getid() == enteredId) {
                                if (member.isActive()) {
                                    member.deactivatemembership();
                                    JOptionPane.showMessageDialog(null, "Membership Deactivated " );
                                } else {
                                    JOptionPane.showMessageDialog(null, "Membership is already inactive f" );
                                }
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            JOptionPane.showMessageDialog(null, "Member ID not found!", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid numeric ID.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
        //reason for cancellation section
        rml19 = new JLabel("Reasons for cancellation");
        rml19.setBounds(20, 40, 150, 20);
        radio1 = new JRadioButton("Relocation");
        radio1.setOpaque(false);
        radio2 = new JRadioButton("Health Issues");
        radio2.setOpaque(false);
        radio3 = new JRadioButton("Temp. Break");
        radio3.setOpaque(false);
        radio4 = new JRadioButton("Lack of Time");
        radio4.setOpaque(false);
        radio5 = new JRadioButton("Other");
        radio5.setOpaque(false);
        cancelGroup = new ButtonGroup();

        radio1.setBounds(100, 60, 110, 15);
        radio2.setBounds(220, 60, 110, 15);
        radio3.setBounds(100, 80, 110, 15);
        radio4.setBounds(220, 80, 110, 15);
        radio5.setBounds(180, 100, 70, 15);

        cancelGroup.add(radio1);
        cancelGroup.add(radio2);
        cancelGroup.add(radio3);
        cancelGroup.add(radio4);
        cancelGroup.add(radio5);

        add(rmP5);

        rmP5.add(btndec);
        rmP5.add(dactiveField);
        rmP5.add(rml19);
        rmP5.add(radio1);
        rmP5.add(radio2);
        rmP5.add(radio3);
        rmP5.add(radio4);
        rmP5.add(radio5);
        //added add button here
        btnAdd = new JButton("Add");
        btnAdd.setBounds(40, 700, 70, 15);
        btnAdd.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        // Mandatory field validation
                        if (panelTf1.getText().isEmpty() || panelTf2.getText().isEmpty() || panelTf5.getText().isEmpty() ||
                        panelTf6.getText().isEmpty() || panelTf7.getText().isEmpty() || panelTf8.getText().isEmpty() ||
                        trainersField.getText().isEmpty() ||
                        (!maleRadio.isSelected() && !femaleRadio.isSelected()) ||
                        (!cradio.isSelected() && !ccradio.isSelected() && !oradio.isSelected())) {

                            JOptionPane.showMessageDialog(null, "Please fill in all fields and make required selections.", "Incomplete Form", JOptionPane.WARNING_MESSAGE);
                            return;
                        }

                        int id = Integer.parseInt(panelTf1.getText());
                        String name = panelTf2.getText();
                        String phone = panelTf5.getText();
                        String email = panelTf7.getText();
                        String location = panelTf8.getText();
                        String gender = maleRadio.isSelected() ? "Male" : "Female";
                        String trainer = trainersField.getText();

                        String dob = comboDays.getSelectedItem() + " " + comboMonths.getSelectedItem() + " " + comboYears.getSelectedItem();
                        String startDate = comboDays_.getSelectedItem() + " " + comboMonths_.getSelectedItem() + " " + comboYears_.getSelectedItem();
                        String referral = combor.getSelectedItem().toString();

                        // Check for duplicate ID
                        for (GymMember m : GymGUI.allMembers) {
                            if (m.getid() == id) {
                                JOptionPane.showMessageDialog(null, "Duplicate ID not allowed!", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }

                        PremiumMember rm = new PremiumMember(id, name, location, phone, email, gender, dob, startDate, trainer);
                        GymGUI.allMembers.add(rm);

                        JOptionPane.showMessageDialog(null, "Premium Member added successfully!");

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please enter valid numeric values for ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Unexpected Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
        add(btnAdd);

        //added button to activate the membership
        btnAct=new JButton("Activate membership ");
        btnAct.setBounds(130,700,170,15);
        actField= new JTextField();
        actField.setBounds(310,700,120,15);
        btnAct.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        int enteredId = Integer.parseInt(actField.getText());
                        boolean found = false;

                        for (GymMember member : GymGUI.allMembers) {
                            if (member.getid() == enteredId) {
                                member.activemembership();
                                JOptionPane.showMessageDialog(null, "Membership Activated for ID: " + enteredId);
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            JOptionPane.showMessageDialog(null, "Member ID not found!", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid numeric ID.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
        //added revert button here to remove the member
        rBtn= new JButton("Revert");
        rBtn.setBounds(450,700,150,15);
        rTf= new JTextField();
        rTf.setBounds(610,700,150,15);
        rBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        int enteredId = Integer.parseInt(rTf.getText());
                        boolean removed = false;

                        for (int i = 0; i < GymGUI.allMembers.size(); i++) {
                            GymMember member = GymGUI.allMembers.get(i);
                            if (member instanceof PremiumMember && member.getid() == enteredId) {
                                GymGUI.allMembers.remove(i);
                                JOptionPane.showMessageDialog(null, "Member has been reverted.");
                                removed = true;
                                break;
                            }
                        }

                        if (!removed) {
                            JOptionPane.showMessageDialog(null, "Premium Member ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Enter a valid numeric Member ID.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                    }
                }
            });
        //addded button to display the info filled
        btnDis = new JButton("Display");
        btnDis.setBounds(450, 720, 150, 15);
        btnDis.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JFrame displayFrame = new JFrame("Premium Members List");
                    displayFrame.setSize(900, 500);
                    displayFrame.setLayout(null);

                    JTextArea displayArea = new JTextArea();
                    displayArea.setEditable(false);

                    String allText = "";
                    for (GymMember p : GymGUI.allMembers) {
                        if (p instanceof PremiumMember) {
                            allText += p.toString() + "\n--------------------------\n";
                        }
                    }

                    displayArea.setText(allText);

                    JScrollPane scrollPane = new JScrollPane(displayArea);
                    scrollPane.setBounds(20, 20, 840, 400);
                    displayFrame.add(scrollPane);

                    displayFrame.setVisible(true);
                }
            });
        JButton backBtn = new JButton("Back to Main Menu");
        backBtn.setBounds(440, 740, 160, 15); 
        backBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    dispose(); // Close current page
                    new GymGUI("Main"); // Open main menu
                }
            });
        add(backBtn);

        JButton btnSave = new JButton("Save to File");
        btnSave.setBounds(610, 740, 150, 15);
        btnSave.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        FileWriter fw = new FileWriter("AllMembers.txt", true); // true means append
                        PrintWriter writer = new PrintWriter(fw);

                        for (GymMember member : GymGUI.allMembers) {
                            if (member instanceof PremiumMember) {
                                PremiumMember pm = (PremiumMember) member;
                                writer.println("TYPE: Premium");
                                writer.println("ID: " + pm.getid());
                                writer.println("Name: " + pm.getname());
                                writer.println("Location: " + pm.getlocation());
                                writer.println("Phone: " + pm.getphone());
                                writer.println("Email: " + pm.getemail());
                                writer.println("Start Date: " + pm.getmembershipStartDate());
                                writer.println("Trainer: " + pm.getpersonalTrainer());
                                writer.println("Paid Amount: " + pm.getpaidAmount());
                                writer.println("Discount: " + pm.getdiscountAmount());
                                writer.println("Loyalty Points: " + pm.getloyaltyPoints());
                                writer.println("Full Payment: " + pm.getisFullPayment());
                                writer.println("Active: " + pm.isActive());
                                writer.println();
                            }
                        }

                        writer.close();
                        JOptionPane.showMessageDialog(null, "Saved Premium Members to file!");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
                    }
                }
            });
        add(btnSave);

        JButton btnRead = new JButton("Read from File");
        btnRead.setBounds(770, 740, 150, 15);
        btnRead.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader("AllMembers.txt"));
                        JFrame fileFrame = new JFrame("Premium Members From File");
                        fileFrame.setSize(900, 500);
                        fileFrame.setLayout(null);

                        JTextArea displayArea = new JTextArea();
                        displayArea.setEditable(false);
                        JScrollPane scrollPane = new JScrollPane(displayArea);
                        scrollPane.setBounds(20, 20, 840, 400);

                        String fullText = "", line;
                        while ((line = reader.readLine()) != null) {
                            if (line.startsWith("TYPE: Premium") || !line.startsWith("TYPE:")) {
                                fullText += line + "\n";
                            }
                        }
                        reader.close();
                        displayArea.setText(fullText);
                        fileFrame.add(scrollPane);

                        JButton backBtn = new JButton("Back to Main Menu");
                        backBtn.setBounds(350, 440, 180, 30);
                        backBtn.addActionListener(ev -> {
                                    fileFrame.dispose();
                                    new GymGUI("Main");
                            });

                        fileFrame.add(backBtn);
                        fileFrame.setVisible(true);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Error reading file: " + ex.getMessage());
                    }
                }
            });
        add(btnRead);

        //added clear button to clear all the filled textfields
        cBtn= new JButton("Clear");
        cBtn.setBounds(620,720,100,15);
        cBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Clear text fields
                    panelTf1.setText("");
                    panelTf2.setText("");
                    panelTf5.setText("");
                    panelTf6.setText("");
                    panelTf7.setText("");
                    panelTf8.setText("");
                    loyaltyField.setText("0");

                    priceField.setText("6500"); // default price
                    // Uncheck gender radio buttons
                    genderGroup.clearSelection();
                    // Uncheck payment method radio buttons
                    paymentGroup.clearSelection();
                    // Uncheck cancellation reasons
                    cancelGroup.clearSelection();
                    // Reset combo boxes to first item
                    comboDays.setSelectedIndex(0);
                    comboMonths.setSelectedIndex(0);
                    comboYears.setSelectedIndex(0);

                    comboDays_.setSelectedIndex(0);
                    comboMonths_.setSelectedIndex(0);
                    comboYears_.setSelectedIndex(0);

                    combod.setSelectedIndex(0);  // duration
                    combor.setSelectedIndex(0);  // referral

                    JOptionPane.showMessageDialog(null, "Form cleared successfully!");
                }
            });

        add(btnAdd);
        add(btnAct);
        add(btnAct);
        add(actField);
        add(rBtn);
        add(rTf);
        add(btnDis);
        add(cBtn);

        setLayout(null);
        setVisible(true);
        setSize(900,800);
    }
}

