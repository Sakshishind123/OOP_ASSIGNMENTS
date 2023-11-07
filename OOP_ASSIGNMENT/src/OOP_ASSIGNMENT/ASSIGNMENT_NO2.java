package OOP_ASSIGNMENT;

public class ASSIGNMENT_NO2 {


    String name;
    long ID;
    String DOB;
    String bloodGroup;
    String testResult;
    String address;
    long mobileNumber;
    long aadharNumber;

    public PatientDetails() {
        name = "Sakshi Shinde";
        ID = 123456789;
        DOB = "01/01/1990";
        bloodGroup = "O+";
        testResult = "positive";
        address = "xyz";
    }

    public PatientDetails(String patientName, long patientID, String dob, String bg, String tr, String patientAddress, long mobile, long aadhar) {
        name = patientName;
        ID = patientID;
        DOB = dob;
        bloodGroup = bg;
        testResult = tr;
        address = patientAddress;
        mobileNumber = mobile;
        aadharNumber = aadhar;
    }

    public void display() {
        System.out.println("Patient Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Date of Birth: " + DOB);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Test Result: " + testResult);
        System.out.println("Address: " + address);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Aadhar Number: " + aadharNumber);
    }

    public static void main(String[] args) {
        System.out.println("Below are the details of the patient");
        PatientDetails x = new PatientDetails(); // Using default values
        PatientDetails y = new PatientDetails("abc", 987654321, "05/02/1985", "O+", "negative", "456 Elm Street, Town", 9876543210, 1234567890);
        
        System.out.println("Constructor without overloading");
        x.display();
        System.out.println("Constructor with overloading");
        y.display();
    }
}

}
