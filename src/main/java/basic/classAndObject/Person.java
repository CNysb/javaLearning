package basic.classAndObject;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static Person.Builder builder() {
        return new Person.Builder();
    }

    static class Builder {
        private String name;
        private int age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Person build() {
            return new Person(this);
        }
    }

    Person(Builder builder) {
        name = builder.name;
        age = builder.age;
    }
}
