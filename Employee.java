import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    int eSalary;

   
    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        eNo = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Name: ");
        eName = sc.nextLine();
        System.out.print("Enter monthly salary: ");
        eSalary = Integer.parseInt(sc.nextLine());
    }

   
    public void display() {
        System.out.println("ID: " + eNo);
        System.out.println("Name: " + eName);
        System.out.println("Salary: " + eSalary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;  // Number of employees
        Employee[] emp = new Employee[n];

        // Read employee data
        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();
            emp[i].read();
        }

       
        while (true) {
            System.out.println("Search by Employee ID or type 'exit' to stop.");
            System.out.print("Enter ID: ");
            String input = sc.nextLine();

            
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            int No = Integer.parseInt(input);
            boolean found = false;

           
            for (int i = 0; i < n; i++) {
                if (emp[i].eNo == No) {
                    emp[i].display();
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Employee with ID " + No + " not found.");
            }
        }

        sc.close();  
    }
}
