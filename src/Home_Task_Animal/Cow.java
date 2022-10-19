package Home_Task_Animal;

public class Cow extends Animal implements Eat {
    @Override
    public void eat() {
        System.out.println("I'm eat grass. Cow.");
    }
}
