package basic.classAndObject;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Animal() {
        System.out.println("empty constructor");
    }
}
