

// Create a class to store the details of a project
public class Project {
    // Create attributes for your class
    public int projectNumber;
    public String projectName;
    public String buildingType;
    public String physicalAddress;
    public int erfNumber;
    public double totalFee;
    public double amountPaid;
    public String deadline;
    public Persons architect;
    public Persons contractor;
    public Persons customer;

    // Create a constructor for your class
    public Project(int projectNumber, String projectName, String buildingType, String physicalAddress, int erfNumber,
                   double totalFee, double amountPaid, String deadline, Persons architect, Persons contractor, Persons customer){
        this.projectNumber = projectNumber;
        this.projectName = projectName;
        this.buildingType = buildingType;
        this.physicalAddress = physicalAddress;
        this.erfNumber = erfNumber;
        this.totalFee = totalFee;
        this.amountPaid = amountPaid;
        this.deadline = deadline;
        this.architect = architect;
        this.contractor = contractor;
        this.customer = customer;
    }

    // Create a method to display your project
    public String toString() {
        String output = "Project number: " + projectNumber;
        output += "\nProject name: " + projectName;
        output += "\nBuilding type:" + buildingType;
        output += "\nPhysical Address:" + physicalAddress;
        output += "\nERF number:" + erfNumber;
        output += "\nTotal fee: R" + totalFee;
        output += "\nAmount paid to date: R" + amountPaid;
        output += "\nDeadline date:" + deadline;
        output += "\nArchitect details:" + architect;
        output += "\nContractor details:" + contractor;
        output += "\nCustomer details:" + customer;

        // Return the output for your ToString method
        return output;}


    // Create your setters and getters
    public void setAmountPaid(double amountPaid) {
        this.amountPaid += amountPaid;
    }
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
    public Persons getContractor() {
        return contractor;
    }
    public Persons getCustomer(){ return customer; }
}

