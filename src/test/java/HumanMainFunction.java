import com.start.learn.human.Human;

import static com.start.learn.human.Human.printHumanInfo;

public class HumanMainFunction {

    public static void main(String[] args) {
        Human humanPersonOne = new Human("Petryk", "Pyatochky", 1990, 11, 25);
        printHumanInfo(humanPersonOne);
        humanPersonOne.setNewNameAndSurname(humanPersonOne);
        printHumanInfo(humanPersonOne);

        Human humanPersonTwo = new Human(1990, 11, 25);
        printHumanInfo(humanPersonTwo);

        Human humanPersonThree = new Human("Coza", "Nostra", 1990, 11, 25);
        printHumanInfo(humanPersonThree);
        humanPersonThree.setNewNameAndSurname(humanPersonThree);
        printHumanInfo(humanPersonThree);

        Human humanPersonFour = new Human(1990, 11, 25);
        printHumanInfo(humanPersonFour);
    }
}
