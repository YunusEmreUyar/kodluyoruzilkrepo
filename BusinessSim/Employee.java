public class Employee {
    String name;
    int salary, workHours, hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if(this.salary<=1000) {
            return 0;
        } else {
            return this.salary*0.03;
        }
    }
    public int bonus() {
        // this.salary += 30*workHours*4;
        return 30*workHours*4;
    }
    public double raiseSalary() {
        if((2021-hireYear)<10) {
            return this.salary*0.05;
        } else if ((2021-hireYear)>=10 && (2021-hireYear) < 20) {
            return this.salary*0.1;
        } else {
            return this.salary*0.15;
        }
    }
    public String toString() {
        String val =  "Name: " + this.name + "\n";
        val += "Base salary: " + this.salary+ "\n";
        val += "Work hours per week: " + this.workHours+ "\n";
        val += "Hire date: " + this.hireYear+ "\n";
        val += "Tax: " + tax()+ "\n";
        val += "Bonus: " + bonus()+ "\n";
        val += "Salary increase: " + raiseSalary()+ "\n";
        val += "Salary (included tax and bonus): " + (this.salary+bonus()+tax())+ "\n";
        val += "Total salary: " + (this.salary + bonus())+ "\n";
        return val;
    }


}