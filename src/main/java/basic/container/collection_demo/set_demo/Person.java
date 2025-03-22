package basic.container.collection_demo.set_demo;

public class Person {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
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
    public static Person.Builder builder() {
        return new Person.Builder();
    }

    public Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }



}
