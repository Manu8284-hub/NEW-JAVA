class Employee {
    int id;
    String name;
    double baseSalary;

    Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary;
    }

    static class FullTime extends Employee {
        double bonus;

        FullTime(int id, String name, double baseSalary, double bonus) {
            super(id, name, baseSalary);
            this.bonus = bonus;
        }

        @Override
        double calculateSalary() {
            return baseSalary + bonus;
        }
    }

    static class PartTimeEmployee extends Employee {
        int noOfHours;
        int costPerHour;

        PartTimeEmployee(int id, String name, int noOfHours, int costPerHour) {
            super(id, name, 0);
            this.noOfHours = noOfHours;
            this.costPerHour = costPerHour;
        }

        @Override
        double calculateSalary() {
            return noOfHours * costPerHour;
        }
    }
}

public class cu {
    public static void main(String[] args) {
        Employee.FullTime ft = new Employee.FullTime(1, "John", 50000, 10000);
        System.out.println("Full-time employee salary: " + ft.calculateSalary());

        Employee.PartTimeEmployee pt = new Employee.PartTimeEmployee(2, "Doe", 20, 200);
        System.out.println("Part-time employee salary: " + pt.calculateSalary());
    }
}