import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        Dogs dog1 = new Dogs();
        dog1.setName("К9");
        dog1.setAge(9);
        dog1.setWeight(29);
        dog1.setHeight(60);

        dog1.voice();
        System.out.println(dog1);
        ArrayList<Dogs> dogsList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Random ron = new Random();
            int r = ron.nextInt(101);
            Dogs tempDog = new Dogs();
            tempDog.setName("ПЁС" + i);
            dogsList.add(i, tempDog);
        }
        for (Dogs x: dogsList) {
            System.out.println(x);
        }
        System.out.println("Создание экземпляров объектов закончено!");

    }
}