import com.start.learn.human.Human;

import static com.start.learn.human.Human.printPersonInfo;

public class HumanMainFunction {

    public static void main(String[] args) {
        Human humanPersonOne = new Human("Petryk", "Pyatochky", 1990, 11, 25);
        String personInfo= Human.toString(humanPersonOne);
        System.out.println("Info about Person1 before name change");
        printPersonInfo(personInfo);
        humanPersonOne.setNewName("Vladislav");
        personInfo=Human.toString(humanPersonOne);
        System.out.println("Info about Person1 after name change");
        printPersonInfo(personInfo);

        Human humanPersonTwo = new Human(1990, 11, 25);
        personInfo=Human.toString(humanPersonTwo);
        printPersonInfo(personInfo);

        Human humanPersonThree = new Human("Pepi", "Longstock", 1990, 11, 25);
        personInfo= Human.toString(humanPersonThree);
        System.out.println("Info about Person2 before surname change");
        printPersonInfo(personInfo);
        humanPersonThree.setNewSurname("Bigstock");
        personInfo=Human.toString(humanPersonThree);
        System.out.println("Info about Person2 after surname change");
        printPersonInfo(personInfo);

        Human humanPersonFour = new Human(1992, 12, 28);
        personInfo=Human.toString(humanPersonFour);
        printPersonInfo(personInfo);
    }
}
