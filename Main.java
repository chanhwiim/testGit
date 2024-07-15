public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        AnimalSound animalSound = new AnimalSound();

        System.out.println(zoo.lionSound());
        System.out.printf(animalSound.getTigerSound());

        Cat cat = new Cat();
        cat.cat();
        System.out.println("test");
    }
}
