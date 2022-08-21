import com.start.learn.human.Human;


public class HumanMainFunction {

    public static void main(String[] args) {
        // TESTING DATA
        //Person1 with name and surname
        Human humanPersonOne = new Human("Petryk", "Pyatochky", 1990, 11, 25);
        System.out.println("Info about Person1 before name change");
        System.out.println(humanPersonOne);
        humanPersonOne.setNewName("Vladislav");
        System.out.println("Info about Person1 after name change");
        System.out.println(humanPersonOne + "\n");

        //Person2 without name and surname
        Human humanPersonTwo = new Human(1990, 11, 25);
        System.out.println(humanPersonTwo+ "\n");

        //Person3  with name and surname
        Human humanPersonThree = new Human("Pepi", "Longstock", 1990, 11, 25);
        System.out.println("Info about Person3 before surname change");
        System.out.println(humanPersonThree);
        humanPersonThree.setNewSurname("Bigstock");
        System.out.println("Info about Person3 after surname change");
        System.out.println(humanPersonThree);

        //Person2 without name and surname
        Human humanPersonFour = new Human(1992, 12, 28);
        System.out.println(humanPersonFour);
    }
}
