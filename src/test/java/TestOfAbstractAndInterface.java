import com.start.learn.practicewithinterfacesandabstractclass.Creature;
import com.start.learn.practicewithinterfacesandabstractclass.Human;

import java.util.Arrays;

public class TestOfAbstractAndInterface {
    public static void main(String[] args) {

        Creature creature1 = new Human("cat", 5, 3, 2000, 12, 28);
        creature1.creatureFly();
        creature1.creatureRun();
        creature1.toString();

        Human[] man = new Human[3];
        man[0] = new Human("human_1", 90, 2, 2001, 12, 25);
        man[1] = new Human("human_2", 80, 1.5, 2003, 11, 30);
        man[2] = new Human("human_3", 91, 1.8, 2012, 10, 15);

        Arrays.sort(man);

        for (Human object : man) {
            object.swim();//default from interface
            object.speak();//Override from Human
            object.creatureRun();//Override from Creature
            object.creatureFly();
            System.out.println(object.toString());
        }
    }
}
