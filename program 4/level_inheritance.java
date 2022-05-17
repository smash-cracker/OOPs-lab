import java.util.Scanner;

class Person {
    String name, gender, address;
    int age;
    Person(String name, String gender,String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

class Employee extends Person {
    String empid, company_name, qualification;
    int salary;
    Employee(String name, String gender,String address, String empid, String company_name, String qualification, int salary, int age) {
        super(name, gender, address, age);
        this.empid = empid;
        this.company_name = company_name;
        this.qualification = qualification;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    String subject, department, teacherid;
    Teacher(String name, String gender,String address, String empid, String company_name, String qualification, String subject, String department, String teacherid, int salary, int age) {
        super(name, gender, address, empid, company_name, qualification, salary, age);
        this.subject = subject;
        this.department = department;
        this.teacherid = teacherid;
    }
    void display() {
        System.out.println(name);
        System.out.println(gender);
        System.out.println(address);
        System.out.println(empid);
        System.out.println(company_name);
        System.out.println(qualification);
        System.out.println(subject);
        System.out.println(salary);
    }
}

class level_inheritance {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter number of objects: ");  
        int N = sc.nextInt(); 
        Teacher[] obj = new Teacher[N];
        for(int i=0; i<N; i++) {
            System.out.print("Enter name: ");  
            String name = sc.nextLine();
            System.out.print("Enter gender: ");  
            String gender = sc.nextLine();
            System.out.print("Enter address: ");  
            String address = sc.nextLine();
            System.out.print("Enter empid: ");  
            String empid = sc.nextLine();
            System.out.print("Enter company name: ");  
            String company_name = sc.nextLine();
            System.out.print("Enter qualification: ");  
            String qualification = sc.nextLine();
            System.out.print("Enter company name: ");  
            String company_name = sc.nextLine();
            System.out.print("Enter company name: ");  
            String company_name = sc.nextLine();
            obj[0] = new Teacher(name, gender, address, empid, company_name, "qualification", "subject", "department", "teacherid", 123, 456);
        }
        obj[0].display();

    }
}
