package circus.animal;

public class Duck extends Bird {
    @Override //overriding the previous behaviour
    public String speak() {
        return "Quack Quack";
    }

    @Override
    public String toString() {
        return "I'm a Duck";
    }

    public void swim() {
        System.out.println("I'm swimming...");
    }

    @Override
    public int getValue() {
        return 10;
    }
}
