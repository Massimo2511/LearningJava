import com.start.learn.employeeinheritancehuman.Employee;
import com.start.learn.employeeinheritancehuman.Human;
import com.start.learn.employeeinheritancehuman.Occupation;

import static com.start.learn.employeeinheritancehuman.Occupation.*;

public class EmployeeExtendsHumanMainTest {

    public static void main(String[] args) {
        //Test1 Employee
        long daysUntilSalary = 0;
        Employee stuff1 = new Employee("Igor", "Petros",
                1990, 12, 25,
                Occupation.fromString("business analyst"), 10000, 2021,
                8, 21);
        daysUntilSalary = stuff1.getDaysUntilSalaryInCurrentMonth();
        System.out.println(" INFO ABOUT STUFF №1");
        System.out.println("INFO BEFORE SALARY REVIEW>>> : " + stuff1 + "\n");
        System.out.println("DAYS UNTIL SALARY: " + daysUntilSalary + "\n");
        stuff1.salaryReview();
        System.out.println("INFO AFTER SALARY REVIEW>>>" + stuff1 + "\n");
        System.out.println("========================================");

        //Test1.2 Employee
        Employee stuff2 = new Employee("Ruslana", "Bylo",
                2020, 12, 15,
                DEVELOPER, 5000, 2018,
                5, 1);
        System.out.println(" INFO ABOUT STUFF №2 ");
        System.out.println("INFO BEFORE SALARY REVIEW>>> : " + stuff2 + "\n");
        System.out.println("DAYS UNTIL SALARY: " + stuff2.getDaysUntilSalaryInCurrentMonth() + "\n");
        stuff2.salaryReview();
        System.out.println("INFO AFTER SALARY REVIEW>>>" + stuff2 + "\n");
        System.out.println("========================================");


        //Test2 Human
        Human person1 = new Human("Patrik", "Honsales", 1990, 12, 25);
        System.out.println("INFO ABOUT HUMAN_PERSON  : \n" + person1);
        System.out.println("========================================");

        //Test2.1 Human
        Human person2 = new Human( 1990, 12, 25);
        System.out.println("INFO ABOUT HUMAN_PERSON  : \n" + person2);
        System.out.println("========================================");
    }
}


