//: Design and develop inheritance for a given case study, identify objects and relationships
//        and implement inheritance wherever applicable. Employee class with Emp_name, Emp_id, Address, Mail_id,
//        and Mobile_no as members. Inherit the classes, Programmer, Team Lead, Assistant Project Manager and
//        Project Manager from employee class. Add Basic Pay (BP) as the member of all the inherited classes with
//        97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff club fund. Generate pay slips
//        for the employees with their gross and net salary.

import java.util.Scanner;

class Employee {
    public double DA, BP, HRA, PF, SCF, GS, NET;
    private String emp_Name;
    private String emp_id;
    private String address;
    private String mail;
    private int mob_no;
    private String role;

    Scanner sc = new Scanner(System.in);

    public void get_input() {
        System.out.println("Enter the Name: ");
        emp_Name = sc.next();
        System.out.println("Enter the Emp Id: ");
        emp_id = sc.next();
        System.out.println("Enter the Address: ");
        address = sc.next();
        System.out.println("Enter the Mail: ");
        mail = sc.next();
        System.out.println("Enter the MobNo: ");
        mob_no = sc.nextInt();
    }

    public void display() {
        System.out.println("Name: " + emp_Name);
        System.out.println("Emp id: " + emp_id);
        System.out.println("Adddress: " + address);
        System.out.println("Mail: " + mail);
        System.out.println("MobNo: " + mob_no);
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void calculate(double BP) {
        DA = 0.97 * BP;
        HRA = 0.10 * BP;
        PF = 0.12 * BP;
        SCF = 0.1 * BP;
        DA = 0.97 * BP;
    }

    public void grossSalary() {
        GS = DA + SCF + PF + HRA + BP;
        System.out.println("Gross Salary:" + GS);
    }

    public void netSalary() {
        NET = GS - SCF - PF;
        System.out.println("NET Salary:" + NET);
    }

    public void displaySalaryInfo() {
        System.out.println("_Salary Info_");
        System.out.println("BP=" + BP);
        System.out.println("DA=" + DA);
        System.out.println("HRA=" + HRA);
        System.out.println("PF=" + PF);
        System.out.println("SCF=" + SCF);

    }

}

/**
 * Programmer
 */
class programmer extends Employee {
    public void getData() {
        super.get_input();
        System.out.println("Enter the basic pay:");
        BP = sc.nextInt();
        super.display();
        super.calculate(BP);
    }

    public void client_Data() {

        super.displaySalaryInfo();
        super.netSalary();
        super.grossSalary();
    }

}

class TeamLead extends Employee {
    public void getData() {
        super.get_input();
        System.out.println("Enter the basic pay:");
        BP = sc.nextInt();
        super.display();
        super.calculate(BP);
    }

    public void client_Data() {

        super.displaySalaryInfo();
        super.netSalary();
        super.grossSalary();
    }

}

class Asst_pro_mng extends Employee {
    public void getData() {
        super.get_input();
        System.out.println("Enter the basic pay:");
        BP = sc.nextInt();
        super.display();
        super.calculate(BP);
    }

    public void client_Data() {

        super.displaySalaryInfo();
        super.netSalary();
        super.grossSalary();
    }

}

class ProjectMan extends Employee {
    public void getData() {
        super.get_input();
        System.out.println("Enter the basic pay:");
        BP = sc.nextInt();
        super.display();
        super.calculate(BP);
    }

    public void client_Data() {

        super.displaySalaryInfo();
        super.netSalary();
        super.grossSalary();
    }

}

class Inheritance_3 {
    public static void main(String[] args) {

        while (true) {
            System.out.println(
                    "\n----Menu-----\n1.Programmer\n2.TeamLead\n3.AssProMan\n4.ProjectMan\n5.Exit\nEnter the choice:");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    programmer p = new programmer();
                    p.getData();
                    p.setRole("Programmer");
                    System.out.println(p.getRole());
                    p.client_Data();
                    break;
                case 2:
                    TeamLead t = new TeamLead();
                    t.getData();
                    t.setRole("Team lead");
                    System.out.println(t.getRole());
                    t.client_Data();
                    break;
                case 3:
                    ProjectMan pm = new ProjectMan();
                    pm.getData();
                    pm.setRole("Project Man");
                    System.out.println(pm.getRole());
                    pm.client_Data();
                    break;
                case 4:
                    break;

                default:
                System.out.println("invalid Input..");
                    break;
            }

        }
    }
}
