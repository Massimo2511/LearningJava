import com.start.learn.employeeinheritancehuman.Employee;

public class EmployeeExtendsHumanMainTest {

        public static  void main(String[] args) {
            Employee stuff1 = new Employee("Igor","Petros",
                    1990,12,25,
                    "DIRECTOR",10000,
                    12,0,
                    2010,12,19,
                    2020,1,1);
            stuff1.defineSalaryDay();
            System.out.println();
            System.out.println("Salary before review:"+stuff1.getSalary());
            stuff1.salaryReview();
            System.out.println("Salary after review: "+stuff1.getSalary());
            System.out.println("Info about Stuff1: "+stuff1);
            System.out.println("========================================");
            Employee stuff2 = new Employee("Ruslana","Bylo",
                    2020,12,15,
                    "HR",5000,
                    1,0,
                    2020,1,1,
                    2022,7,15);
            stuff2.defineSalaryDay();
            System.out.println();
            System.out.println("Salary before review:"+stuff2.getSalary());
            stuff2.salaryReview();
            System.out.println("Salary after review: "+stuff2.getSalary());
            System.out.println("Info about Stuff1: "+stuff2);
            System.out.println("========================================");
            Employee stuff3 = new Employee("Albert","Porto",
                    2020,12,15,
                    "ENGINEER",6000,
                    3.1,0,
                    2019,12,19,
                    2022,7,15);
            stuff3.defineSalaryDay();
            System.out.println();
            System.out.println("Salary before review:"+stuff3.getSalary());
            stuff3.salaryReview();
            System.out.println("Salary after review: "+stuff3.getSalary());
            System.out.println("Info about Stuff1: "+stuff3);
        }
    }


