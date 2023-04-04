import java.util.InputMismatchException;
import java.util.Scanner;

// Create a class called poised
public class Poised {

    public static void main(String[] args) {

        Project newProject = newProject();

        // Create attributes for your class
        int menuChoice;

        while (true) {
            try {
                // Display this menu to the user
                Scanner sc = new Scanner(System.in);
                System.out.println("1: Create a new project: ");
                System.out.println("2: Change due date of a project: ");
                System.out.println("3: Change the total amount of the fee paid to date: ");
                System.out.println("4: Update a contractor’s contact details: ");
                System.out.println("5: Finalise a project: ");
                System.out.println("6: Quit: ");

                // Ask the user to make a choice
                System.out.print("Make your choice: ");
                menuChoice = Integer.parseInt(sc.nextLine());

                // Execute the following functions according to the user input
                if (menuChoice == 1) {
                    // Call the function to create a new project
                    newProject = newProject();

                } else if (menuChoice == 2) {
                    try {
                        // Call the functions to update the new deadline with the user's input
                        Scanner newD = new Scanner(System.in);
                        System.out.println("Enter a new deadline date: ");
                        String newDeadline = newD.nextLine();
                        newProject.setDeadline(newDeadline);
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                    }
                } else if (menuChoice == 3) {
                    while (true) {
                        try {
                            // Call the functions to update the amount paid with the user's input
                            Scanner newTotal = new Scanner(System.in);
                            System.out.println("Enter the amount paid: ");
                            double updatedTotal = Double.parseDouble(newTotal.nextLine());
                            newProject.setAmountPaid(updatedTotal);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input");
                        }
                    }


                } else if (menuChoice == 4) {
                    // Call the functions to update the contractor's contact details according to the user's input
                    Scanner newTelephoneNumber = new Scanner(System.in);
                    System.out.println("Enter the new telephone for the contractor: ");
                    int updatedTelephoneNumber = newTelephoneNumber.nextInt();
                    newProject.getContractor().setTelephoneNumber(updatedTelephoneNumber);

                    Scanner newEmailAddress = new Scanner(System.in);
                    System.out.println("Enter the new email address for the contractor: ");
                    String updatedEmailAddress = newEmailAddress.nextLine();
                    newProject.getContractor().setEmailAddress(updatedEmailAddress);
                    // user to finalise a project.will print out error message if the
                } else if (menuChoice == 5) {
                    try {

                        Persons customerDetails = newProject.getCustomer();
                        double amountStillToPay;
                        if (newProject.amountPaid != 0) {
                            amountStillToPay = newProject.totalFee - newProject.amountPaid;
                            System.out.println(customerDetails + "\n" + amountStillToPay);
                        } else {
                            System.out.println("This project has been finalised");
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                    }
                } else if (menuChoice == 6) {
                    // Exit the program when the user chooses exit on the menu
                    System.out.println("Goodbye!!!");
                    System.exit(0);
                } else {
                    // Print out an error message if the user enters an invalid choice
                    System.out.println("Invalid choice");
                }

            } catch (InputMismatchException exception) {
                System.out.println("Integers only, please.");
            }
        }
    }

    // Create a function to capture details to create a new project
    public static Project newProject() {
        Scanner details = new Scanner(System.in);

        // Ask the user to enter the project number
        System.out.println("Enter the project number: ");
        int newProjectNumber = Integer.parseInt(details.nextLine());

        // Ask the user to enter the name for the project
        System.out.println("Enter the name for the project: ");
        String newProjectName = details.nextLine();

        // Ask the user to enter the building type
        System.out.println("Enter the building type(House/Apartment/Store): ");
        String newBuildingType = details.nextLine();

        // Ask the user to enter the physical address of the project
        System.out.println("Enter the physical address of the project: ");
        String newPhysicalAddress = details.nextLine();

        int newErfNumber;
        while (true) {
            try {
                // Ask the user to enter the ERF number for the project
                System.out.println("Enter the ERF number for the project: ");
                newErfNumber = Integer.parseInt(details.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Numbers only please");
            }
        }

        double newTotalFee;
        while (true) {
            try {
                // Ask the user to enter the total fee for the project
                System.out.println("Enter the total fee for the project: ");
                newTotalFee = Double.parseDouble(details.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("You have entered an incorrect type");
            }
        }
        double newAmountPaid = 0;
        while (true) {
            try {
                // Ask the user to enter the amount paid to date
                System.out.println("Enter the amount paid to date for the project: ");
                newTotalFee = Double.parseDouble(details.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("You have entered an incorrect type");
            }
        }
        // Ask the user to enter the deadline for the project
        System.out.println("Enter the deadline for the project: ");
        String newDeadline = details.nextLine();

        // Ask the user enter the architect's details
        System.out.println("Enter the architect details: ");
        Persons architect = newPersons();

        // Ask the user to enter the contractor's details
        System.out.println("Enter the contractor details: ");
        Persons contractor = newPersons();

        // Ask the user to enter the customer's details
        System.out.println("Enter the customer details: ");
        Persons customer = newPersons();
        // If the user doesn't enter a name for the project then user the customer's surname as the project's name
        if (newProjectName.equals("")) {
            newProjectName = customer.getSurname();
        }

        // Return the new created project
        return new Project(newProjectNumber, newProjectName, newBuildingType, newPhysicalAddress, newErfNumber,
                newTotalFee, newAmountPaid, newDeadline, architect, contractor, customer);
    }


    // Create a function to capture the person's details
    public static Persons newPersons() {
        Scanner personsDetails = new Scanner(System.in);

        // Ask the user to enter the person's name
        System.out.println("Enter the person's name: ");
        String newPersonName = personsDetails.nextLine();

        // Ask the user to enter the person's surname
        System.out.println("Enter the person's surname: ");
        String newPersonSurname = personsDetails.nextLine();

        // Ask the user to enter the person's telephone number
        System.out.println("Enter the telephone number: ");
        int newTelephoneNumber = Integer.parseInt(personsDetails.nextLine());

        // Ask the user to enter the person's email address
        System.out.println("Enter the email address: ");
        String newPersonEmailAddress = personsDetails.nextLine();

        // Ask the user to enter the person's physical address
        System.out.println("Enter the physical address of the person: ");
        String newPersonPhysicalAddress = personsDetails.nextLine();

        // Return the new created person's details
        return new Persons(newPersonName, newPersonSurname, newTelephoneNumber, newPersonEmailAddress, newPersonPhysicalAddress);
    }
}

